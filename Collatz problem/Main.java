#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,count=0;
  cin>>n;
  cout<<n;
  while(n!=1)
  {
  if(n%2==1)
  {
    n=3*n+1;
  }
  else
  {
    n=n/2;
  }
    cout<<"\n";
     cout<<n;
    count++;
  }
  cout<<"\n"<<count;
  
  
}