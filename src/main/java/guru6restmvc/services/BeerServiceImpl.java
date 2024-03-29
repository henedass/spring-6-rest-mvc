package guru6restmvc.services;

import guru6restmvc.model.Beer;
import guru6restmvc.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service

public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerbyId(UUID id) {

        log.debug("Get Beer Id - in service. Id" + id.toString());
        return Beer.builder()
                .id(id)
                .version(1)
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("123456")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(122)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

    }
}
