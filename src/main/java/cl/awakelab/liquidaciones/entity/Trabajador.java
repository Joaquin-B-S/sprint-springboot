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
}
