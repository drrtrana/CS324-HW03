###### CS-324-2: Introduction to the Design of Algorithms <br> Spring 2021 <br> Northeastern Illinois University <br> Homework #2 <br> Suggested Due Date: 01/27/21 <br> Due Date: 02/10/21 at 9:00 p.m. (CT) <br> Divide and Conquer, Part I

**Getting Started**

**1.** Accept the assignment invitation on D2L.<br>
**2.** Clone the assignment to your computer.<br>
**3.** Go to File > Project Structure. Under Project Settings, click on Project and verify that the Project SDK is 
set to JDK 11 or higher.  If it is not, select the correct SDK from the drop-down.<br>
**4.** Go to File > Settings (Mac: IntelliJ IDEA > Preferences). Under Build, Execution, Deployment and under Build 
Tools, click Gradle. Make sure Build and run using: and Run tests using: are set to Gradle. Make sure Use Gradle from: 
is set to 'gradle-wrapper.properties' file. And make sure Gradle JVM is set to JDK 11 or higher.<br>
**5.** Project SDK and Gradle JVM should be set to the same Java version.<br>
**6.** Create the `main/java` directory in the `src` directory. This is where you will be creating your Java classes 
for your assignment. Right click src and go to New > Directory and select main/java.<br>

**Submitting your assignment**

**1.** Once you have completed all the problems, commit your final code to GitHub. <br>
- Please also commit code after each step of each problem and remember to run the unit tests (where applicable) and 
  code analyzers before you commit.

**2.** Then in IntelliJ, go to File, select Export to Zip File. This will create a zip file of the entire project 
directory.<br>
**3.** Submit the .zip file to the Homework 2 Assignment folder on D2L.<br>

**Coding Rules**

**1.** Unless specified in the instructions, you may not use any String variables or any String methods.<br>
**2.** Unless specified in the instructions, you may not use any built-in Array methods.<br>
**3.** Unless specified in the instructions, you may not import anything from the Java API.<br>
**4.** Note that while having all the unit tests and pmd/checkstyle tests is the first step for your code to be 
considered correct, this does not necessarily mean the algorithm is correct.<br>
**5.** Reminder: All code must be your own work.

**Running Tests and Code Analyzers**

**1.** To run the tests when indicated, click the green arrow to the left of each header to run the tests individually or
click the green arrow to the left of the class header to run all the tests. If they do not pass, your code is incorrect,
and you should continue to work on the problem.<br>
**2.** If the unit tests pass, you can run the code analyzers. On the right side, click Gradle, expand Tasks > other. 
Double click the checkstyleMain task to run it. If any rules were violated, you will be shown your errors. You can click 
the link provided then
choose your browser of choice at the top-right corner to view the error description or in the bottom left panel, click 
the middle red exclamation point to view the error. Fix the issue and rerun the checkstyleMain, repeat if necessary.<br>
**3.** Once the checkstyleMain task has passed, double-click on the pmdMain task in the same panel. If a rule 
violation was found, click the provided link, then choose your preferred browser in the top right to view the error 
description. Fix the issue and rerun the pmdMain task, repeat if necessary.<br>
**4.** When the unit tests and code analyzers have passed, open GitHub Desktop. You will be able to see the files that 
have been changed in the left panel. Enter a summary in the bottom left then click "Commit to main". Then click Push 
Origin in the right panel at the top. <br>
**5.** If you go to your GitHub account and go to the Actions tab for this assignment repository, you can see the 
Workflow running.

## **Problem 1**

**1.** In the main/java directory, create a class named `Recursion`.
- Create a static method named `hopSteps` that takes an integer parameter and returns an integer. A child is running 
  up a staircase with `n` steps and can hop either 1 step, 2 steps, or 3 steps at a time. Implement an algorithm
  that counts the number of possible ways the child can run up the stairs (i.e. the child lands on the nth step).
  <em>Hint</em>: Think about this using a top-down approach. What is the very last step, the one that lands the child on the
  nth step, that is done?
