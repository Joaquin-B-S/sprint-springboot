package cl.awakelab.liquidaciones.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "liquidacion")
public class Liquidacion {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_liquidacion;

    @Column
    private LocalDate periodo;

    @Column
    private int sueldo_imponible;

    @Column
    private int sueldo_liquido;

    @Column
    private int monto_inst_salud;


    @Column
    private int monto_inst_previsional;

    @Column
    private int total_descuento;

    @Column
    private int total_haberes;

    @Column
    private int anticipo;

    @Column
    private int trabajador_id_trabajador;

    @Column
    private int institucion_previsional_id_inst_previsional;

    @Column
    private int institucion_salud_id_inst_salud;
}
