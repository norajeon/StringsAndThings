package io.zipcoder;


import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){

        String[] words = input.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith("y") || words[i].endsWith("z")) {
                count++;
            }
        }

        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){

    // if (remove.equals(base)) {
        String newString = base.replaceAll(remove,"");
        return newString;
    //}


    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        // int isNum = 0;
        String[] contains = input.split("is", -5);
        int num1 = contains.length-1;
        // for (int i = 0; i < input.length(); i++) {
           // if (input.matches("is")) {
           //     isNum++;
           // }
       // }
        //int notNum = 0;
        String[] notContains = input.split("not", -5);
        int num2 = notContains.length-1;
         //   for (int j = 0; j < input.length(); j++) {
           //     if (input.matches("not")) {
                   // notNum++;
             //   }

          //  }


        return num1 == num2;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        boolean happyString = input.contains("gg");

        return happyString;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        char[] trips = input.toCharArray();
        int h = 0;
        for (int k = 0; k < trips.length - 2 ; k++) {
            if (trips[k] == trips[k+1] && trips[k] == trips[k+2] && trips[k+1] == trips[k+2]){
                h++;
            }

           /** for (int m = 1; m < trips.length; m++) {
                for (int n = 2; n < trips.length; n++) {
            if (trips[k] == trips[m] && trips[k] == trips[n] && trips[n] == trips[m]) {


                h++;

            }
            }

           }

            */
        }

        return h;
    }
}
