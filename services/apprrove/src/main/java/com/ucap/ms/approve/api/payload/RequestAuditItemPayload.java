package com.ucap.ms.approve.api.payload;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * 接口事项库信息
 * @author loncx
 * @date 2019/11/25
 */
public class RequestAuditItemPayload {

    /**
     * STATUS : {"CODE":"00","TEXT":""}
     * CUSTOM : {"AUDIT_ITEM_INTERMEDIARY":[],"LASTTIMESTAMP":1572407569000,"AUDIT_MATERIAL":[{"partitionguid":"450700","is_generate_ecert":"0","year":1572364800000,"is_jzbm":"0","td_tlimit":"0","materialid":"b21dfa74-6ea9-4099-a764-cba3a3a07af1","is_need":"1","example_guid":"","original_amount":0,"jzbm_way":"","task_code":"1145072100811537184452004020000","material_form":"2","source_type":"10","by_law":"《中央预算内直接投资项目管理办法》（国家发改委令2014年第7号）","copy_amount":3,"source_explain":"申请人自备","page_format":"A4","fill_explian":"无","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","remark":"项目建议书批复文件或国家和自治区有关安排资金的通知文件、纳入国家、自治区或市建设规划的项目，提供有关文件","rowguid":"5a5b6acd-1f55-40e7-bd1e-a2093274cbae","operatedate":1572407820000,"material_type":"1","material_name":"项目建议书批复文件或国家和自治区有关安排资金的通知文件、纳入国家、自治区或市建设规划的项目（见备注）","sign_ask":"单位盖章","page_num":3,"ordernum":1,"td_correctway":"","accept_stand":"无","form_guid":""},{"partitionguid":"450700","is_generate_ecert":"0","year":1572364800000,"is_jzbm":"0","td_tlimit":"0","materialid":"ef81176c-4867-4f2d-a7a0-d107fa6b4cfe","is_need":"1","example_guid":"","original_amount":0,"jzbm_way":"","task_code":"1145072100811537184452004020000","material_form":"2","source_type":"10","by_law":"《固定资产投资项目节能审查办法》（2016年11月27日国家发展和改革委员会令第44号）","copy_amount":3,"source_explain":"申请人自备","page_format":"A4","fill_explian":"无","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","remark":"节能行政主管部门出具的节能审查意见（年综合能源消费量不满1000吨标准煤，且年电力消费量不满500万千瓦时的固定资产投资项目，以及《不单独进行节能审查的行业目录》（发改环资〔2017〕1975号）固定资产投资项目可不编制单独的节能报告，可在项目可行性研究报告中对项目能源利用情况、节能措施情况和能效水平进行分析）","rowguid":"63d0d440-359a-4f02-8a2c-c2b5f94c0ebb","operatedate":1572407052000,"material_type":"1","material_name":"节能行政主管部门出具的节能审查意见（详见备注）","sign_ask":"单位盖章","page_num":3,"ordernum":6,"td_correctway":"","accept_stand":"无","form_guid":""},{"partitionguid":"450700","is_generate_ecert":"0","year":1572364800000,"is_jzbm":"0","td_tlimit":"0","materialid":"a724e8ff-edc5-40d4-8bde-99fd44aba3c0","is_need":"1","example_guid":"","original_amount":1,"jzbm_way":"","task_code":"1145072100811537184452004020000","material_form":"1","source_type":"10","by_law":"《中央预算内直接投资项目管理办法》（国家发改委令2014年第7号）","copy_amount":0,"source_explain":"申请人自备","page_format":"A4","fill_explian":"无","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","remark":"无","rowguid":"6d979e1a-30dc-4526-a274-72631e3675d4","operatedate":1572407052000,"material_type":"1","material_name":"由相应工程咨询资格的机构出具的评估报告或行业主管部门审查意见","sign_ask":"评审机构盖章","page_num":1,"ordernum":3,"td_correctway":"","accept_stand":"无","form_guid":""},{"partitionguid":"450700","is_generate_ecert":"0","year":1572364800000,"is_jzbm":"0","td_tlimit":"0","materialid":"dba58d36-04d9-4b4c-a0d3-6fb2b75799ac","is_need":"1","example_guid":"","original_amount":0,"jzbm_way":"","task_code":"1145072100811537184452004020000","material_form":"2","source_type":"10","by_law":"《中央预算内直接投资项目管理办法》（国家发改委令2014年第7号）","copy_amount":3,"source_explain":"申请人自备","page_format":"A4","fill_explian":"无","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","remark":"无","rowguid":"8aad1a91-2d14-4dc0-a420-2b931d04c2a1","operatedate":1572407052000,"material_type":"1","material_name":"国土资源（海洋）行政主管部门出具的用地（用海）预审意见或土地权属证明","sign_ask":"单位盖章","page_num":3,"ordernum":5,"td_correctway":"","accept_stand":"无","form_guid":""},{"partitionguid":"450700","is_generate_ecert":"0","year":1572364800000,"is_jzbm":"0","td_tlimit":"0","materialid":"f803c63f-befb-46c8-b1d1-8f26acbdac6a","is_need":"1","example_guid":"","original_amount":0,"jzbm_way":"","task_code":"1145072100811537184452004020000","material_form":"2","source_type":"10","by_law":"《中央预算内直接投资项目管理办法》（国家发改委令2014年第7号）","copy_amount":3,"source_explain":"申请人自备","page_format":"A4","fill_explian":"无","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","remark":"城市规划行政主管部门出具的城市规划意见或城市建设行政主管部门出具的项目建设选址意见书（仅指以划拨方式提供国有土地使用权的项目城市规划区域内的投资项目）","rowguid":"8b191567-10bb-49be-bcf9-79d6135b83c2","operatedate":1572407052000,"material_type":"1","material_name":"城市规划行政主管部门出具的城市规划意见或城市建设行政主管部门出具的项目建设选址意见书（详见备注）","sign_ask":"单位盖章","page_num":3,"ordernum":4,"td_correctway":"","accept_stand":"无","form_guid":""},{"partitionguid":"450700","is_generate_ecert":"0","year":1572364800000,"is_jzbm":"0","td_tlimit":"0","materialid":"a40cb4d0-a647-42ab-a8ff-604e4370cfb1","is_need":"1","example_guid":"","original_amount":0,"jzbm_way":"","task_code":"1145072100811537184452004020000","material_form":"2","source_type":"10","by_law":"《财政部 国家发展改革委 工业和信息化部 住房城乡建设部 人力资源社会保障部关于抓紧做好清理偿还政府欠款专项工作的通知》（财建〔2017〕26号）","copy_amount":3,"source_explain":"申请人自备","page_format":"A4","fill_explian":"无","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","remark":"农口项目可免","rowguid":"907965c6-52be-4c4b-b365-e35f94cdd1a2","operatedate":1572407052000,"material_type":"1","material_name":"项目资本金、有关地方配套、自筹资金及金融机构出具的筹资、贷款承诺书，其它资金来源落实情况材料","sign_ask":"单位盖章","page_num":1,"ordernum":7,"td_correctway":"","accept_stand":"无","form_guid":""},{"partitionguid":"450700","is_generate_ecert":"0","year":1572364800000,"is_jzbm":"0","td_tlimit":"0","materialid":"84d8fced-0b2f-455f-9d9d-dd17f6a5f714","is_need":"1","example_guid":"","original_amount":3,"jzbm_way":"","task_code":"1145072100811537184452004020000","material_form":"1","source_type":"10","by_law":"《中央预算内直接投资项目管理办法》（国家发改委令2014年第7号）","copy_amount":0,"source_explain":"申请人自备","page_format":"A4","fill_explian":"无","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","remark":"无","rowguid":"a93c23c4-a5b7-4d26-b45c-ae25a6bac6ee","operatedate":1572407052000,"material_type":"1","material_name":"由相应工程咨询资格的机构编制的可行性研究报告","sign_ask":"编制单位盖章","page_num":3,"ordernum":2,"td_correctway":"","accept_stand":"无","form_guid":""},{"partitionguid":"450700","is_generate_ecert":"0","year":1572364800000,"is_jzbm":"","td_tlimit":"0","materialid":"a30111bd-81da-424a-a5e8-927d3a2502bd","is_need":"2","example_guid":"7f47ae45-7895-4daa-9211-62a0f07f68c3","original_amount":0,"jzbm_way":"","task_code":"1145072100811537184452004020000","material_form":"2","source_type":"10","by_law":"《关于印发广西壮族自治区发展和改革委员会固定资产投资项目社会稳定风险评估暂行办法的通知》（桂发改投资﹝2013﹞833号","copy_amount":3,"source_explain":"申请人自备","page_format":"A4","fill_explian":"无","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","remark":"项目可行性研究报告审批的申请项目所在地县级以上人民政府出具的社会稳定风险评估意见（符合可以不做项目社会稳定风险评估条件的除外）","rowguid":"cf375a91-c583-4d51-b82d-777ce448f52b","operatedate":1572407052000,"material_type":"1","material_name":"项目可行性研究报告审批的申请项目所在地县级以上人民政府出具的社会稳定风险评估意见（详见备注）","sign_ask":"单位盖章","page_num":3,"ordernum":9,"td_correctway":"","accept_stand":"无","form_guid":"cfc39d85-ea96-4b52-8ee8-48773e7b2494"},{"partitionguid":"450700","is_generate_ecert":"0","year":1572364800000,"is_jzbm":"0","td_tlimit":"0","materialid":"7b8804c8-a887-4a27-88a7-b2fde4f7ca90","is_need":"1","example_guid":"","original_amount":1,"jzbm_way":"","task_code":"1145072100811537184452004020000","material_form":"1","source_type":"10","by_law":"《中央预算内直接投资项目管理办法》（国家发改委令2014年第7号）","copy_amount":0,"source_explain":"申请人自备","page_format":"A4","fill_explian":"无","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","remark":"无","rowguid":"e5a5858d-09ad-4f07-b0a3-9a7e6c570225","operatedate":1572407052000,"material_type":"1","material_name":"属上一级发展改革部门审批权限的项目，需提供同级发展改革部门或主管部门审核意见","sign_ask":"政府机构盖章","page_num":1,"ordernum":8,"td_correctway":"","accept_stand":"无","form_guid":""}],"AUDIT_MATERIAL_CONDITION":[],"AUDIT_QA":[{"task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","partitionguid":"450700","question":"可行性研究报告批准后，下一步要开展什么工作？","year":1572364800000,"task_code":"1145072100811537184452004020000","operateusername":"陈泉树","ordernum":1,"rowguid":"091f4f03-761b-4fae-8769-22d89488d80e","operatedate":1572407052000,"missex":"无","answer":"项目单位依据可行性研究报告批复文件向城乡规划部门申请办理规划许可手续，向国土资源部门申请办理正式用地手续，委托具备相应资质的设计单位依据经批准的可行性研究报告和勘察情况等编制初步设计及工程概算。","qaid":"92006779-db32-45d0-b037-c46d8a946d54"}],"AUDIT_ITEM_EXTEND":[{"partitionguid":"450700","year":1572364800000,"amount_limit_desc":"","result_name":"灵山县发展和改革局关于×××项目可行性研究报告的批复","four_handle":"2,4","is_schedule":"1","result_guid":"ec730428-2043-4181-afa7-9e764dabb74b,c699bcfe-694c-40a6-815f-1423f65f78a0","is_online_handle":"1","cjsqmc":"无","is_handle_machine":"0","task_code":"1145072100811537184452004020000","arrive_charge_way":"","is_agency":"0","cjsqdm":"无","handle_area":"4","theme_natural_type":"","is_express":"0","theme_legal_type":"040","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","is_intermediary":"0","lead_dept":"灵山县发展和改革局","handle_online_address":"http://qzls.zwfw.gxzf.gov.cn/","rowguid":"7b7a30c7-398d-4e6a-bc56-22facd931272","operatedate":1572407052000,"local_theme_natural_type":"","match_dept":"1. 城市规划行政主管部门  2. 自然资源行政主管部门","is_entry_center":"1","limit_explain":"","is_joint_org":"1","result_type":"20","wsblsd":"3,6","is_amount_limit":"0","is_cert_joint":"0","xzjddm":"无","sensitives":"0","is_intelli_approval":"0","local_theme_legal_type":"","scene_reason":"现场核验材料","xzjdmc":"无","is_pay_online":"0"}],"AUDIT_ITEM_SPECIAL":[{"task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","partitionguid":"450700","special_id":"18a857f7-5406-42fb-94c3-7a841699f7c9","year":1572407052000,"operateusername":"梁少丽","special_name":"9","special_date":30,"rowguid":"14f140c0-6f07-46d1-aaa9-4396a1183dbc","special_desc":"中华人民共和国国家发展和改革委员会令2017年第2号","operatedate":1572407052000,"special_date_type":"1","special_tel":"6428820","special_dept":"审批机构","ordernumber":1}],"AUDIT_ITEM_BYLAW":[{"law_id":"8f6438a0-d132-44e9-874d-d9fe904b5716","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","partitionguid":"450700","cataloglawid":"42b6c6e3-64aa-11e9-b33b-fa163ea9bf82","year":1572407052000,"clause_number":"第三条第四款","law_type":"2","ordernum":20,"clause_content":"对于政府投资项目，采用直接投资和资本金注入方式的，从投资决策角度只审批项目建议书和可行性研究报告，除特殊情况外不再审批开工报告，同时应严格政府投资项目的初步设计、概算审批工作","rowguid":"52450170-b938-4279-9b03-947f451b3ca5","operatedate":1572407052000,"law_name":"《国务院关于投资体制改革的决定》","law_dept":"国务院","law_number":"国发〔2004〕20号，2004年7月16日实施，国务院颁布","law_date":1089907200000},{"law_id":"b8b9fb0b-2219-4884-b2d1-e6d042d5c016","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","partitionguid":"450700","cataloglawid":"42bc7821-64aa-11e9-b33b-fa163ea9bf82","year":1572407052000,"clause_number":"第三条第一款","law_type":"3","ordernum":23,"clause_content":"直接投资项目实行审批制，包括审批项目建议书、可行性研究报告、初步设计。","rowguid":"61cef258-b41d-4e19-a699-d51a552a3a6d","operatedate":1572407052000,"law_name":"《中央预算内直接投资项目管理办法》","law_dept":"国家发展改革委","law_number":"国家发展改革委令2014年第7号，2014年3月1日实施，国家发展改革委颁布","law_date":1393603200000},{"law_id":"633f4b9f-07de-4f57-9335-cd506578d0b6","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","partitionguid":"450700","cataloglawid":"42c1f7ad-64aa-11e9-b33b-fa163ea9bf82","year":1572407052000,"clause_number":"第三条第七款","law_type":"2","ordernum":24,"clause_content":"改进和规范政府投资项目审批制，采用直接投资和资本金注入方式的项目，对经济社会发展、社会公众利益有重大影响或者投资规模较大的，要在咨询机构评估、公众参与、专家评议、风险评估等科学论证基础上，严格审批项目建议书、可行性研究报告、初步设计。","rowguid":"6f5bf4a3-29cb-401a-a0ed-98743eae9435","operatedate":1572407052000,"law_name":"《中共中央 国务院关于深化投融资体制改革的意见》（）三(七)","law_dept":"中共中央 国务院","law_number":"中发〔2016〕18号，2016年7月5日实施，中共中央、国务院颁布","law_date":1467648000000},{"law_id":"7bd3f4f3-7731-418e-9dda-cca30c9f54a3","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","partitionguid":"450700","cataloglawid":"42c3cec0-64aa-11e9-b33b-fa163ea9bf82","year":1572407052000,"clause_number":"第五条第一款","law_type":"6","ordernum":22,"clause_content":"实行审批制的政府投资项目、实行核准制的企业投资项目以及需自治区发改委核报自治区人民政府或国家发展改革委审批、核准的项目，应在提交项目可行性研究报告或者项目申请报告之前，开展并完成项目社会稳定风险分析报告（篇章）编制和评估工作","rowguid":"74c0ef98-9407-49f7-ac73-2809227c0c3c","operatedate":1572407052000,"law_name":"《关于印发广西壮族自治区发展和改革委员会固定资产投资项目社会稳定风险评估暂行办法的通知》","law_dept":"广西壮族自治区发展和改革委员会","law_number":"桂发改投资﹝2013﹞833号,2013年7月9日实施，自治区发展改革委颁布","law_date":1373299200000},{"law_id":"199d184b-cb2b-41df-a614-c6ac9c1c3ec5","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","partitionguid":"450700","cataloglawid":"42bc4827-64aa-11e9-b33b-fa163ea9bf82","year":1572407052000,"clause_number":"第二款","law_type":"6","ordernum":21,"clause_content":"实行审批制的政府投资项目，项目单位应首先向发展改革等项目审批部门报送项目建议书，依据项目建议书批复文件分别向城乡规划、国土资源和环境保护部门申请办理规划选址、用地预审和环境影响评价审批手续。完成相关手续后，项目单位根据项目论证情况向发展改革等项目审批部门报送可行性研究报告，并附规划选址、用地预审和环评审批文件","rowguid":"e08a20f1-789e-4a8a-9966-71872e4d7d60","operatedate":1572407052000,"law_name":"《国务院办公厅关于加强和规范新开工项目管理的通知》","law_dept":"国务院办公厅","law_number":"国办发〔2007〕64号，2007年11月17日实施，国务院办公厅颁布","law_date":1195228800000}],"AUDIT_ACCEPT_CONDITION":[],"AUDIT_CHARGE":[],"AUDIT_ITEM_WINDOW":[{"traffic_info":"可乘公交1路或101路到县政务服务中心站下车，沿着江南路往南过红绿灯再走50米左右","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","partitionguid":"450700","transact_addr":"灵山县三海街道江南路5号县政务服务中心法人大厅②工程建设项目综合窗口（县卫生监督所一楼）","window_name":"县政务服务中心法人大厅②工程建设项目综合窗口","window_tel":"0777\u20146428820","year":1572364800000,"map_url":"https://j.map.baidu.com/D6EEG","rowguid":"c5a73c2f-f536-4d33-9056-c16fc572bb41","transact_time":"工作日：上午9:00-12:00，下午14:00-17:00，法定节假日除外。","operatedate":1572407052000,"ordernumber":1,"window_id":"c9e71435-81a4-4c86-a8e4-44a8807d4fa5"}],"RETURNITEMSUNNUM":1,"AUDIT_ITEM":[{"dept_code":"114507210081153718","year":1572407052000,"flow_chart":"ecffd209-e349-42c7-ae20-8136166ce48b,1e969d79-18ea-450b-bacc-8cb59baf38f4","td_tlimit":"0","login_url":"http://qzls.zwfw.gxzf.gov.cn/","accept_name":"1.符合国家有关法律法规，符合国民经济和社会发展规划、行业规划、产业政策、行业准入标准、土地利用总体规划和城市总体规划，符合国家宏观调控政策，地区布局合理。\n    2.根据《国家发展改革委关于全国投资项目在线审批监管平台正式运行的通知》（发改投资〔2017〕197号）、《广西壮族自治区人民政府办公厅关于印发广西投资项目在线并联审批监管平台运行管理暂行办法的通知》（桂政办发〔2017〕6号）自2017年2月1日起，除涉及国家秘密的项目外，项目审批、核准、备案以及所涉及的各类审批事项都必须通过在线平台办理，各级政府有关部门统一使用在线平台生成的项目代码办理相关手续。\n       3.可行性研究报告审批\n    （1）由相应工程咨询资格的机构编制的可行性研究报告；\n    （2）由相应工程咨询资格的机构出具的评估意见或行业主管部门出具的审查意见；\n    （3）城市规划行政主管部门出具的城市规划意见或城市建设行政主管部门出具的项目建设选址意见书（仅指以划拨方式提供国有土地使用权、城市规划区域内的投资项目）；\n    （4）国土资源（海洋）行政主管部门出具的用地（用海）预审意见或土地权属证明；\n    （5）重特大项目需提供环境保护行政主管部门出具的环境影响评价文件的审批意见；\n    （6）节能行政主管部门出具的节能审查意见；\n    （7）有关地方配套、企业自筹及金融机构出具的筹资、贷款承诺书；\n      4.申报批复事项所要求备齐的文件和材料将随国家、自治区和市本级发布的新规适时进行补充或调整。","exercise_content":"参照《中央预算内直接投资项目管理办法》；自治区层面由自治区级财政投资的政务信息化项目前期审批。","link_way":"0777\u20146428820","pvi_guid":"d73deab0-6ab5-435e-9b4e-1cc63a663eae","is_need_entry":"1","query_url":"0777\u20146428820","is_bjxs":"1","catalog_id":"ba0fb605-409b-4e61-8ffd-02da1b849b0d","anticipate_day_explain":"无","item_source":"1","pre_dept_name":"1、城市规划行政主管部门;2、自然资源（海洋）行政主管部门;3、出具市有关安排资金的通知文件、纳入国家、自治区或市建设规划项目的单位。","contractor":"钦州市发改委","serve_type":"3,6","operateusername":"梁少丽","use_level":"4","areacode":"450721","operatedate":1572407052000,"check_flag":"0","is_td":"0","publishdate":1572408063000,"dept_type":"1","publishstatus":"1","task_version":11,"is_fee":"0","gscapproveprojectcodeid":"Gx-Gsc-App-69420-636667511770000000","audit_state":"40","ouguid":"516c249e17034981960beb475083f341","is_mobile_entry":"0","task_state":"1","version_date":1572407569000,"reconsiderat":"公民、法人或者其他组织认为具体行政行为侵犯其合法权益的，可以自知道该具体行政行为之日起六十日内提出行政复议申请。","td_conrection_way":"","anticipate_type":"1","task_type":"20","partitionguid":"450700","accept_std":"一、审查方式：书面审查。标准如下：\n    （一）申请书（表）的审查标准\n     1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核；\n     2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确；\n     3. 申请材料中的表格应使用国际标准A4型纸正面印制；\n     4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。\n    （二）证明文件等材料的审查标准\n     1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订；\n     2. 复印材料应清晰可辨认；\n     3. 证明材料相关内容与申请书（表）保持一致。","other_supervise":"无","create_date":1572407052000,"project_type":"2","report_sign":0,"task_code":"1145072100811537184452004020000","entrust_name":"","supervise_way":"0777\u20146428880","publicity_url":"http://wsbs.gxzf.gov.cn","transact_app_url":"","promise_day_explain":"无","task_name":"政府投资项目审批\u2014\u2014可行性研究报告审批","promise_type":"1","inspection_review":"3","handle_publicity":"05","pre_task_name":"1、城市规划行政主管部门出具的城市规划意见或城市建设行政主管部门出具的项目建设选址意见书（仅指以划拨方式提供国有土地使用权、城市规划区域内的投资项目）;2、国土资源（海洋）行政主管部门出具的用地（用海）预审意见或土地权属证明;3、项目建议书批复文件或国家和自治区有关安排资金的通知文件、纳入国家或自治区建设规划的项目，提供有关文件。","canuse":"1","rowguid":"090d24c4-4233-4def-9a97-1be66896c76e","promise_day":5,"anticipate_day":20,"is_history":"0","other_link":"无","authority_division":"　　原则上，市级发展改革委负责市本级预算内政府投资项目审批；县（市、区）发展改革委负责同级预算内政府投资项目审批。但国家对政府投资项目审批权限另有规定的，从其规定。\n　　《中共中央办公厅、国务院办公厅关于进一步严格控制党政机关办公楼等楼堂馆所建设问题的通知》（中办发〔2007〕11号）、《自治区党委办公厅、自治区人民政府办公厅转发自治区纪委等7部门<关于进一步严格控制我区党政机关办公楼等楼堂馆所建设的意见>的通知》（桂办发〔2008〕45号）规定：所有新建、扩建、迁建、购置、装修改造党政机关办公楼项目，市、县（市、区）党政机关办公楼建设项目，由自治区发展改革委核报自治区人民政府审批。","catalog_code":"452004020000","item_id":"e1e0ca77-23c0-4f35-8ce8-097815bdb77b","limit_scene_num":1,"dept_name":"灵山县发展和改革局","handle_type":"1,2","litigation":"1.公民、法人或者其他组织不服复议决定的，可以在收到复议决定书之日起十五日内向人民法院提起诉讼。复议机关逾期不作决定的，申请人可以在复议期满之日起十五日内向人民法院提起诉讼。\n    2.公民、法人或者其他组织直接向人民法院提起诉讼的，应当自知道或者应当知道作出行政行为之日起六个月内提出。","progress_query_way":"02,04"}],"AUDIT_ITEM_CONDITION":[]}
     */

