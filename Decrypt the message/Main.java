#include<iostream>
using namespace std;
int main ()
{  
    int i, num,num2, div, sum=0;
    cin>>num>>num2;
    for (i=1; i < num+num2; i++)
    {
        div = (num+num2) % i;
        if (div == 0)
            sum = sum + i;
    }
    if (sum == num+num2)
        cout<<"They can read the message";
    else
        cout<<"They can't read the message";
    return 0;
}