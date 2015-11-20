# Homework 10: Arrays
##### COMSC-1033 Sec. 1411, Jordyn Hartzell, HW 9
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
// Example 1
// This shows how to create an array that will allow users to input the values.
```
# Code: Sorting Lists
## Console
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
# Code: Addition Game with Arrays
## Console
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
#Summary





