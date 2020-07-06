#include <iostream>
using namespace std;

int main(void)
{
	unsigned int n, a, b, maxi, sum;
	cin >> n;
	sum = 0;
	maxi = 0;
	for (int i = 1; i <= n; ++i)
	{
		cin >> a >> b;
		sum = sum + (b - a);
		if (sum > maxi)
			maxi = sum;
	}
	cout << maxi;
	return 0;
}
