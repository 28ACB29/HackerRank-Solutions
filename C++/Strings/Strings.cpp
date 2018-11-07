#include <iostream>
#include <string>
using namespace std;

int main()
{
   // Complete the program
    string a;
    string b;
    string c;
    string d;
    cin >> a;
    cin >> b;
    cout
    << a.size()
    << " "
    << b.size()
    << endl;
    cout
    << a + b
    << endl;
    c = a;
    c[0] = b[0];
    d = b;
    d[0] = a[0];
    cout
    << c
    << " "
    << d
    << endl;
    return 0;
}
