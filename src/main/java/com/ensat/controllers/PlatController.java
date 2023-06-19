package com.ensat.controllers;

import com.ensat.entities.Plat;
import com.ensat.services.PlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * Plat controller.
 */
@Controller
public class PlatController {
     @Autowired
     private PlatService platService;

   

    /**
     * List all plats.
     *
     * @param model
     * @return
     */
   @GetMapping("/plats")
    public String list(Model model) {
        model.addAttribute("plats", platService.listAllPlats());
        System.out.println("Returning plats:");
        return "plats";
    }

    /**
     * View a specific plat by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping("plat/{id}")
    public String showPlat(@PathVariable Integer id, Model model) {
        model.addAttribute("plat", platService.getPlatById(id));
        return "platshow";
    }

    // Afficher le formulaire de modification du Plat
    @GetMapping("plat/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("plat", platService.getPlatById(id));
        return "platform";
    }

    /**
     * New plat.
     *
     * @param model
     * @return
     */
    @RequestMapping("plat/new")
    public String newPlat(Model model) {
        model.addAttribute("plat", new Plat());
        return "platform";
    }

    /**
     * Save plat to database.
     *
     * @param plat
     * @return
     */
    @RequestMapping(value = "plat", method = RequestMethod.POST)
    public String savePlat(Plat plat) {
        platService.savePlat(plat);
        return "redirect:/plat/" + plat.getId();
    }

    /**
     * Delete plat by its id.
     *
     * @param id
     * @return
     */
    @GetMapping ("plat/delete/{id}")
    public String delete(@PathVariable Integer id) {
        platService.deletePlat(id);
        return "redirect:/plats";
    }

}
