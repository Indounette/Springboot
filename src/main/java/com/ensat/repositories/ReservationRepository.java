package com.ensat.repositories;
import com.ensat.entities.Reservation;
import org.springframework.data.jpa.repository.*;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}