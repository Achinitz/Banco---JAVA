/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Gustavo e Laerte
 */
public class Conexao {
    
    
    private static final String URL="jdbc:mysql://localhost/sistemaBanco?userTimezone=true&serverTimezone=UTC&useSSL=false";
    private static final String USER="root";
    private static final String SENHA="1234";
    
    public static Connection getConnection(){
        
        try{
            
            return DriverManager.getConnection(URL,USER,SENHA);
            
        }catch(Exception ex){
            
            throw new RuntimeException(ex);
            
        }
    }
}
