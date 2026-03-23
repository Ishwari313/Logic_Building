import java.util.Scanner;

class Pattern
{
    public void Display(int No)
    {
        int cnt =0;
        for(cnt = 1; cnt<=No;cnt++)
        {
            System.out.print(cnt+"\t");
        }
        System.out.println();
    }
}
public class program122 {
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        int value =0;

        System.out.println("Enter the Frequency");
        value =sobj.nextInt();

        Pattern pobj =new Pattern();
        pobj.Display(value);

        sobj.close();

    }
}
