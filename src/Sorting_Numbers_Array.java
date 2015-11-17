import java.util.Scanner;
public class Sorting_Numbers_Array {
	public static void main(String[] args) {
		//System.out.println("Ahoy"); 
		
		menuOption();
	}
	public static void menuOption(){
	//	System.out.println("If this runs, menuOption works");
		
		System.out.println("Please choose from the selection below by inputting an integer: ");
		System.out.println("1. Input your own numbers to sort.");
		System.out.println("2. Allow the computer to randomly generate numbers to sort.");
		Scanner input = new Scanner(System.in);
		int userChoice = input.nextInt();
		
		switch(userChoice){
		case 1: userInputNumbersMethod(); break;
		case 2: randomlyGeneratedNumbersMethod();
		}
	}
	public static void userInputNumbersMethod(){
		//System.out.println("If this runs, userInputNumbersMethod works");
		System.out.println("You chose to input numbers.");
		
	}
	public static void randomlyGeneratedNumbersMethod(){
		//System.out.println("If this runs, randomlyGeneratedNumbersMethod works");
		System.out.println("You chose randomly generated numbers.");
		sortingAlgorithm();
	}
	public static void sortingAlgorithm(){
		//System.out.println("If this runs, sortingAlgorithm works");
		
		int listAmount = 6;
		int[] randomNumberArray = new int[listAmount];
		randomNumberArray = generateRandomNumbers(randomNumberArray, listAmount);
		
		System.out.print("Our randomly generated numbers are: ");
		for (int i = 0; i < listAmount; i++ ){
			System.out.print(randomNumberArray[i] + " ");
			
		}
		randomNumberArray = sortArray(randomNumberArray, listAmount);
		System.out.print("\nThe numbers sorted in ascending order are: ");
		for (int i = 0; i < listAmount; i++ ){
			System.out.print(randomNumberArray[i] + " ");
		}
	}
	public static int[] generateRandomNumbers(int[] randomNumberArray, int listAmount){
		//System.out.println("If this runs, generateRandomNumbers works");
		
		int randomNumbers = listAmount * 1000;
		for(int i=0; i<=5; i++){
			randomNumberArray[i] = (int)(Math.random() * randomNumbers);
		}
		return randomNumberArray;
	}
	public static int[] sortArray(int[] randomNumberArray, int listAmount){
		//System.out.println("\nIf this runs, sortArray is running");
		
		int integer1;
		int integer2;
		for(int runthrough=0; runthrough < listAmount; runthrough++){
		//System.out.println("This is runthrough " + runthrough);
		for(int i=0; i<5; i++){
			integer1 = randomNumberArray[i];
			integer2 = randomNumberArray[i+1];
			//System.out.println("Integer 1 is " + integer1);
			//System.out.println("Integer 2 is " + integer2);
			
			if(integer1 > integer2){
				randomNumberArray[i+1] = integer1;
				randomNumberArray[i]= integer2;
					
			
			}
		}
	}
		return randomNumberArray;
	}
	
}
