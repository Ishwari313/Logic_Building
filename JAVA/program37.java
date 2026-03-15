import java.util.*;

class program37
{
    public static boolean checkPrime(int iNo)
    {
        int iFrequency = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(int iCnt = 2; iCnt <= (iNo / 2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iFrequency++;
            }
        }

        return (iFrequency == 0);
    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int iValue = obj.nextInt();   // ✅ corrected variable

        boolean bRet = checkPrime(iValue);

        if(bRet == true)
        {
            System.out.println(iValue + " is a prime number");
        }
        else
        {
            System.out.println(iValue + " is not a prime number");
        }

        obj.close(); // optional
    }
}
