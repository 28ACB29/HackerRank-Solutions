class D : A, B, C
{

    int val;
    public:
        //Initially val is 1
        D()
        {
            this->val=1;
        }

        //Implement this function
        void update_val(int new_val)
        {

            A a;
            B b;
            C c;
            int temp = new_val;
            while(temp % 2 == 0)
            {
                A::func(this->val);
                temp /= 2;
            }
            while(temp % 3 == 0)
            {
                B::func(this->val);
                temp /= 3;
            }
            while(temp % 5 == 0)
            {
                C::func(this->val);
                temp /= 5;
            }
        }
        //For Checking Purpose
        void check(int); //Do not delete this line.
};
