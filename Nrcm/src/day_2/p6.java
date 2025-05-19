package day_2;

public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String n[]= {"ram","raghu","venkat"};
     for(String x:n) {
    	 System.out.println(x);
     }
     int m=25;
    
     for (int i=2;i<=m;i++)
    	 
     {
    	 int count=0;
    	for (int j=1;j<=i;j++) {
    		if (i%j==0)
    		{
    			count++;
    			
    		}
    		
    		}
    	if (count==2) {
			System.out.println(i); 
    		 
    	 }
    	
 		}
    	
		}
     
	}


