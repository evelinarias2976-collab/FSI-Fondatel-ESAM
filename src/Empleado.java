/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eveli
 */
import java.sql.*;

public class Empleado {
    
    static String todos = "SELECT * FROM empleados ORDER BY codigo";
    static String ids = "SELECT codigo FROM empleados ORDER BY codigo";
    
    String codigo, nombree, puesto, turno, estadoe;
    
    public Empleado() {
        
    }

    public Empleado(String codigo, String nombree, String puesto, String turno, String estadoe) {
        this.codigo = codigo;
        this.nombree = nombree;
        this.puesto = puesto;
        this.turno = turno;
        this.estadoe = estadoe;
    }
    
    public int insertar(Connection con){
        int resultado = 0;
        try {
            String sql = "INSERT INTO empleados VALUES(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            ps.setString(2, nombree);
            ps.setString(3, puesto);
            ps.setString(4, turno);
            ps.setString(5, estadoe);
            return ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
            return resultado;
        }
    }
    
    public int borrar(Connection con){
        int resultado = 0;
        try {
            String sql = "DELETE FROM empleados WHERE codigo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
            return resultado;
        }
    }
    
    public int actualizar(Connection con){
        int resultado = 0;
        try {
            String sql = "UPDATE empleados SET nombree = ?, puesto = ?, turno = ?, estadoe = ? WHERE codigo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombree);
            ps.setString(2, puesto);
            ps.setString(3, turno);
            ps.setString(4, estadoe);
            ps.setString(5, codigo);
            return ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
            return resultado;
        }
    }
    
}
