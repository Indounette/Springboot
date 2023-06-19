package com.ensat.services;

import com.ensat.entities.Reservation;

public interface  ReservationService {


        Iterable<Reservation> listAllReservations();

        Reservation getReservationById(Integer id);

        Reservation saveReservation(Reservation reservation);

        void deleteReservation(Integer id);

    }


