package br.com.ddtechrj.hrworker.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ddtechrj.hrworker.entities.Worker;
import br.com.ddtechrj.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping("/workers")
public class WorkerResource {
	
	@Autowired
	WorkerRepository repository; 
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll(){ 
		List<Worker> list = repository.findAll(); 
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) { 
		Optional<Worker> worker = repository.findById(id); 
		return ResponseEntity.ok().body(worker.get());
	}

}
