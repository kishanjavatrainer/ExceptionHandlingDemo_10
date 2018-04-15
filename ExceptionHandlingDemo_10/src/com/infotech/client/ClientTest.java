package com.infotech.client;

import com.infotech.model.Hello;

public class ClientTest {

	public static void main(String[] args) throws ClassNotFoundException  {

		try {
			method1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		//method2();
	}

	private static void method1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> cls = Class.forName("com.infotech.model.Hello");
		Object obj = cls.newInstance();
		if(obj instanceof Hello) {
			Hello hello =(Hello)obj;
			hello.greet();
		}else {
			throw new ClassCastException("Provided class type is not correct!!");
		}
	}
	
	private static void method2() throws ClassNotFoundException {
		try {
			Class<?> cls = Class.forName("com.infotech.model.Hello");
			Object obj = cls.newInstance();
			if(obj instanceof Hello) {
				Hello hello =(Hello)obj;
				hello.greet();
			}else {
				throw new ClassCastException("Provided class type is not correct!!");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw e;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
