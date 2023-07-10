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
    @Column
    private int perfil_id_perfil;
}
