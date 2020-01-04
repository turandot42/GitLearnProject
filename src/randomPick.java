import java.awt.*;
import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class randomPick {

    public static void main(String[] args) {


        String[] students = {"Aida","Chika","Taalai","Abi","Meerimbek","Urmat","Bota","Erkaim","Gul;ya","Nazirke",
                "Aziza","Ulzana","Janar","Argen","Tyncha","Meerim","Datkayim","Nurbek","Ainura","Gulnura",
                "Aidai","Taalai"};

        ArrayList<String> listNames = new ArrayList<String>();

        for(int i = 0; i < students.length; i++){
            listNames.add(students[i]);
        }

        System.out.println(listNames);



    }
    public static String softSkills(String softSkillQuestion){
        ArrayList<String> softSkill = new ArrayList<>(Arrays.asList("1- How many percentage manually and automation?",
                "2- How many team, how many software are u working?",
                "3-What kind of methodology?(scrum)",
                "4- How long your iteration?(sprint)",
                "5- There is 5 days gap on your sprint what do u do those days?",
                "6- What kind of technology or supply used in your application build (spring framework)",
                "7- You have 3 weeks sprint and when do u start writing your code?",
                "8- Do u also test database?",
                "9- Do u create your own test data and do u put that data in database or u put in a file ?",
                "10- How often your automation breaks I mean how often it fails?",
                "11- If developer redesign section of form due to the order and change their markup completely is it going to break your task too?"));



        return softSkillQuestion;
    }

    public static String javaQuestions(String javaQuestion){
        ArrayList<String> javaQuestionsList = new ArrayList<>(Arrays.asList("1.Tell me about class structure and it’s definition?",
        "2. what is main method?",
        "3. Which purposes do you use comments in your program",
        "4. What is data type in Java?",
        "5. What is the size of each datatype in bytes?",
                "6. Tell me what are the values each data type can hold.",
        "7. What can you tell me about characters?",
                "8. What can you tell me about Strings?",
                "9. Which values can be assigned to int?",
        "10. Which values can be assigned to char?",
        "11. How to change directory on unix?",
        "12. how to list the content of the directory?",
        "13. how to write to a file?",
        "14. how to read a file?",
                "15. Tell me about arithmetic operators.",
        "16. What’s the purpose of %?",
        "17. What’s the purpose of * and /",
                "18. What is the data type of 9 * 10.1",
        "19. What is the result of (int)(5 * 10.5)",
        "20. what is the result of num1 = 5; num+=2;",
        "21. what is the result of num1 after. num1 = 9; num1++;",
        "22. what is the result of boolean isGood = true || false;",
        "23. what is the result of boolean isGood = true && false;",
        "24. Difference between post and pre increment",
        "25. what is the result of  (55 >= 55)));"));



        return javaQuestion;
    }

    public static String javaQuestionsTask(String javaQuestionTask){
                ArrayList<String> javaQuestionsTaskList = new ArrayList<>(Arrays.asList("1. Write a program to check if two given String is Anagram of each other. Your function should return true if two Strings are Anagram, false otherwise. A string is said to be an anagram if it contains the same characters and same length, but in a different order, e.g. army and Mary are anagrams. You can ignore cases for this problem, but you should clarify that from your interview.",
                "2.Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . up to a given number. We prepare for cross questions like using iteration over recursion and how to optimize the solution using caching and memoization.",
                "3. Write a Java program to check if a given number is prime or not. Remember, a prime number is a number which is not divisible by any other number, e.g. 3, 5, 7, 11, 13, 17, etc. Be prepared for cross, e.g. checking till the square root of a number, etc.",
                "4. You need to write a simple Java program to check if a given String is palindrome or not. A Palindrome is a String which is equal to the reverse of itself, e.g., “Bob” is a palindrome because of the reverse of “Bob” is also “Bob.” Though be prepared with both recursive and iterative solution of this problem. The interviewer may ask you to solve without using any library method, e.g. indexOf() or subString() so be prepared for that.",
                "5. A number is called an Armstrong number if it is equal to the cube of its every digit. For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3. You need to write a program to check if the given number is Armstrong number or not.",
                "6. This is one of the simplest programs you can expect in interviews. It is generally asked to see if you can code or not. Sometimes interviewer may also ask about changing a recursive solution to iterative one or vice-versa.",
                "7. This problem is similar to the String Palindrome problem we have discussed above. If you can solve that problem, you can solve this as well. You can use indexOf() or substring() to reverse a String or alternatively, convert the problem to reverse an array by operating on character array instead of String. If you want to brush up your data structure skill you can also check Data Structures and Algorithms: Deep Dive Using Java course on Udemy before solving this question.",
                "8. Write a program to remove duplicates from an array in Java without using the Java Collection API. The array can be an array of String, Integer or Character, your solution should be independent of the type of array. If you want to practice more array-based questions, then see this list of top 30 array interview questions from Java interviews."
                ));

        return javaQuestionTask;
    }
}
