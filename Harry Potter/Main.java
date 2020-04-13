#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z,s;
  std::cin>>x;
  y=x%10;
  z=x/1000;
  s=y+z;
  std::cout<<s;
}