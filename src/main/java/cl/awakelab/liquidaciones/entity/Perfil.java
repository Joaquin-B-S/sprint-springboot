package cl.awakelab.liquidaciones.entity;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "perfil")
public class Perfil {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_perfil;
    @Column
    private String descripcion;
    @Column
    private int estado;
}
