package com.kk.factoryMethod.Message;

public class JsonMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JsonMessage();
	}

}
