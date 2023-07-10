package cl.awakelab.liquidaciones.entity;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "trabajador")
public class Trabajador {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_trabajador;

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
    private Long telefono;

    @Column
    private int institucion_prevision_id_inst_prevision;

    @Column
    private int institucion_salud_id_inst_salud;

    public Trabajador() {
    }

    public Trabajador(int id_trabajador, int run, String nombre, String apellido_1, String apellido_2, String email, Long telefono, int institucion_prevision_id_inst_prevision, int institucion_salud_id_inst_salud) {
        this.id_trabajador = id_trabajador;
        this.run = run;
        this.nombre = nombre;
        this.apellido_1 = apellido_1;
        this.apellido_2 = apellido_2;
        this.email = email;
        this.telefono = telefono;
        this.institucion_prevision_id_inst_prevision = institucion_prevision_id_inst_prevision;
        this.institucion_salud_id_inst_salud = institucion_salud_id_inst_salud;
    }

    public int getId_trabajador() {
        return id_trabajador;
    }

    public void setId_trabajador(int id_trabajador) {
        this.id_trabajador = id_trabajador;
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

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public int getInstitucion_prevision_id_inst_prevision() {
        return institucion_prevision_id_inst_prevision;
    }

    public void setInstitucion_prevision_id_inst_prevision(int institucion_prevision_id_inst_prevision) {
        this.institucion_prevision_id_inst_prevision = institucion_prevision_id_inst_prevision;
    }

    public int getInstitucion_salud_id_inst_salud() {
        return institucion_salud_id_inst_salud;
    }

    public void setInstitucion_salud_id_inst_salud(int institucion_salud_id_inst_salud) {
        this.institucion_salud_id_inst_salud = institucion_salud_id_inst_salud;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "id_trabajador=" + id_trabajador +
                ", run=" + run +
                ", nombre='" + nombre + '\'' +
                ", apellido_1='" + apellido_1 + '\'' +
                ", apellido_2='" + apellido_2 + '\'' +
                ", email='" + email + '\'' +
                ", telefono=" + telefono +
                ", institucion_prevision_id_inst_prevision=" + institucion_prevision_id_inst_prevision +
                ", institucion_salud_id_inst_salud=" + institucion_salud_id_inst_salud +
                '}';
    }
}
