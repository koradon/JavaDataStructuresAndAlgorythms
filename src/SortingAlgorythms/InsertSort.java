package SortingAlgorythms;

import java.util.Arrays;

/**
 * Created by emicsip on 2016-10-25.
 */
public class InsertSort {
    /*
    Good for sorting small amout of data.
    Used with other sorting algorythms.
     */
    public static void main(String[] args) {
        int[] data = {6,2,5,9,4,0,1,3,8,2,6,3};
        new InsertSort().sort(data);
        System.out.println(Arrays.toString(data));
    }

    public void sort(int[] data){
        for(int i = 0; i < data.length; i++){
            int current = data[i];
            int j = i-1;

            while(j >= 0 && data[j] >= current){
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = current;
        }
    }
}
