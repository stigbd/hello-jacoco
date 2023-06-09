package com.mycompany.hellojacoco;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        Palindrome palindromeTester = new Palindrome();

        if (palindromeTester.isPalindrome(args[0])) {
            System.out.println(String.format("%s is a palindrome", args[0]));
        } else {
            System.out.println(String.format("%s is NOT a palindrome", args[0]));
        }
    }
}
