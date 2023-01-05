package com.example.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

   @Autowired
   private final SortAlgorithm sortAlgorithm;



    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {

       // BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);



        return 3;
    }

    @Override
    public String toString() {
        return "BinarySearchImpl{" +
                "sortAlgorithm=" + sortAlgorithm +
                '}';
    }

}
