package com.arith;

import com.arith.service.ArithService;

public class App {

	public static void main(String[] args) {

		ArithService arithService = new ArithService();
		System.out.println(arithService.add(12, 13));
		System.out.println(arithService.sub(12, 13));
		System.out.println(arithService.div(12, 12));

	}

}
