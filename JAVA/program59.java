import java.util.*;

class Number
{
    public int CalculateFactorial(int iNo)
    {
        int i =0;
        int iFact = 1;

        for(i=1;i<=iNo;i++)
        {
            iFact=iFact*i;
        }

        return iFact;
    }
}

public class program59 {

    public static void main(String Arr[])
    {
        int ivalue=0;
        int iRet =0;

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter Number:");
        ivalue=sobj.nextInt();

        Number nobj=new Number();
        iRet=nobj.CalculateFactorial(ivalue);

        System.out.println("Factorial is:"+iRet);

       

        nobj=null;
        System.gc();

        sobj.close();
    }
    
}
