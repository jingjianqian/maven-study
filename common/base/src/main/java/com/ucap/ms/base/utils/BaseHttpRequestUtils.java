package com.ucap.ms.base.utils;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Splitter;
import com.ucap.ms.base.data.RestResultBuilder;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;
import java.util.Map.Entry;

public class BaseHttpRequestUtils {

	/**
	 * 连接超时
	 */
	private static int connectTimeOut = 50000;

	/**
	 * 读取数据超时
	 */
	private static int readTimeOut = 15000;

	/**
	 * 请求编码
	 */
	public static String requestEncoding = "UTF-8";

	private static Logger logger = Logger.getLogger(BaseHttpRequestUtils.class);

	/**
	 * <pre>
	 * 发送带参数的GET的HTTP请求
	 * </pre>
	 * 
	 * @param reqUrl
	 *            HTTP请求URL
	 * @param parameters
	 *            参数映射表
	 * @return HTTP响应的字符串
	 */
	public static String doGet(String reqUrl, Map parameters, String recvEncoding) {
		HttpURLConnection url_con = null;
		String responseContent = null;
		try {
			url_con = doHttpGetConnection(reqUrl, parameters);
			InputStream in = url_con.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(in, recvEncoding));
			String tempLine = rd.readLine();
			StringBuffer temp = new StringBuffer();
			String crlf = System.getProperty("line.separator");
			while (tempLine != null) {
				temp.append(tempLine);
				temp.append(crlf);
				tempLine = rd.readLine();
			}
			responseContent = temp.toString();
			rd.close();
			in.close();
		} catch (IOException e) {
			logger.error("网络故障", e);
		} finally {
			if (url_con != null) {
				url_con.disconnect();
			}
		}

