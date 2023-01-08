package com.example.SpringIn5StepsScopeApplication;

import com.example.basic.BinarySearchImpl;
import com.example.scope.PersonDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {

    // What are the beans?
    // What are the dependencies of a bean?
    // Where to search for beans? => No need, all beans in same package

    public static void main(String[] args) {

        //BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
        //BinarySearchImpl binarySearch2 = new BinarySearchImpl(new QuickSortAlgorithm());
        // Application context




       ApplicationContext context= SpringApplication.run(SpringIn5StepsScopeApplication.class, args);

       PersonDAO personDAO = context.getBean(PersonDAO.class);




    }

}
