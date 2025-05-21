package day_9;
import java.util.*;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> l1=new ArrayList<Object>();
		l1.add(12);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		System.out.println(l1);
		List<Object> l2=new ArrayList<Object>(l1);
		l2.add(45);
		l2.add(89);
		System.out.println(l2);
		List<Object> l3=new ArrayList<Object>();
		l3.add(1000);
		l3.add(0,999);
		l3.addAll(l2);
		System.out.println(l3);
		List<Object> l4= Arrays.asList("raghu","ram","venkat");
		l3.addAll(0,l4);
		System.out.println(l3);
		System.out.println(l3.get(6));
		System.out.println(l3.indexOf(1000));
		Object[] arr=l3.toArray();
		for (Object a1:arr) {
			System.out.println(a1);
		}
		
		
		
		
		
		

	}

}
