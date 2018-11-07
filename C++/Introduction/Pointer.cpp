#include <stdio.h>

void update(int *a,int *b)
{
    // Complete this function    
    int c;
    int d;
    c = *a + *b;
    d = *a > *b ? *a - *b : *b - *a;
    *a = c;
    *b = d;
}

int main()
{
    int a;
    int b;
    int *pa = &a, *pb = &b;

    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}
