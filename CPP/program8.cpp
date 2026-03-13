# include <iostream>
using namespace std;

void CheckEvenOdd(int iNo){

    int iRem =0;

    iRem=iNo%2;

    if (iRem==0)
    {
        cout<<"It is even\n";
    }
    else{
        cout<<"It is odd\n";
    }
    
}
int main(){
    int ivalue =0;
    cout<<"Enter the Number\n";
    cin>>ivalue;

    CheckEvenOdd(ivalue);
    return 0;
}