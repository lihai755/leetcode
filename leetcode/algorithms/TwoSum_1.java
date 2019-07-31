package leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

	public static void main(String[] args) {
		int[] a = {2, 7, 11, 15, 34, 5};
		int[] b = twoSum(a, 18);
		for(int i=0; i<b.length ; i++) {
			System.out.print(b[i]+" ");
		}
	}
	static int[] twoSum(int[] numbers, int target) {
		//1、若target=9,int[] numbers = {2, 7, 11, 15, 34, 5}
	    int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < numbers.length; i++) {
	        if (map.containsKey(target - numbers[i])) {//3、9-7=2
	            result[1] = i;
	            result[0] = map.get(target - numbers[i]);
	            return result;
	        }
	        map.put(numbers[i], i);///2、i=0,(2,0)
	    }
	    return result;
	}

}
