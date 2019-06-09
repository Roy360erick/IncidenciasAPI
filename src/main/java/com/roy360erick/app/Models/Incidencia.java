package com.roy360erick.app.Models;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "incidencias")
public class Incidencia implements  Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String  Responsable;

    private String Motivo;

    private String TipoInicidencia;

    private Date FechaIncidencia;

    private Boolean Estado;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String responsable) {
        Responsable = responsable;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String motivo) {
        Motivo = motivo;
    }

    public String getTipoInicidencia() {
        return TipoInicidencia;
    }

    public void setTipoInicidencia(String tipoInicidencia) {
        TipoInicidencia = tipoInicidencia;
    }

    public Date getFechaIncidencia() {
        return FechaIncidencia;
    }

    public void setFechaIncidencia(Date fechaIncidencia) {
        FechaIncidencia = fechaIncidencia;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean estado) {
        Estado = estado;
    }
}
