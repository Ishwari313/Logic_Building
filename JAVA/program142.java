import java.util.Scanner;

class Pattern
{
    public void Display(int No)
    {
        int cnt = 0;
        char ch = 'A';

        for(cnt = 1; cnt<= No;cnt++)
        {
            if((cnt%2)==1)
            {
                System.out.printf("%d\t",cnt);
            }
            else
            {
                System.out.printf("%c\t",ch);
                ch++;
            }
        }
        System.out.println();

    }
}
public class program142 {
    public static void main(String Arr[])
    {
        int value = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Freq:");

        value= sobj.nextInt();

        Pattern pobj= new Pattern();

        pobj.Display(value);
        sobj.close();
        
    }
}
