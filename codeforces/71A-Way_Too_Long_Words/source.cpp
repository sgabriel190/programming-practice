#include <stdio.h>
int main(void)
{
    char c[105];
    int n, k, j, p;
    scanf("%d", &n);
    while(n--)
    {   
        k=0;
        scanf("%s",&c);
        for(j=0; c[j]!='\0'; ++j)
            ++k;
        p=k-2;
        if(k>10)
            printf("%c%d%c\n",c[0],p,c[k-1]);
        else
            printf("%s\n",c);
    }
    return 0;
}
