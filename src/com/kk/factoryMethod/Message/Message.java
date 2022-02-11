package com.kk.factoryMethod.Message;

public abstract class Message {
	StringBuilder content = new StringBuilder();
	
	public abstract String getContent();
	
	public void addDefaultHeaders() {
		content.append("\n--HEADERS--\n");
	}
}
