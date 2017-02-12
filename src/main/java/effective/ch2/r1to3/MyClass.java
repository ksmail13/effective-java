package effective.ch2.r1to3;

import java.util.Arrays;
import java.util.Collections;

public class MyClass {
	
	public static MyClass newInstanceWithAAndB(int a, int b) {
		return new MyClass(a, b);
	}
	
	public MyClass() {}
	
	private int a;
	private int b;
	
	public MyClass(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}
	
	
	@Override
	public String toString() {
		return "MyClass [a=" + a + ", b=" + b + "]";
	}

	public static void main(String[] args) {
		System.out.println("hello world");
	}
}
