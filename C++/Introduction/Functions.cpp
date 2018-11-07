#include <iostream>
#include <cstdio>
using namespace std;

/*
Add `int max_of_four(int a, int b, int c, int d)` here.
*/
int max_of_four(int a, int b, int c, int d)
{
    int maximum;
    maximum = -2147483648;
    if(a > maximum)
    {
        maximum = a;
    }
    if(b > maximum)
    {
        maximum = b;
    }
    if(c > maximum)
    {
        maximum = c;
    }
    if(d > maximum)
    {
        maximum = d;
    }
    return maximum;
}

int main()
{
    int a;
    int b;
    int c;
    int d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int answer = max_of_four(a, b, c, d);
    printf("%d", answer);
    return 0;
}

