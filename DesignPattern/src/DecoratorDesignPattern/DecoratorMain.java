package DecoratorDesignPattern;

import java.util.Scanner;

public class DecoratorMain {
	private static int choice;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.print("=========== Food Menu =========== \n");
			System.out.print("   1.Vegetarian Food.  \n");
			System.out.print("   2.Non-Vegetarian Food.  \n");
			System.out.print("   3.Chineese Food.   \n");
			System.out.print("   4.Exit.   \n");
			System.out.print("Enter your choice:");
		
			
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			switch(choice) {
			case 1:
			{
				VegFood vf=new VegFood();
				System.out.println(vf.prepareFood());
				System.out.println(vf.foodPrice());
			}
			
			}

	}

}
