#include <iostream>
int main(){
    int initial, end;
    // this is the for loop that prints set of the numbers from required range
    std :: cout << " enter the intial number ";
    std :: cin >>  initial;
    std :: cout << " enter the final number";
    std::cin>> end;
    std :: cout<< "  your range is:";
    for( int i =initial; i <= end; i++){
        std:: cout  << i <<"\n";

    }
    return 0;


}