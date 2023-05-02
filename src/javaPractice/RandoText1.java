package javaPractice;

import java.util.Random;
import java.util.Scanner;

public class RandoText1 {
	  public static void main(String[] args) {
		String username="";
		String domain="@gmail.com";
	    String alphabet = "1234567890";
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    int length = 5;
	    for(int i = 1; i < length; i++) {
	      int index = random.nextInt(alphabet.length());
	      char randomChar = alphabet.charAt(index);
	      sb.append(randomChar);
	    }
	    String randomString = sb.toString();
	    String email=username+randomString+domain;
	    System.out.println(email);

	  }
	}

