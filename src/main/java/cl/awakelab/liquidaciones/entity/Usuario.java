package cl.awakelab.liquidaciones.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;
    @Column
    private int run;
    @Column
    private String nombre;
    @Column
    private String apellido_1;
    @Column
    private String apellido_2;
    @Column
    private String email;
    @Column
    private LocalDate fecha_creacion;
    @Column
    private long telefono;
    @Column
    private String clave;

    @ManyToOne
    private Perfil perfil_id_perfil;

    public Usuario() {
    }

    public Usuario(int id_usuario, int run, String nombre, String apellido_1, String apellido_2, String email, LocalDate fecha_creacion, long telefono, String clave, Perfil perfil_id_perfil) {
        this.id_usuario = id_usuario;
        this.run = run;
        this.nombre = nombre;
        this.apellido_1 = apellido_1;
        this.apellido_2 = apellido_2;
        this.email = email;
        this.fecha_creacion = fecha_creacion;
        this.telefono = telefono;
        this.clave = clave;
        this.perfil_id_perfil = perfil_id_perfil;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Perfil getPerfil_id_perfil() {
        return perfil_id_perfil;
    }

    public void setPerfil_id_perfil(Perfil perfil_id_perfil) {
        this.perfil_id_perfil = perfil_id_perfil;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id_usuario=" + id_usuario +
                ", run=" + run +
                ", nombre='" + nombre + '\'' +
                ", apellido_1='" + apellido_1 + '\'' +
                ", apellido_2='" + apellido_2 + '\'' +
                ", email='" + email + '\'' +
                ", fecha_creacion=" + fecha_creacion +
                ", telefono=" + telefono +
                ", clave='" + clave + '\'' +
                ", perfil_id_perfil=" + perfil_id_perfil +
                '}';
    }
}
