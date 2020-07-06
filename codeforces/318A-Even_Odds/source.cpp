#include <iostream>
using namespace std;

int main(void)
{
	unsigned long long int n, k, x;
	cin >> n >> k;
	if (n % 2 == 0)
	{
		if (k <= n / 2)
		{
			x = 1 + 2 * (k - 1);
		}
		else
		{
			x = 2 + 2 * ((k - n / 2) - 1);
		}
	}
	else
	{
		if (k <= (n / 2 + 1))
		{
			x = 1 + 2 * (k - 1);
		}
		else
		{
			x = 2 + 2 * ((k - n / 2) - 2);
		}
	}
	cout << x;
	return 0;
}
