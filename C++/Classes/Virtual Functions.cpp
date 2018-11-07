class Person
{
    protected:
        string name;
        int age;
    public:
        virtual void getdata()
        {
            cin >> this->name >> this->age;
        }
        virtual void putdata()
        {
            cout << this->name << this->age << endl;
        }
};

class Professor : public Person
{
    private:
        int publications;
        static int id;
        int cur_id;
    public:
        Professor()
        {
            this->cur_id = ++Professor::id;
        }
        void getdata()
        {
            cin >> Person::name >> Person::age >> this->publications;
        }
        void putdata()
        {
            cout
            << Person::name
            << " "
            << Person::age
            << " "
            << this->publications
            << " "
            << this->cur_id
            << endl;
        }
};
int Professor::id = 0;

class Student : public Person
{
    private:
        static const int MARKS_SIZE = 6;
        static int id;
        int cur_id;
        vector<int> marks;
    public:
        Student()
        {
            this->cur_id = ++Student::id;
        }
        void getdata()
        {
            int mark;
            cin >> Person::name >> Person::age;
            for(int i = 0; i < Student::MARKS_SIZE; i++)
            {
                cin >> mark;
                this->marks.push_back(mark);
            }
        }
        void putdata()
        {
            int sum = 0;
            for(int i = 0; i < Student::MARKS_SIZE; i++)
            {
                sum += this->marks[i];
            }
            cout
            << Person::name
            << " "
            << Person::age
            << " "
            << sum
            << " "
            << this->cur_id
            << endl;
        }
};
int Student::id = 0;