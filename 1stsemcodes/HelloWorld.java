/*************************************************************************
 *  Compilation:  javac HelloWorld.java
 *  Execution:    java HelloWorld
 *
 *  @author:
 *
 *  Prints "Hello, World". By tradition, this is everyone's first program.
 *
 *  % java HelloWorld
 *  Hello, World
 *
 *************************************************************************/

public class HelloWorld {

    public static void main(String[] args) {

        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int number3 = Integer.parseInt(args[2]);
        int number4 = Integer.parseInt(args[3]);
        int number5 = Integer.parseInt(args[4]);
        int x = 0;
        if ((number1>number2)&&(number1>number3)&&(number1>number4)&&(number1>number5)) {
            x = number1;
        } else if ((number2>number1)&&(number2>number3)&&(number2>number4)&&(number2>number5)) {
            x = number2;
        } else if ((number3>number1)&&(number3>number2)&&(number3>number4)&&(number3>number5)) {
            x = number3;
        } else if ((number4>number1)&&(number4>number2)&&(number4>number3)&&(number4>number5)) {
            x = number4;
        } else {
            x = number5;
        }
        System.out.print(x);
    // WRITE YOUR CODE HERE
    }

}