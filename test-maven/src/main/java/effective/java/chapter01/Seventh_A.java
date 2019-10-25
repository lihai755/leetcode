package effective.java.chapter01;

public class Seventh_A {

	public static void main(String[] args) {
		long l1 = System.currentTimeMillis();
		Fourth_B fourth_B = new Fourth_B();
		System.gc();
		long l2 = System.currentTimeMillis();
		System.out.println(((l2-l1)/1000)%60);
	}

}
