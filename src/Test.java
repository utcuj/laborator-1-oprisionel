import java.sql.Time;
import java.util.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {

	public static void main(String args[]) {
		
		Gara gara1=new Gara();
	
		
		Tren t1=new Tren("Berlin", "10:01:00", "AC1");
		Tren t2=new Tren("Munchen ","05:01:00","AC2");
		Tren t3=new Tren("Frankfurt","16:01:00","AC3");
		Tren t4=new Tren("Dusseldorf","10:31:00","AC4");
		Tren t5=new Tren("Koln","13:01:00","AC5");
		gara1.listaTrenuri.add(t1);
		gara1.listaTrenuri.add(t2);
		gara1.listaTrenuri.add(t3);
		gara1.listaTrenuri.add(t4);
		gara1.listaTrenuri.add(t5);
		
	    Collections.sort(gara1.listaTrenuri,new SortingTest());
	    GUI2 window = new GUI2(gara1);
	    window.main(args);
	    gara1.afiseazaTrenuri();
	   
	    
	    
	}

}
