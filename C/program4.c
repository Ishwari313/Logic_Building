#include <stdio.h>

float AdditionTwoNumbers(float fno1, float fno2)
{
    float fsum = 0.0f;
    fsum = fno1 + fno2;
    return fsum;
}

int main()
{
    float fvalue1 = 0.0f, fvalue2 = 0.0f, fRet = 0.0f;

    printf("Enter the first Number:\n");
    scanf("%f", &fvalue1);

    printf("Enter the second Number:\n");
    scanf("%f", &fvalue2);

    fRet = AdditionTwoNumbers(fvalue1, fvalue2);

    printf("Addition is: %f\n", fRet);

    return 0;
}
