package org.com.eventos.resources;

import java.util.List;

import javax.validation.Valid;

import org.com.eventos.model.Evento;
import org.com.eventos.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Api(value="Api Rest Eventos")
@RestController
@RequestMapping("/evento")
public class EventoResources {

	@Autowired
	private EventoRepository repository;

	@ApiOperation(value="Retorna uma lista de Eventos")
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public @ResponseBody List<Evento> listaEvento() {
		List<Evento> findAll = repository.findAll();
		return findAll;

	}

	
	@ApiOperation(value="Salva um evento")
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Evento addEvento(@RequestBody @Valid Evento evento) {		
		return repository.save(evento);
	}
	
	@ApiOperation(value="Deleta um evento")
	@RequestMapping(value="/del", method=RequestMethod.DELETE)
    public Evento delEvento(@RequestBody @Valid Evento evento) {
    	repository.delete(evento);
    	return evento;
    }
	
	

}
