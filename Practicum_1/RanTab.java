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

    public void printUniqueValus(){
        //prints all unqiue values
        int printArrayIndex = 0;
        int[] temp_array = this.ranArray;
        int[] sortedArray = selectionSort(temp_array);
        int[] printArray = new int[temp_array.length]
        //sorted array now has all values in order
        for (int i =0; i<sortedArray.length;i++){
            if(i+1 >= sortedArray.length){
                printArray[printArrayIndex] = sortedArray[i];
                printArrayIndex +=1;
            }
            else{
                int val1 = sortedArray[i];
                int val2 = sortedArray[i];
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
    }

    public static void main(String[] args) {
        RanTab test = new RanTab(3,6);


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
}
