package com.library;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.repository.BookRepository;
import com.library.service.BookService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookRepository repository = context.getBean("bookrepository",BookRepository.class);
        BookService service = context.getBean("bookservice",BookService.class);
        System.out.println("Beans loaded successfully");
        service.run();
    }
}
