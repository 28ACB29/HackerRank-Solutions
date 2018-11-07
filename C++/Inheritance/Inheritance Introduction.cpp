#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

class Triangle
{
    public:
       void triangle()
       {
           cout<<"I am a triangle\n";
       }
};

class Isosceles : public Triangle
{
    public:
       void isosceles()
       {
          cout<<"I am an isosceles triangle\n";
       }
        //Write your code here.
       void description()
       {
          cout<<"In an isosceles triangle two sides are equal\n";
       }
};

int main()
{
    Isosceles isosceles;
    isosceles.isosceles();
    isosceles.description();
    isosceles.triangle();
    return 0;
}
