package cl.awakelab.liquidaciones.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "institucion_salud")
public class InstitucionSalud {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_inst_salud;
    @Column
    private String descripcion;
    @Column
    private float porc_desc;
}
