package com.example.RestController;

//import jakarta.validation.Valid;

/*
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.example.config.Bundler;
import com.example.dto.CestaDto;
import com.example.dto.ItemDto;
import com.example.services.CestaService;
import com.example.utils.Constants;

/*

@RestController
@RequestMapping(value = "/ScanAppetite/cesta")
public class CestaController {
    private final CestaService cestaService;
    private final Bundler bundler;
    private final Logger log = LoggerFactory.getLogger(CestaController.class);

    
    @Autowired
    public CestaController(CestaService cestaService,
            Bundler bundler) {
        this.cestaService = cestaService;
        this.bundler = bundler;
    }
*/
    /**
     * Get de  todos los platos de cestas para la cliente.
     * @return CestaDto
     */
    /*public ResponseEntity<CestaDto> getPlato(@RequestParam String mesaId) {
        log.info(bundler.getLogMsg(Constants.CESTA_ALL));
        return ResponseEntity.ok(cestaService.findAllPlatosEnCesta(mesaId));
    }
    


    /**
     * Eliminar de la cesta un artículo
     * @param itemDto Plato id
     */
    //*@DeleteMapping("/delete")
  /*  public void delete(@Valid @RequestBody ItemDto itemDto) {
        log.info(bundler.getLogMsg(Constants.CESTA_DELETE) + itemDto.getItemId());
        try {
            cestaService.delete(itemDto.getItemId());
        } catch (Exception e) {
            log.warn(e.getMessage());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    bundler.getLogMsg(Constants.CESTA_DELETE_DBE));
        }
    }

    }

*/
