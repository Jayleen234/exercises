import java.util.Scanner;// word analyzer challenge by Jay
public class Jay{
public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter your full name");
	String name = scanner.nextLine();
	name = name.trim();
	name = name.toLowerCase(); // making word lowercase
	String[] words = name.split(" "); // splitting the name entered
	for(String word:words){
		System.out.println(word);
	}//using for to split the string words to singular words and print new line
	
	String word1=words[0];
	System.out.println(word1.length()); // printing out result of length given
	if(word1.contains("a")){
		System.out.println(word1.indexOf("a"));	
	}
		word1.startsWith("j");
		word1.endsWith("g");
		
		System.out.println(String.valueOf(word1.length())); 
		
	Scanner scanner2 = new Scanner(System.in);
	System.out.println("Please enter your parent's first name");
	String name2 = scanner2.nextLine();
if (word1.compareTo(name2)<0){
System.out.println("Second word comes before first");
}
else{
	System.out.println("Second word comes after first");
};
boolean b = word1.intern()==name2.intern(); // basically checking if the values are equal to each other bruhhhhhh
System.out.println(String.format("Thank You %s for using the program",name));

 // making name.length mean same as name.split
 System.out.println ("There are " + words.length + " words");

   String name4 = (String.join(" , ",words)); // Joining name3 together
    System.out.println(name4);

     System.out.println(word1.compareTo(name2)+name2.compareTo("Jayleen")); // comparing word1 to  name 2 and Jayleen then printing

if ( word1.compareTo(name2)+name2.compareTo("Jayleen") > 0){
	System.out.println ("You have the bigger name ");
}else {
	System.out.println("Parent name is bigger.THATS WHY THEIR IN CHARGE!);
}
}
}