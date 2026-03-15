public class program48 {
    public static void main(String[]args){
        
        int no= 745669;
        int digit =0;

        while(no !=0){
            digit = no % 10;
            System.out.println("The digit is:" +digit);

            no = no /10;
            System.out.println("The no is:" +no);


        }

    }
}
