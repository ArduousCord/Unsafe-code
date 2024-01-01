package com.javaoneclipse.learn.java;

import java.util.ArrayList;
import java.util.List;



public class Laptop 
{

	private List<String>laptops;
	{
		laptops = new ArrayList<>();
		laptops.add("Dell");
		laptops.add("IBM");
		laptops.add("HP");
		laptops.add("Lenovo");
	}
public List<String>getListLaptops()
	{
	return laptops;
	}
}
