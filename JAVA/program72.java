import java.util.*;

class ArrayX
{
    public void Display(int Brr[])
    {
        for(int i = 0; i < Brr.length; i++)
        {
            System.out.println(Brr[i]);
        }
    }
}

public class program72
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements:");

        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();
        aobj.Display(Arr);

        sobj.close(); // good practice
    }
}
