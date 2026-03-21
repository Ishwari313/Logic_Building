import java.util.*;

class ArrayX
{
    public void Display(int Brr[])
    {
        System.out.println("Elements of the array are:");
        for(int i = 0; i < Brr.length; i++)
        {
            System.out.println(Brr[i]);
        }
    }

    public int CountEven(int Brr[])
    {
        int iCount = 0;
        for(int i = 0; i < Brr.length; i++)
        {
            if(Brr[i] % 2 == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int Summation(int Brr[])
    {
        int iSum = 0;
        for(int i = 0; i < Brr.length; i++)
        {
            iSum += Brr[i];
        }
        return iSum;
    }
}

class program75
{
    public static void main(String A[])
    {    
        try (Scanner sobj = new Scanner(System.in)) // Scanner will be automatically closed
        {
            System.out.println("Enter the size of Array:");
            int iSize = sobj.nextInt();

            int Arr[] = new int[iSize];

            System.out.println("Enter the elements:");
            for(int i = 0; i < Arr.length; i++)
            {
                Arr[i] = sobj.nextInt();
            }
        
            ArrayX aobj = new ArrayX();
            aobj.Display(Arr);

            int iRet = aobj.CountEven(Arr);
            System.out.println("Even elements are: " + iRet);

            int iRes = aobj.Summation(Arr);
            System.out.println("Summation of elements are: " + iRes);
        }

        // No need to set objects to null or call System.gc()
    }
}
