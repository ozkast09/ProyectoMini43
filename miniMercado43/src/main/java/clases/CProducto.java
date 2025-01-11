/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import com.mysql.cj.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author OSCAR
 */
public class CProducto {
    
    int idCategoria;

    public void establecerCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    
    }
    
    int idMarca;
    public void establecerMarca(int idMarca) {
        this.idMarca = idMarca;
    }
    
    int idMedida;

    public void establecerMedida(int idMedida) {
        this.idMedida = idMedida;
    }
    
    int idProveedor;
    public void establecerProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    
    
    
    
    
    // metodos para los combobox
    public void MostrarCategoriaCombo (JComboBox comboCategoria){
        clases.cconexion objetoConexion=new clases.cconexion();
        
        String sql="select * from categoria";
        
        Statement st;
        
        try {
            st=objetoConexion.estableceConexion().createStatement();
            ResultSet rs=st.executeQuery(sql);
            comboCategoria.removeAllItems();
            
            while (rs.next()) { 
                String nombreCategoria=rs.getString("categoria");
                this.establecerCategoria(rs.getInt("id"));
                
                comboCategoria.addItem(nombreCategoria);
                comboCategoria.putClientProperty(nombreCategoria, idCategoria);
                
              
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al mostrar la Categoria"+e.toString());
        }
        finally{
        objetoConexion.cerrrarConexion();
        }
        
        
    }
    public void MostrarMarcaCombo( JComboBox comboMarca){
        clases.cconexion objetoConexion=new clases.cconexion();
        String sql="select * from marca";
        Statement st;
        try {
            st=objetoConexion.estableceConexion().createStatement();
            ResultSet rs=st.executeQuery(sql);
            comboMarca.removeAllItems();
            
            while (rs.next()) {
                String nombreMarca=rs.getString("marca");
                this.establecerMarca(rs.getInt("id"));
                
                comboMarca.addItem(nombreMarca);
                comboMarca.putClientProperty(nombreMarca,idMarca);
                
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al mostrar la marca"+e.toString());
        }
        finally{
        objetoConexion.cerrrarConexion();
        }
    }
    
    public void MostrarMedidadCombo(JComboBox comboMedida){
        
       clases.cconexion objetoConexion=new clases.cconexion();
       String sql="select * from unidadMedida";
       Statement st;
        try {
            st=objetoConexion.estableceConexion().createStatement();
            ResultSet rs=st.executeQuery(sql);
            comboMedida.removeAllItems();
            while (rs.next()) {
                String nombreMedida=rs.getString("unidadMedida");
                this.establecerMedida(rs.getInt("id"));
                comboMedida.addItem(nombreMedida);
                comboMedida.putClientProperty(nombreMedida,idMedida);  
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al mostrar la medida"+e.toString());
                       
        }
        finally{
        objetoConexion.cerrrarConexion();
        }
    }
    
    public void MostrarProveedorCombo (JComboBox comboProveedor){
        clases.cconexion objetoConexion=new clases.cconexion();
        String sql="select * from proveedor";
        Statement st;
        try {
            st=objetoConexion.estableceConexion().createStatement();
            ResultSet rs=st.executeQuery(sql);
            comboProveedor.removeAllItems();
            
            while (rs.next()) {
                String nombreProveedor=rs.getString("proveedor");
                this.establecerProveedor(rs.getInt("id3"));
                
                comboProveedor.addItem(nombreProveedor);
                comboProveedor.putClientProperty(nombreProveedor,idProveedor);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al mostrar el proveedor"+e.toString());
        }
    finally{
        objetoConexion.cerrrarConexion();
        }
    }
    
    // Metodo para guardar informacion
    public void agregarProducto(JTextField nombre,JTextField descripcion,JComboBox comboCategoria,JComboBox comboMarca, JComboBox comboMedida,JComboBox comboProveedor, JTextField cantidad){
       cconexion objetoConexion=new cconexion();
       
       String consulta="insert into Inventario (nombre,descripcion,fkcategoria,fkmarca,fkunidadmedida,fkproveedor,cantidad) values (?,?,?,?,?,?,?);";
       
       
        try {
           
            CallableStatement cs=(CallableStatement) objetoConexion.estableceConexion().prepareCall(consulta);
           
          cs.setString(1, nombre.getText());
          cs.setString(2, descripcion.getText());
          
          int IDproducto= (int) comboCategoria.getClientProperty(comboCategoria.getSelectedItem());
          cs.setInt(3,IDproducto);
          
          int idMarca= (int) comboMarca.getClientProperty(comboMarca.getSelectedItem());
          cs.setInt(4, idMarca);
        
          
          int idMedida=(int) comboMedida.getClientProperty(comboMedida.getSelectedItem());
          cs.setInt(5,idMedida);
          
          int idProveedor=(int) comboProveedor.getClientProperty(comboProveedor.getSelectedItem());
          cs.setInt(6,idProveedor);
          
          cs.setInt(7, Integer.parseInt(cantidad.getText()));  
          
          cs.execute();
          
          JOptionPane.showMessageDialog(null,"Producto guardado");
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al guardar:"+e.toString());
        }
        
        
    
    
    
    }
    
    
}
