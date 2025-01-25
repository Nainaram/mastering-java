#include <stdio.h>
void display(int arr[] ,int n){ //this is the code for the traversal and display the all elements of the array
    int i ;
    for( i = 0 ; i < n;i++){
        printf("%d " , arr[i]);
    }
    printf(" \n");
}
void indInsertion(int arr[] ,int size,int capcity,int index,int element){
    if(size>=capcity){
        return -1;
    }
    else{
        for( int i =size -1;i>=index;i--){
            arr[i+1] = arr[i];
        }
        arr[index] =element;
        return 1;
    }
}
int main(){
    int arr[100] = {3,2,43,54,65,656,90};
    int size =10 ,capacity = 100,element = 45,index = 5;
    display(arr,size);
    // insertion function
    indInsertion(arr,size,capacity,index,element);
    display(arr,size);
    return 0;
}