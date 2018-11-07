class Rectangle
{
    protected:
        int width;
        int height;
    public:
        Rectangle()
        {
            this->width = 0;
            this->height = 0;
        }

        void display()
        {
            cout
            << this->width
            << " "
            << this->height
            << endl;
        }
};

class RectangleArea : public Rectangle
{
    public:
        RectangleArea() : Rectangle()
        {
            ;
        }

        void read_input()
        {
            cin
            >> this->width
            >> this->height;
        }

        void display()
        {
            cout
            << (this->width * this->height)
            << endl;
        }
};