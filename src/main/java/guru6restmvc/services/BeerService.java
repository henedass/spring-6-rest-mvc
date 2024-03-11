package guru6restmvc.services;

import guru6restmvc.model.Beer;

import java.util.UUID;

public interface BeerService {
    Beer getBeerbyId(UUID id);
}
