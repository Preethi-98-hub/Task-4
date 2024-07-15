package com.Task4;
import java.util.Scanner;

public class Ninth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the age of the person: ");
        int age = scanner.nextInt();

        if (age >= 65) {
            System.out.println("The person is a senior citizen.");
        } else {
            System.out.println("The person is not a senior citizen.");
        }

        scanner.close();
    }

	}


