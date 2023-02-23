package br.com.examples.singleton;

public class Dog {
	
	private String name;
	private String color;
	private volatile static Dog instance = new Dog();
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	private Dog() {}
	
	public static Dog getInstance() {
			if(instance==null) {
				synchronized (Dog.class){
					instance = new Dog();
				}
			}
			return instance;
	}
}
