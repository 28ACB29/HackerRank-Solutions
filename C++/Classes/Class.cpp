#include <iostream>
#include <sstream>
using namespace std;

/*
Enter code for class Student here.
Read statement for specification.
*/

class Student
{
    private:
        int age;
        int standard;
        string first_name;
        string last_name;
    public:
        int get_age()
        {
            return this->age;
        }

        void set_age(int age)
        {
            this->age = age;
        }

        int get_standard()
        {
            return this->standard;
        }

        void set_standard(int standard)
        {
            this->standard = standard;
        }

        string get_first_name()
        {
            return this->first_name;
        }

        void set_first_name(string first_name)
        {
            this->first_name = first_name;
        }

        string get_last_name()
        {
            return this->last_name;
        }

        void set_last_name(string last_name)
        {
            this->last_name = last_name;
        }

        string to_string()
        {
            stringstream output;
            output
            << this->age
            << ','
            << this->first_name
            << ','
            << this->last_name
            << ','
            << this->standard;
            return output.str();
        }
};


int main()
{
    int age;
    int standard;
    string first_name;
    string last_name;
    
    cin
    >> age
    >> first_name
    >> last_name
    >> standard;
    
    Student student;
    student.set_age(age);
    student.set_standard(standard);
    student.set_first_name(first_name);
    student.set_last_name(last_name);
    
    cout
    << student.get_age()
    << endl;
    cout
    << student.get_last_name()
    << ", "
    << student.get_first_name()
    << endl;
    cout
    << student.get_standard()
    << endl;
    cout << endl;
    cout << student.to_string();
    
    return 0;
}
