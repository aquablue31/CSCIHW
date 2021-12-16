package HW5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPlayground {
    public static void main(String[] args) {
      nums(); 
      Week();
      inpution(); 
    }
 // Question 1
    // Write Java statements that do the following:
    // a) Declare an arrayList nums of 15 elements of type int.
    // b) Output the value of the tenth element of the array nums.
    // c) Set the value of the 5th element of the array alpha to 99.
    // d) Set the value of the 9th element of the array alpha to the sum of the 6th and 13th elements of the array nums.
   public static void nums() {
        System.out.println("Here is my array list of 15 numbers: ");
        int n = 15;
        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> numbers = new ArrayList<Integer>(n);
 
        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= n; i++)
            numbers.add(i);
 
        // Here is a, b, c, d 
        System.out.println(numbers);
        System.out.println("The tenth element of the array nums: " + numbers.get(9));

        numbers.set(4, 99);
        System.out.println("Changing the 5th element of the array alpha to 99 " + "\n" + numbers);
        
        numbers.set(4, 5);
        numbers.set(8, 7 + 14);
        System.out.println("Here is the value of the 9th element of the array alpha to the sum of the 6th and 13th elements of the array nums" + "\n" + numbers);

    }

 // Question 2
    // a) create an arrayList of Strings that contain each day of the week.(starting on monday)
    // b) output each of the days of the week
    // c) output the days of the week we have class
    // d) change the arrayList to start on Sunday

    public static void Week(){
      ArrayList<String> weekList = new ArrayList<String>();
        
         weekList.add("Monday"); 
         weekList.add("Tuesday");
         weekList.add("Wednesday");
         weekList.add("Thursday");
         weekList.add("Friday");
         weekList.add("Saturday");
         weekList.add("Sunday");


         System.out.println("Here's all the days of the week in the Arraylist:");
         System.out.println(weekList);


         System.out.println("Here are the days of the week:");
         for (int i =0; i<weekList.size(); i++) {
             System.out.println(weekList.get(i));
         }
         
         System.out.println("Here are the days we have class");
         System.out.println(weekList.get(1) + " and " + weekList.get(3));
         String item = "Sunday"; 
         int itemPos = weekList.indexOf(item);
         weekList.remove(itemPos);
         weekList.add(0, item);
         System.out.println("It will start on a Sunday instead" + "\n" + weekList); 

  }


 // Question 3 
    // a) create an ArrayList and prompt the user for numbers to add to it until the number 0 is selected
    // b) return the largest and smallest number
    // c) return the ArrayList sorted smallest to largest
    // d) take that ArrayList see if its size is divisable by 3 and then output the ArrayList in a matrix format
    // NOTE: make the matrix n X 3 so it can be n rows by 3 columns 
    // EX. ArrayList [1,2,3,4,5,6,7,8,9]
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // NOTE: If the ArrayList is NOT divisable by 3 ask the user for more numbers and add them until it is
    // ArrayList Size: 7
    // Please enter 2 more numbers to create the matrix...
    // 
public static void inpution() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int number = 0;
        // zero stops it 
        while(true) {
            System.out.println("Enter your number. If you want to stop, enter 0. ");
            number = scan.nextInt(); 
            list.add(number); 

            if (number == 0) {
                list.removeAll(Collections.singleton(0)); 
                int large = Collections.max(list);
                int small = Collections.min(list);
                System.out.println("The largest number is " + large + " and the smallest is " + small);
                Collections.sort(list);
                System.out.println("Here are the numbers you entered from smallest to largest: " + list);

        
        if(list.size() % 3 == 0){
            for(int i = 0; i < list.size(); i += 3){
                System.out.println(list.subList(i, i + 3));
            }
        }
        else{
            Integer more;
            Integer extra = 0;
            System.out.println("In order to complete the matrix. Enter " + (3 - list.size() % 3) + " more numbers.");
            more = (3 - list.size() % 3);
            while(extra != more){
                System.out.println("Enter number");
                number = scan.nextInt();
               if(number != 0){
                list.add(number);
               }
               extra++;
            }
                for(int i = 0; i < list.size(); i += 3){
                System.out.println(list.subList(i, i + 3));
                }
                break; 
         }
    }
         }
    }
}
