package org.bszana.service;

import java.util.ArrayList;
import java.util.List;

import org.bszana.Pojo.Ticket;
import org.springframework.stereotype.Service;

@Service
public class DataService {

		private List<Ticket> tickets;
		
		public DataService() {
			initiateData();
		}
		
		private void initiateData() {
			this.tickets = new ArrayList<Ticket>();
			this.tickets.add(new Ticket(1,"ISSUE#234","Fehler in der Anzeige"));
			this.tickets.add(new Ticket(2,"ISSUE#212","Fehler Berechnung"));
			this.tickets.add(new Ticket(3,"ISSUE#200","Bug speichern Anzeige A"));
			this.tickets.add(new Ticket(4,"ISSUE#2341","Program stürzt ab"));
		}
		
		public List<Ticket> getTickets(){
			return tickets;
		}
		
		public void addTicket(Ticket t) {
			this.tickets.add(t);
		}
		
		public void deleteTicket(Ticket t) {
			this.tickets.removeIf(x->x.getID() == t.getID());
		}
}
