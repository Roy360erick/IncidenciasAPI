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

    public Incidencia insert(Incidencia incidencia){
        try {

            return  incidenciaRepository.save(incidencia);

        }catch (Exception e){
            return null;
        }
    }

    public Incidencia update(Incidencia incidencia){
        try {

            return  incidenciaRepository.save(incidencia);

        }catch (Exception e){
            return null;
        }
    }


    public ResponseMessage delete(Long id){
        try {

            incidenciaRepository.delete(incidenciaRepository.findById(id));
            return  ResponseMessage.success("incidencia eliminada correctamente");

        }catch (Exception e){

            return ResponseMessage.error("Ocurrio un error al eliminar la incidencia");
        }
    }




}
