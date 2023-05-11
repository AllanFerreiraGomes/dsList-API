package com.devSuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devSuperior.dslist.dto.GameMinDTO;
import com.devSuperior.dslist.entities.Game;
import com.devSuperior.dslist.repositories.GameRepository;

@Component  //Registra componentes 
public class GameService {
 
		@Autowired
		private GameRepository gameRepository;	/* injetando uma instancia do game repository*/
		
	 public List<GameMinDTO> finfAll(){
		 List<Game> result =  gameRepository.findAll();
		 List<GameMinDTO> dto = result.stream().map( x -> new GameMinDTO(x)).toList();
		 return dto;
	 }
}
