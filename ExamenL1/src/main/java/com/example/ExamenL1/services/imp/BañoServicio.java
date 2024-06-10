package com.example.ExamenL1.services.imp;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ExamenL1.IBañoRepository;
import com.example.ExamenL1.model.Baño;
import com.example.ExamenL1.services.IBañoServicio;

@Service
public class BañoServicio implements IBañoServicio {
 
	@Autowired
    IBañoRepository _BañoRepository;


    public BañoServicio(IBañoRepository BañoRepository) {
        _BañoRepository = BañoRepository;
    }

    @Override
    public List<Baño> GetAllBaño() { 
        return _BañoRepository.findAll();
    }

    @Override
    public Baño saveBañ(Baño entity) {
        return _BañoRepository.save(entity);
    }

    @Override
    public Baño findBañById(int id) {
        Optional<Baño> row = _BañoRepository.findById(id);
        if(row.isPresent())
            return row.get();
        return new Baño();
    }

    @Override
    public Baño updateBañ(int id,Baño entity) {
        Optional<Baño> row = _BañoRepository.findById(id);
        if(row.isPresent()) {
        	row.get().setHorario(entity.getHorario());
        	row.get().setTipo(entity.getTipo());
            _BañoRepository.save(row.get());
            return row.get();
        }
        else
        return new Baño();
    }

    @Override
    public void deleteBañ(int id) {
         _BañoRepository.deleteById(id);
    }

}

