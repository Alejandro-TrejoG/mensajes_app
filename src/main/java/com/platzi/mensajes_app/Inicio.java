/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.mensajes_app;

import java.sql.Connection;

/**
 *
 * @author Alejandro
 */
public class Inicio {
    public static void main(String[] args) {
        Conexion cn = new Conexion();
        
        try (Connection cnn = cn.get_connection()) {
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
