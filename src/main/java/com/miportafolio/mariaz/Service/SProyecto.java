package com.miportafolio.mariaz.Service;

import com.miportafolio.mariaz.Entity.Proyecto;
import com.miportafolio.mariaz.Repository.RProyecto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;


@Service
@Transactional
public class SProyecto {
    @Autowired
     RProyecto rProyecto;
     
     public List<Proyecto> list(){
         return rProyecto.findAll();
     }
     
     public Optional<Proyecto> getOne(int id){
         return rProyecto.findById(id);
     }
     
     public Optional<Proyecto> getByNombreP(String nombreP){
         return rProyecto.findByNombreP(nombreP);
     }
     
     public void save(Proyecto proyecto){
         rProyecto.save(proyecto);
     }
     
     public void delete(int id){
         rProyecto.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rProyecto.existsById(id);
     }
     
     public boolean existsByNombreP(String nombreP){
         return rProyecto.existsByNombreP(nombreP);
     }
}
