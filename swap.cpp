#include<iostream>
using namespace std;
int main(){
    int a, b,temp;
    cout << " enter the number to swap:"<<" a= "<<"b =";
    cin >> a;
    cin >> b;
    temp = a;
    a = b;
    b = temp;
    cout << " after swapping:";
    cout << "a:" << a<<"\n b :"<< b ;
    return 0;
}