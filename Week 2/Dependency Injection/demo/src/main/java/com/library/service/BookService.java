package com.library.service;
import com.library.repository.BookRepository;

public class BookService {
    private BookRepository repo;

    public BookService() {
        System.out.println("BookService Bean Created");
    }

    public void setRepo(BookRepository repo) {
        this.repo = repo;
    }

    public void run(){
        System.out.println(repo.gun());
    }


}
