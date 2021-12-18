package HW2;

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





    // 3. Create a method that will calculate the tip on a bill per person
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method 

    


    import java.util.Scanner;
    
    public class MathGames {
           public static void main(String[] args) { 
            System.out.println("Welcome \n");
    
            Scanner scan = new Scanner(System.in);
    
            System.out.print("Enter a value for base: ");                                                             
            double base = scan.nextDouble();
            System.out.print("Enter a value for perpendicular: ");
            double perpendicular = scan.nextDouble();
            hypo(base, perpendicular); 
    
            System.out.println("Enter the value the numerical value of the grade: ");
            
            double gradeValue = scan.nextDouble();
            letter(gradeValue); 
    
            System.out.println("Enter the cost of the meal: ");
            double totalBill = scan.nextDouble(); 
    
            System.out.println("Enter the tip percentage: ");
            
            double tip = scan.nextDouble(); 
            System.out.println("How many people are paying?");
            
    
           int people = scan.nextInt();
            billing(totalBill, tip, people);
          // SCANNER
    
            scan.close();
        
    
        }
        public static double hypo(double base, double perpendicular) {
    
            // square root 
            double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(perpendicular, 2));
        
            
            System.out.println("The length of the hypotenuse is: " + hypotenuse + "\n");
            return hypotenuse; 
        } 
    
        public static double letter(double gradeValue) {
    
            double roundUp = Math.ceil(gradeValue);
           
            if (roundUp > 89) {
            
            System.out.println("Your grade is an A."+ "\n");
                } else if (roundUp > 79) {
            
            System.out.println("Your grade is a B."+ "\n");
                } else if (roundUp > 69) {
           
            System.out.println("Your grade is a C."+ "\n");
                } else if (roundUp > 59) {
               
                System.out.println("Your grade is a D."+ "\n");
                } else if (roundUp < 60) {
                System.out.println("Your grade is a F."+ "\n");
                // GRADES with rounding 
    }
            return gradeValue;
    
    }
        public static double billing(double totalBill, double tip, int people) {
    
          
    
           double totalAmount = totalBill + (tip*totalBill);
        
            double round = Math.ceil(totalAmount);
           System.out.println("Your rounded total amount you have to pay is $" + round);
    
          
           double peoplePay = Math.ceil(round/people); 
           System.out.println("Each person has to pay $" + peoplePay + "(rounded)");
    
           return peoplePay; 
        }
    }
           // WITH METHODS
