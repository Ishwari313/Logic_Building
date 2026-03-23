import java.util.*;

class Pattern{
    public void Display(int iNo)
    {
        int icnt =0;

        for(icnt=1;icnt<=iNo;icnt++)
        {
            System.out.print("*\n");
        }
        System.out.println();
    }
}
public class program121 {
    public static void main(String A[])
        {
            Scanner sobj =new Scanner(System.in);
            int ivalue =0;

            System.out.println("Enter the Frequency");
            ivalue=sobj.nextInt();

            Pattern pobj = new Pattern();

            pobj.Display(ivalue);

            sobj.close();
        }
    
}
