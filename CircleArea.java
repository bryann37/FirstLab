import java.util.Scanner;

public class CircleArea {
	
	public static void main (String[]args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the radius of the Circle: " ) ;
		
		//system.out.printl("Please enter the radius of the Circle: ")
		
		double radius = in.nextInt();
		
		double pi = Math.PI;
		
		double Circle_Area = pi * radius * radius ;
		
		System.out.println(Circle_Area );
		
		
		
		
				
		
	}

}
