package effective.java.chapter02;

/**
 * P30：对称性
 * @author camus
 *
 */
public final class Eighth_Symmtery {
	private final String s ;
	public Eighth_Symmtery(String s) {
		if(s==null)
			throw new NullPointerException();
		this.s = s;
	}
	
	@Override
	public boolean equals(Object obj) {
		/*
		 * 失败
		 * if (obj instanceof Eighth_Symmtery) { return
		 * s.equalsIgnoreCase(((Eighth_Symmtery)obj).s); } if (obj instanceof String) {
		 * return s.equalsIgnoreCase((String)obj); } return false;
		 */
		return obj instanceof Eighth_Symmtery && ((Eighth_Symmtery)obj).s.equalsIgnoreCase(s);//成功
	}
	
	public static void main(String[] args) {
		Eighth_Symmtery e = new Eighth_Symmtery("Hello");
		String s = "hello";
		System.out.println(e.equals(s));
		System.out.println(s.equals(e));
	}
}
