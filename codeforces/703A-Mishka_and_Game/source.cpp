#include <iostream>
using namespace std;

int main(void)
{
	int x, m=0, c=0, temp1, temp2;
	cin >> x;
	for(int i = 1; i <= x; ++i)
	{
		cin >> temp1 >> temp2;
		if (temp1 > temp2)
		{
			++m;
		}
		if (temp1 < temp2)
		{
			++c;
		}
	}
	if (m == c)
	{
		cout << "Friendship is magic!^^";
	}
	else
	{
		if (m > c)
		{
			cout << "Mishka";
		}
		else
		{
			cout << "Chris";
		}
	}
	return 0;
}
