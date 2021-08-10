package Arrays;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        double [] list = {45, 2, 5, 1, 7, 3, 78, 92, 66};
        System.out.print(Arrays.toString(list));
        SelectionSort.selectionSort(list);
        System.out.print(Arrays.toString(list));



    }


    public static double selectionSort(double[] list) {
        for(int i = 0; i < list.length; i++) {
            // find the minimum in the list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for(int j = i + 1; j < list.length; j++) {
                if(currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
            System.out.println(list);

        }
        return 0;
    }
}
