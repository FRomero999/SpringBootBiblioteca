/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import java.util.Optional;
import models.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author paco
 */

@Controller
public class MainController {
    @Autowired 
    private LibroRepository repositorio;    
    
    @GetMapping(path="/")
    public String index() {
        return "vista-inicio";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<models.Libro> getAllLibros() {
        System.out.println(repositorio.count());
        System.out.println(repositorio.toString());
        return repositorio.findAll();
    }   
    
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Optional<Libro> getOneLibro( @PathVariable Integer id) {
        return repositorio.findById(id);
    }    
    
    @RequestMapping(path="/biblioteca", method = RequestMethod.GET)
    public String listado(Model pagina) {
        pagina.addAttribute("biblioteca",repositorio.findAll());
        return "vista-biblioteca";
    }   
    
    @RequestMapping(path="/biblioteca/{id}", method = RequestMethod.GET)
    public String verLibro(@PathVariable Integer id, Model pagina2) {            
        pagina2.addAttribute("libro",repositorio.findById(id).get() );
        return "vista-libro";
    }   

    
}