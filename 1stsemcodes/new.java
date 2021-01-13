public class new {
    long barcode = Long.parseLong(args[0]);
        long cnt = 0;         //cnt is count
        while (barcode>0){
            barcode = barcode/10;
            cnt = cnt+1;
        }
        
        if (cnt%2 !=0) {     //for odd number of digits
            long y = 10;
            long cnt2 = 0;
            long z = (cnt/2)+1;
            while (z>0){
                long a = barcode % y;//compute a as barcode % y
                while (a>=10) {  //makes sure value of a is a single digit
                    a = a/10;//compute a as a/10
              }
                cnt2 = cnt2+a;//compute cnt2 as cnt2+a
                y = y*100;//compute y as y*100
                if (y>barcode) {           //if y ever exceeds barcode it decreases it to the right value
                    y = y/10;//compute y as y/10 
                }
                z = z-1;//compute z as z-1
            }
            cnt2 = cnt2%10;//compute cnt2 as cnt%10
           
        
            barcode = barcode/10;
            cnt = cnt-1;//compute cnt as cnt-1
            z = cnt/2;//compute z as cnt/2
            y = 10;//set y to 10
            long cnt3 = 0;//set cnt3 to 0
            while (z>0){
                if (y>barcode) {
                    y = y/10;
                }    // (on second iteration of 3 digit numbers y exceeds barcode so we reduce y)
                long a = barcode % y;//compute a as barcode % y
                while (a>=10){ 
                    a = a/10;//compute a as a/10
              }
                cnt3 = cnt3+a;//compute cnt3 as cnt3+a
                y = y*100;//compute y as y*100
                if (y>barcode) {
                    y = y/10;//compute y as y/10
                }
                z = z-1;//compute z as z-1
            }
        
            cnt3 = cnt%10;//compute cnt3 as cnt%10
            cnt3 = cnt3*3;//compute cnt3 as cnt3*3
            cnt3 = cnt3%10;//compute cnt3 as cnt3%10
            long cnt4 = cnt3 + cnt2;//compute cnt4 as cnt3+cnt2
            cnt4 = cnt4%10;//compute cnt4 as cnt4%10
            System.out.print(cnt4);
        }
        else {          //for even number of digits 
            long y = 10;//set y to 10
            cnt = 0;//set cnt2 to 0   
            long z = cnt/2;//compute z as cnt/2
            long cnt2 = 0;//set cnt2 to 0
            while (z>0) {
                long a = barcode % y; //compute a as barcode % y
                while (a>=10) {
                    a = a/10;//compute a as a/10
                }
                cnt2 = cnt2 + a;//compute cnt3 as cnt3+a
                y = y*100;//compute y as y*100
                if (y>barcode) {
                    y = y/10;//compute y as y/10
                }
                z = z-1;//compute z as z-1
            }
            cnt2 = cnt2%10;//compute cnt2 as cnt%10
           
            barcode = barcode/10;//compute barcode as barcode/10
            cnt = cnt - 1;//compute cnt as cnt-1
            y = 0;//set y to 10
            long cnt3 = 0;//set cnt3 to 0
            z = 6;//compute z as (cnt/2)+1
            while (z>0){
                long a = barcode % y;//compute a as barcode % y
                while (a>=10) {
                    a = a/10;//compute a as a/10
                }
                cnt3 = cnt3+a;//compute cnt3 as cnt3+a
                y = y*100;//compute y as y*100
                if (y>barcode) {
                    y = y/10;//compute y as y/10
                }
                z = z-1;//compute z as z-1
            }
           
            cnt3 = cnt%10;//compute cnt3 as cnt%10
            cnt3 = cnt3*3;//compute cnt3 as cnt3*3
            cnt3 = cnt3%10;//compute cnt3 as cnt3%10
            long cnt4 = cnt3 + cnt2;//compute cnt4 as cnt3+cnt2
            cnt4 = cnt4%10;//compute cnt4 as cnt4%10
            System.out.print(cnt4);
        }
}
