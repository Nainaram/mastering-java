#include <iostream>
int main(){
    int array[4][4] ={
        {0,0,1,1},
        {0,1,0,0},
        {0,1,0,0},
        {0,0,0,0}
        };
        int hits =0;
        int count = 0;
        int row,column;
        
    std :: cout << "  your game begin in few moments\n";
    std :: cout << " your target is to hit the 1  to get  points \n,as you hit every time you get reduced  by one\n";
    std:: cout << " enter the value for row\n";
    std:: cin >> row;
    std:: cout << "enter the value for column\n";
    std::cin >> column;
    for (count = 0; count <=4;count ++){

    if(array[row][column] == 1){
        std ::cout << "yes you got a hit!!\n";
        hits --;
        std:: cout << " hits remaining\n"<< hits;
     }
    else{
        std:: cout << "you missed";
    }
       
        }
    }