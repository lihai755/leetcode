package common;

public class StringBuilderAndStringBuffer {
	public static void main(String[] args) {
		/*
		 * StringBuffer sb=new StringBuffer(); sb.append("select a.* from t_egp_dep a");
		 * //字符串插入：在select a.*中间插入top 10，变成select top 10 a.* sb.insert(6, " top 10");
		 * System.out.println(sb.toString());
		 */
		/*
		 * int i = 180;//总条数 int j = 10;//一页显示10条 if(i%j!=0) {
		 * System.out.println(i/j+1);//需要多少页 }else { System.out.println(i/j);//需要多少页 }
		 */
		
		String s = "abc def ghj sdf";
		String[] strings = s.split(" ");
		for(int i=0;i<strings.length;i++)
			System.out.println(strings[i]);
	}
}
