#include <stdio.h>
int main(void)
{
    int n, m, a, r, c;
    long long ok=0;
    scanf("%d %d %d", &n, &m, &a);
    if(n<=a && m<=a)
        ok=1;
    else
    {
    if (n%a == 0) {
        r=n/a;
    } else {
        r=n/a;
        ++r;
     }
    if (m % a == 0) {
        c=m/a;
    } else {
        c=m/a;
        ++c;
    }
    ok=(long long)c*r;
    }
    printf("%I64d", ok);
    return 0;
}
