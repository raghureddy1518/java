
package day_8;
import java.io.*;

public class p5 {

	public static void main(String[] args) throws IOException {
		File f1 =new File("C:\\Users\\Raghu\\OneDrive\\Desktop\\raghureddy\\");
		// TODO Auto-generated method stub
		if(f1.createNewFile()) {
			System.out.println("file created");
			
		}
		else {
			System.out.println("not created");
		}

	}

}
