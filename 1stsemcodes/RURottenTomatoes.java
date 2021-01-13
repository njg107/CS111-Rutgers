/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author: njg107
 *           Nitin Gowda
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {
		int [][] nakkan = new int[Integer.parseInt(args[0])][Integer.parseInt(args[1])];
        int cnt = 2;
        for (int r = 0; r < nakkan.length; r++)
        {
            for (int c = 0; c < nakkan[r].length; c++)
            {
                nakkan[r][c] = Integer.parseInt(args[cnt]);
                cnt+=1;
            }
        }
        
        int x = 0;
	
        int[] L = new int[Integer.parseInt(args[1])];
        
        for (int i = 0; i<nakkan[0].length; i++)
        {
            int cnt2 = 0;
            for (int j = 0; j<nakkan.length; j++)
            {
                cnt2 += nakkan[j][i];
            }
            L[x] = cnt2;
            x+=1;
            
        }
        
        
        int[] L1 = new int[L.length];
        int p = 0;
        for(int i = 0; i<L.length; i++){
            L1[p] = L[i];
            p+=1;
        }
        for (int i = 0; i < L1.length; i++)
        {
            for (int j = i+1; j < L1.length; j++)
            {
                if (L1[i] > L1[j])
                {
                    int a = L1[i];
                    L1[i]=L1[j];
                    L1[j]=a;

                }
            }
        }
        
        int cnt3 = 0;
        for (int i = 0; i < L1.length; i++)
        {
            if (L[i] == L1[(L1.length)-1])
            {
                System.out.println(cnt3);
                break;
            } 
            else
            {
                cnt3+=1;
            }
        }
		// WRITE YOUR CODE HERE
	}
}

dividend = Double.parseDouble(args[0]);
divisor = Double.parseDouble(args[1]);
if (divisor != 0) {
     System.out.println(dividend/divisor);
}
else {
     System.out.print("error");

    if (x>100) {
        System.out.println("GT");
   }
   else if (x<100) {
        System.out.println("LT");
   }
   else if (x = 100) {
        System.out.println("EQ");
   }


   sum = sum + 1.0/math.pow(num,2);
   line 9
   while (num <=10)
   line 7


   n = StdIn.readInt();
int [][] L = int [n][n];
for (int r = 0; r < L.length; r++)
{
     int[] values = StdIn.readAllInts();
     for ( int c = 0; c<L[r].length; c++)
{
          int cnt = 0;
          L[r][c] = values[cnt];
          cnt+=1;
          }
}