package com.kk.factoryMethod.Message;

public class Client {

	public static void main(String[] args) {
		MessageCreator jsonMessageCreator = new JsonMessageCreator(); 
		printMessage(jsonMessageCreator);
		
		MessageCreator textMessageCreator = new TextMessageCreator(); 
		printMessage(textMessageCreator);
	}

	private static void printMessage(MessageCreator messageCreator) {
		Message message = messageCreator.getMessage();
		System.out.println(message.getContent());
	}

}
