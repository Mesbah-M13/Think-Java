import java.util.Arrays;
import java.util.Scanner;

// READ and PRINT values of an ARRAY

public class Array2 {
    public static void main(String[] args) {
        // input for array size
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of an Array : ");
        int size = in.nextInt();

        // input for array elements
        int[] newArr = new int[size];

        System. out.println("Your entered input:");
        for (int i = 0; i < size; i++) {
            newArr[i] = in.nextInt();
        }
        // for (int i = 0; i < size; i++) {
        //     System.out.print(newArr[i]);
        // }
        System.out.print(Arrays.toString(newArr));
    }
}