import java.util.Comparator;

public class SortingTest implements Comparator<Tren> {

	
	public int compare(Tren t1, Tren t2) {
		
		return t1.OraPlecarii.compareTo(t2.OraPlecarii);

	}
}
