package day_8;
import java.util.*;
public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(11);
		l1.add(12);
		System.out.println(l1);
		Iterator i1=l1.iterator();
				while (i1.hasNext()) {
					System.out.println(i1.next());
				}

	}

}
