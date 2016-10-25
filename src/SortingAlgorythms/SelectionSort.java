package SortingAlgorythms;

import java.util.Arrays;

/**
 * Created by emicsip on 2016-10-25.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {4,7,2,3,5,8,0,9,1,78,3};
        new SelectionSort().sort(data);
        System.out.println(Arrays.toString(data));
    }

    public void sort(int[] data){
        for(int i = 0; i < data.length-1; i++){
            int minIndex = findIndexOfMinElement(i, data);
            swapItems(i, minIndex, data);
        }
    }

    private int findIndexOfMinElement(int startIndex, int[] data){
        int minIndex = startIndex;
        for(int j = minIndex+1; j < data.length; j++){
            if(data[j] < data[minIndex]){
                minIndex = j;
            }
        }
        return minIndex;
    }

    private void swapItems(int index1, int index2, int[] data){
        int tmp = data[index1];
        data[index1] = data[index2];
        data[index2] = tmp;
    }

}
