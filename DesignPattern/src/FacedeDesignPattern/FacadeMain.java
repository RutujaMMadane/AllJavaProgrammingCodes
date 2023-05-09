package FacedeDesignPattern;

import java.util.Scanner;

public class FacadeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		ShopKeeper s=new ShopKeeper();
		switch(choice) {
		case 1:
			System.out.println("Iphone");
			s.iphoneSal();
			break;
		case 2:
			System.out.println("Samsung");
			s.samsungSal();
			break;
		case 3:
			System.out.println("BlackBerry");
			s.blackBerrySal();
			break;
		}

	}

}
