/* Define the exception here */

class BadLengthException : public exception
{
    private:
        int length;
    public:
        BadLengthException(int n)
        {
            this->length = n;
        }

        int what()
        {
            return this->length;
        }
};