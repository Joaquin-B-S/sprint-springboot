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
}