    @JSONField(name = "STATUS")
    private StatusBean status;
    @JSONField(name = "CUSTOM")
    private CustomBean custom;

    public StatusBean getStatus() {
        return status;
    }

    public void setStatus(StatusBean status) {
        this.status = status;
    }

    public CustomBean getCustom() {
        return custom;
    }

    public void setCustom(CustomBean custom) {
        this.custom = custom;
    }

    public static class StatusBean {
        /**
         * CODE : 00
         * TEXT :
         */

        @JSONField(name = "CODE")
        private String code;
        @JSONField(name = "TEXT")
        private String text;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class CustomBean {
        /**
         * AUDIT_ITEM_INTERMEDIARY : []
         * LASTTIMESTAMP : 1572407569000
         * AUDIT_MATERIAL : [{"partitionguid":"450700","is_generate_ecert":"0","year":1572364800000,"is_jzbm":"0","td_tlimit":"0","materialid":"b21dfa74-6ea9-4099-a764-cba3a3a07af1","is_need":"1","example_guid":"","original_amount":0,"jzbm_way":"","task_code":"1145072100811537184452004020000","material_form":"2","source_type":"10","by_law":"《中央预算内直接投资项目管理办法》（国家发改委令2014年第7号）","copy_amount":3,"source_explain":"申请人自备","page_format":"A4","fill_explian":"无","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","remark":"项目建议书批复文件或国家和自治区有关安排资金的通知文件、纳入国家、自治区或市建设规划的项目，提供有关文件","rowguid":"5a5b6acd-1f55-40e7-bd1e-a2093274cbae","operatedate":1572407820000,"material_type":"1","material_name":"项目建议书批复文件或国家和自治区有关安排资金的通知文件、纳入国家、自治区或市建设规划的项目（见备注）","sign_ask":"单位盖章","page_num":3,"ordernum":1,"td_correctway":"","accept_stand":"无","form_guid":""},{"partitionguid":"450700","is_generate_ecert":"0","year":1572364800000,"is_jzbm":"0","td_tlimit":"0","materialid":"ef81176c-4867-4f2d-a7a0-d107fa6b4cfe","is_need":"1","example_guid":"","original_amount":0,"jzbm_way":"","task_code":"1145072100811537184452004020000","material_form":"2","source_type":"10","by_law":"《固定资产投资项目节能审查办法》（2016年11月27日国家发展和改革委员会令第44号）","copy_amount":3,"source_explain":"申请人自备","page_format":"A4","fill_explian":"无","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","remark":"节能行政主管部门出具的节能审查意见（年综合能源消费量不满1000吨标准煤，且年电力消费量不满500万千瓦时的固定资产投资项目，以及《不单独进行节能审查的行业目录》（发改环资〔2017〕1975号）固定资产投资项目可不编制单独的节能报告，可在项目可行性研究报告中对项目能源利用情况、节能措施情况和能效水平进行分析）","rowguid":"63d0d440-359a-4f02-8a2c-c2b5f94c0ebb","operatedate":1572407052000,"material_type":"1","material_name":"节能行政主管部门出具的节能审查意见（详见备注）","sign_ask":"单位盖章","page_num":3,"ordernum":6,"td_correctway":"","accept_stand":"无","form_guid":""},{"partitionguid":"450700","is_generate_ecert":"0","year":1572364800000,"is_jzbm":"0","td_tlimit":"0","materialid":"a724e8ff-edc5-40d4-8bde-99fd44aba3c0","is_need":"1","example_guid":"","original_amount":1,"jzbm_way":"","task_code":"1145072100811537184452004020000","material_form":"1","source_type":"10","by_law":"《中央预算内直接投资项目管理办法》（国家发改委令2014年第7号）","copy_amount":0,"source_explain":"申请人自备","page_format":"A4","fill_explian":"无","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","remark":"无","rowguid":"6d979e1a-30dc-4526-a274-72631e3675d4","operatedate":1572407052000,"material_type":"1","material_name":"由相应工程咨询资格的机构出具的评估报告或行业主管部门审查意见","sign_ask":"评审机构盖章","page_num":1,"ordernum":3,"td_correctway":"","accept_stand":"无","form_guid":""},{"partitionguid":"450700","is_generate_ecert":"0","year":1572364800000,"is_jzbm":"0","td_tlimit":"0","materialid":"dba58d36-04d9-4b4c-a0d3-6fb2b75799ac","is_need":"1","example_guid":"","original_amount":0,"jzbm_way":"","task_code":"1145072100811537184452004020000","material_form":"2","source_type":"10","by_law":"《中央预算内直接投资项目管理办法》（国家发改委令2014年第7号）","copy_amount":3,"source_explain":"申请人自备","page_format":"A4","fill_explian":"无","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","remark":"无","rowguid":"8aad1a91-2d14-4dc0-a420-2b931d04c2a1","operatedate":1572407052000,"material_type":"1","material_name":"国土资源（海洋）行政主管部门出具的用地（用海）预审意见或土地权属证明","sign_ask":"单位盖章","page_num":3,"ordernum":5,"td_correctway":"","accept_stand":"无","form_guid":""},{"partitionguid":"450700","is_generate_ecert":"0","year":1572364800000,"is_jzbm":"0","td_tlimit":"0","materialid":"f803c63f-befb-46c8-b1d1-8f26acbdac6a","is_need":"1","example_guid":"","original_amount":0,"jzbm_way":"","task_code":"1145072100811537184452004020000","material_form":"2","source_type":"10","by_law":"《中央预算内直接投资项目管理办法》（国家发改委令2014年第7号）","copy_amount":3,"source_explain":"申请人自备","page_format":"A4","fill_explian":"无","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","remark":"城市规划行政主管部门出具的城市规划意见或城市建设行政主管部门出具的项目建设选址意见书（仅指以划拨方式提供国有土地使用权的项目城市规划区域内的投资项目）","rowguid":"8b191567-10bb-49be-bcf9-79d6135b83c2","operatedate":1572407052000,"material_type":"1","material_name":"城市规划行政主管部门出具的城市规划意见或城市建设行政主管部门出具的项目建设选址意见书（详见备注）","sign_ask":"单位盖章","page_num":3,"ordernum":4,"td_correctway":"","accept_stand":"无","form_guid":""},{"partitionguid":"450700","is_generate_ecert":"0","year":1572364800000,"is_jzbm":"0","td_tlimit":"0","materialid":"a40cb4d0-a647-42ab-a8ff-604e4370cfb1","is_need":"1","example_guid":"","original_amount":0,"jzbm_way":"","task_code":"1145072100811537184452004020000","material_form":"2","source_type":"10","by_law":"《财政部 国家发展改革委 工业和信息化部 住房城乡建设部 人力资源社会保障部关于抓紧做好清理偿还政府欠款专项工作的通知》（财建〔2017〕26号）","copy_amount":3,"source_explain":"申请人自备","page_format":"A4","fill_explian":"无","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","remark":"农口项目可免","rowguid":"907965c6-52be-4c4b-b365-e35f94cdd1a2","operatedate":1572407052000,"material_type":"1","material_name":"项目资本金、有关地方配套、自筹资金及金融机构出具的筹资、贷款承诺书，其它资金来源落实情况材料","sign_ask":"单位盖章","page_num":1,"ordernum":7,"td_correctway":"","accept_stand":"无","form_guid":""},{"partitionguid":"450700","is_generate_ecert":"0","year":1572364800000,"is_jzbm":"0","td_tlimit":"0","materialid":"84d8fced-0b2f-455f-9d9d-dd17f6a5f714","is_need":"1","example_guid":"","original_amount":3,"jzbm_way":"","task_code":"1145072100811537184452004020000","material_form":"1","source_type":"10","by_law":"《中央预算内直接投资项目管理办法》（国家发改委令2014年第7号）","copy_amount":0,"source_explain":"申请人自备","page_format":"A4","fill_explian":"无","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","remark":"无","rowguid":"a93c23c4-a5b7-4d26-b45c-ae25a6bac6ee","operatedate":1572407052000,"material_type":"1","material_name":"由相应工程咨询资格的机构编制的可行性研究报告","sign_ask":"编制单位盖章","page_num":3,"ordernum":2,"td_correctway":"","accept_stand":"无","form_guid":""},{"partitionguid":"450700","is_generate_ecert":"0","year":1572364800000,"is_jzbm":"","td_tlimit":"0","materialid":"a30111bd-81da-424a-a5e8-927d3a2502bd","is_need":"2","example_guid":"7f47ae45-7895-4daa-9211-62a0f07f68c3","original_amount":0,"jzbm_way":"","task_code":"1145072100811537184452004020000","material_form":"2","source_type":"10","by_law":"《关于印发广西壮族自治区发展和改革委员会固定资产投资项目社会稳定风险评估暂行办法的通知》（桂发改投资﹝2013﹞833号","copy_amount":3,"source_explain":"申请人自备","page_format":"A4","fill_explian":"无","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","remark":"项目可行性研究报告审批的申请项目所在地县级以上人民政府出具的社会稳定风险评估意见（符合可以不做项目社会稳定风险评估条件的除外）","rowguid":"cf375a91-c583-4d51-b82d-777ce448f52b","operatedate":1572407052000,"material_type":"1","material_name":"项目可行性研究报告审批的申请项目所在地县级以上人民政府出具的社会稳定风险评估意见（详见备注）","sign_ask":"单位盖章","page_num":3,"ordernum":9,"td_correctway":"","accept_stand":"无","form_guid":"cfc39d85-ea96-4b52-8ee8-48773e7b2494"},{"partitionguid":"450700","is_generate_ecert":"0","year":1572364800000,"is_jzbm":"0","td_tlimit":"0","materialid":"7b8804c8-a887-4a27-88a7-b2fde4f7ca90","is_need":"1","example_guid":"","original_amount":1,"jzbm_way":"","task_code":"1145072100811537184452004020000","material_form":"1","source_type":"10","by_law":"《中央预算内直接投资项目管理办法》（国家发改委令2014年第7号）","copy_amount":0,"source_explain":"申请人自备","page_format":"A4","fill_explian":"无","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","remark":"无","rowguid":"e5a5858d-09ad-4f07-b0a3-9a7e6c570225","operatedate":1572407052000,"material_type":"1","material_name":"属上一级发展改革部门审批权限的项目，需提供同级发展改革部门或主管部门审核意见","sign_ask":"政府机构盖章","page_num":1,"ordernum":8,"td_correctway":"","accept_stand":"无","form_guid":""}]
         * AUDIT_MATERIAL_CONDITION : []
         * AUDIT_QA : [{"task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","partitionguid":"450700","question":"可行性研究报告批准后，下一步要开展什么工作？","year":1572364800000,"task_code":"1145072100811537184452004020000","operateusername":"陈泉树","ordernum":1,"rowguid":"091f4f03-761b-4fae-8769-22d89488d80e","operatedate":1572407052000,"missex":"无","answer":"项目单位依据可行性研究报告批复文件向城乡规划部门申请办理规划许可手续，向国土资源部门申请办理正式用地手续，委托具备相应资质的设计单位依据经批准的可行性研究报告和勘察情况等编制初步设计及工程概算。","qaid":"92006779-db32-45d0-b037-c46d8a946d54"}]
         * AUDIT_ITEM_EXTEND : [{"partitionguid":"450700","year":1572364800000,"amount_limit_desc":"","result_name":"灵山县发展和改革局关于×××项目可行性研究报告的批复","four_handle":"2,4","is_schedule":"1","result_guid":"ec730428-2043-4181-afa7-9e764dabb74b,c699bcfe-694c-40a6-815f-1423f65f78a0","is_online_handle":"1","cjsqmc":"无","is_handle_machine":"0","task_code":"1145072100811537184452004020000","arrive_charge_way":"","is_agency":"0","cjsqdm":"无","handle_area":"4","theme_natural_type":"","is_express":"0","theme_legal_type":"040","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","is_intermediary":"0","lead_dept":"灵山县发展和改革局","handle_online_address":"http://qzls.zwfw.gxzf.gov.cn/","rowguid":"7b7a30c7-398d-4e6a-bc56-22facd931272","operatedate":1572407052000,"local_theme_natural_type":"","match_dept":"1. 城市规划行政主管部门  2. 自然资源行政主管部门","is_entry_center":"1","limit_explain":"","is_joint_org":"1","result_type":"20","wsblsd":"3,6","is_amount_limit":"0","is_cert_joint":"0","xzjddm":"无","sensitives":"0","is_intelli_approval":"0","local_theme_legal_type":"","scene_reason":"现场核验材料","xzjdmc":"无","is_pay_online":"0"}]
         * AUDIT_ITEM_SPECIAL : [{"task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","partitionguid":"450700","special_id":"18a857f7-5406-42fb-94c3-7a841699f7c9","year":1572407052000,"operateusername":"梁少丽","special_name":"9","special_date":30,"rowguid":"14f140c0-6f07-46d1-aaa9-4396a1183dbc","special_desc":"中华人民共和国国家发展和改革委员会令2017年第2号","operatedate":1572407052000,"special_date_type":"1","special_tel":"6428820","special_dept":"审批机构","ordernumber":1}]
         * AUDIT_ITEM_BYLAW : [{"law_id":"8f6438a0-d132-44e9-874d-d9fe904b5716","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","partitionguid":"450700","cataloglawid":"42b6c6e3-64aa-11e9-b33b-fa163ea9bf82","year":1572407052000,"clause_number":"第三条第四款","law_type":"2","ordernum":20,"clause_content":"对于政府投资项目，采用直接投资和资本金注入方式的，从投资决策角度只审批项目建议书和可行性研究报告，除特殊情况外不再审批开工报告，同时应严格政府投资项目的初步设计、概算审批工作","rowguid":"52450170-b938-4279-9b03-947f451b3ca5","operatedate":1572407052000,"law_name":"《国务院关于投资体制改革的决定》","law_dept":"国务院","law_number":"国发〔2004〕20号，2004年7月16日实施，国务院颁布","law_date":1089907200000},{"law_id":"b8b9fb0b-2219-4884-b2d1-e6d042d5c016","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","partitionguid":"450700","cataloglawid":"42bc7821-64aa-11e9-b33b-fa163ea9bf82","year":1572407052000,"clause_number":"第三条第一款","law_type":"3","ordernum":23,"clause_content":"直接投资项目实行审批制，包括审批项目建议书、可行性研究报告、初步设计。","rowguid":"61cef258-b41d-4e19-a699-d51a552a3a6d","operatedate":1572407052000,"law_name":"《中央预算内直接投资项目管理办法》","law_dept":"国家发展改革委","law_number":"国家发展改革委令2014年第7号，2014年3月1日实施，国家发展改革委颁布","law_date":1393603200000},{"law_id":"633f4b9f-07de-4f57-9335-cd506578d0b6","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","partitionguid":"450700","cataloglawid":"42c1f7ad-64aa-11e9-b33b-fa163ea9bf82","year":1572407052000,"clause_number":"第三条第七款","law_type":"2","ordernum":24,"clause_content":"改进和规范政府投资项目审批制，采用直接投资和资本金注入方式的项目，对经济社会发展、社会公众利益有重大影响或者投资规模较大的，要在咨询机构评估、公众参与、专家评议、风险评估等科学论证基础上，严格审批项目建议书、可行性研究报告、初步设计。","rowguid":"6f5bf4a3-29cb-401a-a0ed-98743eae9435","operatedate":1572407052000,"law_name":"《中共中央 国务院关于深化投融资体制改革的意见》（）三(七)","law_dept":"中共中央 国务院","law_number":"中发〔2016〕18号，2016年7月5日实施，中共中央、国务院颁布","law_date":1467648000000},{"law_id":"7bd3f4f3-7731-418e-9dda-cca30c9f54a3","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","partitionguid":"450700","cataloglawid":"42c3cec0-64aa-11e9-b33b-fa163ea9bf82","year":1572407052000,"clause_number":"第五条第一款","law_type":"6","ordernum":22,"clause_content":"实行审批制的政府投资项目、实行核准制的企业投资项目以及需自治区发改委核报自治区人民政府或国家发展改革委审批、核准的项目，应在提交项目可行性研究报告或者项目申请报告之前，开展并完成项目社会稳定风险分析报告（篇章）编制和评估工作","rowguid":"74c0ef98-9407-49f7-ac73-2809227c0c3c","operatedate":1572407052000,"law_name":"《关于印发广西壮族自治区发展和改革委员会固定资产投资项目社会稳定风险评估暂行办法的通知》","law_dept":"广西壮族自治区发展和改革委员会","law_number":"桂发改投资﹝2013﹞833号,2013年7月9日实施，自治区发展改革委颁布","law_date":1373299200000},{"law_id":"199d184b-cb2b-41df-a614-c6ac9c1c3ec5","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","partitionguid":"450700","cataloglawid":"42bc4827-64aa-11e9-b33b-fa163ea9bf82","year":1572407052000,"clause_number":"第二款","law_type":"6","ordernum":21,"clause_content":"实行审批制的政府投资项目，项目单位应首先向发展改革等项目审批部门报送项目建议书，依据项目建议书批复文件分别向城乡规划、国土资源和环境保护部门申请办理规划选址、用地预审和环境影响评价审批手续。完成相关手续后，项目单位根据项目论证情况向发展改革等项目审批部门报送可行性研究报告，并附规划选址、用地预审和环评审批文件","rowguid":"e08a20f1-789e-4a8a-9966-71872e4d7d60","operatedate":1572407052000,"law_name":"《国务院办公厅关于加强和规范新开工项目管理的通知》","law_dept":"国务院办公厅","law_number":"国办发〔2007〕64号，2007年11月17日实施，国务院办公厅颁布","law_date":1195228800000}]
         * AUDIT_ACCEPT_CONDITION : []
         * AUDIT_CHARGE : []
         * AUDIT_ITEM_WINDOW : [{"traffic_info":"可乘公交1路或101路到县政务服务中心站下车，沿着江南路往南过红绿灯再走50米左右","task_guid":"090d24c4-4233-4def-9a97-1be66896c76e","partitionguid":"450700","transact_addr":"灵山县三海街道江南路5号县政务服务中心法人大厅②工程建设项目综合窗口（县卫生监督所一楼）","window_name":"县政务服务中心法人大厅②工程建设项目综合窗口","window_tel":"0777\u20146428820","year":1572364800000,"map_url":"https://j.map.baidu.com/D6EEG","rowguid":"c5a73c2f-f536-4d33-9056-c16fc572bb41","transact_time":"工作日：上午9:00-12:00，下午14:00-17:00，法定节假日除外。","operatedate":1572407052000,"ordernumber":1,"window_id":"c9e71435-81a4-4c86-a8e4-44a8807d4fa5"}]
         * RETURNITEMSUNNUM : 1
         * AUDIT_ITEM : [{"dept_code":"114507210081153718","year":1572407052000,"flow_chart":"ecffd209-e349-42c7-ae20-8136166ce48b,1e969d79-18ea-450b-bacc-8cb59baf38f4","td_tlimit":"0","login_url":"http://qzls.zwfw.gxzf.gov.cn/","accept_name":"1.符合国家有关法律法规，符合国民经济和社会发展规划、行业规划、产业政策、行业准入标准、土地利用总体规划和城市总体规划，符合国家宏观调控政策，地区布局合理。\n    2.根据《国家发展改革委关于全国投资项目在线审批监管平台正式运行的通知》（发改投资〔2017〕197号）、《广西壮族自治区人民政府办公厅关于印发广西投资项目在线并联审批监管平台运行管理暂行办法的通知》（桂政办发〔2017〕6号）自2017年2月1日起，除涉及国家秘密的项目外，项目审批、核准、备案以及所涉及的各类审批事项都必须通过在线平台办理，各级政府有关部门统一使用在线平台生成的项目代码办理相关手续。\n       3.可行性研究报告审批\n    （1）由相应工程咨询资格的机构编制的可行性研究报告；\n    （2）由相应工程咨询资格的机构出具的评估意见或行业主管部门出具的审查意见；\n    （3）城市规划行政主管部门出具的城市规划意见或城市建设行政主管部门出具的项目建设选址意见书（仅指以划拨方式提供国有土地使用权、城市规划区域内的投资项目）；\n    （4）国土资源（海洋）行政主管部门出具的用地（用海）预审意见或土地权属证明；\n    （5）重特大项目需提供环境保护行政主管部门出具的环境影响评价文件的审批意见；\n    （6）节能行政主管部门出具的节能审查意见；\n    （7）有关地方配套、企业自筹及金融机构出具的筹资、贷款承诺书；\n      4.申报批复事项所要求备齐的文件和材料将随国家、自治区和市本级发布的新规适时进行补充或调整。","exercise_content":"参照《中央预算内直接投资项目管理办法》；自治区层面由自治区级财政投资的政务信息化项目前期审批。","link_way":"0777\u20146428820","pvi_guid":"d73deab0-6ab5-435e-9b4e-1cc63a663eae","is_need_entry":"1","query_url":"0777\u20146428820","is_bjxs":"1","catalog_id":"ba0fb605-409b-4e61-8ffd-02da1b849b0d","anticipate_day_explain":"无","item_source":"1","pre_dept_name":"1、城市规划行政主管部门;2、自然资源（海洋）行政主管部门;3、出具市有关安排资金的通知文件、纳入国家、自治区或市建设规划项目的单位。","contractor":"钦州市发改委","serve_type":"3,6","operateusername":"梁少丽","use_level":"4","areacode":"450721","operatedate":1572407052000,"check_flag":"0","is_td":"0","publishdate":1572408063000,"dept_type":"1","publishstatus":"1","task_version":11,"is_fee":"0","gscapproveprojectcodeid":"Gx-Gsc-App-69420-636667511770000000","audit_state":"40","ouguid":"516c249e17034981960beb475083f341","is_mobile_entry":"0","task_state":"1","version_date":1572407569000,"reconsiderat":"公民、法人或者其他组织认为具体行政行为侵犯其合法权益的，可以自知道该具体行政行为之日起六十日内提出行政复议申请。","td_conrection_way":"","anticipate_type":"1","task_type":"20","partitionguid":"450700","accept_std":"一、审查方式：书面审查。标准如下：\n    （一）申请书（表）的审查标准\n     1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核；\n     2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确；\n     3. 申请材料中的表格应使用国际标准A4型纸正面印制；\n     4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。\n    （二）证明文件等材料的审查标准\n     1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订；\n     2. 复印材料应清晰可辨认；\n     3. 证明材料相关内容与申请书（表）保持一致。","other_supervise":"无","create_date":1572407052000,"project_type":"2","report_sign":0,"task_code":"1145072100811537184452004020000","entrust_name":"","supervise_way":"0777\u20146428880","publicity_url":"http://wsbs.gxzf.gov.cn","transact_app_url":"","promise_day_explain":"无","task_name":"政府投资项目审批\u2014\u2014可行性研究报告审批","promise_type":"1","inspection_review":"3","handle_publicity":"05","pre_task_name":"1、城市规划行政主管部门出具的城市规划意见或城市建设行政主管部门出具的项目建设选址意见书（仅指以划拨方式提供国有土地使用权、城市规划区域内的投资项目）;2、国土资源（海洋）行政主管部门出具的用地（用海）预审意见或土地权属证明;3、项目建议书批复文件或国家和自治区有关安排资金的通知文件、纳入国家或自治区建设规划的项目，提供有关文件。","canuse":"1","rowguid":"090d24c4-4233-4def-9a97-1be66896c76e","promise_day":5,"anticipate_day":20,"is_history":"0","other_link":"无","authority_division":"　　原则上，市级发展改革委负责市本级预算内政府投资项目审批；县（市、区）发展改革委负责同级预算内政府投资项目审批。但国家对政府投资项目审批权限另有规定的，从其规定。\n　　《中共中央办公厅、国务院办公厅关于进一步严格控制党政机关办公楼等楼堂馆所建设问题的通知》（中办发〔2007〕11号）、《自治区党委办公厅、自治区人民政府办公厅转发自治区纪委等7部门<关于进一步严格控制我区党政机关办公楼等楼堂馆所建设的意见>的通知》（桂办发〔2008〕45号）规定：所有新建、扩建、迁建、购置、装修改造党政机关办公楼项目，市、县（市、区）党政机关办公楼建设项目，由自治区发展改革委核报自治区人民政府审批。","catalog_code":"452004020000","item_id":"e1e0ca77-23c0-4f35-8ce8-097815bdb77b","limit_scene_num":1,"dept_name":"灵山县发展和改革局","handle_type":"1,2","litigation":"1.公民、法人或者其他组织不服复议决定的，可以在收到复议决定书之日起十五日内向人民法院提起诉讼。复议机关逾期不作决定的，申请人可以在复议期满之日起十五日内向人民法院提起诉讼。\n    2.公民、法人或者其他组织直接向人民法院提起诉讼的，应当自知道或者应当知道作出行政行为之日起六个月内提出。","progress_query_way":"02,04"}]
         * AUDIT_ITEM_CONDITION : []
         */

        @JSONField(name = "LASTTIMESTAMP")
        private long lastTimeStamp;
        @JSONField(name = "RETURNITEMSUNNUM")
        private int returnItemSunNum;
        @JSONField(name = "AUDIT_ITEM_INTERMEDIARY")
        private List<?> auditItemIntermediary;
        @JSONField(name = "AUDIT_MATERIAL")
        private List<AuditMaterialBean> auditMaterial;
        @JSONField(name = "AUDIT_MATERIAL_CONDITION")
        private List<?> auditMaterialCondition;
        @JSONField(name = "AUDIT_QA")
        private List<AuditQaBean> auditQa;
        @JSONField(name = "AUDIT_ITEM_EXTEND")
        private List<AuditItemExtendBean> auditItemExtend;
        @JSONField(name = "AUDIT_ITEM_SPECIAL")
        private List<AuditItemSpecialBean> auditItemSpecial;
        @JSONField(name = "AUDIT_ITEM_BYLAW")
        private List<AuditItemBylawBean> auditItemBylaw;
        @JSONField(name = "AUDIT_ACCEPT_CONDITION")
        private List<?> auditAcceptCondition;
        @JSONField(name = "AUDIT_CHARGE")
        private List<AuditChargeBean> auditCharge;
        @JSONField(name = "AUDIT_ITEM_WINDOW")
        private List<AuditItemWindowBean> auditItemWindow;
        @JSONField(name = "AUDIT_ITEM")
        private List<AuditItemBean> auditItem;
        @JSONField(name = "AUDIT_ITEM_CONDITION")
        private List<?> auditItemCondition;

        public long getLastTimeStamp() {
            return lastTimeStamp;
        }

        public void setLastTimeStamp(long lastTimeStamp) {
            this.lastTimeStamp = lastTimeStamp;
        }

        public int getReturnItemSunNum() {
            return returnItemSunNum;
        }

        public void setReturnItemSunNum(int returnItemSunNum) {
            this.returnItemSunNum = returnItemSunNum;
        }

        public List<?> getAuditItemIntermediary() {
            return auditItemIntermediary;
        }

        public void setAuditItemIntermediary(List<?> auditItemIntermediary) {
            this.auditItemIntermediary = auditItemIntermediary;
        }

        public List<AuditMaterialBean> getAuditMaterial() {
            return auditMaterial;
        }

        public void setAuditMaterial(List<AuditMaterialBean> auditMaterial) {
            this.auditMaterial = auditMaterial;
        }

        public List<?> getAuditMaterialCondition() {
            return auditMaterialCondition;
        }

        public void setAuditMaterialCondition(List<?> auditMaterialCondition) {
            this.auditMaterialCondition = auditMaterialCondition;
        }

        public List<AuditQaBean> getAuditQa() {
            return auditQa;
        }

        public void setAuditQa(List<AuditQaBean> auditQa) {
            this.auditQa = auditQa;
        }

        public List<AuditItemExtendBean> getAuditItemExtend() {
            return auditItemExtend;
        }

        public void setAuditItemExtend(List<AuditItemExtendBean> auditItemExtend) {
            this.auditItemExtend = auditItemExtend;
        }

        public List<AuditItemSpecialBean> getAuditItemSpecial() {
            return auditItemSpecial;
        }

        public void setAuditItemSpecial(List<AuditItemSpecialBean> auditItemSpecial) {
            this.auditItemSpecial = auditItemSpecial;
        }

        public List<AuditItemBylawBean> getAuditItemBylaw() {
            return auditItemBylaw;
        }

        public void setAuditItemBylaw(List<AuditItemBylawBean> auditItemBylaw) {
            this.auditItemBylaw = auditItemBylaw;
        }

        public List<?> getAuditAcceptCondition() {
            return auditAcceptCondition;
        }

        public void setAuditAcceptCondition(List<?> auditAcceptCondition) {
            this.auditAcceptCondition = auditAcceptCondition;
        }

        public List<AuditChargeBean> getAuditCharge() {
            return auditCharge;
        }

        public void setAuditCharge(List<AuditChargeBean> auditCharge) {
            this.auditCharge = auditCharge;
        }

        public List<AuditItemWindowBean> getAuditItemWindow() {
            return auditItemWindow;
        }

        public void setAuditItemWindow(List<AuditItemWindowBean> auditItemWindow) {
            this.auditItemWindow = auditItemWindow;
        }

        public List<AuditItemBean> getAuditItem() {
            return auditItem;
        }

        public void setAuditItem(List<AuditItemBean> auditItem) {
            this.auditItem = auditItem;
        }

        public List<?> getAuditItemCondition() {
            return auditItemCondition;
        }

        public void setAuditItemCondition(List<?> auditItemCondition) {
            this.auditItemCondition = auditItemCondition;
        }

        public static class AuditMaterialBean {
            /**AUDITMATERIALBean
             * partitionguid : 450700
             * is_generate_ecert : 0
             * year : 1572364800000
             * is_jzbm : 0
             * td_tlimit : 0
             * materialid : b21dfa74-6ea9-4099-a764-cba3a3a07af1
             * is_need : 1
             * example_guid :
             * original_amount : 0
             * jzbm_way :
             * task_code : 1145072100811537184452004020000
             * material_form : 2
             * source_type : 10
             * by_law : 《中央预算内直接投资项目管理办法》（国家发改委令2014年第7号）
             * copy_amount : 3
             * source_explain : 申请人自备
             * page_format : A4
             * fill_explian : 无
             * task_guid : 090d24c4-4233-4def-9a97-1be66896c76e
             * remark : 项目建议书批复文件或国家和自治区有关安排资金的通知文件、纳入国家、自治区或市建设规划的项目，提供有关文件
             * rowguid : 5a5b6acd-1f55-40e7-bd1e-a2093274cbae
             * operatedate : 1572407820000
             * material_type : 1
             * material_name : 项目建议书批复文件或国家和自治区有关安排资金的通知文件、纳入国家、自治区或市建设规划的项目（见备注）
             * sign_ask : 单位盖章
             * page_num : 3
             * ordernum : 1
             * td_correctway :
             * accept_stand : 无
             * form_guid :
             */

            @JSONField(name = "partitionguid")
            private String partitionguid;
            @JSONField(name = "is_generate_ecert")
            private String isGenerateEcert;
            @JSONField(name = "year")
            private long year;
            @JSONField(name = "is_jzbm")
            private String isJzbm;
            @JSONField(name = "td_tlimit")
            private String tdTlimit;
            @JSONField(name = "materialid")
            private String materialid;
            @JSONField(name = "is_need")
            private String isNeed;
            @JSONField(name = "example_guid")
            private String exampleGuid;
            @JSONField(name = "original_amount")
            private int originalAmount;
            @JSONField(name = "jzbm_way")
            private String jzbmWay;
            @JSONField(name = "task_code")
            private String taskCode;
            @JSONField(name = "material_form")
            private String materialForm;
            @JSONField(name = "source_type")
            private String sourceType;
            @JSONField(name = "by_law")
            private String byLaw;
            @JSONField(name = "copy_amount")
            private int copyAmount;
            @JSONField(name = "source_explain")
            private String sourceExplain;
            @JSONField(name = "page_format")
            private String pageFormat;
            @JSONField(name = "fill_explian")
            private String fillExplian;
            @JSONField(name = "task_guid")
            private String taskGuid;
            @JSONField(name = "remark")
            private String remark;
            @JSONField(name = "rowguid")
            private String rowguid;
            @JSONField(name = "operatedate")
            private long operatedate;
            @JSONField(name = "material_type")
            private String materialType;
            @JSONField(name = "material_name")
            private String materialName;
            @JSONField(name = "sign_ask")
            private String signAsk;
            @JSONField(name = "page_num")
            private int pageNum;
            @JSONField(name = "ordernum")
            private int ordernum;
            @JSONField(name = "td_correctway")
            private String tdCorrectway;
            @JSONField(name = "accept_stand")
            private String acceptStand;
            @JSONField(name = "form_guid")
            private String formGuid;

            public String getPartitionguid() {
                return partitionguid;
            }

            public void setPartitionguid(String partitionguid) {
                this.partitionguid = partitionguid;
            }

            public String getIsGenerateEcert() {
                return isGenerateEcert;
            }

            public void setIsGenerateEcert(String isGenerateEcert) {
                this.isGenerateEcert = isGenerateEcert;
            }

            public long getYear() {
                return year;
            }

            public void setYear(long year) {
                this.year = year;
            }

            public String getIsJzbm() {
                return isJzbm;
            }

            public void setIsJzbm(String isJzbm) {
                this.isJzbm = isJzbm;
            }

            public String getTdTlimit() {
                return tdTlimit;
            }

            public void setTdTlimit(String tdTlimit) {
                this.tdTlimit = tdTlimit;
            }

            public String getMaterialid() {
                return materialid;
            }

            public void setMaterialid(String materialid) {
                this.materialid = materialid;
            }

            public String getIsNeed() {
                return isNeed;
            }

            public void setIsNeed(String isNeed) {
                this.isNeed = isNeed;
            }

            public String getExampleGuid() {
                return exampleGuid;
            }

            public void setExampleGuid(String exampleGuid) {
                this.exampleGuid = exampleGuid;
            }

            public int getOriginalAmount() {
                return originalAmount;
            }

            public void setOriginalAmount(int originalAmount) {
                this.originalAmount = originalAmount;
            }

            public String getJzbmWay() {
                return jzbmWay;
            }

            public void setJzbmWay(String jzbmWay) {
                this.jzbmWay = jzbmWay;
            }

            public String getTaskCode() {
                return taskCode;
            }

            public void setTaskCode(String taskCode) {
                this.taskCode = taskCode;
            }

            public String getMaterialForm() {
                return materialForm;
            }

            public void setMaterialForm(String materialForm) {
                this.materialForm = materialForm;
            }

            public String getSourceType() {
                return sourceType;
            }

            public void setSourceType(String sourceType) {
                this.sourceType = sourceType;
            }

            public String getByLaw() {
                return byLaw;
            }

            public void setByLaw(String byLaw) {
                this.byLaw = byLaw;
            }

            public int getCopyAmount() {
                return copyAmount;
            }

            public void setCopyAmount(int copyAmount) {
                this.copyAmount = copyAmount;
            }

            public String getSourceExplain() {
                return sourceExplain;
            }

            public void setSourceExplain(String sourceExplain) {
                this.sourceExplain = sourceExplain;
            }

            public String getPageFormat() {
                return pageFormat;
            }

            public void setPageFormat(String pageFormat) {
                this.pageFormat = pageFormat;
            }

            public String getFillExplian() {
                return fillExplian;
            }

            public void setFillExplian(String fillExplian) {
                this.fillExplian = fillExplian;
            }

            public String getTaskGuid() {
                return taskGuid;
            }

            public void setTaskGuid(String taskGuid) {
                this.taskGuid = taskGuid;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getRowguid() {
                return rowguid;
            }

            public void setRowguid(String rowguid) {
                this.rowguid = rowguid;
            }

            public long getOperatedate() {
                return operatedate;
            }

            public void setOperatedate(long operatedate) {
                this.operatedate = operatedate;
            }

            public String getMaterialType() {
                return materialType;
            }

            public void setMaterialType(String materialType) {
                this.materialType = materialType;
            }

            public String getMaterialName() {
                return materialName;
            }

            public void setMaterialName(String materialName) {
                this.materialName = materialName;
            }

            public String getSignAsk() {
                return signAsk;
            }

            public void setSignAsk(String signAsk) {
                this.signAsk = signAsk;
            }

            public int getPageNum() {
                return pageNum;
            }

            public void setPageNum(int pageNum) {
                this.pageNum = pageNum;
            }

            public int getOrdernum() {
                return ordernum;
            }

            public void setOrdernum(int ordernum) {
                this.ordernum = ordernum;
            }

            public String getTdCorrectway() {
                return tdCorrectway;
            }

            public void setTdCorrectway(String tdCorrectway) {
                this.tdCorrectway = tdCorrectway;
            }

            public String getAcceptStand() {
                return acceptStand;
            }

            public void setAcceptStand(String acceptStand) {
                this.acceptStand = acceptStand;
            }

            public String getFormGuid() {
                return formGuid;
            }

            public void setFormGuid(String formGuid) {
                this.formGuid = formGuid;
            }
        }

        public static class AuditQaBean {
            /**
             * task_guid : 090d24c4-4233-4def-9a97-1be66896c76e
             * partitionguid : 450700
             * question : 可行性研究报告批准后，下一步要开展什么工作？
             * year : 1572364800000
             * task_code : 1145072100811537184452004020000
             * operateusername : 陈泉树
             * ordernum : 1
             * rowguid : 091f4f03-761b-4fae-8769-22d89488d80e
             * operatedate : 1572407052000
             * missex : 无
             * answer : 项目单位依据可行性研究报告批复文件向城乡规划部门申请办理规划许可手续，向国土资源部门申请办理正式用地手续，委托具备相应资质的设计单位依据经批准的可行性研究报告和勘察情况等编制初步设计及工程概算。
             * qaid : 92006779-db32-45d0-b037-c46d8a946d54
             */

            @JSONField(name = "task_guid")
            private String taskGuid;
            @JSONField(name = "partitionguid")
            private String partitionguid;
            @JSONField(name = "question")
            private String question;
            @JSONField(name = "year")
            private long year;
            @JSONField(name = "task_code")
            private String taskCode;
            @JSONField(name = "operateusername")
            private String operateusername;
            @JSONField(name = "ordernum")
            private int ordernum;
            @JSONField(name = "rowguid")
            private String rowguid;
            @JSONField(name = "operatedate")
            private long operatedate;
            @JSONField(name = "missex")
            private String missex;
            @JSONField(name = "answer")
            private String answer;
            @JSONField(name = "qaid")
            private String qaid;

            public String getTaskGuid() {
                return taskGuid;
            }

            public void setTaskGuid(String taskGuid) {
                this.taskGuid = taskGuid;
            }

            public String getPartitionguid() {
                return partitionguid;
            }

            public void setPartitionguid(String partitionguid) {
                this.partitionguid = partitionguid;
            }

            public String getQuestion() {
                return question;
            }

            public void setQuestion(String question) {
                this.question = question;
            }

            public long getYear() {
                return year;
            }

            public void setYear(long year) {
                this.year = year;
            }

            public String getTaskCode() {
                return taskCode;
            }

            public void setTaskCode(String taskCode) {
                this.taskCode = taskCode;
            }

            public String getOperateusername() {
                return operateusername;
            }

            public void setOperateusername(String operateusername) {
                this.operateusername = operateusername;
            }

            public int getOrdernum() {
                return ordernum;
            }

            public void setOrdernum(int ordernum) {
                this.ordernum = ordernum;
            }

            public String getRowguid() {
                return rowguid;
            }

            public void setRowguid(String rowguid) {
                this.rowguid = rowguid;
            }

            public long getOperatedate() {
                return operatedate;
            }

            public void setOperatedate(long operatedate) {
                this.operatedate = operatedate;
            }

            public String getMissex() {
                return missex;
            }

            public void setMissex(String missex) {
                this.missex = missex;
            }

            public String getAnswer() {
                return answer;
            }

            public void setAnswer(String answer) {
                this.answer = answer;
            }

            public String getQaid() {
                return qaid;
            }

            public void setQaid(String qaid) {
                this.qaid = qaid;
            }
        }

        public static class AuditItemExtendBean {
            /**
             * partitionguid : 450700
             * year : 1572364800000
             * amount_limit_desc :
             * result_name : 灵山县发展和改革局关于×××项目可行性研究报告的批复
             * four_handle : 2,4
             * is_schedule : 1
             * result_guid : ec730428-2043-4181-afa7-9e764dabb74b,c699bcfe-694c-40a6-815f-1423f65f78a0
             * is_online_handle : 1
             * cjsqmc : 无
             * is_handle_machine : 0
             * task_code : 1145072100811537184452004020000
             * arrive_charge_way :
             * is_agency : 0
             * cjsqdm : 无
             * handle_area : 4
             * theme_natural_type :
             * is_express : 0
             * theme_legal_type : 040
             * task_guid : 090d24c4-4233-4def-9a97-1be66896c76e
             * is_intermediary : 0
             * lead_dept : 灵山县发展和改革局
             * handle_online_address : http://qzls.zwfw.gxzf.gov.cn/
             * rowguid : 7b7a30c7-398d-4e6a-bc56-22facd931272
             * operatedate : 1572407052000
             * local_theme_natural_type :
             * match_dept : 1. 城市规划行政主管部门  2. 自然资源行政主管部门
             * is_entry_center : 1
             * limit_explain :
             * is_joint_org : 1
             * result_type : 20
             * wsblsd : 3,6
             * is_amount_limit : 0
             * is_cert_joint : 0
             * xzjddm : 无
             * sensitives : 0
             * is_intelli_approval : 0
             * local_theme_legal_type :
             * scene_reason : 现场核验材料
             * xzjdmc : 无
             * is_pay_online : 0
             */

            @JSONField(name = "partitionguid")
            private String partitionguid;
            @JSONField(name = "year")
            private long year;
            @JSONField(name = "amount_limit_desc")
            private String amountLimitDesc;
            @JSONField(name = "result_name")
            private String resultName;
            @JSONField(name = "four_handle")
            private String fourHandle;
            @JSONField(name = "is_schedule")
            private String isSchedule;
            @JSONField(name = "result_guid")
            private String resultGuid;
            @JSONField(name = "is_online_handle")
            private String isOnlineHandle;
            @JSONField(name = "cjsqmc")
            private String cjsqmc;
            @JSONField(name = "is_handle_machine")
            private String isHandleMachine;
            @JSONField(name = "task_code")
            private String taskCode;
            @JSONField(name = "arrive_charge_way")
            private String arriveChargeWay;
            @JSONField(name = "is_agency")
            private String isAgency;
            @JSONField(name = "cjsqdm")
            private String cjsqdm;
            @JSONField(name = "handle_area")
            private String handleArea;
            @JSONField(name = "theme_natural_type")
            private String themeNaturalType;
            @JSONField(name = "is_express")
            private String isExpress;
            @JSONField(name = "theme_legal_type")
            private String themeLegalType;
            @JSONField(name = "task_guid")
            private String taskGuid;
            @JSONField(name = "is_intermediary")
            private String isIntermediary;
            @JSONField(name = "lead_dept")
            private String leadDept;
            @JSONField(name = "handle_online_address")
            private String handleOnlineAddress;
            @JSONField(name = "rowguid")
            private String rowguid;
            @JSONField(name = "operatedate")
            private long operatedate;
            @JSONField(name = "local_theme_natural_type")
            private String localThemeNaturalType;
            @JSONField(name = "match_dept")
            private String matchDept;
            @JSONField(name = "is_entry_center")
            private String isEntryCenter;
            @JSONField(name = "limit_explain")
            private String limitExplain;
            @JSONField(name = "is_joint_org")
            private String isJointOrg;
            @JSONField(name = "result_type")
            private String resultType;
            @JSONField(name = "wsblsd")
            private String wsblsd;
            @JSONField(name = "is_amount_limit")
            private String isAmountLimit;
            @JSONField(name = "is_cert_joint")
            private String isCertJoint;
            @JSONField(name = "xzjddm")
            private String xzjddm;
            @JSONField(name = "sensitives")
            private String sensitives;
            @JSONField(name = "is_intelli_approval")
            private String isIntelliApproval;
            @JSONField(name = "local_theme_legal_type")
            private String localThemeLegalType;
            @JSONField(name = "scene_reason")
            private String sceneReason;
            @JSONField(name = "xzjdmc")
            private String xzjdmc;
            @JSONField(name = "is_pay_online")
            private String isPayOnline;

            public String getPartitionguid() {
                return partitionguid;
            }

            public void setPartitionguid(String partitionguid) {
                this.partitionguid = partitionguid;
            }

            public long getYear() {
                return year;
            }

            public void setYear(long year) {
                this.year = year;
            }

            public String getAmountLimitDesc() {
                return amountLimitDesc;
            }

            public void setAmountLimitDesc(String amountLimitDesc) {
                this.amountLimitDesc = amountLimitDesc;
            }

            public String getResultName() {
                return resultName;
            }

            public void setResultName(String resultName) {
                this.resultName = resultName;
            }

            public String getFourHandle() {
                return fourHandle;
            }

            public void setFourHandle(String fourHandle) {
                this.fourHandle = fourHandle;
            }

            public String getIsSchedule() {
                return isSchedule;
            }

            public void setIsSchedule(String isSchedule) {
                this.isSchedule = isSchedule;
            }

            public String getResultGuid() {
                return resultGuid;
            }

            public void setResultGuid(String resultGuid) {
                this.resultGuid = resultGuid;
            }

            public String getIsOnlineHandle() {
                return isOnlineHandle;
            }

            public void setIsOnlineHandle(String isOnlineHandle) {
                this.isOnlineHandle = isOnlineHandle;
            }

            public String getCjsqmc() {
                return cjsqmc;
            }

            public void setCjsqmc(String cjsqmc) {
                this.cjsqmc = cjsqmc;
            }

            public String getIsHandleMachine() {
                return isHandleMachine;
            }

            public void setIsHandleMachine(String isHandleMachine) {
                this.isHandleMachine = isHandleMachine;
            }

            public String getTaskCode() {
                return taskCode;
            }

            public void setTaskCode(String taskCode) {
                this.taskCode = taskCode;
            }

            public String getArriveChargeWay() {
                return arriveChargeWay;
            }

            public void setArriveChargeWay(String arriveChargeWay) {
                this.arriveChargeWay = arriveChargeWay;
            }

            public String getIsAgency() {
                return isAgency;
            }

            public void setIsAgency(String isAgency) {
                this.isAgency = isAgency;
            }

            public String getCjsqdm() {
                return cjsqdm;
            }

            public void setCjsqdm(String cjsqdm) {
                this.cjsqdm = cjsqdm;
            }

            public String getHandleArea() {
                return handleArea;
            }

            public void setHandleArea(String handleArea) {
                this.handleArea = handleArea;
            }

            public String getThemeNaturalType() {
                return themeNaturalType;
            }

            public void setThemeNaturalType(String themeNaturalType) {
                this.themeNaturalType = themeNaturalType;
            }

            public String getIsExpress() {
                return isExpress;
            }

            public void setIsExpress(String isExpress) {
                this.isExpress = isExpress;
            }

            public String getThemeLegalType() {
                return themeLegalType;
            }

            public void setThemeLegalType(String themeLegalType) {
                this.themeLegalType = themeLegalType;
            }

            public String getTaskGuid() {
                return taskGuid;
            }

            public void setTaskGuid(String taskGuid) {
                this.taskGuid = taskGuid;
            }

            public String getIsIntermediary() {
                return isIntermediary;
            }

            public void setIsIntermediary(String isIntermediary) {
                this.isIntermediary = isIntermediary;
            }

            public String getLeadDept() {
                return leadDept;
            }

            public void setLeadDept(String leadDept) {
                this.leadDept = leadDept;
            }

            public String getHandleOnlineAddress() {
                return handleOnlineAddress;
            }

            public void setHandleOnlineAddress(String handleOnlineAddress) {
                this.handleOnlineAddress = handleOnlineAddress;
            }

            public String getRowguid() {
                return rowguid;
            }

            public void setRowguid(String rowguid) {
                this.rowguid = rowguid;
            }

            public long getOperatedate() {
                return operatedate;
            }

            public void setOperatedate(long operatedate) {
                this.operatedate = operatedate;
            }

            public String getLocalThemeNaturalType() {
                return localThemeNaturalType;
            }

            public void setLocalThemeNaturalType(String localThemeNaturalType) {
                this.localThemeNaturalType = localThemeNaturalType;
            }

            public String getMatchDept() {
                return matchDept;
            }

            public void setMatchDept(String matchDept) {
                this.matchDept = matchDept;
            }

            public String getIsEntryCenter() {
                return isEntryCenter;
            }

            public void setIsEntryCenter(String isEntryCenter) {
                this.isEntryCenter = isEntryCenter;
            }

            public String getLimitExplain() {
                return limitExplain;
            }

            public void setLimitExplain(String limitExplain) {
                this.limitExplain = limitExplain;
            }

            public String getIsJointOrg() {
                return isJointOrg;
            }

            public void setIsJointOrg(String isJointOrg) {
                this.isJointOrg = isJointOrg;
            }

            public String getResultType() {
                return resultType;
            }

            public void setResultType(String resultType) {
                this.resultType = resultType;
            }

            public String getWsblsd() {
                return wsblsd;
            }

            public void setWsblsd(String wsblsd) {
                this.wsblsd = wsblsd;
            }

            public String getIsAmountLimit() {
                return isAmountLimit;
            }

            public void setIsAmountLimit(String isAmountLimit) {
                this.isAmountLimit = isAmountLimit;
            }

            public String getIsCertJoint() {
                return isCertJoint;
            }

            public void setIsCertJoint(String isCertJoint) {
                this.isCertJoint = isCertJoint;
            }

            public String getXzjddm() {
                return xzjddm;
            }

            public void setXzjddm(String xzjddm) {
                this.xzjddm = xzjddm;
            }

            public String getSensitives() {
                return sensitives;
            }

            public void setSensitives(String sensitives) {
                this.sensitives = sensitives;
            }

            public String getIsIntelliApproval() {
                return isIntelliApproval;
            }

            public void setIsIntelliApproval(String isIntelliApproval) {
                this.isIntelliApproval = isIntelliApproval;
            }

            public String getLocalThemeLegalType() {
                return localThemeLegalType;
            }

            public void setLocalThemeLegalType(String localThemeLegalType) {
                this.localThemeLegalType = localThemeLegalType;
            }

            public String getSceneReason() {
                return sceneReason;
            }

            public void setSceneReason(String sceneReason) {
                this.sceneReason = sceneReason;
            }

            public String getXzjdmc() {
                return xzjdmc;
            }

            public void setXzjdmc(String xzjdmc) {
                this.xzjdmc = xzjdmc;
            }

            public String getIsPayOnline() {
                return isPayOnline;
            }

            public void setIsPayOnline(String isPayOnline) {
                this.isPayOnline = isPayOnline;
            }
        }

        public static class AuditItemSpecialBean {
            /**
             * task_guid : 090d24c4-4233-4def-9a97-1be66896c76e
             * partitionguid : 450700
             * special_id : 18a857f7-5406-42fb-94c3-7a841699f7c9
             * year : 1572407052000
             * operateusername : 梁少丽
             * special_name : 9
             * special_date : 30
             * rowguid : 14f140c0-6f07-46d1-aaa9-4396a1183dbc
             * special_desc : 中华人民共和国国家发展和改革委员会令2017年第2号
             * operatedate : 1572407052000
             * special_date_type : 1
             * special_tel : 6428820
             * special_dept : 审批机构
             * ordernumber : 1
             */

            @JSONField(name = "task_guid")
            private String taskGuid;
            @JSONField(name = "partitionguid")
            private String partitionguid;
            @JSONField(name = "special_id")
            private String specialId;
            @JSONField(name = "year")
            private long year;
            @JSONField(name = "operateusername")
            private String operateusername;
            @JSONField(name = "special_name")
            private String specialName;
            @JSONField(name = "special_date")
            private int specialDate;
            @JSONField(name = "rowguid")
            private String rowguid;
            @JSONField(name = "special_desc")
            private String specialDesc;
            @JSONField(name = "operatedate")
            private long operatedate;
            @JSONField(name = "special_date_type")
            private String specialDateType;
            @JSONField(name = "special_tel")
            private String specialTel;
            @JSONField(name = "special_dept")
            private String specialDept;
            @JSONField(name = "ordernumber")
            private int ordernumber;

            public String getTaskGuid() {
                return taskGuid;
            }

            public void setTaskGuid(String taskGuid) {
                this.taskGuid = taskGuid;
            }

            public String getPartitionguid() {
                return partitionguid;
            }

            public void setPartitionguid(String partitionguid) {
                this.partitionguid = partitionguid;
            }

            public String getSpecialId() {
                return specialId;
            }

            public void setSpecialId(String specialId) {
                this.specialId = specialId;
            }

            public long getYear() {
                return year;
            }

            public void setYear(long year) {
                this.year = year;
            }

            public String getOperateusername() {
                return operateusername;
            }

            public void setOperateusername(String operateusername) {
                this.operateusername = operateusername;
            }

            public String getSpecialName() {
                return specialName;
            }

            public void setSpecialName(String specialName) {
                this.specialName = specialName;
            }

            public int getSpecialDate() {
                return specialDate;
            }

            public void setSpecialDate(int specialDate) {
                this.specialDate = specialDate;
            }

            public String getRowguid() {
                return rowguid;
            }

            public void setRowguid(String rowguid) {
                this.rowguid = rowguid;
            }

            public String getSpecialDesc() {
                return specialDesc;
            }

            public void setSpecialDesc(String specialDesc) {
                this.specialDesc = specialDesc;
            }

            public long getOperatedate() {
                return operatedate;
            }

            public void setOperatedate(long operatedate) {
                this.operatedate = operatedate;
            }

            public String getSpecialDateType() {
                return specialDateType;
            }

            public void setSpecialDateType(String specialDateType) {
                this.specialDateType = specialDateType;
            }

            public String getSpecialTel() {
                return specialTel;
            }

            public void setSpecialTel(String specialTel) {
                this.specialTel = specialTel;
            }

            public String getSpecialDept() {
                return specialDept;
            }

            public void setSpecialDept(String specialDept) {
                this.specialDept = specialDept;
            }

            public int getOrdernumber() {
                return ordernumber;
            }

            public void setOrdernumber(int ordernumber) {
                this.ordernumber = ordernumber;
            }
        }

        public static class AuditItemBylawBean {
            /**
             * law_id : 8f6438a0-d132-44e9-874d-d9fe904b5716
             * task_guid : 090d24c4-4233-4def-9a97-1be66896c76e
             * partitionguid : 450700
             * cataloglawid : 42b6c6e3-64aa-11e9-b33b-fa163ea9bf82
             * year : 1572407052000
             * clause_number : 第三条第四款
             * law_type : 2
             * ordernum : 20
             * clause_content : 对于政府投资项目，采用直接投资和资本金注入方式的，从投资决策角度只审批项目建议书和可行性研究报告，除特殊情况外不再审批开工报告，同时应严格政府投资项目的初步设计、概算审批工作
             * rowguid : 52450170-b938-4279-9b03-947f451b3ca5
             * operatedate : 1572407052000
             * law_name : 《国务院关于投资体制改革的决定》
             * law_dept : 国务院
             * law_number : 国发〔2004〕20号，2004年7月16日实施，国务院颁布
             * law_date : 1089907200000
             */

            @JSONField(name = "law_id")
            private String lawId;
            @JSONField(name = "task_guid")
            private String taskGuid;
            @JSONField(name = "partitionguid")
            private String partitionguid;
            @JSONField(name = "cataloglawid")
            private String cataloglawid;
            @JSONField(name = "year")
            private long year;
            @JSONField(name = "clause_number")
            private String clauseNumber;
            @JSONField(name = "law_type")
            private String lawType;
            @JSONField(name = "ordernum")
            private int ordernum;
            @JSONField(name = "clause_content")
            private String clauseContent;
            @JSONField(name = "rowguid")
            private String rowguid;
            @JSONField(name = "operatedate")
            private long operatedate;
            @JSONField(name = "law_name")
            private String lawName;
            @JSONField(name = "law_dept")
            private String lawDept;
            @JSONField(name = "law_number")
            private String lawNumber;
            @JSONField(name = "law_date")
            private long lawDate;

            public String getLawId() {
                return lawId;
            }

            public void setLawId(String lawId) {
                this.lawId = lawId;
            }

            public String getTaskGuid() {
                return taskGuid;
            }

            public void setTaskGuid(String taskGuid) {
                this.taskGuid = taskGuid;
            }

            public String getPartitionguid() {
                return partitionguid;
            }

            public void setPartitionguid(String partitionguid) {
                this.partitionguid = partitionguid;
            }

            public String getCataloglawid() {
                return cataloglawid;
            }

            public void setCataloglawid(String cataloglawid) {
                this.cataloglawid = cataloglawid;
            }

            public long getYear() {
                return year;
            }

            public void setYear(long year) {
                this.year = year;
            }

            public String getClauseNumber() {
                return clauseNumber;
            }

            public void setClauseNumber(String clauseNumber) {
                this.clauseNumber = clauseNumber;
            }

            public String getLawType() {
                return lawType;
            }

            public void setLawType(String lawType) {
                this.lawType = lawType;
            }

            public int getOrdernum() {
                return ordernum;
            }

            public void setOrdernum(int ordernum) {
                this.ordernum = ordernum;
            }

            public String getClauseContent() {
                return clauseContent;
            }

            public void setClauseContent(String clauseContent) {
                this.clauseContent = clauseContent;
            }

            public String getRowguid() {
                return rowguid;
            }

            public void setRowguid(String rowguid) {
                this.rowguid = rowguid;
            }

            public long getOperatedate() {
                return operatedate;
            }

            public void setOperatedate(long operatedate) {
                this.operatedate = operatedate;
            }

            public String getLawName() {
                return lawName;
            }

            public void setLawName(String lawName) {
                this.lawName = lawName;
            }

            public String getLawDept() {
                return lawDept;
            }

            public void setLawDept(String lawDept) {
                this.lawDept = lawDept;
            }

            public String getLawNumber() {
                return lawNumber;
            }

            public void setLawNumber(String lawNumber) {
                this.lawNumber = lawNumber;
            }

            public long getLawDate() {
                return lawDate;
            }

            public void setLawDate(long lawDate) {
                this.lawDate = lawDate;
            }
        }
        public static class AuditChargeBean{
            @JSONField(name = "rowguid")
            private String rowguid;
            @JSONField(name = "task_guid")
            private String taskGuid;
            @JSONField(name = "fee_name")
            private String feeName;
            @JSONField(name = "fee_stand")
            private String feeStand;
            @JSONField(name = "is_desc")
            private String isDesc;

            @JSONField(name = "desc_explain")
            private String descExplain;

            @JSONField(name = "remark")
            private String remark;

            @JSONField(name = "ordernum")
            private int ordernum;

            @JSONField(name = "task_code")
            private String taskCode;
            @JSONField(name = "partitionguid")
            private String partitionguid;
            @JSONField(name = "year")
            private long year;
            @JSONField(name = "chargeid")
            private String chargeid;
            @JSONField(name = "ywcode")
            private String ywcode;
            @JSONField(name = "charge_prop")
            private String chargeProp;
            @JSONField(name = "desc_condition")
            private String descCondition;

            public String getRowguid() {
                return rowguid;
            }

            public void setRowguid(String rowguid) {
                this.rowguid = rowguid;
            }

            public String getTaskGuid() {
                return taskGuid;
            }

            public void setTaskGuid(String taskGuid) {
                this.taskGuid = taskGuid;
            }

            public String getFeeName() {
                return feeName;
            }

            public void setFeeName(String feeName) {
                this.feeName = feeName;
            }

            public String getFeeStand() {
                return feeStand;
            }

            public void setFeeStand(String feeStand) {
                this.feeStand = feeStand;
            }

            public String getIsDesc() {
                return isDesc;
            }

            public void setIsDesc(String isDesc) {
                this.isDesc = isDesc;
            }

            public String getDescExplain() {
                return descExplain;
            }

            public void setDescExplain(String descExplain) {
                this.descExplain = descExplain;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public int getOrdernum() {
                return ordernum;
            }

            public void setOrdernum(int ordernum) {
                this.ordernum = ordernum;
            }

            public String getTaskCode() {
                return taskCode;
            }

            public void setTaskCode(String taskCode) {
                this.taskCode = taskCode;
            }

            public String getPartitionguid() {
                return partitionguid;
            }

            public void setPartitionguid(String partitionguid) {
                this.partitionguid = partitionguid;
            }

            public long getYear() {
                return year;
            }

            public void setYear(long year) {
                this.year = year;
            }

            public String getChargeid() {
                return chargeid;
            }

            public void setChargeid(String chargeid) {
                this.chargeid = chargeid;
            }

            public String getYwcode() {
                return ywcode;
            }

            public void setYwcode(String ywcode) {
                this.ywcode = ywcode;
            }

            public String getChargeProp() {
                return chargeProp;
            }

            public void setChargeProp(String chargeProp) {
                this.chargeProp = chargeProp;
            }

            public String getDescCondition() {
                return descCondition;
            }

            public void setDescCondition(String descCondition) {
                this.descCondition = descCondition;
            }
        }
        public static class AuditItemWindowBean {
            /**
             * traffic_info : 可乘公交1路或101路到县政务服务中心站下车，沿着江南路往南过红绿灯再走50米左右
             * task_guid : 090d24c4-4233-4def-9a97-1be66896c76e
             * partitionguid : 450700
             * transact_addr : 灵山县三海街道江南路5号县政务服务中心法人大厅②工程建设项目综合窗口（县卫生监督所一楼）
             * window_name : 县政务服务中心法人大厅②工程建设项目综合窗口
             * window_tel : 0777—6428820
             * year : 1572364800000
             * map_url : https://j.map.baidu.com/D6EEG
             * rowguid : c5a73c2f-f536-4d33-9056-c16fc572bb41
             * transact_time : 工作日：上午9:00-12:00，下午14:00-17:00，法定节假日除外。
             * operatedate : 1572407052000
             * ordernumber : 1
             * window_id : c9e71435-81a4-4c86-a8e4-44a8807d4fa5
             */

            @JSONField(name = "traffic_info")
            private String trafficInfo;
            @JSONField(name = "task_guid")
            private String taskGuid;
            @JSONField(name = "partitionguid")
            private String partitionguid;
            @JSONField(name = "transact_addr")
            private String transactAddr;
            @JSONField(name = "window_name")
            private String windowName;
            @JSONField(name = "window_tel")
            private String windowTel;
            @JSONField(name = "year")
            private long year;
            @JSONField(name = "map_url")
            private String mapUrl;
            @JSONField(name = "rowguid")
            private String rowguid;
            @JSONField(name = "transact_time")
            private String transactTime;
            @JSONField(name = "operatedate")
            private long operatedate;
            @JSONField(name = "ordernumber")
            private int ordernumber;
            @JSONField(name = "window_id")
            private String windowId;

            public String getTrafficInfo() {
                return trafficInfo;
            }

            public void setTrafficInfo(String trafficInfo) {
                this.trafficInfo = trafficInfo;
            }

            public String getTaskGuid() {
                return taskGuid;
            }

            public void setTaskGuid(String taskGuid) {
                this.taskGuid = taskGuid;
            }

            public String getPartitionguid() {
                return partitionguid;
            }

            public void setPartitionguid(String partitionguid) {
                this.partitionguid = partitionguid;
            }

            public String getTransactAddr() {
                return transactAddr;
            }

            public void setTransactAddr(String transactAddr) {
                this.transactAddr = transactAddr;
            }

            public String getWindowName() {
                return windowName;
            }

            public void setWindowName(String windowName) {
                this.windowName = windowName;
            }

            public String getWindowTel() {
                return windowTel;
            }

            public void setWindowTel(String windowTel) {
                this.windowTel = windowTel;
            }

            public long getYear() {
                return year;
            }

            public void setYear(long year) {
                this.year = year;
            }

            public String getMapUrl() {
                return mapUrl;
            }

            public void setMapUrl(String mapUrl) {
                this.mapUrl = mapUrl;
            }

            public String getRowguid() {
                return rowguid;
            }

            public void setRowguid(String rowguid) {
                this.rowguid = rowguid;
            }

            public String getTransactTime() {
                return transactTime;
            }

            public void setTransactTime(String transactTime) {
                this.transactTime = transactTime;
            }

            public long getOperatedate() {
                return operatedate;
            }

            public void setOperatedate(long operatedate) {
                this.operatedate = operatedate;
            }

            public int getOrdernumber() {
                return ordernumber;
            }

            public void setOrdernumber(int ordernumber) {
                this.ordernumber = ordernumber;
            }

            public String getWindowId() {
                return windowId;
            }

            public void setWindowId(String windowId) {
                this.windowId = windowId;
            }
        }

        public static class AuditItemBean {
            /**
             * dept_code : 114507210081153718
             * year : 1572407052000
             * flow_chart : ecffd209-e349-42c7-ae20-8136166ce48b,1e969d79-18ea-450b-bacc-8cb59baf38f4
             * td_tlimit : 0
             * login_url : http://qzls.zwfw.gxzf.gov.cn/
             * accept_name : 1.符合国家有关法律法规，符合国民经济和社会发展规划、行业规划、产业政策、行业准入标准、土地利用总体规划和城市总体规划，符合国家宏观调控政策，地区布局合理。
             2.根据《国家发展改革委关于全国投资项目在线审批监管平台正式运行的通知》（发改投资〔2017〕197号）、《广西壮族自治区人民政府办公厅关于印发广西投资项目在线并联审批监管平台运行管理暂行办法的通知》（桂政办发〔2017〕6号）自2017年2月1日起，除涉及国家秘密的项目外，项目审批、核准、备案以及所涉及的各类审批事项都必须通过在线平台办理，各级政府有关部门统一使用在线平台生成的项目代码办理相关手续。
             3.可行性研究报告审批
             （1）由相应工程咨询资格的机构编制的可行性研究报告；
             （2）由相应工程咨询资格的机构出具的评估意见或行业主管部门出具的审查意见；
             （3）城市规划行政主管部门出具的城市规划意见或城市建设行政主管部门出具的项目建设选址意见书（仅指以划拨方式提供国有土地使用权、城市规划区域内的投资项目）；
             （4）国土资源（海洋）行政主管部门出具的用地（用海）预审意见或土地权属证明；
             （5）重特大项目需提供环境保护行政主管部门出具的环境影响评价文件的审批意见；
             （6）节能行政主管部门出具的节能审查意见；
             （7）有关地方配套、企业自筹及金融机构出具的筹资、贷款承诺书；
             4.申报批复事项所要求备齐的文件和材料将随国家、自治区和市本级发布的新规适时进行补充或调整。
             * exercise_content : 参照《中央预算内直接投资项目管理办法》；自治区层面由自治区级财政投资的政务信息化项目前期审批。
             * link_way : 0777—6428820
             * pvi_guid : d73deab0-6ab5-435e-9b4e-1cc63a663eae
             * is_need_entry : 1
             * query_url : 0777—6428820
             * is_bjxs : 1
             * catalog_id : ba0fb605-409b-4e61-8ffd-02da1b849b0d
             * anticipate_day_explain : 无
             * item_source : 1
             * pre_dept_name : 1、城市规划行政主管部门;2、自然资源（海洋）行政主管部门;3、出具市有关安排资金的通知文件、纳入国家、自治区或市建设规划项目的单位。
             * contractor : 钦州市发改委
             * serve_type : 3,6
             * operateusername : 梁少丽
             * use_level : 4
             * areacode : 450721
             * operatedate : 1572407052000
             * check_flag : 0
             * is_td : 0
             * publishdate : 1572408063000
             * dept_type : 1
             * publishstatus : 1
             * task_version : 11
             * is_fee : 0
             * gscapproveprojectcodeid : Gx-Gsc-App-69420-636667511770000000
             * audit_state : 40
             * ouguid : 516c249e17034981960beb475083f341
             * is_mobile_entry : 0
             * task_state : 1
             * version_date : 1572407569000
             * reconsiderat : 公民、法人或者其他组织认为具体行政行为侵犯其合法权益的，可以自知道该具体行政行为之日起六十日内提出行政复议申请。
             * td_conrection_way :
             * anticipate_type : 1
             * task_type : 20
             * partitionguid : 450700
             * accept_std : 一、审查方式：书面审查。标准如下：
             （一）申请书（表）的审查标准
             1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核；
             2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确；
             3. 申请材料中的表格应使用国际标准A4型纸正面印制；
             4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。
             （二）证明文件等材料的审查标准
             1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订；
             2. 复印材料应清晰可辨认；
             3. 证明材料相关内容与申请书（表）保持一致。
             * other_supervise : 无
             * create_date : 1572407052000
             * project_type : 2
             * report_sign : 0
             * task_code : 1145072100811537184452004020000
             * entrust_name :
             * supervise_way : 0777—6428880
             * publicity_url : http://wsbs.gxzf.gov.cn
             * transact_app_url :
             * promise_day_explain : 无
             * task_name : 政府投资项目审批——可行性研究报告审批
             * promise_type : 1
             * inspection_review : 3
             * handle_publicity : 05
             * pre_task_name : 1、城市规划行政主管部门出具的城市规划意见或城市建设行政主管部门出具的项目建设选址意见书（仅指以划拨方式提供国有土地使用权、城市规划区域内的投资项目）;2、国土资源（海洋）行政主管部门出具的用地（用海）预审意见或土地权属证明;3、项目建议书批复文件或国家和自治区有关安排资金的通知文件、纳入国家或自治区建设规划的项目，提供有关文件。
             * canuse : 1
             * rowguid : 090d24c4-4233-4def-9a97-1be66896c76e
             * promise_day : 5
             * anticipate_day : 20
             * is_history : 0
             * other_link : 无
             * authority_division : 　　原则上，市级发展改革委负责市本级预算内政府投资项目审批；县（市、区）发展改革委负责同级预算内政府投资项目审批。但国家对政府投资项目审批权限另有规定的，从其规定。
             　　《中共中央办公厅、国务院办公厅关于进一步严格控制党政机关办公楼等楼堂馆所建设问题的通知》（中办发〔2007〕11号）、《自治区党委办公厅、自治区人民政府办公厅转发自治区纪委等7部门<关于进一步严格控制我区党政机关办公楼等楼堂馆所建设的意见>的通知》（桂办发〔2008〕45号）规定：所有新建、扩建、迁建、购置、装修改造党政机关办公楼项目，市、县（市、区）党政机关办公楼建设项目，由自治区发展改革委核报自治区人民政府审批。
             * catalog_code : 452004020000
             * item_id : e1e0ca77-23c0-4f35-8ce8-097815bdb77b
             * limit_scene_num : 1
             * dept_name : 灵山县发展和改革局
             * handle_type : 1,2
             * litigation : 1.公民、法人或者其他组织不服复议决定的，可以在收到复议决定书之日起十五日内向人民法院提起诉讼。复议机关逾期不作决定的，申请人可以在复议期满之日起十五日内向人民法院提起诉讼。
             2.公民、法人或者其他组织直接向人民法院提起诉讼的，应当自知道或者应当知道作出行政行为之日起六个月内提出。
             * progress_query_way : 02,04
             */

            @JSONField(name = "dept_code")
            private String deptCode;
            @JSONField(name = "year")
            private long year;
            @JSONField(name = "flow_chart")
            private String flowChart;
            @JSONField(name = "td_tlimit")
            private String tdTlimit;
            @JSONField(name = "login_url")
            private String loginUrl;
            @JSONField(name = "accept_name")
            private String acceptName;
            @JSONField(name = "exercise_content")
            private String exerciseContent;
            @JSONField(name = "link_way")
            private String linkWay;
            @JSONField(name = "pvi_guid")
            private String pviGuid;
            @JSONField(name = "is_need_entry")
            private String isNeedEntry;
            @JSONField(name = "query_url")
            private String queryUrl;
            @JSONField(name = "is_bjxs")
            private String isBjxs;
            @JSONField(name = "catalog_id")
            private String catalogId;
            @JSONField(name = "anticipate_day_explain")
            private String anticipateDayExplain;
            @JSONField(name = "item_source")
            private String itemSource;
            @JSONField(name = "pre_dept_name")
            private String preDeptName;
            @JSONField(name = "contractor")
            private String contractor;
            @JSONField(name = "serve_type")
            private String serveType;
            @JSONField(name = "operateusername")
            private String operateusername;
            @JSONField(name = "use_level")
            private String useLevel;
            @JSONField(name = "areacode")
            private String areacode;
            @JSONField(name = "operatedate")
            private long operatedate;
            @JSONField(name = "check_flag")
            private String checkFlag;
            @JSONField(name = "is_td")
            private String isTd;
            @JSONField(name = "publishdate")
            private long publishdate;
            @JSONField(name = "dept_type")
            private String deptType;
            @JSONField(name = "publishstatus")
            private String publishstatus;
            @JSONField(name = "task_version")
            private int taskVersion;
            @JSONField(name = "is_fee")
            private String isFee;
            @JSONField(name = "gscapproveprojectcodeid")
            private String gscapproveprojectcodeid;
            @JSONField(name = "audit_state")
            private String auditState;
            @JSONField(name = "ouguid")
            private String ouguid;
            @JSONField(name = "is_mobile_entry")
            private String isMobileEntry;
            @JSONField(name = "task_state")
            private String taskState;
            @JSONField(name = "version_date")
            private long versionDate;
            @JSONField(name = "reconsiderat")
            private String reconsiderat;
            @JSONField(name = "td_conrection_way")
            private String tdConrectionWay;
            @JSONField(name = "anticipate_type")
            private String anticipateType;
            @JSONField(name = "task_type")
            private String taskType;
            @JSONField(name = "partitionguid")
            private String partitionguid;
            @JSONField(name = "accept_std")
            private String acceptStd;
            @JSONField(name = "other_supervise")
            private String otherSupervise;
            @JSONField(name = "create_date")
            private long createDate;
            @JSONField(name = "project_type")
            private String projectType;
            @JSONField(name = "report_sign")
            private int reportSign;
            @JSONField(name = "task_code")
            private String taskCode;
            @JSONField(name = "entrust_name")
            private String entrustName;
            @JSONField(name = "supervise_way")
            private String superviseWay;
            @JSONField(name = "publicity_url")
            private String publicityUrl;
            @JSONField(name = "transact_app_url")
            private String transactAppUrl;
            @JSONField(name = "promise_day_explain")
            private String promiseDayExplain;
            @JSONField(name = "task_name")
            private String taskName;
            @JSONField(name = "promise_type")
            private String promiseType;
            @JSONField(name = "inspection_review")
            private String inspectionReview;
            @JSONField(name = "handle_publicity")
            private String handlePublicity;
            @JSONField(name = "pre_task_name")
            private String preTaskName;
            @JSONField(name = "canuse")
            private String canuse;
            @JSONField(name = "rowguid")
            private String rowguid;
            @JSONField(name = "promise_day")
            private int promiseDay;
            @JSONField(name = "anticipate_day")
            private int anticipateDay;
            @JSONField(name = "is_history")
            private String isHistory;
            @JSONField(name = "other_link")
            private String otherLink;
            @JSONField(name = "authority_division")
            private String authorityDivision;
            @JSONField(name = "catalog_code")
            private String catalogCode;
            @JSONField(name = "item_id")
            private String itemId;
            @JSONField(name = "limit_scene_num")
            private int limitSceneNum;
            @JSONField(name = "dept_name")
            private String deptName;
            @JSONField(name = "handle_type")
            private String handleType;
            @JSONField(name = "litigation")
            private String litigation;
            @JSONField(name = "progress_query_way")
            private String progressQueryWay;
            @JSONField(name = "ywcode")
            private String ywcode;

            public String getDeptCode() {
                return deptCode;
            }

            public void setDeptCode(String deptCode) {
                this.deptCode = deptCode;
            }

            public long getYear() {
                return year;
            }

            public void setYear(long year) {
                this.year = year;
            }

            public String getFlowChart() {
                return flowChart;
            }

            public void setFlowChart(String flowChart) {
                this.flowChart = flowChart;
            }

            public String getTdTlimit() {
                return tdTlimit;
            }

            public void setTdTlimit(String tdTlimit) {
                this.tdTlimit = tdTlimit;
            }

            public String getLoginUrl() {
                return loginUrl;
            }

            public void setLoginUrl(String loginUrl) {
                this.loginUrl = loginUrl;
            }

            public String getAcceptName() {
                return acceptName;
            }

            public void setAcceptName(String acceptName) {
                this.acceptName = acceptName;
            }

            public String getExerciseContent() {
                return exerciseContent;
            }

            public void setExerciseContent(String exerciseContent) {
                this.exerciseContent = exerciseContent;
            }

            public String getLinkWay() {
                return linkWay;
            }

            public void setLinkWay(String linkWay) {
                this.linkWay = linkWay;
            }

            public String getPviGuid() {
                return pviGuid;
            }

            public void setPviGuid(String pviGuid) {
                this.pviGuid = pviGuid;
            }

            public String getIsNeedEntry() {
                return isNeedEntry;
            }

            public void setIsNeedEntry(String isNeedEntry) {
                this.isNeedEntry = isNeedEntry;
            }

            public String getQueryUrl() {
                return queryUrl;
            }

            public void setQueryUrl(String queryUrl) {
                this.queryUrl = queryUrl;
            }

            public String getIsBjxs() {
                return isBjxs;
            }

            public void setIsBjxs(String isBjxs) {
                this.isBjxs = isBjxs;
            }

            public String getCatalogId() {
                return catalogId;
            }

            public void setCatalogId(String catalogId) {
                this.catalogId = catalogId;
            }

            public String getAnticipateDayExplain() {
                return anticipateDayExplain;
            }

            public void setAnticipateDayExplain(String anticipateDayExplain) {
                this.anticipateDayExplain = anticipateDayExplain;
            }

            public String getItemSource() {
                return itemSource;
            }

            public void setItemSource(String itemSource) {
                this.itemSource = itemSource;
            }

            public String getPreDeptName() {
                return preDeptName;
            }

            public void setPreDeptName(String preDeptName) {
                this.preDeptName = preDeptName;
            }

            public String getContractor() {
                return contractor;
            }

            public void setContractor(String contractor) {
                this.contractor = contractor;
            }

            public String getServeType() {
                return serveType;
            }

            public void setServeType(String serveType) {
                this.serveType = serveType;
            }

            public String getOperateusername() {
                return operateusername;
            }

            public void setOperateusername(String operateusername) {
                this.operateusername = operateusername;
            }

            public String getUseLevel() {
                return useLevel;
            }

            public void setUseLevel(String useLevel) {
                this.useLevel = useLevel;
            }

            public String getAreacode() {
                return areacode;
            }

            public void setAreacode(String areacode) {
                this.areacode = areacode;
            }

            public long getOperatedate() {
                return operatedate;
            }

            public void setOperatedate(long operatedate) {
                this.operatedate = operatedate;
            }

            public String getCheckFlag() {
                return checkFlag;
            }

            public void setCheckFlag(String checkFlag) {
                this.checkFlag = checkFlag;
            }

            public String getIsTd() {
                return isTd;
            }

            public void setIsTd(String isTd) {
                this.isTd = isTd;
            }

            public long getPublishdate() {
                return publishdate;
            }

            public void setPublishdate(long publishdate) {
                this.publishdate = publishdate;
            }

            public String getDeptType() {
                return deptType;
            }

            public void setDeptType(String deptType) {
                this.deptType = deptType;
            }

            public String getPublishstatus() {
                return publishstatus;
            }

            public void setPublishstatus(String publishstatus) {
                this.publishstatus = publishstatus;
            }

            public int getTaskVersion() {
                return taskVersion;
            }

            public void setTaskVersion(int taskVersion) {
                this.taskVersion = taskVersion;
            }

            public String getIsFee() {
                return isFee;
            }

            public void setIsFee(String isFee) {
                this.isFee = isFee;
            }

            public String getGscapproveprojectcodeid() {
                return gscapproveprojectcodeid;
            }

            public void setGscapproveprojectcodeid(String gscapproveprojectcodeid) {
                this.gscapproveprojectcodeid = gscapproveprojectcodeid;
            }

            public String getAuditState() {
                return auditState;
            }

            public void setAuditState(String auditState) {
                this.auditState = auditState;
            }

            public String getOuguid() {
                return ouguid;
            }

            public void setOuguid(String ouguid) {
                this.ouguid = ouguid;
            }

            public String getIsMobileEntry() {
                return isMobileEntry;
            }

            public void setIsMobileEntry(String isMobileEntry) {
                this.isMobileEntry = isMobileEntry;
            }

            public String getTaskState() {
                return taskState;
            }

            public void setTaskState(String taskState) {
                this.taskState = taskState;
            }

            public long getVersionDate() {
                return versionDate;
            }

            public void setVersionDate(long versionDate) {
                this.versionDate = versionDate;
            }

            public String getReconsiderat() {
                return reconsiderat;
            }

            public void setReconsiderat(String reconsiderat) {
                this.reconsiderat = reconsiderat;
            }

            public String getTdConrectionWay() {
                return tdConrectionWay;
            }

            public void setTdConrectionWay(String tdConrectionWay) {
                this.tdConrectionWay = tdConrectionWay;
            }

            public String getAnticipateType() {
                return anticipateType;
            }

            public void setAnticipateType(String anticipateType) {
                this.anticipateType = anticipateType;
            }

            public String getTaskType() {
                return taskType;
            }

            public void setTaskType(String taskType) {
                this.taskType = taskType;
            }

            public String getPartitionguid() {
                return partitionguid;
            }

            public void setPartitionguid(String partitionguid) {
                this.partitionguid = partitionguid;
            }

            public String getAcceptStd() {
                return acceptStd;
            }

            public void setAcceptStd(String acceptStd) {
                this.acceptStd = acceptStd;
            }

            public String getOtherSupervise() {
                return otherSupervise;
            }

            public void setOtherSupervise(String otherSupervise) {
                this.otherSupervise = otherSupervise;
            }

            public long getCreateDate() {
                return createDate;
            }

            public void setCreateDate(long createDate) {
                this.createDate = createDate;
            }

            public String getProjectType() {
                return projectType;
            }

            public void setProjectType(String projectType) {
                this.projectType = projectType;
            }

            public int getReportSign() {
                return reportSign;
            }

            public void setReportSign(int reportSign) {
                this.reportSign = reportSign;
            }

            public String getTaskCode() {
                return taskCode;
            }

            public void setTaskCode(String taskCode) {
                this.taskCode = taskCode;
            }

            public String getEntrustName() {
                return entrustName;
            }

            public void setEntrustName(String entrustName) {
                this.entrustName = entrustName;
            }

            public String getSuperviseWay() {
                return superviseWay;
            }

            public void setSuperviseWay(String superviseWay) {
                this.superviseWay = superviseWay;
            }

            public String getPublicityUrl() {
                return publicityUrl;
            }

            public void setPublicityUrl(String publicityUrl) {
                this.publicityUrl = publicityUrl;
            }

            public String getTransactAppUrl() {
                return transactAppUrl;
            }

            public void setTransactAppUrl(String transactAppUrl) {
                this.transactAppUrl = transactAppUrl;
            }

            public String getPromiseDayExplain() {
                return promiseDayExplain;
            }

            public void setPromiseDayExplain(String promiseDayExplain) {
                this.promiseDayExplain = promiseDayExplain;
            }

            public String getTaskName() {
                return taskName;
            }

            public void setTaskName(String taskName) {
                this.taskName = taskName;
            }

            public String getPromiseType() {
                return promiseType;
            }

            public void setPromiseType(String promiseType) {
                this.promiseType = promiseType;
            }

            public String getInspectionReview() {
                return inspectionReview;
            }

            public void setInspectionReview(String inspectionReview) {
                this.inspectionReview = inspectionReview;
            }

            public String getHandlePublicity() {
                return handlePublicity;
            }

            public void setHandlePublicity(String handlePublicity) {
                this.handlePublicity = handlePublicity;
            }

            public String getPreTaskName() {
                return preTaskName;
            }

            public void setPreTaskName(String preTaskName) {
                this.preTaskName = preTaskName;
            }

            public String getCanuse() {
                return canuse;
            }

            public void setCanuse(String canuse) {
                this.canuse = canuse;
            }

            public String getRowguid() {
                return rowguid;
            }

            public void setRowguid(String rowguid) {
                this.rowguid = rowguid;
            }

            public int getPromiseDay() {
                return promiseDay;
            }

            public void setPromiseDay(int promiseDay) {
                this.promiseDay = promiseDay;
            }

            public int getAnticipateDay() {
                return anticipateDay;
            }

            public void setAnticipateDay(int anticipateDay) {
                this.anticipateDay = anticipateDay;
            }

            public String getIsHistory() {
                return isHistory;
            }

            public void setIsHistory(String isHistory) {
                this.isHistory = isHistory;
            }

            public String getOtherLink() {
                return otherLink;
            }

            public void setOtherLink(String otherLink) {
                this.otherLink = otherLink;
            }

            public String getAuthorityDivision() {
                return authorityDivision;
            }

            public void setAuthorityDivision(String authorityDivision) {
                this.authorityDivision = authorityDivision;
            }

            public String getCatalogCode() {
                return catalogCode;
            }

            public void setCatalogCode(String catalogCode) {
                this.catalogCode = catalogCode;
            }

            public String getItemId() {
                return itemId;
            }

            public void setItemId(String itemId) {
                this.itemId = itemId;
            }

            public int getLimitSceneNum() {
                return limitSceneNum;
            }

            public void setLimitSceneNum(int limitSceneNum) {
                this.limitSceneNum = limitSceneNum;
            }

            public String getDeptName() {
                return deptName;
            }

            public void setDeptName(String deptName) {
                this.deptName = deptName;
            }

            public String getHandleType() {
                return handleType;
            }

            public void setHandleType(String handleType) {
                this.handleType = handleType;
            }

            public String getLitigation() {
                return litigation;
            }

            public void setLitigation(String litigation) {
                this.litigation = litigation;
            }

            public String getProgressQueryWay() {
                return progressQueryWay;
            }

            public void setProgressQueryWay(String progressQueryWay) {
                this.progressQueryWay = progressQueryWay;
            }

            public String getYwcode() {
                return ywcode;
            }

            public void setYwcode(String ywcode) {
                this.ywcode = ywcode;
            }
        }
    }
    public boolean isOk() {
        return "00".equals(status.getCode());
    }

}
