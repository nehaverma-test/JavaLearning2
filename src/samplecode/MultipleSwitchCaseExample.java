package samplecode;

import java.util.Scanner;

public class MultipleSwitchCaseExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input age");
        int age = sc.nextInt();

        System.out.println("Enter the input day");
        String day = sc.next();

        switch(day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                   if(age>=18 && age<=59)
                       System.out.println("Ticket price is Rs100");
                   else if(age>=60)
                       System.out.println("Ticket price is Rs80");
                   else
                       System.out.println("You are not an adult");
                   break;
            case "Saturday", "Sunday":
                if(age>=18 && age<=59)
                    System.out.println("Ticket price is Rs150");
                else if(age>=60)
                    System.out.println("Ticket price is Rs120");
                else
                    System.out.println("You are not an adult");
                  break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
