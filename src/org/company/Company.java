package org.company;

import java.util.Scanner;

public class Company  {
	    public static void main(String[] args) {
	        String s="a3b2ab";
	        for(int i=0;i<s.length();i++) {
	        	if(Character.isAlphabetic(s.charAt(i))) {
                  System.out.print(s.charAt(i));
                  }
	        	else {
	        		int x=Character.getNumericValue(s.charAt(i));
	        		for(int j=1;j<x;j++);
	        		System.out.print(s.charAt(i-1));
	        	}
	        		
	        	}
	        	
	        }
	}
	

