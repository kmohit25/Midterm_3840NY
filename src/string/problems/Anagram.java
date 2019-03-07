package string.problems;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


      String first ="mary";
      String second ="army";


      boolean isAnagram =isAnagram(first,second);

        System.out.println(first +" and "+ second +" are anagrams: "+isAnagram);


    }
    public static boolean isAnagram(String first, String second){

        char [] firstWord=first.toLowerCase().replace("","").toCharArray();
        char [] secondWord=first.toLowerCase().replace("","").toCharArray();

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        return Arrays.equals(firstWord,secondWord);
    }
}


