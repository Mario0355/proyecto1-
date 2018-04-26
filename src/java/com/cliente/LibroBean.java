/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliente;

/**
 *
 * @author joe 92
 */
public class LibroBean {

    /**
     * @return the nombrelibro
     */
    public String getNombrelibro() {
        return nombrelibro;
    }

    /**
     * @param nombrelibro the nombrelibro to set
     */
    public void setNombrelibro(String nombrelibro) {
        this.nombrelibro = nombrelibro;
    }

    /**
     * @return the tipodelibro
     */
    public String getTipodelibro() {
        return tipodelibro;
    }

    /**
     * @param tipodelibro the tipodelibro to set
     */
    public void setTipodelibro(String tipodelibro) {
        this.tipodelibro = tipodelibro;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
        private String nombrelibro;
        private String tipodelibro;
        private String autor;
        private String editorial;
        private String codigo;

    public LibroBean(String nombrelibro, String tipodelibro, String autor, String editorial, String codigo) {
        this.nombrelibro = nombrelibro;
        this.tipodelibro = tipodelibro;
        this.autor = autor;
        this.editorial = editorial;
        this.codigo = codigo;
    }
public String toString () {
    
        return getNombrelibro() + "" + getTipodelibro() + "" + getAutor();
        
    }
}
