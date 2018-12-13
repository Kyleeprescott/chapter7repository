package examples7;

public class PracticeFoods {
private String typeOfFood;
private double weight;
private double cost;
private String servingSize;

public PracticeFoods(String typeOfFood) {
	super();
	this.typeOfFood = typeOfFood;
}
private int numberOfServings;
private double  numberOfCaloriesPerServing;
public PracticeFoods() {
	super();
}
private String Measurment;
public void display() {
	System.out.println(typeOfFood);
	System.out.println(weight);
	System.out.println(servingSize);
	System.out.println( cost);
	System.out.println(numberOfServings);
	System.out.println(numberOfCaloriesPerServing);
	System.out.println(Measurment);
	
}

	public void cost(){
		double C = cost/numberOfServings;
		System.out.println(C);
		
	}
 public void calories() {
	 double A = numberOfServings* numberOfCaloriesPerServing;
	 System.out.println(A);
	 
 }
 public String gettypeOfFood() {
	 return typeOfFood;
	 
 }
 public void setTypetypeOfFood(String typeOfFood) {
	 this.typeOfFood = typeOfFood;	 
 }
 public double getweight() {
	 return weight ;
	 
 }
 public void setweight(double weight) {
	 this.weight = weight;	 
 }
 public PracticeFoods(String typeOfFood, double weight, double cost, String servingSize, int numberOfServings,
		double numberOfCaloriesPerServing, String measurment) {
	super();
	this.typeOfFood = typeOfFood;
	this.weight = weight;
	this.cost = cost;
	this.servingSize = servingSize;
	this.numberOfServings = numberOfServings;
	this.numberOfCaloriesPerServing = numberOfCaloriesPerServing;
	Measurment = measurment;
}

public double getcost() {
	 return cost;
	 
 }
 public void setcost(double cost) {
	 this.cost =cost;	 
 }
 public String getservingSize() {
	 return servingSize;
	 
 }
 public void setservingSize(String servingSize) {
	 this.servingSize= servingSize;	 
 }
 public int getnumberOfServings() {
	 return numberOfServings;
	 
 }
 public void setnumberOfServings(int numberOfServings) {
	 this.numberOfServings = numberOfServings;	 
 }
 public double getnumberOfCaloriesPerServing() {
	 return numberOfCaloriesPerServing;
	 
 }
 public void setnumberOfCaloriesPerServing(double numberOfCaloriesPerServing) {
	 this.numberOfCaloriesPerServing = numberOfCaloriesPerServing;	 
 }
 public String getMeasurment() {
	 return Measurment;
	 
 }
 public void setMeasurment(String Measurment) {
	 this.Measurment = Measurment;	 
 }
 
}
