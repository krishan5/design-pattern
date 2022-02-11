package com.kk.factoryMethod.Message;

public abstract class MessageCreator {
	public Message getMessage() {
		Message message = createMessage();
		message.addDefaultHeaders();
		return message;
	}
	
	//Factory method
	protected abstract Message createMessage();
}
