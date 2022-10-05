package Practicum_1;

import java.util.Random;

public class RanTab {
    private int[] ranArray;

    RanTab(int n, int lim){
        //n is num values
        //lim is range between 0-lim inclusive
        this.ranArray = new int[n];
        Random rand = new Random();
        for (int i =0; i<n;i++){
            int tempval = rand.nextInt(lim);
            this.ranArray[i] = tempval;
        }
    }
    private int[] getRanArray(){
        return this.ranArray;
    }

    private void setRanArray(int[] newArray){
        this.ranArray = newArray;
    }

    public int getOcc(int n){
        //for given n returns how many time it occurs in the array
        int count = 0;
        for (int i =0; i<this.ranArray.length;i++){
            if (this.ranArray[i] == n){
                count+=1;
            }
        }
        return count;
    }

    public void printUniqueValues(){
        //prints all unqiue values
        int printArrayIndex = 0;
        int[] temp_array = this.ranArray;
        int[] sortedArray = selectionSort(temp_array);
        int[] printArray = new int[temp_array.length];
        //sorted array now has all values in order
        for (int i =0; i<sortedArray.length;i++){
            if(i+1 >= sortedArray.length){
                //if on last value
                if(sortedArray[i] != printArray[printArrayIndex]){
                    //check if value before is same else add
                    printArray[printArrayIndex] = sortedArray[i];
                    printArrayIndex +=1;
                }
            }
            else{
                //not at end of list
                int val1 = sortedArray[i];
                int val2 = sortedArray[i];
                if(val1 != val2){
                    //if value1 is unique add, remeber sorted
                    printArray[printArrayIndex] = val1;
                    printArrayIndex +=1;
                }
            }
            
        }
        System.out.println("Unique Values in the array:");
        for (int i =0; i<printArray.length;i++){
            if(i>0 && (printArray[i] == 0)){ 
                System.out.printf("\n");
                break;
            }
            else{
                if(i == printArray.length-1){
                    System.out.printf("%d \n",printArray[i]);
                }
                else{System.out.printf("%d, ",printArray[i]);}
            }
        }
    }

    public boolean OddEven(){
        //returns true if sum of all even values is equal to sum of all odd values
        int oddArraySum = 0;
        int evenArraySum = 0;
        for (int i =0; i<this.ranArray.length;i++){
            if ((this.ranArray[i] % 2) == 0){
                //even
                evenArraySum+= this.ranArray[i];
            }
            else{oddArraySum+= this.ranArray[i];}
        }
        if (evenArraySum == oddArraySum){
            return true;
        }
        else{return false;}
    }

    public boolean Distro(int i){
        //returns true if sum of values from 0 to i-1 is equal to sum of values from index i to n-1 else false
        int toI = 0;
        int afterI = 0;
        for(int x=0;x<i-1;x++){
            toI += ranArray[x];
        }
        for(int y=i;y<this.ranArray.length;y++){
            afterI += ranArray[y];
        }
        if (toI == afterI){
            return true;
        }
        else{return false;}
    }

    //leveraged from past hw
    private static int[] selectionSort(int[] inputArray){
        /**
         * Author: Blaise Meilunas
         * This function  
         * It follows the requirement described below:
         * 
         * 'Implement the Selection sort algorithm that we have seen in class, but in an
         * descendant order. Feel free to implement methods similar to the ones we have
         * seen in class, if necessary. To test the method, write a program that randomly
         * creates an array, and displays it before and after the sorting.'
         * 
         * @param int[] inputArray The array to be sorted
         * 
         * @return int[] array The array that has been sorted using selection sort
         */
        //dont wanna overwrite value
        int[] array = inputArray;
        int length = array.length;
        //loop array
        for (int i =0; i < length-1;i++){
            //store min index
            int minIndex = i;
            //loop through array for each index to compare
            for (int j = i+1; j < length; j++){
                //check if curr value is less than min, if so replace index and continue
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            //replace starting array value with minimum value
            int temp_minValue = array[minIndex];
            array[minIndex] = array[i]; array[i] = temp_minValue;
        }
        return array;
    }

    public static void main(String[] args) {
        RanTab test = new RanTab(3,6);
        System.out.print("The array: [ ");
        for (int i =0; i<test.getRanArray().length;i++){
            if(i == test.getRanArray().length-1){
                System.out.printf("%d ]\n",test.getRanArray()[i]);
            }
            else{System.out.printf("%d, ",test.getRanArray()[i]);}
        }
        int[] occ =  {1,2,2,2};
        int[] uniq =  {1,2,3,4,4,4};
        int[] oddequaleven =  {2,2,1,3};
        int[] divideisum =  {1,1,1,1,1,1};
        int[] temp = occ;
        System.out.print("The new array: [ ");
        for (int i =0; i<temp.length;i++){
            if(i == temp.length-1){
                System.out.printf("%d ]\n",temp[i]);
            }
            else{System.out.printf("%d, ",temp[i]);}
        }
        test.setRanArray(occ);
        int numocc = test.getOcc(2);
        System.out.printf("The number %d occurs %d times.\n",2,numocc);

        temp = uniq;
        System.out.print("The new array: [ ");
        for (int i =0; i<temp.length;i++){
            if(i == temp.length-1){
                System.out.printf("%d ]\n",temp[i]);
            }
            else{System.out.printf("%d, ",temp[i]);}
        }
        test.setRanArray(uniq);
        test.printUniqueValues();

        temp = oddequaleven;
        System.out.print("The new array: [ ");
        for (int i =0; i<temp.length;i++){
            if(i == temp.length-1){
                System.out.printf("%d ]\n",temp[i]);
            }
            else{System.out.printf("%d, ",temp[i]);}
        }
        test.setRanArray(oddequaleven);
        System.out.printf("The sum of odd and even values is equal: ");
        System.out.printf(test.OddEven() ? "true" : "false");
        System.out.printf("\n");


        temp = divideisum;
        System.out.print("The new array: [ ");
        for (int i =0; i<temp.length;i++){
            if(i == temp.length-1){
                System.out.printf("%d ]\n",temp[i]);
            }
            else{System.out.printf("%d, ",temp[i]);}
        }
        test.setRanArray(divideisum);
        System.out.printf("The sum of values from 1 to 3 and 4 to 6 are equal: ");
        System.out.printf(test.Distro(4) ? "true" : "false");
        System.out.printf("\n");
    }

    
}
