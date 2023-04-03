
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};        
        MainProgram.sort(numbers);
    }
    
    
    
    
    // Part 1
    public static int smallest(int[] array) {
        int smallest = array[0];
        
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }
    
    
    // Part 2
    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;
        int smallest = array[0];
        
        for (int i=0; i<array.length; i++) {
            if (array[i] < smallest) {
                indexOfSmallest = i;
                smallest = array[i];
            }
        }
        return indexOfSmallest;
    }
    
    
    // Part 3
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexOfSmallest = startIndex;
        int smallest = array[startIndex];
        
        for (int i=startIndex; i<array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
    
    
    //Part 4
    public static void swap(int[] array, int index1, int index2) {
        int numberIndex1 = array[index1];
        array[index1] = array[index2];
        array[index2] = numberIndex1;
    }
    
    
    //Part 5
    public static void sort(int[] array) {
        
        for (int i=0; i<array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);            
        }
    }
}
