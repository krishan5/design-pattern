package com.kk.factoryMethod.Message;

public class TextMessage extends Message {

	@Override
	public String getContent() {
		return super.content.append("Text Message").toString();
	}

}
