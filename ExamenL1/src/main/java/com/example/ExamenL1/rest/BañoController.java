package com.example.ExamenL1.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.ExamenL1.model.Baño;
import com.example.ExamenL1.services.IBañoServicio;

@RestController
public class BañoController {
	
	@Autowired
	IBañoServicio BañoServicio;
	
	public BañoController( IBañoServicio BañoServicio) {
        this.BañoServicio = BañoServicio;
    }

    @GetMapping("/Bans")
    public List<Baño> getAll() {
        return BañoServicio.GetAllBaño();
    }

    @GetMapping("/Ban/{id}")
    public Baño getHab(@PathVariable int id) {
        return BañoServicio.findBañById(id);
    }

    @PostMapping("/Ban")
    public Baño saveBañ(@RequestBody Baño entity) {
        return BañoServicio.saveBañ(entity);
    }

    @PutMapping("/BanUpd/{id}")
    public Baño putBañ(@PathVariable int id, @RequestBody Baño entity) {
        return BañoServicio.updateBañ( id, entity);
    }

    @DeleteMapping("/BanDele/{id}")
    public void delBañ(@PathVariable int id) {
    	BañoServicio.deleteBañ(id);
    }
}
