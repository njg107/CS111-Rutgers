/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @author:
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  0.3
 *************************************************************************/

public class TwoSmallest {

    public static void main(String[] args) {


        
        for (int i = 0; i < args.length; i++){
            for (int j = i+1; j < args.length; j++){
                if (Double.parseDouble(args[i]) > Double.parseDouble(args[j])){
                    String a = args[i];
                    args[i]=args[j];
                    args[j]=a;
                
                }
            }
        }
        System.out.println(args[0]);
        System.out.println(args[1]);
    // WRITE YOUR CODE HERE
    }

}
