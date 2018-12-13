#include <iostream>

using namespace std;

//triangular number = Summition of 1 + 2 + ... + x = x(x+1)/2

int main()
{
    long N, num, three, five, fifteen = 0;
    cin >> N;

    for (int i = 0; i < N; i++)
    {
        cin >> num;
        //sum of all numbers divisible by 3
        three = (num - 1) / 3;
        //sum of all number divisible by 5
        five = (num - 1) / 5;
        //sum of all numbers divisible by 15 (as they'll be counted twice)
        fifteen = (num - 1) / 15;

        cout << 3 * (three * (three + 1) / 2) + 5 * (five * (five + 1) / 2) - 15 * (fifteen * (fifteen + 1) / 2) << endl;
    }

    return 0;
}