package com.tgt.igniteplus;

//SWIGGY CODE//
/*Develop a method that accepts a zip code and validates against non-deliverable zip codes.
• Example – zip codes 123, 456, 789 are non-deliverable.
• If the customer resides at a non-deliverable zip code, throw a custom exception.
• Handle the exception and display an appropriate message to the customer.
• If the customer resides at a deliverable zip code, display a message “Delivery available in your area! “.
• Invoke this method from the main function which takes the zip code as input parameter
*/

import java.util.*;
public class exchandl {

        static   ArrayList<Integer> code = new ArrayList<>();
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the zipcode");
            int zipcode = sc.nextInt();
            code.add(123);
            code.add(456);
            code.add(789);
            try {
                checkCode(zipcode);
            } catch (Exception e) {
                System.out.println("Delivery unavailable");
            }
        }
        public static void checkCode(int zipcode) throws InvalidCodeException{
            int flag=0;
            for(int i =0;i< code.size();i++) {
                if (zipcode != code.get(i) &&  Integer.toString(zipcode).length()==6)
                    flag=1;
                else
                    throw new InvalidCodeException("Invalid");
            }
            if(flag==1)
                System.out.println("Delivery available in your area!");
        }
    }
    class InvalidCodeException extends Exception {
        InvalidCodeException(String s) {
            super(s);
        }
    }
/*output
Enter the zipcode
789
Delivery unavailable
Enter the zipcode
560032
Delivery available in your area!
 */
