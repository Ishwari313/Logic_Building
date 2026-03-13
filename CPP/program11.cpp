#include <iostream>
using namespace std;

class Program
{
public:
    static void Main()       // class method (like Java's static main)
    {
        cout << "Jay Ganesh.." << endl;
        cout << "Jay Ganesh.." << endl;
    }
};

int main()
{
    Program::Main();         // calling class method
    return 0;
}
