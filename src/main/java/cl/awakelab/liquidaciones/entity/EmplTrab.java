package cl.awakelab.liquidaciones.entity;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "empl_trab")
public class EmplTrab {
    private int trabajador_id_trabajador;
    private int empleador_id_empleador;
}
