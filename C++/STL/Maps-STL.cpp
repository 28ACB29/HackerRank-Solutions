#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <map>
#include <algorithm>
using namespace std;

int main()
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    map<string, int> grades;
    int Q;
    int type;
    string X;
    map<string, int>::iterator gradeIterator;
    int Y;
    cin >> Q;
    for(int i = 0; i < Q; i++)
    {
        cin
        >> type
        >> X;
        switch(type)
        {
            case 1:
                cin >> Y;
                gradeIterator = grades.find(X);
                if(gradeIterator == grades.end())
                {
                    grades.insert(make_pair(X, Y));
                }
                else
                {
                    grades[X] += Y;
                }
                break;
            case 2:
                grades.erase(X); 
                break;
            case 3:
                cout
                << grades[X]
                << endl;
                break;
            default:
                cout
                << "Invalid Operation"
                << endl;
                break;
        }
    }
    return 0;
}
