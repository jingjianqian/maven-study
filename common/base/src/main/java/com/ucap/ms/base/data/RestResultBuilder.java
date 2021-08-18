package com.ucap.ms.base.data;


import com.ucap.ms.base.exception.BaseErrorCode;
import com.ucap.ms.base.exception.GlobalBaseErrorCode;


/**
 * 分页查询返回值封装类
 */
public class RestResultBuilder<T>  {
	
	protected int code;

    protected String message;

    protected T data;

	
    public static RestResultBuilder builder() {
        RestResultBuilder restResultBuilder = new RestResultBuilder();
        return restResultBuilder;
    }

    public RestResultBuilder code(int code) {
        this.code = code;
        return this;
    }

    public RestResultBuilder message(String message) {
        this.message = message;
        this.code = GlobalBaseErrorCode.FAILURE.getCode();
        return this;
    }

    public RestResultBuilder data(T data) {
        this.data = data;
        return this;
    }

    public RestResultBuilder errorCode(BaseErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
        return this;
    }

    public RestResultBuilder success() {
        this.code = GlobalBaseErrorCode.SUCCESS.getCode();
        this.message = GlobalBaseErrorCode.SUCCESS.getMessage();
        return this;
    }

    public RestResultBuilder success(T data) {
        this.code = GlobalBaseErrorCode.SUCCESS.getCode();
        this.message = GlobalBaseErrorCode.SUCCESS.getMessage();
        this.data = data;
        return this;
    }

    public RestResultBuilder failure() {
        this.code = GlobalBaseErrorCode.FAILURE.getCode();
        this.message = GlobalBaseErrorCode.FAILURE.getMessage();
        return this;
    }
    public RestResultBuilder noData() {
    	this.code = GlobalBaseErrorCode.NO_DATA.getCode();
        this.message = GlobalBaseErrorCode.NO_DATA.getMessage();
        return this;
    }
    public RestResultBuilder noData(T data) {
    	this.code = GlobalBaseErrorCode.NO_DATA.getCode();
        this.message = GlobalBaseErrorCode.NO_DATA.getMessage();
        this.data = data;
        return this;
    }
    public RestResultBuilder noLogin() {
        BaseErrorCode errorCode = GlobalBaseErrorCode.NO_LOGIN;
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
        return this;
    }
    public RestResultBuilder failure(T data) {
        this.code = GlobalBaseErrorCode.FAILURE.getCode();
        this.message = GlobalBaseErrorCode.FAILURE.getMessage();
        this.data = data;
        return this;
    }

    public RestResultBuilder result(boolean successful) {
        if (successful) {
            return this.success();
        } else {
            return this.failure();
        }
    }

    public RestResultBuilder success(Boolean result) {
        if (result == Boolean.TRUE) {
            success();
        } else {
            failure();
        }
        return this;
    }

    public ResultModel<T> build() {
        return new ResultModel<T>(this.code, this.message, this.data);
    }

    public ResultModel build(ResultModel restResult) {
        return restResult;
    }
    
}
