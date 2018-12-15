#include <iostream>
#include <iomanip>
#include <limits>

using namespace std;

int main()
{
    int i = 4;
    double d = 4.0;
    string s = "HackerRank ";
    // Declare second integer, double, and String variables.
    int i2;
    double d2;
    string s2;

    // Read and save an integer, double, and String to your variables.
    // Note: If you have trouble reading the entire string, please go back and
    // review the Tutorial closely.
    cin >> i2;
    cin >> d2;
    // gnore before we do a getline call, because when a user inputs something
    // with std::cin , they hit enter and a '\n' char gets into the cin buffer.
    cin.ignore();
    getline(cin, s2);
    s.append(s2);

    // Print the sum of both integer variables on a new line.
    // Print the sum of the double variables on a new line.
    // Concatenate and print the String variables on a new line
    // The 's' variable above should be printed first.

    cout << i + i2 << endl;
    cout << fixed << setprecision(1) << d + d2 << endl;
    cout << s << endl;

    return 0;
}