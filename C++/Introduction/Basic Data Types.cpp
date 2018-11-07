#include <iostream>
#include <cstdio>
using namespace std;

int main()
{
    // Complete the code.
    int integer;
    long longInteger;
    //long long longLong;
    char character;
    float floating;
    double doubleFloating;
    int numberRead;
    //numberRead = scanf("%d %ld %lld %c %f %lf", &integer, &longInteger, &longLong, &character, &floating, &doubleFloating);
    numberRead = scanf("%d %ld %c %f %lf", &integer, &longInteger, &character, &floating, &doubleFloating);
    //printf("%d\n%ld\n%lld\n%c\n%f\n%lf", integer, longInteger, longLong, character, floating, doubleFloating);
    printf("%d\n%ld\n%c\n%f\n%lf", integer, longInteger, character, floating, doubleFloating);
    return 0;
}
