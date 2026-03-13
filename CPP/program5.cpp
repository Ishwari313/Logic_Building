#include<iostream>
using namespace std;

float AdditionTwoNumbers(float fno1, float fno2)
{
    float fsum=0.0f;

    if(fno1<0.0f)
    {
        fno1=-fno1;
    }
    if(fno2<0.0f)
    {
        fno2=-fno2;
    }

    fsum=fno1 + fno2;

    return fsum;

}

int main()
{
    float fvalue1=0.0f,fvalue2=0.0f,fRet=0.0f;

    cout<<"Enter the first no:\n";
    cin>>fvalue1;

    cout<<"Enter the second no:\n";
    cin>>fvalue2;

    fRet= AdditionTwoNumbers(fvalue1,fvalue2);

    cout<<"Addition is:\n,fret";

    return 0;

}