package examples7;

public class Arrays {

	public static void main(String[] args) {
		String[]gamelist= {"Cover Your Assests", " Super Mario Bros",
				"Apples To Apples","GO Fish",
				" Zelda","Pool", "Cool Math Games",
				"Charads","battleship","Unicorn Race Two"};
		for(int i=0; i<5; i++) {
			

		System.out.println(gamelist[i]);
	}
		for (int b=0; b<3;  b++) {
			System.out.println(gamelist[b]);
			
		}
for (int x=7; x<10; x++) {
	System.out.println(gamelist[x]);
}
for (int y=3; y<8; y++) {
	System.out.println(gamelist[y]);
	
}
double[]nums;
nums = new double[100];
System.out.println(nums[1]);

char[]charlist = new char[20];
System.out.println(charlist[0]);

int []numint = new int[11];
System.out.println(numint[0]);

boolean []boollist = new boolean[10];
System.out.println(boollist[9]);
 for (int i=0; i<100; i++) {
	 nums[i]=Math.random()*100;
	 
 } for (int i=0; i<100; i++) {
System.out.println(nums[i]);

	}
 int x=nums.length;
 System.out.println(x);
 for (int i = 0; i<nums.length; i++) {
	 System.out.println(nums[i]+" ");
 }
 char[]city = {'s','a','l','t',' ','l','a','k','e'};
 System.out.println(city);
 double total=0;
 for (int i= 0; i<nums.length; i++) {
	 total=total+nums[i];
 }
 System.out.println(total);
 int[]myList= new int[10];
 for (int i=0; i<10; i++) {
	 myList[i]=(int) (Math.random()*10); 
 }
for (int i=0; i<10; i++) {
	if (myList[i] ==5) {
		System.out.println("True");
		break;
	}
	else {
		System.out.println("false");
		
	}
}
int min=myList[0];
for(int i=0; i<myList.length; i++) {
	if( myList[i] <min) {
	min= myList[i];
	}
	System.out.println(min);
}
int high = myList[0];
for (int i=0 ; i<myList.length; i++ ) {
	if(myList[i]>high) {
		high = myList[i];
	}
	System.out.println(high);
	
}
for (int i= myList.length -1; i>0; i--) {
	int j=(int)(Math.random()*(i+1));
	int temp = myList[i];
	myList[i]=myList[j];
	myList[j]=temp;
}
for (int i=0; i<10; i++)	{
	System.out.println(myList[i]);
	
}
for (int e:myList){
	System.out.println()
}
}
}