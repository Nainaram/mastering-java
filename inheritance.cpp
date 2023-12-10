#include<iostream>
using namespace std;

class Vehicle{
    public:
    string carname = "volvo";
    void horn(){
        cout << " pow pow!!";
    }};
class Car: public Vehicle{
    public :
    string carmodel = "brown";

};

int main(){
    Car myobj;
    myobj.horn();
    
    
    cout << "this is the best";
}