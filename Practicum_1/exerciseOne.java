package Practicum_1;

public class exerciseOne{

public boolean CompareArrays(int[] array1, int[] array2){
    for(int i = 0; i<array1.length;i++){
        if(array1[i] < array2[i]){
            return false;
        }
    }
    //if it gets past loop then all matched
    return true;
}

public boolean CompareArraysRecursive(int[] array1, int[] array2){
    for(int i = 0; i<array1.length;i++){

    }
    return false;
}

public static void main(String[] args) {
    exerciseOne test = new exerciseOne();

    int[] smallest = {1,2,3,4};
    int[] largest =  {10,20,30,40};

    boolean goodComp = test.CompareArrays(largest, smallest);
    boolean badComp = test.CompareArrays(smallest, largest);
    boolean goodCompRec = test.CompareArraysRecursive(largest, smallest);
    boolean badCompRec = test.CompareArraysRecursive(smallest, largest);


}








}