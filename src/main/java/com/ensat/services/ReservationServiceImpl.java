package com.ensat.services;
import com.ensat.entities.Reservation;
import com.ensat.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;



    @Override
    public Iterable<Reservation> listAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation getReservationById(Integer id) {
        return reservationRepository.findById(id).get();
    }

    @Override
    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(Integer id) {
        reservationRepository.deleteById(id);
    }

}
