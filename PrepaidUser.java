package simDisplay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrepaidUser
{
    UserPojo userPojo=new UserPojo();
    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
    void prepaid() throws IOException
    {
        System.out.println("Enter your sim type");
        userPojo.setSim_type(bufferedReader.readLine());
        if(userPojo.getSim_type()=="prepaid")
        {
            System.out.println("Enter your mobile number");
            long mobNumber=Long.parseLong(bufferedReader.readLine());
            if(mobNumber==userPojo.getPhoneNumber())
            {
                System.out.println("Press 0 for balance and validity check");
                System.out.println("Press 1 to recharge");
                int choice=Integer.parseInt(bufferedReader.readLine());
                switch (choice)
                {
                    case 0:
                    {
                        System.out.println("The name of the user is "+userPojo.getName());
                        System.out.println("The balance of the user is "+userPojo.getBalance());
                        System.out.println("The validity of the user is "+userPojo.getValidity());
                        break;
                    }
                    case 1:
                    {
                        System.out.println("Enter the balance you want to recharge for");
                        int extraBalance=Integer.parseInt(bufferedReader.readLine());
                        if(extraBalance<=0)
                        {
                            try
                            {
                                throw new RechargeAmountTooLowException();
                            }
                            catch (RechargeAmountTooLowException rechargeAmountTooLowException)
                            {
                                rechargeAmountTooLowException.printStackTrace();
                            }
                        }
                        else
                        {
                            userPojo.setBalance(userPojo.getBalance()+extraBalance);
                            userPojo.setValidity(userPojo.getValidity()+30);
                        }

                    }

                }

            }
            else
            {
            try
            {
             throw new UserDoesNotExistException();
            }
            catch (UserDoesNotExistException userDoesNotExistException)
            {
                  userDoesNotExistException.printStackTrace();
            }
            }
        }
        else
        {
            System.out.println("The user is not prepaid");
        }

    }
}
