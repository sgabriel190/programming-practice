#include <iostream>
#include <math.h>
using namespace std;

int main(void)
{
	int i, j, x, ok=1;
	for (i = 0; i < 5; ++i)
	{
		for (j = 0; j < 5; ++j)
		{
			cin >> x;
			if (x == 1)
			{
				break;
			}

		}
		if (x == 1)
		{
			break;
		}
	}
	i = abs(2 - i);
	j = abs(2 - j);
	cout << i + j;
	return 0;
}
