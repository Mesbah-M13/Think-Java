import java.util.Arrays;
import java.util.Scanner;

// Print Values of an Array

public class Array1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] myArr = new int[4];
            myArr[0] = 22;
            myArr[1] = 2;
            myArr[2] = 20;
// PATH -1
        // for (int i = 0; i < myArr.length; i++) {
        //     myArr[i] = in.nextInt();
        // }
        // for (int i = 0; i < myArr.length; i++) {
        //     System.out.print(myArr[i] + " ");
        // }
// PATH -2
//  for (int i: myArr) {
//            System.out.print(Arrays.toString(myArr));
//        }
// PATH -3
        for (int i = 0; i < myArr.length; i++) {
        myArr[i]= in.nextInt();       // BEST ⭐
     }

     System.out.print(Arrays.toString(myArr));

    }

}
