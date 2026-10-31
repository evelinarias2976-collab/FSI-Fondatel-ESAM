/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eveli
 */
import java.sql.*;

public class Orden {
    
    static String todos = "SELECT * FROM ordenes ORDER BY folio";
    static String ids = "SELECT folio FROM ordenes ORDER BY folio";
    
    int folio, silla, mesas_numero, alimentos_idalimentos;
    Timestamp fecha_hora;
    String observaciones, estadoo, clientes_codigoc, empleados_codigo_mesero, empleados_codigo_cocinero;
    
    public Orden() {
        
    }

    public Orden(int folio, Timestamp fecha_hora, String observaciones, String estadoo, int silla, String clientes_codigoc, int mesas_numero, int alimentos_idalimentos, String empleados_codigo_mesero, String empleados_codigo_cocinero) {
        this.folio = folio;
        this.fecha_hora = fecha_hora;
        this.observaciones = observaciones;
        this.estadoo = estadoo;
        this.silla = silla;
        this.clientes_codigoc = clientes_codigoc;
        this.mesas_numero = mesas_numero;
        this.alimentos_idalimentos = alimentos_idalimentos;
        this.empleados_codigo_mesero = empleados_codigo_mesero;
        this.empleados_codigo_cocinero = empleados_codigo_cocinero;
    }
    
    public int insertar(Connection con){
        int resultado = 0;
        try {
            String sql = "INSERT INTO ordenes VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, folio);
            ps.setTimestamp(2, fecha_hora);
            ps.setString(3, observaciones);
            ps.setString(4, estadoo);
            ps.setInt(5, silla);
            ps.setString(6, clientes_codigoc);
            ps.setInt(7, mesas_numero);
            ps.setInt(8, alimentos_idalimentos);
            ps.setString(9, empleados_codigo_mesero);
            ps.setString(10, empleados_codigo_cocinero);
            return ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
            return resultado;
        }
    }
    
    public int borrar(Connection con){
        int resultado = 0;
        try {
            String sql = "DELETE FROM ordenes WHERE folio = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, folio);
            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
            return resultado;
        }
    }
    
    public int actualizar(Connection con){
        int resultado = 0;
        try {
            String sql = "UPDATE ordenes SET fecha_hora = ?, observaciones = ?, estadoo = ?, silla = ?, clientes_codigoc = ?, mesas_numero = ?, alimentos_idalimentos = ?, empleados_codigo_mesero = ?, empleados_codigo_cocinero = ? WHERE folio = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setTimestamp(1, fecha_hora);
            ps.setString(2, observaciones);
            ps.setString(3, estadoo);
            ps.setInt(4, silla);
            ps.setString(5, clientes_codigoc);
            ps.setInt(6, mesas_numero);
            ps.setInt(7, alimentos_idalimentos);
            ps.setString(8, empleados_codigo_mesero);
            ps.setString(9, empleados_codigo_cocinero);
            ps.setInt(10, folio);
            return ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
            return resultado;
        }
    }
    
}
