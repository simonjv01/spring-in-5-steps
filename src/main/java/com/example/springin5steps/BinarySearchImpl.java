package com.example.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

   @Autowired
   private SortAlgorithm bubbleSortAlgorithm;



//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        super();
//        this.sortAlgorithm = sortAlgorithm;
//    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {

       // BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        System.out.println(bubbleSortAlgorithm);



        return 3;
    }


}
