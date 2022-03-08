/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    String url = "jdbc:mysql://localhost:3306/bd_parcial";
    String user = "root";
    String pass = "";       
    public Connection Conexion(){
      try{
         Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection(url, user, pass);
      }catch(Exception e){
          System.out.println("error en la conexion con la base de datos "+e.getMessage());
      }
         
    return con;
}
}
