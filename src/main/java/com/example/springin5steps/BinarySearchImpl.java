package com.example.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BinarySearchImpl {

   @Autowired
   @Qualifier("bubble")
   private SortAlgorithm sortAlgorithm;



//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        super();
//        this.sortAlgorithm = sortAlgorithm;
//    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {

       // BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);



        return 3;
    }


}
