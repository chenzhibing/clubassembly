package com.base;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String driverName = "����";
		String vehicle = "��";
		String targetPlace = "����";
		go(driverName, vehicle, targetPlace);
	}
	
	public static void go(String driverName, String vehicle, String targetPlace) {
		System.out.println(driverName + "��" + vehicle + "ȥ" + targetPlace);
	}
}
