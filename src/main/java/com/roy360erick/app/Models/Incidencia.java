package com.roy360erick.app.Models;


import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "incidencias")
public class Incidencia implements  Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String  responsable;

    private String motivo;

    private String tipoInicidencia;

    private Date fechaIncidencia;

    private Boolean estado;

    @JsonProperty("Id")
    public Long getId() {
        return id;
    }

    @JsonSetter("Id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("Responsable")
    public String getResponsable() {
        return responsable;
    }

    @JsonSetter("Responsable")
    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    @JsonProperty("Motivo")
    public String getMotivo() {
        return motivo;
    }

    @JsonSetter("Motivo")
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @JsonProperty("TipoInicidencia")
    public String getTipoInicidencia() {
        return tipoInicidencia;
    }

    @JsonSetter("TipoInicidencia")
    public void setTipoInicidencia(String tipoInicidencia) {
        this.tipoInicidencia = tipoInicidencia;
    }

    @JsonProperty("FechaIncidencia")
    public Date getFechaIncidencia() {
        return fechaIncidencia;
    }

    @JsonSetter("FechaIncidencia")
    public void setFechaIncidencia(Date fechaIncidencia) {
        this.fechaIncidencia = fechaIncidencia;
    }

    @JsonProperty("Estado")
    public Boolean getEstado() {
        return estado;
    }

    @JsonSetter("Estado")
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
