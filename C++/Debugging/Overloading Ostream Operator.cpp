
// Enter your code here.
std::ostream& operator<<(std::ostream& os, const Person& person)
{
    return os
        << "first_name="
        << person.get_first_name()
        << ","
        << "last_name="
        << person.get_last_name();
}