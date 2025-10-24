/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.biblioteca.service;

import com.biblioteca.biblioteca.domain.Book;
import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book save(Book book);
    void delete(Long id);
    Book findById(Long id);
}

