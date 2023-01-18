
import java.io.*;
import java.util.Scanner;

class revString {
    public static void main(String[] args) {

        String str = "Mehul", nstr = "";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Mehul");

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reversed word: " + nstr);
    }
}
