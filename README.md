# Homework 10: Arrays
##### COMSC-1033 Sec. 1411, Jordyn Hartzell, HW 9
## Introduction
### Outline
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






