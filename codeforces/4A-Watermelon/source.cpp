#include <stdio.h>
int main(void)
{
    int w, n;
    scanf("%d",&w);
    if(w%2!=0 || w==2)
        printf("\n NO");
    else 
        printf("\n YES");
    return 0;
}
