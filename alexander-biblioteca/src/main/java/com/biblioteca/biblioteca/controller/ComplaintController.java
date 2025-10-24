/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.biblioteca.controller;

/**
 *
 * @author alexa
 */
import com.biblioteca.biblioteca.domain.Complaint;
import com.biblioteca.biblioteca.domain.ComplaintType;
import com.biblioteca.biblioteca.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/complaints")
public class ComplaintController {

    @Autowired
    private ComplaintService complaintService;

    @GetMapping("/form")
    public String complaintForm(Model model) {
        model.addAttribute("complaint", new Complaint());
        model.addAttribute("types", ComplaintType.values());
        return "complaints/form"; // Carga complaints/form.html
    }

    @PostMapping("/save")
    public String saveComplaint(@ModelAttribute Complaint complaint) {
        complaintService.save(complaint);
        return "redirect:/";
    }
    

}

