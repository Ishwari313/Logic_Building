import java.util.Scanner;

class Pattern
{
    public void Display(int row , int col)
    {
        int i =0 , j =0;
        char ch ='a';

        for(i=1;i<=row;i++)
        {
            for(j = 1,ch='a';j<=col;j++)
            {
                System.out.printf("%c\t",ch);
                ch++;

            }
            System.out.println();
        }
    }
}
public class program144 {

    public static void main(String[] args) {
        int value1 = 0;
        int value2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the no of rows:");
        value1=sobj.nextInt();

        System.out.println("Enter the no of columns:");
        value2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(value1, value2);

        sobj.close();

    }
    
}
