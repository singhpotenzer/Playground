#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  std::cin>>x>>y>>z;
  if(x>=75*y+30*z)
  {
    std::cout<<"Boat is stable";
  }
  else
  {
    std::cout<<"Boat will drow";
  }
}