

#include <stdio.h>
int main(void)
{
    int n, k, a[51], i, ok, cont;
    scanf("%d%d", &n, &k);
    ok=0;
    for(i=1;i<=n;++i)
    {
        scanf("%d",&a[i]);
        if(a[i]>0)
            ok=1;
    }
    if(ok==0)
        printf("%d",ok);
    else{
        i=k;
        while(a[i]==0)
        {
            --i;
        }
        cont=i;
        while(a[i]==a[i+1])
        {
            ++cont;
            ++i;
        }
        printf("%d",cont);
    }
    return 0;
}
