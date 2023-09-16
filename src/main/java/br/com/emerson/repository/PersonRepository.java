package br.com.emerson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.emerson.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}