package com.tka.patterns;

public class SquarePattern {
	public static void main(String[] args) {
		System.out.println("Square pattern");
		for(int i = 1;i <= 4;i++) {
			for(int j = 1;j <= 4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
