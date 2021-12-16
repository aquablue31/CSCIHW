package HW2;
import java.util.Scanner;
public class MathGames {
    public static Scanner sc = new Scanner (System.in);
    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    // Hypotenuse and Perpendicular and return the base.

        
    // 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements are your friend here you will probably need at the least 5 if / ifelse / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method 
        
    // 3. Create a method that will calculate the tip on a bill
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method 
    // you do not need this main if you want to make a tester class
    

// solving right triangles. hypotenuse, base, perpendicular

    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        System.out.println("Which side are you trying to solve?");
        System.out.println("Press 1 for Perpendicular");
        System.out.println("Press 2 for Base");
        System.out.println("Press 3 for Hypotenuese");
        int m =0;
        m= sc.nextInt();

        if(m ==1)
        {
            System.out.println("Input Base:");
            b= sc.nextDouble();
            System.out.println("Input Hypotenuese:");
            c= sc.nextDouble();
            a = Math.sqrt(Math.pow(c,2)- Math.pow(b,2));
            System.out.println("Perpendicular =");
            System.out.println(a);

        }
        else if (m == 2)
        {
            System.out.println("Input Perpendicular:");
            a= sc.nextDouble();
            System.out.println("Input Hypotenuese:");
            c= sc.nextDouble();
            b = Math.sqrt(Math.pow(c,2)- Math.pow(a,2));
            System.out.println("Base =");
            System.out.println(b);
        }
        else if (m==3)
        {
            System.out.println("Pythagorean Theorm Solver");
            System.out.println("Input Perpendicular:");
            a= sc.nextDouble();
            System.out.println("Input Base:");
            b= sc.nextDouble();
            c = Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
            System.out.println("Hypotenuese=");
            System.out.println(c);
        }
        else{
            System.out.println("Enter the valid number");
        }
        System.out.println("---------------------------------------------------------------------------------------------");

    // calculating a grade

        System.out.println("Enter the the final grade of the student (0-100)");
        double marks =sc.nextDouble();
        if (marks<= 100 && marks > 89){
            System.out.println("Your Grade is an A");
        }
        else if (marks <= 89 && marks > 79){
            System.out.println("Your Grade is a B");
        }
        else if (marks <= 79 && marks > 69){
            System.out.println("Your Grade is a C");
        }
        else if (marks <= 69 && marks > 59){
            System.out.println("Your Grade is a D");
        }
        else if (marks <= 59 && marks >= 0){
            System.out.println("Your Grade is a F");
        }
        else {
            System.out.println("Enter Valid Marks");
        }
        System.out.println("---------------------------------------------------------------------------------------------");
        
    // tip

        System.out.println("Enter the total bill for calculating the share of the tip ");
        double totalbill = sc.nextDouble();
        totalbill = Math.ceil(totalbill);
        int t = (int) totalbill;
        System.out.println("The total Bill is (roundoff)");
        System.out.println(t);
        System.out.println("Enter the percentage of tip you want to give");
        double tip = sc.nextDouble();
        double tipamount = t * tip;
        double ab = tipamount* 1 /100 ;
        System.out.println("The total tip amount is");
        System.out.println(ab);
        System.out.println("Enter the number of people sharing the tip");
        int noofpersons = sc.nextInt();
        double tipperperson;
        tipperperson = ab / noofpersons ;
        System.out.println("The tip per person:");
        System.out.println(tipperperson);
        System.out.println("---------------------------------------------------------------------------------------------");

    }
}
