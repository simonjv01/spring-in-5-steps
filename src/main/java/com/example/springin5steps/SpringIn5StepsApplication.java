package com.example.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

    public static void main(String[] args) {

        BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
        BinarySearchImpl binarySearch2 = new BinarySearchImpl(new QuickSortAlgorithm());
        int result = binarySearch.binarySearch(new int[] {12,4, 6}, 3);
        int result2 = binarySearch2.binarySearch(new int[] {4, 90, 23}, 90);
        System.out.println(result);
        System.out.println(result2);

       //ApplicationContext context= SpringApplication.run(SpringIn5StepsApplication.class, args);

        //SomeSearchImpl searchImpl = context.getBean(SomeSearchImpl.class);
    }

}
