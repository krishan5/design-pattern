package com.kk.builder.course;

public class Course {
	
	private int id;
	private String name;
	private Category category;
	private int price;
	private Currency currency;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public static CourseBuilder getBuilder() {
		return new CourseBuilder();
	}
	
	public static class CourseBuilder {
		
		private Course course;
		
		CourseBuilder() {
			this.course = new Course();
		}
		
		public void setId(int id) {
			this.course.setId(id);
		}
		
		public void setName(String name) {
			this.course.setName(name);
		}
		
		public void setCategory(Category category) {
			this.course.setCategory(category);
		}
		
		public void setPrice(int price) {
			this.course.setPrice(price);
		}
		
		public void setCurrency(Currency currency) {
			this.course.setCurrency(currency);
		}
		
		public Course build() {
			return this.course;
		}
	}
		
}
