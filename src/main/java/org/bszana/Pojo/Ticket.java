package org.bszana.Pojo;


public class Ticket {
	
	private long ID;
	private String Name;
	private String Beschreibung;
	
	public Ticket() {}
	
	public Ticket(String name,String beschreibung) {
		this.setName(name);
		this.setBeschreibung(beschreibung);
	}
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBeschreibung() {
		return Beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		Beschreibung = beschreibung;
	}
	
}
