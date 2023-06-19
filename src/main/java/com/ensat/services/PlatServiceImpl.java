package com.ensat.services;

import com.ensat.entities.Plat;
import com.ensat.repositories.PlatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Plat service implement.
 */
@Service
public class PlatServiceImpl implements PlatService {
     @Autowired
     private PlatRepository platRepository;

    

    @Override
    public Iterable<Plat> listAllPlats() {
        return platRepository.findAll();
    }

    @Override
    public Plat getPlatById(Integer id) {
        return platRepository.findById(id).get();
    }

    @Override
    public Plat savePlat(Plat plat) {
        return platRepository.save(plat);
    }

    @Override
    public void deletePlat(Integer id) {
        platRepository.deleteById(id);
    }

}
