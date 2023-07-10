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

    public InstitucionSalud() {
    }

    public InstitucionSalud(int id_inst_salud, String descripcion, float porc_desc) {
        this.id_inst_salud = id_inst_salud;
        this.descripcion = descripcion;
        this.porc_desc = porc_desc;
    }

    public int getId_inst_salud() {
        return id_inst_salud;
    }

    public void setId_inst_salud(int id_inst_salud) {
        this.id_inst_salud = id_inst_salud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPorc_desc() {
        return porc_desc;
    }

    public void setPorc_desc(float porc_desc) {
        this.porc_desc = porc_desc;
    }

    @Override
    public String toString() {
        return "InstitucionSalud{" +
                "id_inst_salud=" + id_inst_salud +
                ", descripcion='" + descripcion + '\'' +
                ", porc_desc=" + porc_desc +
                '}';
    }
}
