class Matrix
{
    public:
    vector<vector<int>> a;
    
    Matrix operator +(Matrix x)
    {
        Matrix y;
        int rows = this->a.size();
        int columns = this->a[0].size();
        for(int i = 0; i < rows; i++)
        {
            vector<int> b;
            for(int j = 0; j < columns; j++)
            {
                b.push_back(this->a[i][j] + x.a[i][j]);
            }
            y.a.push_back(b);
        }
        return y;
    }
};