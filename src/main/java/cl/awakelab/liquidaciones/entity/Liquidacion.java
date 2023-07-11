package cl.awakelab.liquidaciones.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "liquidacion")
public class Liquidacion {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_liquidacion;

    @Column
    private LocalDateTime periodo;

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

    @ManyToOne
    private Trabajador trabajador_id_trabajador;

    @ManyToOne
    private InstitucionPrevision institucion_previsional_id_inst_previsional;

    @ManyToOne
    private InstitucionSalud institucion_salud_id_inst_salud;

    public Liquidacion() {
    }

    public Liquidacion(Long id_liquidacion, LocalDateTime periodo, int sueldo_imponible, int sueldo_liquido, int monto_inst_salud, int monto_inst_previsional, int total_descuento, int total_haberes, int anticipo, Trabajador trabajador_id_trabajador, InstitucionPrevision institucion_previsional_id_inst_previsional, InstitucionSalud institucion_salud_id_inst_salud) {
        this.id_liquidacion = id_liquidacion;
        this.periodo = periodo;
        this.sueldo_imponible = sueldo_imponible;
        this.sueldo_liquido = sueldo_liquido;
        this.monto_inst_salud = monto_inst_salud;
        this.monto_inst_previsional = monto_inst_previsional;
        this.total_descuento = total_descuento;
        this.total_haberes = total_haberes;
        this.anticipo = anticipo;
        this.trabajador_id_trabajador = trabajador_id_trabajador;
        this.institucion_previsional_id_inst_previsional = institucion_previsional_id_inst_previsional;
        this.institucion_salud_id_inst_salud = institucion_salud_id_inst_salud;
    }

    public Long getId_liquidacion() {
        return id_liquidacion;
    }

    public void setId_liquidacion(Long id_liquidacion) {
        this.id_liquidacion = id_liquidacion;
    }

    public LocalDateTime getPeriodo() {
        return periodo;
    }

    public void setPeriodo(LocalDateTime periodo) {
        this.periodo = periodo;
    }

    public int getSueldo_imponible() {
        return sueldo_imponible;
    }

    public void setSueldo_imponible(int sueldo_imponible) {
        this.sueldo_imponible = sueldo_imponible;
    }

    public int getSueldo_liquido() {
        return sueldo_liquido;
    }

    public void setSueldo_liquido(int sueldo_liquido) {
        this.sueldo_liquido = sueldo_liquido;
    }

    public int getMonto_inst_salud() {
        return monto_inst_salud;
    }

    public void setMonto_inst_salud(int monto_inst_salud) {
        this.monto_inst_salud = monto_inst_salud;
    }

    public int getMonto_inst_previsional() {
        return monto_inst_previsional;
    }

    public void setMonto_inst_previsional(int monto_inst_previsional) {
        this.monto_inst_previsional = monto_inst_previsional;
    }

    public int getTotal_descuento() {
        return total_descuento;
    }

    public void setTotal_descuento(int total_descuento) {
        this.total_descuento = total_descuento;
    }

    public int getTotal_haberes() {
        return total_haberes;
    }

    public void setTotal_haberes(int total_haberes) {
        this.total_haberes = total_haberes;
    }

    public int getAnticipo() {
        return anticipo;
    }

    public void setAnticipo(int anticipo) {
        this.anticipo = anticipo;
    }

    public Trabajador getTrabajador_id_trabajador() {
        return trabajador_id_trabajador;
    }

    public void setTrabajador_id_trabajador(Trabajador trabajador_id_trabajador) {
        this.trabajador_id_trabajador = trabajador_id_trabajador;
    }

    public InstitucionPrevision getInstitucion_previsional_id_inst_previsional() {
        return institucion_previsional_id_inst_previsional;
    }

    public void setInstitucion_previsional_id_inst_previsional(InstitucionPrevision institucion_previsional_id_inst_previsional) {
        this.institucion_previsional_id_inst_previsional = institucion_previsional_id_inst_previsional;
    }

    public InstitucionSalud getInstitucion_salud_id_inst_salud() {
        return institucion_salud_id_inst_salud;
    }

    public void setInstitucion_salud_id_inst_salud(InstitucionSalud institucion_salud_id_inst_salud) {
        this.institucion_salud_id_inst_salud = institucion_salud_id_inst_salud;
    }

    @Override
    public String toString() {
        return "Liquidacion{" +
                "id_liquidacion=" + id_liquidacion +
                ", periodo=" + periodo +
                ", sueldo_imponible=" + sueldo_imponible +
                ", sueldo_liquido=" + sueldo_liquido +
                ", monto_inst_salud=" + monto_inst_salud +
                ", monto_inst_previsional=" + monto_inst_previsional +
                ", total_descuento=" + total_descuento +
                ", total_haberes=" + total_haberes +
                ", anticipo=" + anticipo +
                ", trabajador_id_trabajador=" + trabajador_id_trabajador +
                ", institucion_previsional_id_inst_previsional=" + institucion_previsional_id_inst_previsional +
                ", institucion_salud_id_inst_salud=" + institucion_salud_id_inst_salud +
                '}';
    }
}