- Using big-O notation, determine the running time of your algorithm. Put this as a comment at the top of your file.
  Include a justification as to why your algorithm has that running time and include the basic operation.
- Uncomment the tests in the `RecursionTest` class in the `test/java` directory to test this method. Run the tests.
- Run the Code Analyzers.
- Push your code to GitHub.

## **Problem 2**

**1.** In the main/java directory, create a class named `ArrayInformation`.
- Let's do a little OOP review! Create an encapsulated (private) 1D integer array instance variable named `array`. Other
  than this variable, you may not have any other "global" variables (i.e. no other instance or static variables).
- Create a constructor that takes one parameter, a 1D integer array. The constructor should initialize 
  `array` to have the same length as the parameter and copy all the elements of the parameter to the array. Do **not**
  assign the reference of the parameter to the instance variable. Then, use the `Arrays.sort` method to sort the 
  instance variable (Note: this is an in-place method).
- Uncomment the tests beginning with `constructor...` in the `ArrayInformationTest` class in the `test/java`
  directory to test this method. Run the tests.
- Run the Code Analyzers.  
- Push your code to GitHub.
- Create an instance method named `findLeftBoundary` that takes an integer parameter `x` and returns an integer. This 
  method should find the largest value in `array` that is less than or equal to `x`. For example, if `array` is 
  `[1, 4, 6, 8, 9]` and `x` is `5`, then the method will return `4`. If there is no left boundary value, return -1.
  Note: This must be a recursive implementation. <em>Hint:</em> You may find it helpful to create a private helper 
  method to handle tracking the value and your indices during recursion.
- Your code must run in <em>O</em>(log <em>n</em>).
- Uncomment the tests beginning with `findLeftBoundary...` in the `ArrayInformationTest` class in the `test/java` 
  directory to test this method. Run the tests.
- Run the Code Analyzers.
- Push your code to GitHub.
- Create an instance method named `findRightBoundary` that takes an integer parameter `x` and returns an integer. This
  method should find the smallest value in `array` that is greater than or equal to `x`. For example, if `array` is
  `[1, 4, 6, 8, 9]` and `x` is `5`, then the method will return `6`. If there is no right boundary value, return -1.
  Note: This must be a recursive implementation. <em>Hint:</em> You may find it helpful to create a private helper
  method to handle tracking the value and your indices during recursion.
- Your code must run in <em>O</em>(log <em>n</em>).
- Uncomment the tests beginning with `findRightBoundary...` in the `ArrayInformationTest` class in the `test/java`
  directory to test this method. Run the tests.
- Run the Code Analyzers.
- Push your code to GitHub.

## **Problem 3**

**1.** In the main/java directory, create a class named `Organizer`.
- You may not have any other "global" variables (i.e. no instance or static variables).
- Create a static method named `findAscendingViolations` that takes a 1D integer array as a parameter and returns an
  integer. I love organization, and it really bugs me when lists of numbers are out of order in an ascending list. 
  Because of this, I need a method that determines how many cases (or violations) where a smaller number comes after a 
  larger number in the list. This method should return the number of violations for a given array.<br>
  Example 1: if the array is `[4, 5, 6, 7, 1]`, then the number of violations is `4` because although `1` is out of
  order, it comes before 4 other numbers.<br>
  Example 1: if the array is `[4, 2, 5, 6, 7, 1]`, then the number of violations is `6` because although `1` is out of
  order, it comes before 5 other numbers and `2` is out of order in front of one other number.<br>
- Note: This must be a recursive implementation and run in <em>O</em>(<em>n</em>log <em>n</em>). <em>Hint:</em> You may 
  find it helpful to create a private helper method to handle tracking the indices during recursion.
- Uncomment the tests in the `OrganizerTest` class in the `test/java` directory to test this method. 
  Run the tests.
- Run the Code Analyzers.
- Push your code to GitHub.



