package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import javax.swing.JOptionPane;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
	    try {
	        File file = new File(mappe + filnavn);
	        PrintWriter writer = new PrintWriter(new FileWriter(file, StandardCharsets.UTF_8));

	        String content = samling.toString();

	        writer.println(content);

	        writer.close();
	        
	    } catch (Exception e) {
	        e.printStackTrace(); // Use proper error handling, print the exception stack trace
	    return false;
	    }
	    return true;
	}
}
