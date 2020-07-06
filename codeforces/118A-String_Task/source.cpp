

#include <stdio.h>
#include <string.h>
int main(void)
{
	char a[103], b[203], voc[13] = "AEIOUYaeiouy";
	int k, i, n;
	fgets(a, 103, stdin);
	n=strlen(a);
	a[n - 1] = '\0';
	k = 0;
	for (i = 0; a[i] != '\0'; ++i)
	{
		if (strchr(voc, a[i]) == 0)
		{
			b[k] = '.';
			++k;
			if ('A'<a[i] && a[i]<='Z')
			{
				b[k] = a[i] + 32;
				++k;
			}
			else
			{
				b[k] = a[i];
				++k;
			}
		}
	}
	b[k] = '\0';
	fputs(b,stdout);
	return 0;
}
