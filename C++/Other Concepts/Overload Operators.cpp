//Overload operators + and << for the class complex
//+ should add two complex numbers as (a+ib) + (c+id) = (a+c) + i(b+d)
//<< should print a complex number in the format "a+ib"
Complex operator +(Complex x, Complex y)
{
    Complex z;
    z.a = x.a + y.a;
    z.b = x.b + y.b;
    return z;
}

ostream& operator <<(ostream& out, Complex x)
{
    out
    << x.a
    << ((x.b > 0) ? "+" : "-")
    << "i"
    << x.b;
    return out;
}