package HW1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        Adlibs a = new Adlibs();
        //creates a variable for name, age, and favoriteColor
        String str = a.story("Jessica", 20, "blue");
        //prints out what is in return 
        System.out.println(str);
        //prints out method
        Pyramid.Output(); 

        //a.story(name, age, favoriteColor); 
 
        Replace r = new Replace();
        r.charReplace("i WANT CAKE", 7, 'C'); 
        // print the modified string
        System.out.println(r.charReplace("i WANT CAKE", 7, 'C'));

//   s = "i WANT CAKE"; x = 7; z = 'C';

        // Create an object that will make a Pyramid (see Pyramid.java for more info)

        // Create an object that implements a method which will take an name, age, and favorite color and will return a story (see Adlibs.java for more info)
        
        // Create an object that implements a method which will  accept a string, an integer, and a char and will replace the char in the string at the given integer (See Replace.java for more info)

        //Adlibs a = new Adlibs();
        //a.story(name, age, favoriteColor);
    }

}
