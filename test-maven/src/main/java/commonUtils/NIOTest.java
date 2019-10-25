package commonUtils;

import java.util.ArrayList;
import java.util.List;

public class NIOTest {

	public static void main(String[] args) {
		List<String> lists = new ArrayList<String>();
		lists.add("1");
		lists.add("2");
		lists.add("3");
		lists.add("4");
		lists.add("5");
		lists.add("6");
		
		String s = "abc,ghi";
		System.out.println(s.split(",")[0]);
		System.out.println(s.split(",")[1]);
	}

}
