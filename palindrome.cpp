#include<iostream>
using namespace std;
int main (){
    int num , digit ,rev, n;
    cout << "enter the value for palindrome check:\n";
    cin>>num;
    n = num;
    do{
        digit = num%10;
        rev = (rev*10) + digit;
        num =num/10;
    }
    while(num!=0);
    {
        cout << " reverse of the given number" << rev << endl;
        if( n == rev){
            cout << " number is a palindrome";

        }
        else{
            cout << " not a palindrome";
        }
    }
}