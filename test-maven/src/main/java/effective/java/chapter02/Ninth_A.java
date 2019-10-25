package effective.java.chapter02;

import java.util.HashMap;
import java.util.Map;

public final class Ninth_A {

	private final short a;
	private final short b;
	private final short c;

	public Ninth_A(int a, int b, int c) {
		rangeCheck(a, 999, "a");
		rangeCheck(b, 999, "b");
		rangeCheck(c, 9999, "c");
		this.a = (short) a;
		this.b = (short) b;
		this.c = (short) c;
	}

	private static void rangeCheck(int arg, int max, String name) {
		if (arg < 0 || arg > max) {
			throw new IllegalArgumentException(name + ": " + arg);
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Ninth_A))
			return false;
		Ninth_A n = (Ninth_A) obj;
		return n.a == a && n.b == b && n.c == c;
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31*result+a;
		result = 31*result+b;
		result = 31*result+c;
		return result;
	}
	public static void main(String[] args) {
		Map<Ninth_A, String> map = new HashMap<Ninth_A, String>();
		Ninth_A nA = new Ninth_A(707, 867, 5309);
		map.put(nA, "jenny");
		System.out.println(map.get(new Ninth_A(408, 867, 5309)));//返回null，不返回jenny
	}

}
