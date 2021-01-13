/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author:
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {

        double[] return_array = new double[array.length];
        for (int i=0;i<array.length;i++){
            return_array[i] = array[i];
        }

        return (return_array);
    } 
    public static void scale(double[] x, double[] y, double alpha) {
        
        for(int i = 0; i<x.length; i++){
            x[i] = alpha*x[i];
        }
        for(int i = 0; i<y.length; i++){
            y[i] = alpha*y[i];
        }
        
	// WRITE YOUR CODE HERE
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
        for(int i = 0; i<x.length; i++){
            x[i] = dx + x[i];
        }
        for(int i = 0; i<y.length; i++){
            y[i] = dy + y[i];
        }
        

	// WRITE YOUR CODE HERE
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {

        theta = Math.toRadians(theta);

        for (int i=0;i<x.length;i++){
            double yay = x[i];
            x[i] = (x[i]*Math.cos(theta)) - (y[i]*Math.sin(theta));
            y[i] = (y[i]*Math.cos(theta)) + (yay*Math.sin(theta));
        }
    }
        

	// WRITE YOUR CODE HERE
    

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {
        // Rotates polygon 45 degrees. 
        StdDraw.setScale(-5.0, +5.0); 
        double[] x = { 0, 1, 1, 0 }; 
        double[] y = { 0, 0, 2, 1 }; 
        double theta = 45.0; 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        rotate(x, y, theta); 
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
        
        
    
    } 
}