		return responseContent;
	}

	private static HttpURLConnection doHttpGetConnection(String reqUrl, Map parameters) throws IOException {
		HttpURLConnection url_con = null;
		String params = getMapParamsToStr(parameters, BaseHttpRequestUtils.requestEncoding);

		URL url = new URL(reqUrl);
		url_con = (HttpURLConnection) url.openConnection();
		url_con.setRequestMethod("GET");
		System.setProperty("sun.net.client.defaultConnectTimeout", String.valueOf(BaseHttpRequestUtils.connectTimeOut));// （单位：毫秒）jdk1.4换成这个,连接超时
		System.setProperty("sun.net.client.defaultReadTimeout", String.valueOf(BaseHttpRequestUtils.readTimeOut)); // （单位：毫秒）jdk1.4换成这个,读操作超时

		url_con.setDoOutput(true);
		byte[] b = params.toString().getBytes();
		url_con.getOutputStream().write(b, 0, b.length);
		url_con.getOutputStream().flush();
		url_con.getOutputStream().close();

		return url_con;
	}

	/**
	 * <pre>
	 * 发送不带参数的GET的HTTP请求
	 * </pre>
	 * 
	 * @param reqUrl
	 *            HTTP请求URL
	 * @return HTTP响应的字符串
	 */
	public static String doGet(String reqUrl, String recvEncoding) {
		HttpURLConnection url_con = null;
		String responseContent = null;
		try {
			StringBuffer params = new StringBuffer();
			String queryUrl = reqUrl;
			int paramIndex = reqUrl.indexOf("?");

			if (paramIndex > 0) {
				queryUrl = reqUrl.substring(0, paramIndex);
				String parameters = reqUrl.substring(paramIndex + 1, reqUrl.length());
				String[] paramArray = parameters.split("&");
				for (int i = 0; i < paramArray.length; i++) {
					String string = paramArray[i];
					int index = string.indexOf("=");
					if (index > 0) {
						String parameter = string.substring(0, index);
						String value = string.substring(index + 1, string.length());
						params.append(parameter);
						params.append("=");
						params.append(URLEncoder.encode(value, BaseHttpRequestUtils.requestEncoding));
						params.append("&");
					}
				}

				params = params.deleteCharAt(params.length() - 1);
			}

			URL url = new URL(queryUrl);
			url_con = (HttpURLConnection) url.openConnection();
			url_con.setRequestMethod("GET");
			System.setProperty("sun.net.client.defaultConnectTimeout", String.valueOf(BaseHttpRequestUtils.connectTimeOut));// （单位：毫秒）jdk1.4换成这个,连接超时
			System.setProperty("sun.net.client.defaultReadTimeout", String.valueOf(BaseHttpRequestUtils.readTimeOut)); // （单位：毫秒）jdk1.4换成这个,读操作超时

			url_con.setDoOutput(true);
			byte[] b = params.toString().getBytes();
			url_con.getOutputStream().write(b, 0, b.length);
			url_con.getOutputStream().flush();
			url_con.getOutputStream().close();
			InputStream in = url_con.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(in, recvEncoding));
			String tempLine = rd.readLine();
			StringBuffer temp = new StringBuffer();
			String crlf = System.getProperty("line.separator");
			while (tempLine != null) {
				temp.append(tempLine);
				temp.append(crlf);
				tempLine = rd.readLine();
			}
			responseContent = temp.toString();
			rd.close();
			in.close();
		} catch (IOException e) {
			logger.error("网络故障", e);
		} finally {
			if (url_con != null) {
				url_con.disconnect();
			}
		}

		return responseContent;
	}

	/**
	 * <pre>
	 * 发送带参数的POST的HTTP请求
	 * </pre>
	 * 
	 * @param reqUrl
	 *            HTTP请求URL
	 * @param parameters
	 *            参数映射表
	 * @return HTTP响应的字符串
	 */
	public static String doPost(String reqUrl, Map parameters) {
		HttpURLConnection url_con = null;
		String responseContent = null;
		try {
			String params = getMapParamsToStr(parameters, BaseHttpRequestUtils.requestEncoding);
			URL url = new URL(reqUrl);
			url_con = (HttpURLConnection) url.openConnection();
			url_con.setRequestMethod("POST");
			System.setProperty("sun.net.client.defaultConnectTimeout", String.valueOf(BaseHttpRequestUtils.connectTimeOut));// （单位：毫秒）jdk1.4换成这个,连接超时
			System.setProperty("sun.net.client.defaultReadTimeout", String.valueOf(BaseHttpRequestUtils.readTimeOut)); // （单位：毫秒）jdk1.4换成这个,读操作超时

			url_con.setDoOutput(true);
			byte[] b = params.toString().getBytes();
			url_con.getOutputStream().write(b, 0, b.length);
			url_con.getOutputStream().flush();
			url_con.getOutputStream().close();

			InputStream in = url_con.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(in, BaseHttpRequestUtils.requestEncoding));
			String tempLine = rd.readLine();
			StringBuffer tempStr = new StringBuffer();
			String crlf = System.getProperty("line.separator");
			while (tempLine != null) {
				tempStr.append(tempLine);
				tempStr.append(crlf);
				tempLine = rd.readLine();
			}
			responseContent = tempStr.toString();
			rd.close();
			in.close();
		} catch (IOException e) {
			logger.error("网络故障", e);
		} finally {
			if (url_con != null) {
				url_con.disconnect();
			}
		}
		return responseContent;
	}

	/**
	 * <pre>
	 * 发送带参数的POST的HTTP请求
	 * </pre>
	 * 
	 * @param reqUrl
	 *            HTTP请求URL
	 * @param jsonData
	 *            发送数据，raw
	 * @return HTTP响应的字符串
	 */
	public static String doJsonPost(String reqUrl, String jsonData) {
		HttpURLConnection url_con = null;
		String responseContent = null;
		try {
			URL url = new URL(reqUrl);
			url_con = (HttpURLConnection) url.openConnection();
			url_con.setRequestMethod("POST");
			System.setProperty("sun.net.client.defaultConnectTimeout", String.valueOf(BaseHttpRequestUtils.connectTimeOut));// （单位：毫秒）jdk1.4换成这个,连接超时
			System.setProperty("sun.net.client.defaultReadTimeout", String.valueOf(BaseHttpRequestUtils.readTimeOut)); // （单位：毫秒）jdk1.4换成这个,读操作超时
			url_con.setDoOutput(true);
			url_con.setRequestProperty("Accept", "application/json"); // 设置接收数据的格式
			url_con.setRequestProperty("Content-Type", "application/json"); // 设置发送数据的格式

			byte[] b = jsonData.toString().getBytes();
			url_con.getOutputStream().write(b, 0, b.length);
			url_con.getOutputStream().flush();
			url_con.getOutputStream().close();

			InputStream in = url_con.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(in, BaseHttpRequestUtils.requestEncoding));
			String tempLine = rd.readLine();
			StringBuffer tempStr = new StringBuffer();
			String crlf = System.getProperty("line.separator");
			while (tempLine != null) {
				tempStr.append(tempLine);
				tempStr.append(crlf);
				tempLine = rd.readLine();
			}
			responseContent = tempStr.toString();
			rd.close();
			in.close();
		} catch (IOException e) {
			logger.error("网络故障", e);
		} finally {
			if (url_con != null) {
				url_con.disconnect();
			}
		}
		return responseContent;
	}
	public static String doXmlPost(String reqUrl, String xmlData) {
		HttpURLConnection url_con = null;
		String responseContent = null;
		try {
			URL url = new URL(reqUrl);
			url_con = (HttpURLConnection) url.openConnection();
			url_con.setRequestMethod("POST");
			System.setProperty("sun.net.client.defaultConnectTimeout", String.valueOf(BaseHttpRequestUtils.connectTimeOut));// （单位：毫秒）jdk1.4换成这个,连接超时
			System.setProperty("sun.net.client.defaultReadTimeout", String.valueOf(BaseHttpRequestUtils.readTimeOut)); // （单位：毫秒）jdk1.4换成这个,读操作超时
			url_con.setDoOutput(true);
			url_con.setRequestProperty("Accept", "application/xml"); // 设置接收数据的格式
			url_con.setRequestProperty("Content-Type", "application/xml"); // 设置发送数据的格式

			byte[] b = xmlData.toString().getBytes();
			url_con.getOutputStream().write(b, 0, b.length);
			url_con.getOutputStream().flush();
			url_con.getOutputStream().close();

			InputStream in = url_con.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(in, BaseHttpRequestUtils.requestEncoding));
			String tempLine = rd.readLine();
			StringBuffer tempStr = new StringBuffer();
			String crlf = System.getProperty("line.separator");
			while (tempLine != null) {
				tempStr.append(tempLine);
				tempStr.append(crlf);
				tempLine = rd.readLine();
			}
			responseContent = tempStr.toString();
			rd.close();
			in.close();
		} catch (IOException e) {
			logger.error("网络故障", e);
		} finally {
			if (url_con != null) {
				url_con.disconnect();
			}
		}
		return responseContent;
	}


	/**
	 * 
	 * @param reqUrl
	 * @param parameters
	 * @param recvEncoding
	 * @param fileIn
	 *            文件流
	 * @return
	 */
	public static String uploadMedia(String reqUrl, Map parameters, String recvEncoding, InputStream fileIn,
			String fileName, String contentType) {
		HttpURLConnection url_con = null;
		String responseContent = null;
		try {
			// 设置边界
			String BOUNDARY = "----------" + System.currentTimeMillis();
			// String params =
			// getMapParamsToStr(parameters,HttpRequestProxy.requestEncoding);

			URL urlObj = new URL(reqUrl);// + "&" + params.toString());
			// 连接
			url_con = (HttpURLConnection) urlObj.openConnection();
			/**
			 * 设置关键值
			 */
			url_con.setRequestMethod("POST"); // 以Post方式提交表单，默认get方式
			url_con.setDoInput(true);
			url_con.setDoOutput(true);
			url_con.setUseCaches(false); // post方式不能使用缓存

			// 设置请求头信息
			url_con.setRequestProperty("Connection", "Keep-Alive");
			url_con.setRequestProperty("Charset", recvEncoding);

			// 设置边界
			url_con.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + BOUNDARY);

			// 请求正文信息

			// 第一部分：
			StringBuilder sb = new StringBuilder();
			sb.append("--"); // 必须多两道线
			sb.append(BOUNDARY);
			sb.append("\r\n");
			sb.append("Content-Disposition: form-data;name=\"media\";filename=\"" + fileName + "\"\r\n");
			sb.append("Content-Type:application/octet-stream\r\n\r\n");

			byte[] head = sb.toString().getBytes(recvEncoding);

			// 获得输出流
			OutputStream out = new DataOutputStream(url_con.getOutputStream());
			// 输出表头
			out.write(head);
			// 文件正文部分
			// 把文件以流文件的方式 推入到url中
			DataInputStream in = new DataInputStream(fileIn);
			int bytes = 0;
			byte[] bufferOut = new byte[1024];
			while ((bytes = in.read(bufferOut)) != -1) {
				out.write(bufferOut, 0, bytes);
			}
			in.close();
			if (parameters.get("type") != null && parameters.get("type").toString().equals("video")) {
				out.write(("--" + BOUNDARY + "\r\n").getBytes());
				out.write("Content-Disposition: form-data; name=\"description\";\r\n\r\n".getBytes());
				out.write(String.format("{\"title\":\"%s\", \"introduction\":\"%s\"}",
						parameters.get("title").toString(), parameters.get("introduction").toString()).getBytes());
			}
			out.write(("\r\n--" + BOUNDARY + "--\r\n\r\n").getBytes());
			out.flush();
			out.close();
			in.close();

			InputStream iddn = url_con.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(iddn, recvEncoding));
			String tempLine = rd.readLine();
			StringBuffer tempStr = new StringBuffer();
			String crlf = System.getProperty("line.separator");
			while (tempLine != null) {
				tempStr.append(tempLine);
				tempStr.append(crlf);
				tempLine = rd.readLine();
			}
			responseContent = tempStr.toString();
			rd.close();
		} catch (IOException e) {
			logger.error("网络故障", e);
		} finally {
			if (url_con != null) {
				url_con.disconnect();
			}
		}
		return responseContent;
	}
	
	

	/**
	 * 将参数转换成string
	 * 
	 * @param paramMap
	 * @param requestEncoding
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	private static String getMapParamsToStr(Map paramMap, String requestEncoding) throws IOException {
		StringBuffer params = new StringBuffer();
		// 设置边界
		for (Iterator iter = paramMap.entrySet().iterator(); iter.hasNext();) {
			Entry element = (Entry) iter.next();
			params.append(element.getKey().toString());
			params.append("=");
			params.append(URLEncoder.encode(element.getValue().toString(), requestEncoding));
			params.append("&");
		}

		if (params.length() > 0) {
			params = params.deleteCharAt(params.length() - 1);
		}

		return params.toString();
	}

	/**
	 * @return 请求编码
	 */
	public static String getRequestEncoding() {
		return requestEncoding;
	}

	/**
	 * @param connectTimeOut
	 *            连接超时(毫秒)
	 */
	public static void setConnectTimeOut(int connectTimeOut) {
		BaseHttpRequestUtils.connectTimeOut = connectTimeOut;
	}

	/**
	 * @param readTimeOut
	 *            读取数据超时(毫秒)
	 */
	public static void setReadTimeOut(int readTimeOut) {
		BaseHttpRequestUtils.readTimeOut = readTimeOut;
	}

	/**
	 * @param requestEncoding
	 *            请求编码
	 */
	public static void setRequestEncoding(String requestEncoding) {
		BaseHttpRequestUtils.requestEncoding = requestEncoding;
	}

	private final static int CONN_TIMEOUT  = 300 * 1000; // 300s
	private final static RequestConfig REQUEST_CONFIG = RequestConfig.custom()
			.setConnectTimeout(CONN_TIMEOUT)
			.setConnectionRequestTimeout(CONN_TIMEOUT)
			.setSocketTimeout(CONN_TIMEOUT)
			.build();
	public final static String HEADER_PREFIX = "_header:";
	/**
	 * 发送请求
	 * @param method    请求类型：POST/GET
	 * @param url       请求地址
	 * @param paramMap  请求参数
	 * @return 响应返回内容
	 */
	public static String sendRequest(String method,String url,Map<String,String> paramMap) {

		CloseableHttpClient httpClient = HttpClients.createDefault();
		CloseableHttpResponse response = null;
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		if(paramMap == null) paramMap = new HashMap<String,String>();
		Map<String, String> headerMap = new HashMap<String,String>();
		for(Entry<String,String> entry:paramMap.entrySet()) {
			if(entry.getKey().indexOf(HEADER_PREFIX) == 0)
				headerMap.put(entry.getKey().substring(HEADER_PREFIX.length()), entry.getValue());
			else
				params.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
		}
		try {
			URL accessUrl = new URL(url);
			String strQuery = accessUrl.getQuery();
			if(!BaseTools.checkEmpty(strQuery)) {//取出url中的参数
				Map<String, String> urlParams = Splitter.on("&").withKeyValueSeparator("=").split(strQuery);
				if(urlParams != null) {
					for (Entry<String, String> entry : urlParams.entrySet()) {
						params.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
					}
				}
				if(url.lastIndexOf("?") > 0)
					url = url.substring(0,url.lastIndexOf("?"));
			}
			if("POST".equals(method)) {
				HttpPost httpPost = new HttpPost(url);
				httpPost.setConfig(REQUEST_CONFIG);
				for(Entry<String,String> entry:headerMap.entrySet()) {
					httpPost.setHeader(entry.getKey(),entry.getValue());
				}
				UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(params, Consts.UTF_8);
				httpPost.setEntity(formEntity);
				response = httpClient.execute(httpPost);
			}
			else if("POST-JSON".equals(method)) {
				HttpPost httpPost = new HttpPost(url);
				httpPost.setConfig(REQUEST_CONFIG);
				httpPost.setHeader("Content-Type", "application/json");
				for(Entry<String,String> entry:headerMap.entrySet()) {
					httpPost.setHeader(entry.getKey(),entry.getValue());
				}
				String jsonBody = "";
				for(int i=0;i < params.size();i++) {
					String value = params.get(i).getValue();
					if(!BaseTools.checkEmpty(value))
						value = value.replaceAll("\n","\\\\n")
									 .replaceAll("\t","\\\\t")
									 .replaceAll("\"","\\\\\"");
					jsonBody += ",\"" + params.get(i).getName() + "\":\"" + value + "\"";
				}
				if(jsonBody.length() > 0) jsonBody = "{" + jsonBody.substring(1) + "}";

				System.out.println("jsonBody:" + jsonBody);
				httpPost.setEntity(new StringEntity(jsonBody, Consts.UTF_8));
				response = httpClient.execute(httpPost);
			}
			else if("GET".equals(method)) {
				String strParams = EntityUtils.toString(new UrlEncodedFormEntity(params, Consts.UTF_8));
				HttpGet httpGet = new HttpGet(url + "?" + strParams);
				System.out.println("==================请求url:"+url + "?" + strParams);
				//-------------伪装浏览器访问以防止某些地址检测浏览器信息------------
				httpGet.setHeader("Accept", "text/html,application/xhtml+xml,application/xml;");
				httpGet.setHeader("Accept-Language", "zh-cn");
				httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.9.0.3) Gecko/2008092417 Firefox/3.0.3");
				httpGet.setHeader("Accept-Charset", "utf-8");
				httpGet.setHeader("Keep-Alive", "300");
				httpGet.setHeader("Connection", "Keep-Alive");
				httpGet.setHeader("Cache-Control", "no-cache");
				//---------------------------------------------------------------------
				for(Entry<String,String> entry:headerMap.entrySet()) {
					httpGet.setHeader(entry.getKey(),entry.getValue());
				}
				httpGet.setConfig(REQUEST_CONFIG);
				response = httpClient.execute(httpGet);
			}
			if(response != null) {
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					return EntityUtils.toString(entity, Consts.UTF_8);
				}
			}
			return RestResultBuilder.builder().failure().build().toString();
		}
		catch (Exception e) {
			logger.error(e.getMessage(),e);
			return RestResultBuilder.builder().failure().build().toString();
		} finally{
			try {
				if(response != null) response.close();
			} catch (IOException e) {
				logger.error(e.getMessage(),e);
			}
			try {
				if(httpClient != null) httpClient.close();
			} catch (IOException e) {
				logger.error(e.getMessage(),e);
			}
		}
	}

	/**
	 * 发送请求
	 * @param method    请求类型：POST/GET
	 * @param url       请求地址
	 * @param paramMap  请求参数
	 * @return 响应返回内容
	 */
	public static String sendPostWithJson(String url,Map<String,Object> paramMap) {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		CloseableHttpResponse response = null;

		try{
			HttpPost httpPost = new HttpPost(url);
			httpPost.setConfig(REQUEST_CONFIG);
			httpPost.setHeader("Content-Type", "application/json");
			JSONObject jsonBody=new JSONObject(paramMap);
			System.out.println("jsonBody:" + jsonBody);
			httpPost.setEntity(new StringEntity(String.valueOf(jsonBody), Consts.UTF_8));
			response = httpClient.execute(httpPost);
			if(response != null) {
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					return EntityUtils.toString(entity, Consts.UTF_8);
				}
			}
			return RestResultBuilder.builder().failure().build().toString();
		}
		catch (Exception e) {
			logger.error(e.getMessage(),e);
			return RestResultBuilder.builder().failure().build().toString();
		} finally{
			try {
				if(response != null) response.close();
			} catch (IOException e) {
				logger.error(e.getMessage(),e);
			}
			try {
				if(httpClient != null) httpClient.close();
			} catch (IOException e) {
				logger.error(e.getMessage(),e);
			}
		}
	}

}
