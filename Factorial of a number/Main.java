// C++ program to find factorial of given number 
#include <iostream> 
using namespace std; 

// function to find factorial of given number 
unsigned int factorial(unsigned int n) 
{ 
	if (n == 0) 
		return 1; 
	return n * factorial(n - 1); 
} 

// Driver code 
int main() 
{ 
	int num ;
  std::cin>>num;
	cout << factorial(num) << endl; 
	return 0; 
} 

// This code is contributed by Shivi_Aggarwal 
