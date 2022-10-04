package simDisplay;

import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

public class DisplayMenu
{



    public static void main(String[] args) throws IOException {
        NewConnection newConnection=new NewConnection();
        PrepaidUser prepaidUser=new PrepaidUser();



        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("Press 0 to exit");
            System.out.println("Press 1 to check prepaid users");
            System.out.println("press 2 to add new user");
            System.out.println("Press 3 to print in ascending order by name");
            System.out.println("enter your choice");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 0:
                {
                    System.exit(0);
                    break;
                }
                case 1:
                {
                   prepaidUser.prepaid();
                    break;
                }
                case 2:
                {
                    newConnection.addUser();
                    break;
                }
                case 3:
                {
                    newConnection.display();
                    break;
                }
                default:
                {
                    System.out.println("Enter a valid choice");
                }
            }


        }
    }
}