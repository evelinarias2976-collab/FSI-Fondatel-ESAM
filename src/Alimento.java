/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eveli
 */
import java.io.Serializable;
import javax.swing.ImageIcon;
import java.sql.PreparedStatement;

public class Alimento implements Serializable {

    private int idalimentos;
    private String nombre, descripcion, categoria, estado;
    private float precio;
    private ImageIcon foto;

    static String todos = "SELECT * FROM alimentos ORDER BY idalimentos";
    static String ids = "SELECT idalimentos FROM alimentos ORDER BY idalimentos";

    public Alimento() {

    }

    public Alimento(int idalimentos, String nombre, String descripcion, float precio, ImageIcon foto, String categoria, String estado) {
        this.idalimentos = idalimentos;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.foto = foto;
        this.categoria = categoria;
        this.estado = estado;
    }

    public int insertar(Conexion cnx) {
        try {
            String sql = "INSERT INTO alimentos VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = cnx.con.prepareStatement(sql);

            ps.setInt(1, idalimentos);
            ps.setString(2, nombre);
            ps.setString(3, descripcion);
            ps.setFloat(4, precio);

            java.io.FileInputStream imagen = cnx.ImagenBytes(foto);

            if (imagen == null) {
                ps.close();
                return 0;
            }

            ps.setBinaryStream(5, imagen);
            ps.setString(6, categoria);
            ps.setString(7, estado);

            int resultado = ps.executeUpdate();

            imagen.close();
            ps.close();

            return resultado;

        } catch (Exception e) {
            System.out.println("Error al insertar: " + e.getMessage());
            return 0;
        }
    }

    public int borrar(Conexion cnx) {
        try {
            String sql = "DELETE FROM alimentos WHERE idalimentos = ?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setInt(1, idalimentos);

            return ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return 0;
        }
    }

    public int actualizar(Conexion cnx) {
        try {
            String sql = "UPDATE alimentos SET nombre = ?, descripcion = ?, precio = ?, foto = ?, categoria = ?, estado = ? WHERE idalimentos = ?";

            PreparedStatement ps = cnx.con.prepareStatement(sql);

            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setFloat(3, precio);

            java.io.FileInputStream imagen = cnx.ImagenBytes(foto);

            if (imagen == null) {
                ps.close();
                return 0;
            }

            ps.setBinaryStream(4, imagen);
            ps.setString(5, categoria);
            ps.setString(6, estado);
            ps.setInt(7, idalimentos);

            int resultado = ps.executeUpdate();

            imagen.close();
            ps.close();

            return resultado;

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return 0;
        }
    }
}
