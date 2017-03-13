package armstrong.alexandra;

import java.util.Scanner;

import static armstrong.alexandra.MoneyToWords.convertNumberToWords;

public class IO {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        long number = scanner.nextLong();
        System.out.println(convertNumberToWords(number));


    }
}
