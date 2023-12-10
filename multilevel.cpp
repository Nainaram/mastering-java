#include<iostream>
using namespace std;
class Grand{
    public:
    void myFunc(){
        cout<< " this is grand!";
    }
};
class parent{
    public:
    void myFunc2(){
        cout<< " this is grand 2!";
    }

};
class Grandchild :public parent , public Grand{

};
int main(){
    Grandchild myobj;
    myobj.myFunc();
    myobj.myFunc2();
    return 0 ;
}