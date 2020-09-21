#include <iostream>
using namespace std;


int main(void)
{
    int n = 0, value = 0;
    cin >> n;
    while(n != 0)
    {
        cin >> value;
        int tmp = value, idx = 0, mul = 1;
        int res[5] = { 0 };
        while(tmp != 0)
        {
            int c = tmp % 10;
            if (c > 0)
            {
                res[idx] = c * mul;
                ++idx;
            }
            mul *= 10;
            tmp /= 10;
        }
        cout << idx << "\n";
        for(int i = 0; i < idx; ++i)
        {
            cout << res[i] << " ";
        }
        cout << "\n";
        --n;
    }
    return 0;
}