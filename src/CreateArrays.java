import sun.lwawt.macosx.CPrinterDevice;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //printing using arrays to string
        int[] numbers = {1, 21, 63, 4, 51};
        System.out.println("Numbers: " + Arrays.toString(numbers));

        //printing user for loop
        System.out.print("Numbers: ");
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i] + ", ");
        }

        System.out.println();
        System.out.println();

//        7 Strings
        String[] weekDays = new String[7];
        for (int i = 0; i < weekDays.length; i++) {
            System.out.println("Enter a weekday #" + (i+ 1) + ":" );
            weekDays[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(weekDays));

        System.out.println();

//        Print array of char
        System.out.println("Array of char");
        char[] letters = {'a','e','i','o','u'};
        System.out.println(Arrays.toString(letters));


        System.out.println();


//        Print array of booleans
        System.out.println("Booleans:");
        boolean[] facts = {true, false};
        System.out.println(Arrays.toString(facts));


    }
}




