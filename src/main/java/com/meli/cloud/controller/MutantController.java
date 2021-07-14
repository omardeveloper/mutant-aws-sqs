package com.meli.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.meli.cloud.service.MutantService;
import com.meli.cloud.service.RedisService;
import com.meli.cloud.service.SqsSender;

import javax.websocket.server.PathParam;
import java.util.Map;

@RestController
@RequestMapping("/mutant")
public class MutantController {

	@Autowired
	MutantService mutantService;

	@GetMapping("/hola")
    public String saludar() {
        return "Hola Javero Omar !!!";
    }	
	
	@PostMapping("/meli")
	public ResponseEntity isMutant(@RequestBody Map<String, String[]> data) {
		return mutantService.isMutant(data.get("dna")) ? new ResponseEntity(HttpStatus.OK)
				: new ResponseEntity(HttpStatus.FORBIDDEN);
	}

	@GetMapping("/stats")
	public ResponseEntity stats() {
		return new ResponseEntity<>(mutantService.stats(), HttpStatus.OK);
	}
	
	@GetMapping("/allDna")
	public ResponseEntity findAll() {
		return new ResponseEntity<>(mutantService.findAll(), HttpStatus.OK);
	}

}
