package com.ensat.controllers;

import com.ensat.entities.Reservation;
import com.ensat.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * Reservation controller.
 */
@Controller
public class ReservationController {
    @Autowired
    private ReservationService reservationService;



    /**
     * List all reservations.
     *
     * @param model
     * @return
     */
    @GetMapping("/reservations")
    public String list(Model model) {
        model.addAttribute("reservations", reservationService.listAllReservations());
        System.out.println("Returning reservations:");
        return "reservations";
    }

    /**
     * View a specific reservation by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping("reservation/{id}")
    public String showReservation(@PathVariable Integer id, Model model) {
        model.addAttribute("reservation", reservationService.getReservationById(id));
        return "reservationshow";
    }

    // Afficher le formulaire de modification du Reservation
    @GetMapping("reservation/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("reservation", reservationService.getReservationById(id));
        return "reservationform";
    }

    /**
     * New reservation.
     *
     * @param model
     * @return
     */
    @RequestMapping("reservation/new")
    public String newReservation(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "reservationform";
    }

    /**
     * Save reservation to database.
     *
     * @param reservation
     * @return
     */
    @RequestMapping(value = "reservation", method = RequestMethod.POST)
    public String saveReservation(Reservation reservation) {
        reservationService.saveReservation(reservation);
        return "redirect:/reservation/" + reservation.getId();
    }

    /**
     * Delete reservation by its id.
     *
     * @param id
     * @return
     */
    @GetMapping ("reservation/delete/{id}")
    public String delete(@PathVariable Integer id) {
        reservationService.deleteReservation(id);
        return "redirect:/reservations";
    }

}
