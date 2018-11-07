
//Implement the class Box  
//l,b,h are integers representing the dimensions of the box

// The class should have the following functions : 

// Constructors: 
// Box();
// Box(int,int,int);
// Box(Box);

// Destructor
// ~Box()
// {

// }

// int getLength(); // Return box's length
// int getBreadth (); // Return box's breadth
// int getHeight ();  //Return box's height
// long long CalculateVolume(); // Return the volume of the box

//Overload operator < as specified
//bool operator<(Box &b)

//Overload operator << as specified
//ostream& operator<<(ostream& out, Box B)

class Box
{
    private:
        int l;
        int b;
        int h;

    public:
        Box()
        {
            this->l = 0;
            this->b = 0;
            this->h = 0;
            BoxesCreated++;
        }

        Box(int l, int b, int h)
        {
            this->l = l;
            this->b = b;
            this->h = h;
            BoxesCreated++;
        }

        Box(const Box& rhs)
        {
            this->l = rhs.l;
            this->b = rhs.b;
            this->h = rhs.h;
            BoxesCreated++;
        }

        ~Box()
        {
            this->l = 0;
            this->b = 0;
            this->h = 0;
            BoxesDestroyed++;
        }

        int getLength()
        {
            return this->l;
        }

        int getBreadth()
        {
            return this->b;
        }

        int getHeight()
        {
            return this->h;
        }

        long long CalculateVolume()
        {
            return (long long) this->l * (long long) this->b * (long long) this->h;
        }

        bool operator<(const Box& rhs)
        {
            return this->l < rhs.l ? true : this->l == rhs.l && this->b < rhs.b ? true : this->l == rhs.l && this->b == rhs.b && this->h < rhs.h;
        }

        friend ostream& operator<<(ostream& out, Box B)
        {
            out << B.getLength() << " " << B.getBreadth() << " " << B.getHeight() << " ";
            return out;
        }
};