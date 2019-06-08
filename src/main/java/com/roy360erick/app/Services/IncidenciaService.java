package com.roy360erick.app.Services;


import com.roy360erick.app.Models.Incidencia;
import com.roy360erick.app.Repositories.IncidenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class IncidenciaService {

    @Autowired
    private IncidenciaRepository incidenciaRepository;



    public Map<String,Object> findById(Long id){
        Map<String,Object> response = new HashMap<>();

        try {
            response.put("status", "success");
            response.put("incidencias",incidenciaRepository.findById(id));
            return  response;
        }catch (Exception e){
            response.put("status", "error");
            return  response;
        }
    }

    public Map<String,Object> findAll(){
        Map<String,Object> response = new HashMap<>();

        try {
            response.put("status", "success");
            response.put("incidencias",incidenciaRepository.findAll());
            return  response;
        }catch (Exception e){
            response.put("status", "error");
            return  response;
        }
    }

    public Map<String,Object> insert(Incidencia incidencia){
        Map<String,Object> response = new HashMap<>();
        try {
            incidenciaRepository.save(incidencia);
            response.put("status", "success");
            return response;

        }catch (Exception e){
            response.put("status", "error");
            return response;
        }
    }

    public Map<String,Object> delete(Long id){
        Map<String,Object> response = new HashMap<>();
        try {
            incidenciaRepository.delete(incidenciaRepository.findById(id));
            response.put("status", "success");
            return response;

        }catch (Exception e){
            response.put("status", "error");
            return response;
        }
    }




}
