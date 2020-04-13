#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z;
  std::cin>>x>>y;
  if(y<x)
  {
    z=100-x+y;
    std::cout<<z;
  }
  else
  {
    z=y-x;
    std::cout<<z;
  }
}