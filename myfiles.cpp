#include<iostream>
#include<fstream>
using namespace std;
int main(){
    ofstream myfiles("C:\\java codes\\filestools.txt");
    myfiles << " hi this is the programming site use it for developing skills.";
    myfiles.close();
    string myText;
    ifstream myReadfile("C:\\java codes\\filestools.txt");
    while(getline(myReadfile,myText)){
cout << myText;
    }
    myReadfile.close();
    
}