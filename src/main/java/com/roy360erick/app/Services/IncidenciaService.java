package com.roy360erick.app.Services;


import com.roy360erick.app.Models.Incidencia;
import com.roy360erick.app.Models.ResponseMessage;
import com.roy360erick.app.Repositories.IncidenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IncidenciaService {

    @Autowired
    private IncidenciaRepository incidenciaRepository;



    public Incidencia findById(Long id){
        try {

            return  incidenciaRepository.findById(id);
        }catch (Exception e){

            return  null;
        }
    }

    public List<Incidencia>  findAll(){
        try {
            return incidenciaRepository.findAll();
        }catch (Exception e){
            return null;
        }
    }

    public ResponseMessage insert(Incidencia incidencia){
        try {
             incidenciaRepository.save(incidencia);
            return  ResponseMessage.success("incidencia registrada correctamente");

        }catch (Exception e){
            return ResponseMessage.error("Ocurrio un error al insertar la incidencia");
        }
    }

    public ResponseMessage update(Incidencia incidencia){
        try {
            incidenciaRepository.save(incidencia);
            return  ResponseMessage.success("incidencia actualizada correctamente");

        }catch (Exception e){
            return ResponseMessage.error("Ocurrio un error al actualizar la incidencia");
        }
    }


    public ResponseMessage delete(Long id){
        try {

            incidenciaRepository.delete(incidenciaRepository.findById(id));
            return  ResponseMessage.success("incidencia registrada correctamente");

        }catch (Exception e){

            return ResponseMessage.error("Ocurrio un error al insertar la incidencia");
        }
    }




}
