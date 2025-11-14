package com.tnsif.ExceptionHandling;

public class CodeRewrite {

	public static void main(String[] args) {
        String[] accounts = {"John", "Alice", null, "Bob"};
        int[] balances = {1000, 2000, 3000};

        // Detective task: Find all issues!
        try {
        	for(int i = 0; i <= accounts.length; i++) {
	        	System.out.println("Account holder: " + accounts[i]);
	        	System.out.println("Balance: " + balances[i]);	
	        	}
        }
        catch (NullPointerException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e){
        	System.out.println(e);
        }

        try {
        	String input = "abc";
            int withdrawal = Integer.parseInt(input);
            System.out.println(withdrawal);
        }catch(Exception e) {
        	System.out.println(e);
        }
    }
}