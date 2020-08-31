/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliente;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Mario 
 */
public interface Comando {

    public String ejecuta(HttpServletRequest req)throws ComandoException;
    
}
