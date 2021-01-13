/*************************************************************************
 *  Compilation:  javac OrderCheck.java
 *  Execution:    java OrderCheck 5 10 15 2
 *
 *  @author: Nitin Gowda 
 *           njg107@scarletmail.rutgers.edu 
 *           njg107
 *
 *  Prints true if the four integer inputs are in strictly ascending
 *  or descending order, false otherwise
 *
 *  % java OrderCheck 5 10 15 2
 *  false
 *
 *  % java OrderCheck 15 11 9 4
 *  true
 *
 *************************************************************************/

public class OrderCheck {

    public static void main(String[] args) {

    int number1 = Integer.parseInt(args[0]);
    int number2 = Integer.parseInt(args[1]);
    int number3 = Integer.parseInt(args[2]);
    int number4 = Integer.parseInt(args[3]);
    boolean output = ((number1>number2)&&(number2>number3)&&(number3>number4))||((number4>number3)&&(number3>number2)&&(number2>number1));
    System.out.println(output);    
    // WRITE YOUR CODE HERE
	
    }
}
