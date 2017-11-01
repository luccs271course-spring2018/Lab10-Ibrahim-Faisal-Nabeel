package edu.luc.cs271.linkedstack;
import java.util.Scanner;


public class ReverseLines {
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.println("Enter data then press Ctrl+D to reserve the input");
        printReverse(input);

    }
    private static void printReverse(final Scanner input) {
        while (input.hasNextLine()) {// TODO recursively read and print successive input lines until EOF, then print them out in reverse order
        String data = input.nextLine();
            System.out.println(data);
            printReverse(input);
            System.out.println(data);
        }
    }
}

