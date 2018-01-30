//Nick Bergan
//This program is called in the AppTest program. This program prints local and imported variable values to the console.
package com.mavenCodeBind;

public class Hello_World {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		App application = new com.mavenCodeBind.App();

		System.out.println(application.Sample() +" "+ application.hue);
	}

}
