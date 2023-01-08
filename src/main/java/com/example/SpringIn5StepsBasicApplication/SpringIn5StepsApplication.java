package com.example.SpringIn5StepsBasicApplication;

import com.example.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

    // What are the beans?
    // What are the dependencies of a bean?
    // Where to search for beans? => No need, all beans in same package

    public static void main(String[] args) {

        //BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
        //BinarySearchImpl binarySearch2 = new BinarySearchImpl(new QuickSortAlgorithm());
        // Application context




       ApplicationContext context= SpringApplication.run(SpringIn5StepsApplication.class, args);

       BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);

       int result = binarySearch.binarySearch(new int[] { 12,4,6}, 3);
        System.out.println(result);


       // System.out.println(result2);


    }

}
