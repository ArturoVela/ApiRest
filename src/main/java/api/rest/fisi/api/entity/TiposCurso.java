package api.rest.fisi.api.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipos_curso")
@SQLDelete(sql = "UPDATE tipos_curso SET estado = 0 WHERE idtipocurso = ?")
@Where(clause = "estado = 1")

public class TiposCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtipocurso;
    private String tipo;
    private Integer estado = 1;

    public TiposCurso() {
    }

    public TiposCurso(Integer id) {
        this.idtipocurso = id;
    }

    public Integer getIdtipocurso() {
        return this.idtipocurso;
    }

    public void setIdtipocurso(Integer idtipocurso) {
        this.idtipocurso = idtipocurso;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getEstado() {
        return this.estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "{" +
                " idtipocurso='" + getIdtipocurso() + "'" +
                ", tipo='" + getTipo() + "'" +
                ", estado='" + getEstado() + "'" +
                "}";
    }

}
