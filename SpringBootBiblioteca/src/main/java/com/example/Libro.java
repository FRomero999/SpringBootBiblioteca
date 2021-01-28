/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author paco
*/

@Entity
@Table(name="biblioteca")
public class Libro implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String autor;
    private String categoria;
    private Integer año;
    private String ISBN;
    private String estado;

    public Libro() {
    }

    public Libro(Integer id, String nombre, String autor, String categoria, Integer año, String ISBN, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.categoria = categoria;
        this.año = año;
        this.ISBN = ISBN;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", nombre=" + nombre + ", autor=" + autor + ", categoria=" + categoria + ", a\u00f1o=" + año + ", ISBN=" + ISBN + ", estado=" + estado + '}';
    }    
    
}
