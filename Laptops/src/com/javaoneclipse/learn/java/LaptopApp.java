package com.javaoneclipse.learn.java;

public class LaptopApp {

	public static void main(String[] args) 
	{
		Laptop laptop = new Laptop();
		//adds the brand Acer to the list
		laptop.getListLaptops().add("Acer");
		//removes the brand with index 2 which is HP
		laptop.getListLaptops().remove(2);
		System.out.print("\n"+laptop.getListLaptops());
	}
}
