package br.com.ddtechrj.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ddtechrj.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
