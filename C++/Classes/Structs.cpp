#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

/*
    add code for struct here.
*/
struct Student
{
    int age;
    string first_name;
    string last_name;
    int standard;
};

int main()
{
    Student student;
    
    cin
    >> student.age
    >> student.first_name
    >> student.last_name
    >> student.standard;
    cout
    << student.age
    << " "
    << student.first_name
    << " "
    << student.last_name
    << " "
    << student.standard;
    
    return 0;
}
