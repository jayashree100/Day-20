package com.bridgelab.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegestration {
	private static final String NAME = "[A-Z][a-z]{2,}";

	public void ValidateFirstName(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first Name : ");
        String firstName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));
    }
}
