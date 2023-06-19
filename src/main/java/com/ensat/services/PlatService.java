package com.ensat.services;

import com.ensat.entities.Plat;

public interface PlatService {

    Iterable<Plat> listAllPlats();

    Plat getPlatById(Integer id);

    Plat savePlat(Plat plat);

    void deletePlat(Integer id);

}
