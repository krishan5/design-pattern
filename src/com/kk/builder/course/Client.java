package com.kk.builder.course;

public class Client {
	
	public static void main(String[] args) {
		//Created new object of CourseBuilder as well as of Course through its constructor.
		Course.CourseBuilder builder = Course.getBuilder();
		builder.setId(1);
		builder.setName("Java");
		builder.setCategory(Category.IT);
		builder.setPrice(100);
		builder.setCurrency(Currency.INR);
		Course course = builder.build();
		System.out.println("Course details : ");
		System.out.println("ID : " + course.getId());
		System.out.println("NAME : " + course.getName());
		System.out.println("PRICE : " + course.getPrice());
		System.out.println("CURRENCY : " + course.getCurrency());
		System.out.println("CATEGORY : " + course.getCategory());
	}

}
