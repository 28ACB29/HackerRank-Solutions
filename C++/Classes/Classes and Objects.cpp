class Student
{
    private:
        static const int SCORE_SIZE = 5;
        int scores[Student::SCORE_SIZE];
    public:
        void input()
        {
            for(int i = 0; i < Student::SCORE_SIZE; i++)
            {
                cin >> this->scores[i];
            }
        }
        int calculateTotalScore()
        {
            int sum = 0;
            for(int i = 0; i < Student::SCORE_SIZE; i++)
            {
                sum += this->scores[i];
            }
            return sum;
        }
};