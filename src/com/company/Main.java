package com.company;
import java.util.Scanner;

public class Main {

    static String userName(String name) {
        Scanner myObj = new Scanner(System.in);
        String userName;

        // Enter username and press Enter
        System.out.println("Enter username");
        userName = myObj.nextLine();

        System.out.println("Username is: " + userName);
        return userName;
    }
    static int add5(int num) {
        return num + 5;
    }

    public static void main(String[] args) {
	// write your code here
        int num;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        num = input.nextInt();

        num = add5(num);
        System.out.println(num);

        String userName = "";
        userName(userName);

        System.out.println(userName);
    }
}
