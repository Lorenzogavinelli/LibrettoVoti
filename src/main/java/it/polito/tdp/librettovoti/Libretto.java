package it.polito.tdp.librettovoti;
import java.util.LinkedList;

public class Libretto {
	
	private LinkedList<Voto> voti;
	
	public Libretto() {
		voti = new LinkedList<Voto>();
	}
	
	public void add(Voto v) {
		this.voti.add(v);
	}
	
	@Override
	public String toString() {
		String s = "";
		for(Voto v : this.voti) {
			s = s+v.toString()+"\n";
		}
		return s;
	}
	
	

}
