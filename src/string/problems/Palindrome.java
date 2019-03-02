package string.problems;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word to check palindrom");
        String st = input.next();
        System.out.println(isPalindrom(st));
    }

    public static boolean isPalindrom(String st) {
        boolean palindrom = false;
        for (int i = 0; i < st.length(); i++) {
            for (int j = st.length() - 1; j >= 0; j--) {
                if (st.charAt(i) == st.charAt(j)) {
                    palindrom = true;
                }
                else { 	palindrom = false;

                }
            }
        }
        return palindrom;


    }



}

