package cl.awakelab.liquidaciones.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "empleador")
public class Empleador {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_empleador;

    @Column
    private int run;

    @Column
    private  String nombre;

    @Column
    private String apellido_1;

    @Column
    private String apellido_2;

    @Column
    private String direccion;

    @Column
    private String email;

    @Column
    private Long telefono;

    @Column
    private int usuario_id_usuario;

    public Empleador() {
    }

    public Empleador(int id_empleador, int run, String nombre, String apellido_1, String apellido_2, String direccion, String email, Long telefono, int usuario_id_usuario) {
        this.id_empleador = id_empleador;
        this.run = run;
        this.nombre = nombre;
        this.apellido_1 = apellido_1;
        this.apellido_2 = apellido_2;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.usuario_id_usuario = usuario_id_usuario;
    }

    public int getId_empleador() {
        return id_empleador;
    }

    public void setId_empleador(int id_empleador) {
        this.id_empleador = id_empleador;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_1() {
        return apellido_1;
    }

    public void setApellido_1(String apellido_1) {
        this.apellido_1 = apellido_1;
    }

    public String getApellido_2() {
        return apellido_2;
    }

    public void setApellido_2(String apellido_2) {
        this.apellido_2 = apellido_2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public int getUsuario_id_usuario() {
        return usuario_id_usuario;
    }

    public void setUsuario_id_usuario(int usuario_id_usuario) {
        this.usuario_id_usuario = usuario_id_usuario;
    }

    @Override
    public String toString() {
        return "Empleador{" +
                "id_empleador=" + id_empleador +
                ", run=" + run +
                ", nombre='" + nombre + '\'' +
                ", apellido_1='" + apellido_1 + '\'' +
                ", apellido_2='" + apellido_2 + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", telefono=" + telefono +
                ", usuario_id_usuario=" + usuario_id_usuario +
                '}';
    }
}
