package cl.awakelab.liquidaciones.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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

    @OneToMany(mappedBy = "perfil_id_perfil")
    private List<Usuario> usuarios;

    public Perfil() {
    }

    public Perfil(int id_perfil, String descripcion, int estado, List<Usuario> usuarios) {
        this.id_perfil = id_perfil;
        this.descripcion = descripcion;
        this.estado = estado;
        this.usuarios = usuarios;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "id_perfil=" + id_perfil +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                ", usuarios=" + usuarios +
                '}';
    }
}
