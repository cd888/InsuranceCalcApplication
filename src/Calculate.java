import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 * @author Chris Daly
 * @version 27/01/2017
 *
 * This class calculates and displays the Premium Value
 */
public class Calculate {
	
	/**
	 * This method is the main method in which the values are stored, calculated, 
	 * sorted and then displayed.
	 * @param args
	 */
	public static void main(String[] args) {
		
	ArrayList <Value> iList = new ArrayList<>();
	
	DecimalFormat df1 = new DecimalFormat(".#");
		
	Value v1 = new Value(0, 7, 13, 11);
	v1.pv = (v1.np + v1.il) - v1.di;
	Value v2 = new Value(0, 22.2, 2, 1.5);
	v2.pv = (v2.np + v2.il) - v2.di;
	Value v3 = new Value(0, 4, 6.2, 4);
	v3.pv = (v3.np + v3.il) - v3.di;
	Value v4 = new Value(0, 56.3, 120, 50);
	v4.pv = (v4.np + v4.il) - v4.di;
	Value v5 = new Value(0, 67, 34, 12.1);
	v5.pv = (v5.np + v5.il) - v5.di;
	Value v6 = new Value(0, 56, 32, 11);
	v6.pv = (v6.np + v6.il) - v6.di;
	Value v7 = new Value(0, 99, 99, 45);
	v7.pv = (v7.np + v7.il) - v7.di;
	
    iList.add(v1);
    iList.add(v2);
    iList.add(v3);
    iList.add(v4);
    iList.add(v5);
    iList.add(v6);
    iList.add(v7);
    
    Collections.sort(iList, new Comparator<Value>(){
    	
    	public int compare (Value v1, Value v2){
    		return Double.valueOf(v1.pv).compareTo(v2.pv);
    	}
    });
    
    for (int i = 0; i<iList.size(); i++){
    	
    	System.out.println(df1.format(iList.get(i).getPv()) + " PV = " + iList.get(i).getNp() + " NP + " + iList.get(i).getIl() + " IL - " + iList.get(i).getDi() + " DI");
    	
    }
	
		
	}

}
