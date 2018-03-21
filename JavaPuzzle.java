import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class JavaPuzzle {
//    public static void main (String[] args){
//        int[] myArray = {3,5,1,2,7,9,8,13,25,32};
//        int sum = 0;
//        ArrayList<Integer> myNewArray = new ArrayList<Integer>();
//        for ( int i = 0; i < myArray.length; i++){
//            sum = sum + myArray[i];
//            if (myArray[i] > 10){
//                myNewArray.add(myArray[i]);
//            }
//        }
//            System.out.println("the sum is " + sum);
//        System.out.println(myNewArray);
//
//    }

    //public static void main (String[] args){
        //String[] myArray = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        //List<String> nameList = Arrays.asList(myArray);
        //ArrayList<String> myNewArray = new ArrayList<String>();
        //for ( int i = 0; i < nameList.size(); i++){
            //if(nameList.get(i).length() > 5){
                //myNewArray.add(nameList.get(i));
            //}

        //}
        //Collections.shuffle(nameList);
        //System.out.println(myNewArray);
        //System.out.println(nameList);

    //}

//    public static void main (String[] args){
//        String[] alphabet = {"a","b","c","d","e","f", "g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
//        List<String> alphabetList = Arrays.asList(alphabet);
//        Collections.shuffle(alphabetList);
//
//            if (alphabetList.get(0) == "a" | alphabetList.get(0) == "e" | alphabetList.get(0) == "i" | alphabetList.get(0) == "o" | alphabetList.get(0) == "u"){
//                System.out.println("YOU AINT GETTING THRU U VOWEL BACKK UP BEFORE U GET SMACKED UP");
//            }
//
//        System.out.println(alphabetList);
//        System.out.println(alphabetList.get(alphabetList.size()-1));
//        System.out.println(alphabetList.get(0));
//    }
//    public static void main (String[] args){
//        int[] array = new int[10];
//        for (int i =0; i < array.length; i++){
//            int randomnum = (int) (Math.random() * 100 + 55);
//            array[i] = randomnum;
//        }
//        System.out.println(Arrays.toString(array));
//
//    }

//    public static void main (String[] args){
//        int[] array = new int[10];
//        for (int i =0; i < array.length; i++){
//            int randomnum = (int) (Math.random() * 100 + 55);
//            array[i] = randomnum;
//
//        }
//        Arrays.sort(array);
//
//        System.out.println(Arrays.toString(array));
//        System.out.println("The minimum number is " + array[0]);
//        System.out.println("The maximum number is " + array[array.length-1]);
//
//    }

    public static void main (String[] args){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        StringBuffer output = new StringBuffer(5);
        int length = alphabet.length();
        Random r = new Random();
        for (int i =0; i < 5; i++) {

//            System.out.println(alphabet.charAt(r.nextInt(length)));
            output.append(alphabet.charAt(r.nextInt(length)));
        }

        System.out.println(output.toString());
    }



}













