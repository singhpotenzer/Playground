#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,t,i,a;
  float d1,s;
  std::cin>>p>>r>>t;
  i=(p*t*r)/100;
  std::cout<<i<<"\n";
  a=p+i;
  std::cout<<a<<"\n";
  d1=i*0.02;
  std::cout<<d1<<"\n";
  s=a-d1;
  std::cout<<s;
}
