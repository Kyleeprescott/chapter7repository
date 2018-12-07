package examples7;
import java.util.Scanner;
public class NumberAnalyzer {

	public static void main(String[] arrs) {
		java.util.Scanner input = new java .util.Scanner(System.in);
		System.out.println("Enter the number of items:");
		int n= input.nextInt();
		
		double[]numbers = new double [n] ;
		double sum = 0;
		System.out.println("Enter the numbers:");
		for (int i = 0; i<n; i++) {
			numbers[i]= input.nextDouble();
			sum +=numbers[i];
			
		}
		double average= sum /numbers .length ;
		int lower =0;
		int high=0;
		
		for(double element:numbers) {
			if (element <average) {
				lower++;
			}
			else {
				high++;
			}
		}

		double min = numbers[0];
		double max = numbers[0];
		
		for (double element:numbers) {
			if (element >max) {
	
	 max = element  ;
		
			}
		if (element<min) {
			
			 min= element;
			 
			
		}
		
			
		}
System.out.println(min);
System.out.println(max);
System.out.println(average);
double mean= numbers[0];

for(double element:numbers) {
	if (element <average) {
		lower++;
	}
	else {
		high++;
	}
}
 
 
	
double mode = numbers[0];
for (int i = 0; i < numbers .length; ++i) {
    int count = 0;
    for (int j = 0; j < numbers .length; ++j) {
        if (numbers[j] == numbers[i]) ++count;
    }
    if (count > max) {
        max= count;
        max = numbers[i];
    }
}
int median = numbers.length/2;
if (numbers.length%2 == 1) {
    double x =  numbers[median];
} else {
    double x =  (numbers[median-1] + numbers[median]) / 2.0;
}
System.out.println("The Mode is" +mode);
System.out.println("The median is " +median);

}

		
	}


