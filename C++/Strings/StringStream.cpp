#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str)
{
    // Complete this function
    stringstream sstream(str);
    vector<int> integers;
    int a;
    char comma;
    while(sstream.good())
    {
        sstream >> a;
        integers.push_back(a);
        if(sstream.good() && sstream.peek() == ',')
        {
            sstream >> comma;
        }
    }
    return integers;
}

int main()
{
    string str;
    getline(cin, str);
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++)
    {
        cout << integers[i] << endl;
    }
    
    return 0;
}
