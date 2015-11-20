# Homework 10: Arrays
##### COMSC-1033 Sec. 1411, Jordyn Hartzell, HW 10
(https://github.com/Jordyn-Hartzell/Sorting_Lists_Arrays)

## Introduction
The two programs in this assignment both use arrays. The first assignment uses an array to sort a list of numbers. It offers the user the choice to input their own numbers or to allow the computer to generate numbers. The second program is a reworking of the addition game code to incorporate arrays. The programs use print statements, custom methods, scanner objects, case statements, for loops, if/else statements, and arrays.
### Outline
Sorting Lists Arrays
```java
// Call menu method
// Allow user to choose menu options
// If user input is chosen 
	// Call user input methods
	// Prompt user for input of numbers
	// Sort numbers in ascending order
	// Output sorted numbers
// If generated numbers are chosen
	// Call randomly generated methods
	// Generate random numbers
	// Sort numbers in ascending order
	// Output sorted numbers
```
Addition Game with Arrays
```
// Output opening statements
// Call method for addition game
// Establish variables with an array
// Loop for 4 rounds
// Call method to check if answer is correct
// If answer is correct
	// Award points
	// Increase difficulty
// If answer is incorrect
	// Output correct answer
	// Decrease difficulty
// Output ending message
// Output total score
```	
### References and Literature
```java
// Liang Java 10th edition. Pg. 100, 3.13
// switch(x){
	case 0: example1; break
	case 1: example2;
	}
// This is an example of how to use switch statements.

// Liang Java 10th edition. Pg 204, 6.2.
// modifier returnValueType methodName(list of parameteres){
//	Method body;
//   }
// This listing shows the proper syntax for defining a method.

// Evert, Jeremy "Sort3dNumbersIfStatementsProject" Github (https://github.com/swosu/Sort3NumbersIfStatementsProject.git)
// public static int[] populateRandomArray(int[] numberArray, int listSize)
// public static int[] sortOurArray(int[] numberArray, int listSize)
// I used these custom methods as a guideline on how to import variables into new methods and how to use the methods to complete an array.

// Liang Java 10th edition. Pg. 249, 7.2.6
// java.util.Scanner input = new java.util.Scanner(System.in);
// System.out.print("Enter " + myList.length + " value: ");
// for(int i = 0; i < myList.length; i++)
//    myList[i] = input.nextDouble();
// This shows the syntax to create an array that will allow users to input the values.

// Hartzell, Jordyn "Hartzell_Jordyn_Homework_9" Github (https://github.com/Jordyn-Hartzell/Hartzell_Jordyn_Homework_9/blob/master/src/Addition_Game_Methods_and_Loops.java)
// This is my previous addition game code. I used this and replaced the variables with an array for this assignment.
```
# Code: Sorting Lists
```java
import java.util.Scanner;
public class Sorting_Numbers_Array {
	public static void main(String[] args) {
		//System.out.println("Ahoy"); 
		
		menuOptionMethod();
	}
	public static void menuOptionMethod(){
		//System.out.println("If this runs, menuOption works");
		
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
		System.out.println("Please input integers only.");
		
		sortingAlgorithmUserInput();
	}
	public static void sortingAlgorithmUserInput(){
		//System.out.println("If this runs, sortingAlgorithmUserInput works");
		int listAmount = 6;
		int[] userInputNumberArray = new int[listAmount];
		userInputNumberArray = getUserInputNumbers(userInputNumberArray, listAmount);
		
		userInputNumberArray = sortUserInputArray(userInputNumberArray, listAmount);
		System.out.print("The numbers sorted in ascending order are: ");
		for (int i = 0; i < listAmount; i++ ){
			System.out.print(userInputNumberArray[i] + " ");
		}
	}
	public static int[] getUserInputNumbers(int[] userInputNumberArray, int listAmount){
		//System.out.println("If this runs, getUserInputNumbers works");
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter " + listAmount + " numbers: ");
		for(int i = 0; i < userInputNumberArray.length; i++){
			userInputNumberArray[i] = input.nextInt();
		}
		return userInputNumberArray;
	}
	public static int[] sortUserInputArray(int[] userInputNumberArray, int listAmount){
		//System.out.println("If this runs, sortUserInputArray works");
		
		int integer1;
		int integer2;
		for(int runthrough=0; runthrough < listAmount; runthrough++){
		//System.out.println("This is runthrough " + runthrough);
		for(int i=0; i<5; i++){
			integer1 = userInputNumberArray[i];
			integer2 = userInputNumberArray[i+1];
			//System.out.println("Integer 1 is " + integer1);
			//System.out.println("Integer 2 is " + integer2);
			
			if(integer1 > integer2){
				userInputNumberArray[i+1] = integer1;
				userInputNumberArray[i]= integer2;
			}
		}
		}
		return userInputNumberArray;
	}
	public static void randomlyGeneratedNumbersMethod(){
		//System.out.println("If this runs, randomlyGeneratedNumbersMethod works");
		System.out.println("You chose randomly generated numbers.");
		sortingAlgorithmRandom();
	}
	public static void sortingAlgorithmRandom(){
		//System.out.println("If this runs, sortingAlgorithm works");
		
		int listAmount = 6;
		int[] randomNumberArray = new int[listAmount];
		randomNumberArray = generateRandomNumbers(randomNumberArray, listAmount);
		
		System.out.print("Our randomly generated numbers are: ");
		for (int i = 0; i < listAmount; i++ ){
			System.out.print(randomNumberArray[i] + " ");
			
		}
		randomNumberArray = sortRandomArray(randomNumberArray, listAmount);
		System.out.print("\nThe numbers sorted in ascending order are: ");
		for (int i = 0; i < listAmount; i++){
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
	public static int[] sortRandomArray(int[] randomNumberArray, int listAmount){
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
				randomNumberArray[i]   = integer2;
					
			
			}
		}
	}
		return randomNumberArray;
	}
	
}
```
## Console
This example shows a user choosing to input numbers. The user chose to input numbers by choosing option 1, and then gave the numbers in descending order. The program gave them back in ascending order.
```java
Please choose from the selection below by inputting an integer: 
1. Input your own numbers to sort.
2. Allow the computer to randomly generate numbers to sort.
1
You chose to input numbers.
Please input integers only.
Enter 6 numbers: 6
5
4
3
2
1
The numbers sorted in ascending order are: 1 2 3 4 5 6 
```
This example shows the user choosing randomly generated numbers by inputting option 2. The computer randomly generates 6 numbers and feeds them back in ascending order.
```java
Please choose from the selection below by inputting an integer: 
1. Input your own numbers to sort.
2. Allow the computer to randomly generate numbers to sort.
2
You chose randomly generated numbers.
Our randomly generated numbers are: 880 3489 3581 1678 5769 3613 
The numbers sorted in ascending order are: 880 1678 3489 3581 3613 5769 
```
This is another user input option with more random numbers. Note that although "023" was an input, it was still output as "23."
```java
Please choose from the selection below by inputting an integer: 
1. Input your own numbers to sort.
2. Allow the computer to randomly generate numbers to sort.
1
You chose to input numbers.
Please input integers only.
Enter 6 numbers: 924
4375
10
6054
023
54
The numbers sorted in ascending order are: 10 23 54 924 4375 6054 
```
In this scenario, the user input an invalid number for the menu. The program does not run and nothing happens.
```java
Please choose from the selection below by inputting an integer: 
1. Input your own numbers to sort.
2. Allow the computer to randomly generate numbers to sort.
0
```
### Command Prompt
I started by following the GitHub instructions to sync my local repository to the remote repository.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>echo # Sorting_Lists_Arrays
>> README.md

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git config user.name "Jordyn
 Hartzell"

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git config user.email "hartz
ellj@student.swosu.edu"

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git init
Initialized empty Git repository in E:/Jordyn_CS1_Workspace/Jordyn_Hartzell_Home
work_10/.git/

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git add .

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git commit -m "first commit"

[master (root-commit) 14176e9] first commit
 5 files changed, 36 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 README.md
 create mode 100644 bin/Sorting_Numbers_Array.class
 create mode 100644 src/Sorting_Numbers_Array.java

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git remote add origin https:
//github.com/Jordyn-Hartzell/Sorting_Lists_Arrays.git

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git push -u origin master
Username for 'https://github.com': jordyn-hartzell
Password for 'https://jordyn-hartzell@github.com':
Counting objects: 9, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (8/8), done.
Writing objects: 100% (9/9), 1.24 KiB | 0 bytes/s, done.
Total 9 (delta 0), reused 0 (delta 0)
To https://github.com/Jordyn-Hartzell/Sorting_Lists_Arrays.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.
```
To avoid cluttering my master branch, I created and switched to a new dev branch.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git checkout -b dev
Switched to a new branch 'dev'
```
I made my first commit for the dev branch, but I had yet to set up tracking for the dev branch.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git add .

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git commit -m "Got the initi
al program running"
[dev 4232f20] Got the initial program running
 2 files changed, 1 insertion(+), 7 deletions(-)

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

fatal: The current branch dev has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin dev
```
This command allowed tracking for the dev branch.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git push -u origin dev
Username for 'https://github.com': jordyn-hartzell
Password for 'https://jordyn-hartzell@github.com':
Counting objects: 6, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 758 bytes | 0 bytes/s, done.
Total 6 (delta 2), reused 0 (delta 0)
To https://github.com/Jordyn-Hartzell/Sorting_Lists_Arrays.git
 * [new branch]      dev -> dev
Branch dev set up to track remote branch dev from origin.
```
I made multiple commits along the way and pushed my changes to save my progress incrementally while keeping the remote repository up-to-date.
```

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git add .

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git commit -m "updated readm
e file"
[dev 748e431] updated readme file
 3 files changed, 7 insertions(+), 2 deletions(-)
 rewrite bin/Sorting_Numbers_Array.class (67%)

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': jordyn-hartzell
Password for 'https://jordyn-hartzell@github.com':
Counting objects: 7, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (7/7), done.
Writing objects: 100% (7/7), 1.62 KiB | 0 bytes/s, done.
Total 7 (delta 3), reused 0 (delta 0)
To https://github.com/Jordyn-Hartzell/Sorting_Lists_Arrays.git
   8a4cad6..748e431  dev -> dev
```
When I was happy with my working code, I merged the dev branch into the master.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git checkout master
Switched to branch 'master'
Your branch is up-to-date with 'origin/master'.

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git merge dev
Updating 14176e9..5011282
Fast-forward
 README.md                       | 236 +++++++++++++++++++++++++++++++++++++++-
 bin/Sorting_Numbers_Array.class | Bin 406 -> 3372 bytes
 src/Sorting_Numbers_Array.java  | 133 ++++++++++++++++++++--
 3 files changed, 360 insertions(+), 9 deletions(-)
```
I did a final add, commit, and push to keep my remote repository up-to-date.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git add .

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git commit -m "Merged dev ch
anges into master branch"
On branch master
Your branch is ahead of 'origin/master' by 9 commits.
  (use "git push" to publish your local commits)
nothing to commit, working directory clean

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_10>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': jordyn-hartzell
Password for 'https://jordyn-hartzell@github.com':
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/Jordyn-Hartzell/Sorting_Lists_Arrays.git
   14176e9..5011282  master -> master
```
# Code: Addition Game with Arrays
```java
import java.util.Scanner;
public class Addition_Game_Methods_and_Loops {
	public static void main(String[] args) {
		/* This line was used to make sure the program was running.
		System.out.println("Hello");*/
		
		// Output opening message and instructions
		System.out.println("Welcome to the addition game!");
		System.out.println("Please input integers only.");
		System.out.println("Good luck!\n");
		
		// Call the addition game method to run
		additonGameMethod();
	}	
	// Create method for the addition game
	public static void additonGameMethod(){
		/* This was used to check that the method was working.
		System.out.println("If this runs, additionGameMethod works");*/
		
		// Establish variables for difficulty and score
		int[] gameVariables = new int[4];
		//int difficulty = 10;
		gameVariables[1] = 10;
		//int score = 0;
		gameVariables[2] = 0;
		
		// For loop to increment 4 rounds
		for(gameVariables[3] = 1; gameVariables[3] <= 4; gameVariables[3]++){
			/* This was used to check that the for loop was working.
			System.out.println("If the for loop works, the round should display. " + round);*/
			
			// This boolean was copied from Jeremy Evert's Addition Game on Github.
			boolean isAnswerCorrect = checkStudentAnswer(gameVariables);
			
			// Output based on correct answer
			if(isAnswerCorrect){
				// Increase and output score
				gameVariables[2] = gameVariables[2] + gameVariables[1];
				System.out.println("You have earned " + gameVariables[2] + " points.");
				
				if(gameVariables[3] < 4){
					// Increase and output difficulty
					gameVariables[1] = gameVariables[1] * 10;
					System.out.println("Your difficulty has increased to " + gameVariables[1] + ".");
				}
			// Output based on incorrect answer
			}else{
				System.out.println("Your score is still " + gameVariables[2] + ".");
				if(gameVariables[3] < 4){
					if(gameVariables[1] > 10){
						// Decrease and output difficulty
						gameVariables[1] = gameVariables[1] / 10;
						System.out.println("Your difficulty has decreased to " + gameVariables[1] + ".");
					}
				}
				
			}
			// Output round number
			System.out.println("End of round " + gameVariables[3] + "\n");
		}
		// Message at the end of the game
		System.out.println("You have reached the end of the game.");
		System.out.print("Total Score: " + gameVariables[2] + "/11110");
	}	
		/* Part of this method was also copied from Jeremy Evert's Addition Game on Github.*/
		// Create method to check if the answer is correct
		public static boolean checkStudentAnswer(int[] gameVariables) {
		
		/* This was used to check that the method was working.
		System.out.println("If this runs, checkStudentAnswer works");*/
		
		int number1 = (int)(Math.random() * gameVariables[1]);
		int number2 = (int)(Math.random() * gameVariables[1]);
		
		// Prompt user with question
		System.out.print("What is " + number1 + " + " + number2 +"? ");
		Scanner get = new Scanner(System.in);
		int answer = get.nextInt();
		
		// Correct formula
		int correctAnswer = number1 + number2;
		
		// Output based on correct answer
		if(answer == correctAnswer){
			System.out.println("Correct!");
			return true;
		// Output based on incorrect answer
		}else{
			System.out.println("Sorry, that was incorrect.\nThe correct answer was " 
					+ correctAnswer + ".");
			return false;
		}
	}
}
```
## Console
This console output is identical to my last version of the addition game. The only difference is that the variables in the code are replaced by an array that allows for multiple variables.
The first example is with all correct answers. The difficulty and score continue to increase every round.
```java
Welcome to the addition game!
Please input integers only.
Good luck!

What is 8 + 5? 13
Correct!
You have earned 10 points.
Your difficulty has increased to 100.
End of round 1

What is 1 + 11? 12
Correct!
You have earned 110 points.
Your difficulty has increased to 1000.
End of round 2

What is 761 + 786? 1547
Correct!
You have earned 1110 points.
Your difficulty has increased to 10000.
End of round 3

What is 7803 + 5246? 13049
Correct!
You have earned 11110 points.
End of round 4

You have reached the end of the game.
Total Score: 11110/11110
```
This is an example of all incorrect answers. The score never increases and the difficulty never decreases as it's already at the lowest level.
```java
Welcome to the addition game!
Please input integers only.
Good luck!

What is 9 + 7? 0
Sorry, that was incorrect.
The correct answer was 16.
Your score is still 0.
End of round 1

What is 2 + 8? 0
Sorry, that was incorrect.
The correct answer was 10.
Your score is still 0.
End of round 2

What is 6 + 2? 0
Sorry, that was incorrect.
The correct answer was 8.
Your score is still 0.
End of round 3

What is 9 + 7? 0
Sorry, that was incorrect.
The correct answer was 16.
Your score is still 0.
End of round 4

You have reached the end of the game.
Total Score: 0/11110
```
This example shows an incorrect answer for round 3. The difficulty decreases and the points awarded also decrease for the next round.
```java
Welcome to the addition game!
Please input integers only.
Good luck!

What is 1 + 0? 1
Correct!
You have earned 10 points.
Your difficulty has increased to 100.
End of round 1

What is 15 + 95? 110
Correct!
You have earned 110 points.
Your difficulty has increased to 1000.
End of round 2

What is 739 + 113? 0
Sorry, that was incorrect.
The correct answer was 852.
Your score is still 110.
Your difficulty has decreased to 100.
End of round 3

What is 51 + 8? 59
Correct!
You have earned 210 points.
End of round 4

You have reached the end of the game.
Total Score: 210/11110
```
### Command Prompt
I updated the Addition Game code from the methods and loops project for this assignment. First I created a new branch to try out the array.
```
E:\Jordyn_CS1_Workspace\Addition_Game_Methods_And_Loops>git checkout -b devArray

Switched to a new branch 'devArray'
```
I saved the branch and set up tracking for the new branch.
```
E:\Jordyn_CS1_Workspace\Addition_Game_Methods_And_Loops>git add .

E:\Jordyn_CS1_Workspace\Addition_Game_Methods_And_Loops>git commit -m "Added an
array"
On branch devArray
nothing to commit, working directory clean

E:\Jordyn_CS1_Workspace\Addition_Game_Methods_And_Loops>git push -u origin devAr
ray
Username for 'https://github.com': jordyn-hartzell
Password for 'https://jordyn-hartzell@github.com':
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/Jordyn-Hartzell/Addition_Game_Methods_and_Loops.git
 * [new branch]      devArray -> devArray
Branch devArray set up to track remote branch devArray from origin.
```
When I was happy with the code, I merged it into the dev code.
```
E:\Jordyn_CS1_Workspace\Addition_Game_Methods_And_Loops>git checkout dev
Switched to branch 'dev'
Your branch is up-to-date with 'origin/dev'.

E:\Jordyn_CS1_Workspace\Addition_Game_Methods_And_Loops>git merge devarray
Already up-to-date.
```
I did a final add, commit, and push to update the remote repository.
```
E:\Jordyn_CS1_Workspace\Addition_Game_Methods_And_Loops>git add .

E:\Jordyn_CS1_Workspace\Addition_Game_Methods_And_Loops>git commit -m "merged de
varray changes into dev branch"
On branch dev
Your branch is up-to-date with 'origin/dev'.
nothing to commit, working directory clean

E:\Jordyn_CS1_Workspace\Addition_Game_Methods_And_Loops>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': jordyn-hartzell
Password for 'https://jordyn-hartzell@github.com':
Everything up-to-date
```
#Summary
The focus of the assignments this week was to learn arrays. We did this by sorting a list of numbers using an array and reworking the addition game using an array to define the variables. For my programs I used print statements, for loops, scanner objects, if/else statements, custom methods, case statements, and arrays. I had yet to use a case statement in any of my programs, but I wanted to give the user the option of inputting numbers or randomly generating numbers. I learned the purpose of arrays and found how they can be useful for defining many variables. They are especially useful to import into another method as you can import and return all variables at once because methods can only return one value. I also have a much better grasp of custom methods now because after the last assignment I still felt a little unsure of how we use them.



