package grades;
import java.io.*;
import java.util.Scanner;

public class mygrade {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		String name=null;
		System.out.println("enter name of the student : ");
		name=sc.nextLine();
		int phy=0;
		int mat=0;
		int chem=0;
		int tel=0;
		System.out.println("enter the physics marks: ");
		phy=sc.nextInt();
		System.out.println("enter the maths marks: ");
		mat=sc.nextInt();
		System.out.println("enter the chemistry marks: ");
		chem=sc.nextInt();
		System.out.println("enter the telugu marks: ");
		tel=sc.nextInt();
		try {
			int total=(phy+mat+chem+tel);
			System.out.println(total);
			int percentage=(total/4);
			System.out.println(percentage);
			if((percentage>90)&&(percentage<100)) {
				System.out.println("grade A");
			}
			else if(percentage>100) {
				System.out.println("invalid");
			}
			else if((percentage>80)&&(percentage<90)) {
				System.out.println("grade B");
			}
			else if((percentage>70)&&(percentage<80)) {
				System.out.println("grade c");
			}
			else if((percentage>60)&&(percentage<70)) {
				System.out.println("grade D");
			}
			else if((percentage>50)&&(percentage<60)) {
				System.out.println("grade E");
			}
			else {
				System.out.println("Fail");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
