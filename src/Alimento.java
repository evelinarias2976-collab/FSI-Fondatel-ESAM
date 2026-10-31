/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eveli
 */
import java.sql.*;

public class Alimento {
    
    static String todos = "SELECT * FROM alimentos ORDER BY idalimentos";
    static String ids = "SELECT idalimentos FROM alimentos ORDER BY idalimentos";
    
    int idalimentos;
    String nombre, descripcion, categoria, estado;
    float precio;
    byte[] foto;
    
    public Alimento() {
        
    }

    public Alimento(int idalimentos, String nombre, String descripcion, float precio, byte[] foto, String categoria, String estado) {
        this.idalimentos = idalimentos;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.foto = foto;
        this.categoria = categoria;
        this.estado = estado;
    }
    
    public int insertar(Connection con){
        int resultado = 0;
        try {
            String sql = "INSERT INTO alimentos VALUES(?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idalimentos);
            ps.setString(2, nombre);
            ps.setString(3, descripcion);
            ps.setFloat(4, precio);
            ps.setBytes(5, foto);
            ps.setString(6, categoria);
            ps.setString(7, estado);
            return ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
            return resultado;
        }
    }
    
    public int borrar(Connection con){
        int resultado = 0;
        try {
            String sql = "DELETE FROM alimentos WHERE idalimentos = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idalimentos);
            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
            return resultado;
        }
    }
    
    public int actualizar(Connection con){
        int resultado = 0;
        try {
            String sql = "UPDATE alimentos SET nombre = ?, descripcion = ?, precio = ?, foto = ?, categoria = ?, estado = ? WHERE idalimentos = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setFloat(3, precio);
            ps.setBytes(4, foto);
            ps.setString(5, categoria);
            ps.setString(6, estado);
            ps.setInt(7, idalimentos);
            return ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
            return resultado;
        }
    }
    
}