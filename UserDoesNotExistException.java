package simDisplay;

public class UserDoesNotExistException extends Exception{

    UserDoesNotExistException()
    {
        System.out.println("The user does not exists");
    }
}
