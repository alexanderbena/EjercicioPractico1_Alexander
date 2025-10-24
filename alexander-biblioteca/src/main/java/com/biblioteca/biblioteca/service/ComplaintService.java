/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.biblioteca.service;

import com.biblioteca.biblioteca.domain.Complaint;
import java.util.List;

public interface ComplaintService {
    List<Complaint> findAll();
    Complaint save(Complaint complaint);
}

