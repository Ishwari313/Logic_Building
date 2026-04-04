#include<iostream>
using namespace std;

void Display(int iFrequency)
{
    int icnt = 0;
    for(icnt = 1; icnt <= iFrequency; icnt++)
    {
        cout << "Jay Ganesh...." << endl;  // Better formatting
    }
}

int main()
{
    int iCount = 0;
    
    cout << "Enter the no of Frequency: ";
    cin >> iCount;

    Display(iCount);

    return 0;
}
