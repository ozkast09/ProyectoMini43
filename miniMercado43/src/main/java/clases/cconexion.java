/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import com.sun.source.doctree.ReturnTree;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author OSCAR
 */
public class cconexion {
    
    Connection conectar=null;
    String usuario="root";
    String contraseña="";
    String bd="inventariomini43";
    String ip="localhost";
    String puerto="3306";
    
    String cadena= "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection(cadena,usuario,contraseña);
            //JOptionPane.showMessageDialog(null,"conexion a base de datos correcta");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se pudo conectar a la base de datos"+e.toString());
            
        }
    
    return conectar;
    }
    
    public void cerrrarConexion(){
    
        try {
            if (conectar!=null && !conectar.isClosed()) {
            conectar.close();
            
            //JOptionPane.showMessageDialog(null,"La conexion se ha cerrado");
            
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"no se pudo cerrar la conexion");
        }
    }

    
}
