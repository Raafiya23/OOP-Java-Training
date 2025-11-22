package com.MiniProject3;

import com.MiniProject3.AlgorithmToolkit.*;

public class TestAlgorithmToolkit {
    public static void main(String[] args) {

        // ==== Sorting Test ====
        int[] arr1 = {5, 2, 8, 1, 3};
        SortingUtil.bubbleSort(arr1);

        int[] arr2 = {9, 4, 7, 1, 0};
        SortingUtil.quickSort(arr2);

        // ==== Searching Test ====
        int[] sortedArr = {1, 2, 3, 4, 5};
        System.out.println(SearchUtil.linearSearch(sortedArr, 4));   // Output: 3
        System.out.println(SearchUtil.binarySearch(sortedArr, 3));  // Output: 2

        // ==== Collection Test ====
        CollectionUtil<Integer> stack = new CollectionUtil<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop()); // 20

        CollectionUtil<String> queue = new CollectionUtil<>();
        queue.enqueue("A");
        queue.enqueue("B");
        System.out.println(queue.dequeue()); // "A"

        // ==== Timing Test ====
        long time = AnalysisUtil.measure(() -> SortingUtil.mergeSort(arr1));
        System.out.println("Merge Sort Time: " + time + " ms");
    }
}
