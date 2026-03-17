import java.util.*;

class Digit
{
    public int SumDigits(int No)
    {
        int iDigit=0;
        int iSum=0;

        while(No!=0)
        {
            iDigit=No%10;
            iSum=iSum+iDigit;
            No=No/10;

        }
        return iSum;
    }
}
class program64
{
    public static void main(String Arr[])
    {
        int ivalue =0;
        int iRet =0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number:");
        ivalue =sobj.nextInt();

        Digit dobj=new Digit();
        iRet=dobj.SumDigits(ivalue);

        System.out.println("Addition of Digits:"+iRet);

        sobj.close();
        dobj=null;

        System.gc();

    }
}