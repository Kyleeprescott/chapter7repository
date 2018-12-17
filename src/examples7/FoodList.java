package examples7;

public class FoodList {

	public static void main(String[] args) {
		PracticeFoods Milk = new PracticeFoods("Dairy",1.0, 2.92,"6 ounce cup", 20, 150, "Gallons");
		PracticeFoods Oreos =  new PracticeFoods("Snack");
		PracticeFoods Yogurt = new  PracticeFoods();
		PracticeFoods ProteinSmoothie = new PracticeFoods();
		PracticeFoods Cheezits = new PracticeFoods();
		PracticeFoods MacAndCheese = new PracticeFoods();
		 

		
		Oreos.setTypetypeOfFood("Snack");
		Oreos.setcost(3);
		Oreos.weight = 14.5;
		Oreos.Measurment="Grams";
		Oreos.servingSize= " 6 Cookies";
		Oreos.numberOfServings = 15;
		Oreos.numberOfCaloriesPerServing = 140;
		
		
		Yogurt.typeOfFood = "Dairy";
		Yogurt.weight = 500;
	    Yogurt.Measurment="Gram";
	    Yogurt.cost = 4;
		Yogurt.servingSize= " 1/2 Cup ";
		Yogurt.numberOfServings = 4;
		Yogurt.numberOfCaloriesPerServing = 110;
		
		
		ProteinSmoothie.typeOfFood = "Drink";
		ProteinSmoothie.cost = 3.92;
		ProteinSmoothie.weight = 12;
		ProteinSmoothie.Measurment="ounce ";
		ProteinSmoothie.servingSize= " 1 12 ounce bottle ";
		ProteinSmoothie.numberOfServings = 1;
		ProteinSmoothie.numberOfCaloriesPerServing = 160;
		
		
		
		Cheezits.typeOfFood = "Snack";
		Cheezits.cost = 4.99;
		Cheezits.weight = 48;
		Cheezits.Measurment="ounce ";
		Cheezits.servingSize= " 27 Crackers ";
		Cheezits.numberOfServings = 6;
		Cheezits.numberOfCaloriesPerServing = 150;
		
		MacAndCheese.typeOfFood = "Pasta";
		MacAndCheese.cost = 1.99;
		MacAndCheese.weight = 2.5;
		MacAndCheese.Measurment="ounce ";
		MacAndCheese.servingSize= " 1/3 of The box ";
		MacAndCheese.numberOfServings = 3;
		MacAndCheese.numberOfCaloriesPerServing = 400;
		
		
		
		
		Milk.display();
		 Oreos .display();
		 Yogurt .display();
		 ProteinSmoothie .display();
		 Cheezits .display();
		 MacAndCheese .display();


			Milk.cost();
			 Oreos .cost();
			 Yogurt .cost();
			 ProteinSmoothie .cost();
			 Cheezits .cost();
			 MacAndCheese .cost();
		
			
		
		
			
		
			
		
			 
		
		
		
		
		
		
		
		
		
		

	}

}
