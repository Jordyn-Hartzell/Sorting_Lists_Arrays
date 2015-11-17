import java.util.Scanner;
public class Sorting_Numbers_Array {
	public static void main(String[] args) {
		
		 System.out.println("Ahoy");
		 
		
		menuOption();
	}
	public static void menuOption(){
		
		System.out.println("If this runs, menuOption works");
		
		System.out.println("Choose 1 or 2");
		Scanner input = new Scanner(System.in);
		int userChoice = input.nextInt();
		
		switch(userChoice){
		case 1: System.out.println("1"); break;
		case 2: System.out.println("2");
		}
	}
}
