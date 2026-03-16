import java.util.*;

class Number
{
    public void DisplayFactors(int iNo)
    {
        int i =0;
        
        for(i = 1;i<=(iNo/2);i++)
        {
            if((iNo % i)==0)
            {
                System.out.println(i);
            }
        }
    }
}

public class program55 {

    public static void main(String Arr[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number:");
        iValue=sobj.nextInt();

        Number nobj=new Number();
        nobj.DisplayFactors(iValue);

        //Important
        
      
        nobj = null;

        System.gc();
        sobj.close();

    }
    
}
