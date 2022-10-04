package simDisplay;

public class RechargeAmountTooLowException extends Exception
{
    RechargeAmountTooLowException()
    {
        System.out.println("The current amount recharge is not possible");
    }
}
