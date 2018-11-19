// Define specializations for the Traits class template here.
template<>
struct Traits<Fruit>
{
    public:
        static string name(int index)
        {
            string output;
            switch(index)
            {
                case 0:
                    output = "apple";
                    break;
                case 1:
                    output = "orange";
                    break;
                case 2:
                    output = "pear";
                    break;
                default:
                    output = "unknown";
                    break;
            }
            return output;
        }
};

template<>
struct Traits<Color>
{
    public:
        static string name(int index)
        {
            string output;
            switch(index)
            {
                case 0:
                    output = "red";
                    break;
                case 1:
                    output = "green";
                    break;
                case 2:
                    output = "orange";
                    break;
                default:
                    output = "unknown";
                    break;
            }
            return output;
        }
};