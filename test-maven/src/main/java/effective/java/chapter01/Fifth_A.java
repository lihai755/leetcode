package effective.java.chapter01;

/**
 * P19：当心无意识的自动装箱
 * @author camus
 *
 */
public class Fifth_A {

	public static void main(String[] args) {
		long l1 = System.currentTimeMillis();
		long sum = 0L;//Long sum = 0L;
		for(long i =0;i<Integer.MAX_VALUE;i++) {
			sum += i ;
		}
		long l2 = System.currentTimeMillis();
		System.out.println(((l2-l1)/1000)%60);
	}

}
