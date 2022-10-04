package simDisplay;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class NewConnection
 {
    UserPojo userPojo = new UserPojo();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<UserPojo> arrayList = new ArrayList<>();

    public NewConnection(UserPojo userPojo) {
        this.userPojo = userPojo;
    }
    public NewConnection()
    {

    }

    public void addUser()
    {
        try
        {
            System.out.println("Enter your name");
            userPojo.setName(bufferedReader.readLine());
            System.out.println("Enter your email");
            userPojo.setEmail(bufferedReader.readLine());
            System.out.println("Enter your address");
            userPojo.setAddress(bufferedReader.readLine());
            System.out.println("Select your sim type");
            userPojo.setSim_type(bufferedReader.readLine());
            System.out.println("Enter your aadhar Number");
            userPojo.setAadharNumber(Integer.parseInt(bufferedReader.readLine()));
            System.out.println("Enter your balance");
            userPojo.setBalance(Integer.parseInt(bufferedReader.readLine()));
            System.out.println("Enter validity");
            userPojo.setValidity(Long.parseLong(bufferedReader.readLine()));
            System.out.println("The mobile number goes as follows");
            long phoneNumber = userPojo.setPhoneNumber(ThreadLocalRandom.current().nextLong(10, 1000000000) * 10);
            arrayList.add(userPojo);
            System.out.println(arrayList);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    void display()
    {
        Collections.sort(arrayList,new SortByName());
        for (UserPojo index:arrayList)
        {
            System.out.println(index);
        }

    }
 }
    class SortByName implements Comparator<UserPojo>
     {
         @Override
         public int compare(UserPojo o1, UserPojo o2)
         {
             return o1.getName().compareTo(o2.getName());
         }
     }


