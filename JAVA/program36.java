import java.util.Scanner;

class program36 {

    public static void CountFactorsNonFactors(int num) {
        int freq1 = 0, freq2 = 0;

        if (num < 0)
            num = -num;

        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                freq1++;
            else
                freq2++;
        }

        System.out.println("Number Of Factors Are : " + freq1);
        System.out.println("Number Of Non Factors Are : " + freq2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int value = sc.nextInt();

        CountFactorsNonFactors(value);

        sc.close();
    }
}
