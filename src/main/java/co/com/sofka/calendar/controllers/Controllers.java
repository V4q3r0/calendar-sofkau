package co.com.sofka.calendar.controllers;

import co.com.sofka.calendar.model.ProgramDate;
import co.com.sofka.calendar.services.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.LocalDate;

@RestController
@RequestMapping("/api")
public class Controllers {

    @Autowired
    SchedulerService service;

    @GetMapping("/generate")
    public Flux<ProgramDate> generaCalendar(){
        var startDate = LocalDate.of(2022, 1, 1);

        return service.generateCalendar("61b3d87e34ca9d52a0035101", startDate);
    }
}
