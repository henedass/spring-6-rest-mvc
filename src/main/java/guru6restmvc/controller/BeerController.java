package guru6restmvc.controller;

import guru6restmvc.model.Beer;
import guru6restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

    public Beer getbeerById(UUID id){
        log.debug("Get Beer by Id - in controller");

        return beerService.getBeerbyId(id);
    }


}
