package com.zhongmin.boot.common;

public class StaticEntity<T> extends MessageEntity {

	private T data;

	public StaticEntity() {
		super();
	}

	public StaticEntity(int code, String mssage){
		this.setCode(code);
		this.setMessage(mssage);
	}

	public StaticEntity(int code, String mssage, T data) {
		this();
		this.setCode(code);
		this.setMessage(mssage);
		this.setData(data);
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
