package day_3;

public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,2,3,45,6,8};
		int min=a[0];
		for (int i=1;i<a.length;i++) {
			if (a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("min:" +min);
		int max=a[0];
		for (int i=1;i<a.length;i++) {
			if (a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max:" +max);


	}
	
}
