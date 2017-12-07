package org.bszana.Controller;

import java.util.Date;
import java.util.List;

import org.bszana.Pojo.Ticket;
import org.bszana.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
	
	
	@Autowired
	DataService dataService;
	
	@RequestMapping("/tickets")
	@CrossOrigin
	public List<Ticket> getTickets()
	{		
		return dataService.getTickets();		
	}
	
	@RequestMapping(value="/addTicket",method=RequestMethod.POST)
	@CrossOrigin
	public void addTicket(@RequestBody Ticket ticket) {		
		ticket.setID(new Date().getTime());
		dataService.addTicket(ticket);
	}
	
	
}
