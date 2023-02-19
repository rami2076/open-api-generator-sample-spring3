package nxy.non.com.openapigenerator.conto;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import lombok.RequiredArgsConstructor;
import nxy.non.com.openapigenerator.service.Service;
import org.openapitools.api.PetsApi;
import org.openapitools.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequiredArgsConstructor
public class PetsContoller implements PetsApi {

    private final Service service;


    @GetMapping("/pets")
    @Override
    //    private final PetsApi petsApi;
    public ResponseEntity<List<Pet>> listPets(
            @Max(100) @Parameter(name = "limit", description = "How many items to return at one time (max 100)", in = ParameterIn.QUERY) @Valid @RequestParam(value = "limit", required = false) Integer limit
    ) {

        return ResponseEntity.ok().body(List.of());

    }


    @PostMapping("/pets")
    @Override
    public ResponseEntity<Void> createPets() {
        service.create();
        return ResponseEntity.ok().build();
    }

}
