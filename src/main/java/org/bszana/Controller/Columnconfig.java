package org.bszana.Controller;

import java.util.ArrayList;
import java.util.List;

import org.bszana.Pojo.Column;
import org.bszana.Pojo.Ticket;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Columnconfig {

	@RequestMapping("/columnconfig")
	@CrossOrigin
	public List<Column> getTickets()
	{		
		List<Column> columnConfig = new ArrayList<Column>();
		columnConfig.add(new Column("id","id",true,true,"100px"));
		columnConfig.add(new Column("Beschreibung","Beschreibung",true,true,"100px"));
		return columnConfig;		
	}
}
