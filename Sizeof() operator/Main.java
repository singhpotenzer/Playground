#include<iostream>
using namespace std;
int main()
{
  int x,x1,c1;
  char c;
  float f,f1;
  double l,l1;
  c1=sizeof(c);
  std::cout<<c1<<"\n";
  x1=sizeof(x);
  std::cout<<x1<<"\n";
  f1=sizeof(f);
  std::cout<<f1<<"\n";
  l1=sizeof(l);
  std::cout<<l1;
}