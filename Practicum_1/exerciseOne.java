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

    int[] temp = largest;
    System.out.print("Array 1: [ ");
    for (int i =0; i<temp.length;i++){
        if(i == temp.length-1){
            System.out.printf("%d ]\n",temp[i]);
        }
        else{System.out.printf("%d, ",temp[i]);}
    }
    temp = smallest;
    System.out.print("Array 2: [ ");
    for (int i =0; i<temp.length;i++){
        if(i == temp.length-1){
            System.out.printf("%d ]\n",temp[i]);
        }
        else{System.out.printf("%d, ",temp[i]);}
    }
    System.out.printf("Array 1 is greater than Array 2: ");
    System.out.printf(goodComp ? "true" : "false");
    System.out.printf("\n");

    temp = smallest;
    System.out.print("Array 1: [ ");
    for (int i =0; i<temp.length;i++){
        if(i == temp.length-1){
            System.out.printf("%d ]\n",temp[i]);
        }
        else{System.out.printf("%d, ",temp[i]);}
    }
    temp = largest;
    System.out.print("Array 2: [ ");
    for (int i =0; i<temp.length;i++){
        if(i == temp.length-1){
            System.out.printf("%d ]\n",temp[i]);
        }
        else{System.out.printf("%d, ",temp[i]);}
    }
    System.out.printf("Array 1 is greater than Array 2: ");
    System.out.printf(badComp ? "true" : "false");
    System.out.printf("\n");
}

        
}