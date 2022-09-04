package chapters.chapter_04;
import java.util.Scanner;

public class Exercise_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the bounding circle:");
		double r = input.nextDouble();
		//2 pi /5 2 şer
		double a1 = 2 * (Math.PI / 5);
		double a2 = 4 * (Math.PI / 5);
		double a3 = 6 * (Math.PI / 5);
		double a4 = 8 * (Math.PI / 5);
		double a5 = 10 * (Math.PI / 5);  

		

		double x1 = r * Math.cos(a1);
		double y1 = r * Math.sin(a1);
		double x2 = r * Math.cos(a2);
		double y2 = r * Math.sin(a2);
		double x3 = r * Math.cos(a3);
		double y3 = r * Math.sin(a3);
		double x4 = r * Math.cos(a4);
		double y4 = r * Math.sin(a4);
		double x5 = r * Math.cos(a5);
		double y5 = r * Math.sin(a5);
		
		//To make three digits appear after the comma, the following operations are performed.
		x1=(int)(x1*100)/100.;
		x2=(int)(x2*100)/100.;
		x3=(int)(x3*100)/100.;
		x4=(int)(x4*100)/100.;
		x5=(int)(x5*100)/100.;
		y1=(int)(y1*100)/100.;
		y2=(int)(y2*100)/100.;
		y3=(int)(y3*100)/100.;
		y4=(int)(y4*100)/100.;
		y5=(int)(y5*100)/100.;
		
		

		System.out.println("(,"+ x1+","+ y1+")");
		System.out.println("(,"+ x2+","+ y2+")");
		System.out.println("(,"+ x3+","+ y3+")");
		System.out.println("(,"+ x4+","+ y4+")");
		System.out.println("(,"+ x5+","+ y5+")");
		
	}

}

