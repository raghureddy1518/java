package day_8;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p7 {

	public static void main(String[] args) {
		try {
			
		
		File f1 =new File("C:\\Users\\Raghu\\OneDrive\\Desktop\\raghureddy\\");
		Scanner r=new Scanner(f1);
		while (r.hasNextLine()) {
			String data=r.nextLine();
			System.out.println(data);
		}
		
		r.close();
		
	}
		catch(FileNotFoundException e) {
			System.out.println("an error has accured");
			e.printStackTrace();
			}
		}

}
