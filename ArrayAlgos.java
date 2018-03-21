import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
public class ArrayAlgos {
    //public static void main(String[] args) {
		//for (int i = 1; i < 256; i++){
		//System.out.println(i);
	//}
	//public static void main(String[] args) {
		//for (int i = 1; i < 256; i=i+2){
		//System.out.println(i);
	//}
	
	//public static void main(String[] args) {
		//int sum = 0;
		//for (int i = 0; i < 256; i++){
		//sum = sum + i;
		//System.out.println(sum);
	//}
	
	//public static void main(String[] args) {
		//int[] myArray = {1,3,5,7,9,13};
		
		//for (int i = 0; i<myArray.length; i++){
			//System.out.println(myArray[i]);
		//}
	//}
	
	//public static void main(String[] args) {
		//int[] MyArray = {-3, 17, 14, -100, 12, 15, 2, 1};
		//int min = MyArray[0];
		//for (int i = 0; i<MyArray.length; i++){
			//if (MyArray[i] < min ){
				//min = MyArray[i];
			//}else {
				//continue;
			//}
		//}
		//System.out.println(min);
	//}
	
	//public static void main(String[] args) {
		//int[] MyArray = {3, 17, 14, 100, 12, 15, 2, 1};
		//int sum = 0;
		//int avg;
		//for (int i = 0; i<MyArray.length; i++){
			//sum = sum + MyArray[i];
		//}
		
		//avg = sum / MyArray.length;
		//System.out.println("The sum is "+sum);
		//System.out.println("The average is "+avg);
	//}
	
	//public static void main(String[] args) {
		//ArrayList<Integer> MyArray = new ArrayList<Integer>();
		//for (int i = 1; i< 256; i = i+2){
			//MyArray.add(i);
		//}
		//System.out.println("The new Array is " + MyArray);
	//}
	
	//public static void main(String[] args) {
		//int[] MyArray = {3, 17, 14, 100, 12, 15, 2, 1};
		//int y = 35;
		//int count = 0;
		//for (int i = 0; i<MyArray.length; i++){
			//if (MyArray[i] > y){
				//count++;
			//}
		//}
		
		//System.out.println("The numbers in the array that are larger than Y is "+ count);
	//}
	
	//public static void main(String[] args) {
		//int[] MyArray = {3, 17, 14, 100, 12, 15, 2, 1};
		//for (int i = 0; i<MyArray.length; i++){
			//MyArray[i] = (int)Math.pow(MyArray[i],2);
		//}
		
	//System.out.println(Arrays.toString(MyArray));
	
	//public static void main(String[] args) {
		//int[] MyArray = {1, 5, 10, -2};
		//for (int i = 0; i<MyArray.length; i++){
			//if (MyArray[i] < 0 ){
				//MyArray[i] = 0;
			//}else {
				//continue;
			//}
		//}
		//System.out.println(Arrays.toString(MyArray));
	//}

//    public static void main(String[] args) {
//        int[] MyArray = {1, 5, 10, -2};
//        double max = MyArray[0];
//        double min = MyArray[0];
//        double sum = 0;
//        for (int i = 0; i<MyArray.length; i++){
//            if (MyArray[i] < min ){
//                min = MyArray[i];
//            } else if(MyArray[i] > max){
//                max = MyArray[i];
//            }
//            sum = sum + MyArray[i];
//
//        }
//        double avg = sum/MyArray.length;
//
//        double [] MyNewArray ={max, min, avg};
//
//        System.out.println(Arrays.toString(MyNewArray));
//    }

    public static void main (String[] args){
        int[] MyArray = {1, 5, 10, 7, -2};
        for (int i = 0 ; i<MyArray.length-1; i++) {
            MyArray[i] = MyArray[i + 1];
        }
        MyArray[MyArray.length - 1] = 0;

        System.out.println(Arrays.toString(MyArray));
    }
}

	
