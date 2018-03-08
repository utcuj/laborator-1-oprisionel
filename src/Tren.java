import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.*;
public class Tren  {
   String Destinatie;
   Time OraPlecarii ;
   String Cod;
   
   public Tren(String Destinatie, String ora, String Cod)
   {
	   this.Destinatie=Destinatie;
	   this.OraPlecarii=Time.valueOf(ora);
	   this.Cod=Cod;
   }
   
   
   public String getDestinatie()
   {
	   return Destinatie;
   }
   
   public String getCod()
   {
	   return Cod;
   }
   public Time getOra()
   {
	   return OraPlecarii;
   }
   public String toString()
   {
	   return("Cod :"+getCod()+" Destinatie :"+getDestinatie()+" Ora plecare "+getOra());
   }
    
   
}

