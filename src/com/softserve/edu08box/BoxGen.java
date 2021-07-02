package com.softserve.edu08box;

//import java.io.Serializable;

public class BoxGen<T> { 
//public class BoxGen<T extends Serializable> { // BoxGen<T> { 
	private T obj;

	public T get() {
		return obj;
	}

	public void set(T obj) {
		this.obj = obj;
	}

//    public static T todo() { // Error
//    }
}
