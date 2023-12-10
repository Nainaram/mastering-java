#include <iostream>
class myClass{
    public:
    int speed(int maxSpeed);
};
int myClass::speed(int maxSpeed){
    return maxSpeed;

}
int main(){
    int speed;
    myClass obj;
    std:: cout << " enter the speed:";
    std:: cin >> speed;
    std:: cout <<obj.speed(speed);
    return 0 ;
}