/*Write the class AddElements here*/
template <class T>
class AddElements
{
    private:
        T x;
    public:
        AddElements(T x)
        {
            this->x = x;
        }
        T add(T y)
        {
            return this->x + y;
        }
};

template <>
class AddElements<string>
{
    private:
        string x;
    public:
        AddElements(string x)
        {
            this->x = x;
        }
        string concatenate(string y)
        {
            return this->x + y;
        }
};