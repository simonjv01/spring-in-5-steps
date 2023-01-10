package com.example.SpringIn5StepsScopeApplication;


import com.example.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {

    // What are the beans?
    // What are the dependencies of a bean?
    // Where to search for beans? => No need, all beans in same package

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

    public static void main(String[] args) {

        //BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
        //BinarySearchImpl binarySearch2 = new BinarySearchImpl(new QuickSortAlgorithm());
        // Application context




       ApplicationContext context= SpringApplication.run(SpringIn5StepsScopeApplication.class, args);


        PersonDAO personDAO = context.getBean(PersonDAO.class);

        PersonDAO personDAO2 = context.getBean(PersonDAO.class);

        LOGGER.info("{}", personDAO);
        LOGGER.info("{}", personDAO.getJdbcConnection());

        LOGGER.info("{}", personDAO2);
        LOGGER.info("{}", personDAO2.getJdbcConnection());


    }

}
