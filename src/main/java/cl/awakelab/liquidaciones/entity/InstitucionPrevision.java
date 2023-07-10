package cl.awakelab.liquidaciones.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "institucion_prevision")
public class InstitucionPrevision {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_inst_prevision;
    @Column
    private String descripcion;
    @Column
    private float porc_desc;

    public InstitucionPrevision() {
    }

    public InstitucionPrevision(int id_inst_prevision, String descripcion, float porc_desc) {
        this.id_inst_prevision = id_inst_prevision;
        this.descripcion = descripcion;
        this.porc_desc = porc_desc;
    }

    public int getId_inst_prevision() {
        return id_inst_prevision;
    }

    public void setId_inst_prevision(int id_inst_prevision) {
        this.id_inst_prevision = id_inst_prevision;
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
        return "InstitucionPrevision{" +
                "id_inst_prevision=" + id_inst_prevision +
                ", descripcion='" + descripcion + '\'' +
                ", porc_desc=" + porc_desc +
                '}';
    }
}
