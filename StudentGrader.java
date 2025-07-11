import java.util.Scanner; //Using th scanner class to allow user input
public class StudentGrader{
	static int score;
static String response = "Yes";
	
public static void main(String[]args){
	while(response.equals("Yes")){
		Scanner scanner = new Scanner(System.in); // Creating object scanner using new and setting keyboard as input
System.out.print("Enter exam score:"); //Prompting user to enter exam score
int score=scanner.nextInt();//Read integer input

if(score<40){
score-=2;
}//using if and -= to subtract two 
score +=5;//adding 5 regardless
 System.out.println("Final exam score:"+ score);



if(score>50){System.out.println("PASS");
}else{System.out.println("fail");
}
String status=(score>80)? "Excellent":(score>60)?"Good":"Needs Improvement";//Using nested ternory operator
System.out.println("Status:"+ status);

int lastDigit = score %10;
switch(lastDigit){
case 0:
case 5: 
System.out.println("NICE ROUND NUMBER!");
break;
case 1:
case 2:
case 3:
case 4:
 System.out.println("Low tail!");
break;
case 6:
case 7:
case 8:
case 9:
System.out.println("High tail!");
break;

}
System.out.print("Would you like to continue:"); //Prompting user to continue
Scanner scanner2 = new Scanner(System.in);
 response = scanner2.nextLine();//Read string input
	}

do{
	System.out.print("Would you like to exit the program ? ");
	Scanner scanner3 = new Scanner(System.in);
	 response = scanner3.nextLine();
}while(!(response.equals("Yes")));
}
}


