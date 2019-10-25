package hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class HashMapDemo {
	
	/**
	 * set集合去重，不打乱顺序
	 */
	@Test
	public void test_remove_repeat_01() {
		List<String> list  =   new  ArrayList<String>(); 
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("aba");
        list.add("aba");
        list.add("aba");
        list.add("aaa");

        Set set = new  HashSet(); 
        List newList = new  ArrayList(); 
        for (String cd:list) {
           if(set.add(cd)){
               newList.add(cd);
           }
       }
        System.out.println( "去重后的集合： " + newList);
	}
	
	@Test
	public void test_remove_repeat_02() {
		List<String> list  =   new  ArrayList<String>(); 
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("aba");
        list.add("aba");
        list.add("aba");
        list.add("aaa");

       Set set = new  HashSet(); 
        List newList = new  ArrayList(); 
        set.addAll(list);
        newList.addAll(set);
        List newList_2 = new ArrayList(new HashSet(list));
        System.out.println( "去重后的集合_1： " + newList);
        System.out.println( "去重后的集合_2： " + newList_2);
	}

	public static void main(String[] args) {
		 HashMap<String, String> map = new HashMap<String, String>();
	        // 键不能重复，值可以重复
	        map.put("san", "张三");
	        map.put("si", "李四");
	        map.put("wu", "王五");
	        map.put("wang", "老王");
	        map.put("wang", "老王2");// 老王被覆盖
	        map.put("lao", "老王");
	        map.put("lao", "老王3");
	        System.out.println("-------直接输出hashmap:-------");
	        System.out.println(map);
	        /**
	         * 遍历HashMap
	         */
	        // 1.获取Map中的所有键
	        System.out.println("-------foreach获取Map中所有的键:------");
	        Set<String> keys = map.keySet();
	        for (String key : keys) {
	            System.out.print(key+"  ");
	        }
	        System.out.println();//换行
	        // 2.获取Map中所有值
	        System.out.println("-------foreach获取Map中所有的值:------");
	        Collection<String> values = map.values();
	        for (String value : values) {
	            System.out.print(value+"  ");
	        }
	        System.out.println();//换行
	        // 3.得到key的值的同时得到key所对应的值
	        System.out.println("-------得到key的值的同时得到key所对应的值:-------");
	        Set<String> keys2 = map.keySet();
	        for (String key : keys2) {
	            System.out.print(key + "：" + map.get(key)+"   ");

	        }
	        /**
	         * 另外一种不常用的遍历方式
	         */
	        // 当我调用put(key,value)方法的时候，首先会把key和value封装到
	        // Entry这个静态内部类对象中，把Entry对象再添加到数组中，所以我们想获取
	        // map中的所有键值对，我们只要获取数组中的所有Entry对象，接下来
	        // 调用Entry对象中的getKey()和getValue()方法就能获取键值对了
	        Set<java.util.Map.Entry<String, String>> entrys = map.entrySet();
	        for (java.util.Map.Entry<String, String> entry : entrys) {
	            System.out.println(entry.getKey() + "--" + entry.getValue());
	        }

	        /**
	         * HashMap其他常用方法
	         */
	        System.out.println("after map.size()："+map.size());
	        System.out.println("after map.isEmpty()："+map.isEmpty());
	        System.out.println(map.remove("san"));
	        System.out.println("after map.remove()："+map);
	        System.out.println("after map.get(si)："+map.get("si"));
	        System.out.println("after map.containsKey(si)："+map.containsKey("si"));
	        System.out.println("after containsValue(李四)："+map.containsValue("李四"));
	        System.out.println(map.replace("si", "李四2"));
	        System.out.println("after map.replace(si, 李四2):"+map);
	    }

}
