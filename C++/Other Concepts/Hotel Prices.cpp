#include <iostream>
#include <vector>

using namespace std;

class HotelRoom
{
    private:
        int bedrooms;
        int bathrooms;
    public:
        HotelRoom(int bedrooms, int bathrooms) 
        : bedrooms(bedrooms), bathrooms(bathrooms)
        {
            ;
        }

        virtual int get_price()
        {
            return 50 * this->bedrooms + 100 * this->bathrooms;
        }
};

class HotelApartment : public HotelRoom
{
    public:
        HotelApartment(int bedrooms, int bathrooms) 
        : HotelRoom(bedrooms, bathrooms)
        {
            ;
        }

        int get_price()
        {
            return HotelRoom::get_price() + 100;
        }
};