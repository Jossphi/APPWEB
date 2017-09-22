/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author josep
 */
public class consultas extends conexion{
    
    public boolean autenticacion(String usuario, String contraseña){
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            String consulta = "select * from jefe where usuario = ? and contraseña =?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, contraseña);
            rs = pst.executeQuery();
            
            if(rs.absolute(1)){
                return true;
            }
        }catch(Exception e){
            System.err.println("error" + e);
        }finally{
            try{
                if(getConexion() !=null) getConexion().close();
                if(pst !=null) pst.close();
                if(rs !=null)rs.close();
            }catch (Exception e){
                
            }
                
        }
        
        return false;
    }
    public static void main (String[] args){
        consultas co = new consultas();
        System.out.println(co.autenticacion("joseph","12345"));
    }
    public boolean registrar(String nombre,String apellidopat,String apellidomat,String DNI,String estadocivil,String nacimiento,String telefono,String pais,String region,String ciudad, String usuario, String contraseña){
        PreparedStatement pst = null;
        
        try{
            String consulta = "insert into postulantes (nombre,apellidopat,apellidomat,DNI,estadocivil,nacimiento,telefono,pais,region,ciudad,usuario,contraseña) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, apellidopat);
            pst.setString(3, apellidomat);
            pst.setString(4, DNI);
            pst.setString(5, estadocivil);
            pst.setString(6, nacimiento);
            pst.setString(7, telefono);
            pst.setString(8, pais);
            pst.setString(9, region);
            pst.setString(10, ciudad);
            pst.setString(11, usuario);
            pst.setString(12, contraseña);
            
            if(pst.executeUpdate() == 1){
                return true;
            }
        } catch(Exception ex){
            System.err.println("Error" + ex);
        }finally{
            try{
                if(getConexion() != null) getConexion().close();
                if(pst != null)pst.close();
            }catch (Exception e){
                System.err.println("Error" + e);
                
            }
        }
        
        return false;
    }
    /*public static void main(String[] args){
        consultas co = new consultas();
        System.out.println(co.registrar("Joseasas","Gonzales","Jave","123456789","soltero","mayo","1234567899","peru","La libertad","Trujillo","gatito","123456"));
    }*/
    
}
