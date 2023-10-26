package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	
	public Innlegg[] samling;
	public int antall;
	

	public Blogg() {	
		int startStørrelse= 20;
		samling = new Innlegg[startStørrelse];
		antall = 0;
	}

	public Blogg(int lengde) {
	
		samling = new Innlegg[lengde];
		antall = 0;
		
	}

	public int getAntall() {
		return antall;
	}
	
	public Innlegg[] getSamling() {
	
		return samling;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < antall; i++) {
			if(samling[i].erLik(innlegg)) {
				return i;
				}
			}
		return -1;
		}
			
	public boolean finnes(Innlegg innlegg) {
		
		for (int i = 0; i < antall; i++) {
			if(samling[i] != null && samling[i].equals(innlegg))
			return true;
		}
			return false;
		}
		


	public boolean ledigPlass() {
		
		return antall<samling.length;

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if(antall == samling.length) {
			Innlegg [] nyTab = new Innlegg[2*samling.length];
			for (int i = 0; i < antall; i++) {
				
				nyTab[i] = samling[i];
			}
			samling = nyTab;
		}
		samling[antall] = innlegg;
		antall++;
		return true;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("2");
		sb.append("\n");
		for (int i = 0; i < antall; i++) {
		
			sb.append(samling[i].toString());
			
		}
		return sb.toString();
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
	
		Innlegg[] nyTab = new Innlegg[2*samling.length];
		for (int i = 0; i < antall; i++) {
			nyTab[i] = samling[i];
		}
		samling = nyTab;
	}
	
	
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		for (int i = 0; i < antall; i++) {
			if(antall <samling.length || samling[i].ikkeLik(innlegg)) {
				}
			
			else if(antall == samling.length || samling[i].ikkeLik(innlegg)) {
				utvid();
			}	
		}
		antall++;
		samling[antall] = innlegg; 
		return true;
	}
	
	public boolean slett(Innlegg innlegg) {
	    int fjerneIndex = -1;

	    for (int i = 0; i < antall; i++) {
	        if (samling[i].equals(innlegg)) {
	            fjerneIndex = i;
	            break;
	        }
	    }
	    
	    if (fjerneIndex != -1) {
	        for (int i = fjerneIndex; i < antall - 1; i++) {
	            samling[i] = samling[i + 1];
	        }
	        antall--;
	        return true; 
	    } else {
	        return false; 
	    }
	}

	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}