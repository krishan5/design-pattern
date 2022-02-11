package com.kk.factoryMethod.Message;

public class JsonMessage extends Message {

	@Override
	public String getContent() {
		return super.content.append("{\"JSON\":123}").toString();
	}

}
