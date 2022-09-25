package rbaliwal00.brewery.services.V2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import rbaliwal00.brewery.web.model.BeerDto;
import rbaliwal00.brewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDtoV2) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
