#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float x,y,z;
  std::cin>>x>>y;
  if(x==2)
  {
    z=y+y*0.5;
    std::cout<<z;
  }
  else if (x==3)
  {
    z=2*y;
    std::cout<<z;
  }
  else if (x>3)
  {
    std::cout<<"Number of items is more";
  }
}