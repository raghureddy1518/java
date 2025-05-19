package day_3;

public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,13,12,14,15,13};
			int arr1[]=new int [a.length];
			int index=0;
		for (int i=0;i<a.length;i++) {
			int count=0;
		
			for (int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					
				}
				
			}
			if (count==1) {
				arr1[index++]=a[i];
				
				
			}
		}
		for (int i=0;i<index;i++) {
			System.out.println(arr1[i]+" ");
		}
			
	}

}
