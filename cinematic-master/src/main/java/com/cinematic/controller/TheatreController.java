package com.cinematic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinematic.model.Theatre;
import com.cinematic.service.TheatreService;

import java.util.List;

@RestController
public class TheatreController {
    private TheatreService theatreService;

    @Autowired
    public TheatreController(TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    @GetMapping("/theatres")
    public List<Theatre> getAllTheatres() {
        return theatreService.getAllTheatres();
    }
}
