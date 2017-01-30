/**
 * 
 * @author Chris Daly
 * @version 27/01/2017
 * This class is the Value Object class which creates the four variables used in the calculations.
 */
public class Value {
	
	public double np;
	public double il;
	public double di;
	public double pv;
	
	
	public Value(double pv, double np, double il, double di){
		setPv(pv);
		setNp(np);
		setIl(il);
		setDi(di);
		
		
	}
	
	/**
	 * This is a constructor for value.
	 */
	public Value (){
		
	}
	
	/**
	 * The following methods are the getter and setter methods for the Value class.
	 * @return
	 */
	
	public double getPv() {
		return pv;
	}
	public void setPv(double pv) {
		this.pv = pv;
	}
	public double getNp() {
		return np;
	}
	public void setNp(double np) {
		this.np = np;
	}
	public double getIl() {
		return il;
	}
	public void setIl(double il) {
		this.il = il;
	}
	public double getDi() {
		return di;
	}
	public void setDi(double di) {
		this.di = di;
	}
	
	
	

}
