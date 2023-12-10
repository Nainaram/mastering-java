#include<iostream>
using namespace std;
int main(){
int n1 = 0 , n2 = 1, sum = 0, i ,num;
cout << " enter the number :";
cin >> num;
for(i = 2;i < num;i++){
    sum = n1+n2;
    cout << sum << "\n";
    n1 = n2;
    n2 = sum;
}
}