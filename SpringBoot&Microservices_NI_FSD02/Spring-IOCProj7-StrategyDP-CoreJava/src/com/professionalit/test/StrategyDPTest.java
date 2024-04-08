package com.professionalit.test;

import com.professionalit.comp.Flipkart;
import com.professionalit.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		// get Target class obj having Dependent class obj
		Flipkart fpkt = FlipkartFactory.getInstance("dtdc");
		// invoke b.method
		String result = fpkt.shopping(new String[] { "shirt", "trouser", "watch" },
				new float[] { 4000.0f, 6000.0f, 30000.0f });
		System.out.println(result);

	}

}
