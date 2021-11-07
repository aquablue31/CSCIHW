package HW1;
// Make a method that accepts a string and an integer and a char and will return the string with the char
// replaced at the integer given
// charReplace("I MAKE BREAD",2,T)
// EX: I MAKE BREAD, 2, T
//     I TAKE BREAD
// remember computer counting starts at 0:
// HELLO
// 01234
public class Replace {
    public String charReplace(String s, int x, char z) {     
                StringBuilder sb = new StringBuilder(s);
                // replace character at the specified position
                sb.setCharAt(x, z);
                s = sb.toString();
        
                return s; 
        
    }
    
}
