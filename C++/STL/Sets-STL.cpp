#include <cmath>
#include <cstdio>
#include <set>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    set<int> intSet;
    int Q;
    int type;
    int argument;
    cin >> Q;
    for(int i = 0; i < Q; i++)
    {
        cin
        >> type
        >> argument;
        switch(type)
        {
            case 1:
                intSet.insert(argument);
                break;
            case 2:
                if(*(intSet.find(argument)) == argument)
                {
                    intSet.erase(argument);
                }
                break;
            case 3:
                cout
                << (intSet.find(argument) != intSet.end() ? "Yes" : "No")
                << endl;
                break;
            default:
                cout
                << "Unknown operation"
                << endl;
                break;
        }
    }
    return 0;
}
