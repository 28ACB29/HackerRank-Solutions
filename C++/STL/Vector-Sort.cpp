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
    vector<int> V;
    cin >> N;
    for(int i = 0; i < N; i++)
    {
        cin >> j;
        V.push_back(j);
    }
    sort(V.begin(), V.end());
    for(int i = 0; i < V.size() - 1; i++)
    {
        cout << V[i] << " ";
    }
    cout << V[V.size() - 1];
    return 0;
}
