#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int N;
    int j;
    vector<int> X;
    int Q;
    int Y;
    vector<int>::iterator lowerBound;
    cin >> N;
    for(int i = 0; i < N; i++)
    {
        cin >> j;
        X.push_back(j);
    }
    cin >> Q;
    for(int i = 0; i < Q; i++)
    {
        cin >> Y;
        lowerBound = lower_bound(X.begin(), X.end(), Y);
        cout
        << (X[lowerBound - X.begin()] == Y ? "Yes " : "No ")
        << lowerBound - X.begin() + 1
        << endl;
    }
    return 0;
}
