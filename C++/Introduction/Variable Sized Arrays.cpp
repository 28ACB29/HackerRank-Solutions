#include <iostream>
using namespace std;

int main()
{
    int N;
    int Q;
    int** A;
    int k;
    int s;
    int a;
    int b;
    cin
    >> N
    >> Q;
    A = new int*[N];
    for(int i = 0; i < N; i++)
    {
        cin >> k;
        A[i] = new int[k];
        for(int j = 0; j < k; j++)
        {
            cin >> s;
            A[i][j] = s;
        }
    }
    for(int i = 0; i < Q; i++)
    {
        cin
        >> a
        >> b;
        cout
        << A[a][b]
        << endl;
    }
    for(int i = 0; i < N; i++)
    {
        delete[] A[i];
    }
    delete[] A;
    return 0;
}
