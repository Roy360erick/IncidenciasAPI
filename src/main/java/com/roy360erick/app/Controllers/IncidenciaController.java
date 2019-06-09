package com.roy360erick.app.Controllers;

import com.roy360erick.app.Models.Incidencia;
import com.roy360erick.app.Models.ResponseMessage;
import com.roy360erick.app.Services.IncidenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins="*")
public class IncidenciaController {

    @Autowired
    private IncidenciaService incidenciaService;

    @GetMapping(value = "/incidencia")
    public List<Incidencia> findAll(){
        return incidenciaService.findAll();
    }

    @GetMapping(value = "/incidencia/{id}")
    public Incidencia findById(@PathVariable Long id ){
        return incidenciaService.findById(id);
    }
    @PostMapping(value = "/incidencia")
    public ResponseMessage create(@RequestBody Incidencia incidencia){
        return incidenciaService.insert(incidencia);
    }

    @PutMapping(value = "/incidencia")
    public ResponseMessage update(@RequestBody Incidencia incidencia){
        return incidenciaService.update(incidencia);
    }

    @DeleteMapping(value = "/incidencia/{id}")
    public ResponseMessage delete(@PathVariable Long id){
        return incidenciaService.delete(id);
    }
}
