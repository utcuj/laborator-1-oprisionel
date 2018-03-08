import java.util.*;

public class Gara {

	 
	String nume;
	ArrayList<Tren> listaTrenuri=new ArrayList<Tren>();
	public ArrayList<Tren> getTrenuriGara(){
		return this.listaTrenuri;
	}
	
	
	
	public void afiseazaTrenuri()
	{
		for(Tren trenuri:listaTrenuri)
		{
			System.out.println(trenuri.toString());
		}
	}
	
	 
	
}

