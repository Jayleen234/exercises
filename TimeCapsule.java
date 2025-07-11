import java.util.*;
import java.time.*;
import java.time.format.*; // importing all necessary packages

public class TimeCapsule{
private String Title;
private String Message;
private String Date;
private String Zone;
private Boolean reminderSet; // declaring all variables as private

public static void main(String [] args){
// IMPRT SCANNER
Scanner scanner = new scanner (System.in);
//CREATING ARRAY LIst
 List <TimeCapsule> capsules = new ArrayList<>();
 System.out.println( " HEY THERE! WELCOME TO THE TIME CAPSULE");
 System.out.println( "How many capsules would you like to set up? ");
int count = Integer.parseInt(sc.nextLine());

// Input loop
for (int i = 0; i < count; i++) {
System.out.println("\nCapsule #" + (i + 1));
System.out.print("Title: ");
String title = sc.nextLine();

System.out.print("Message: ");
String message = sc.nextLine();

System.out.print("Date (yyyy-MM-dd): ");
LocalDate date = LocalDate.parse(sc.nextLine());

System.out.print("Time (HH:mm): ");
LocalTime time = LocalTime.parse(sc.nextLine());

System.out.print("Zone: ");
String zone = sc.nextLine();

System.out.print("Set reminder? (true/false): ");
boolean reminder = Boolean.parseBoolean(sc.nextLine());

capsules.add(new TimeCapsule(title, message, date, time, zone, reminder));
}

// Display all capsules
for (TimeCapsule capsule : capsules) {
System.out.println("\n" + capsule.toFormattedString());

// Show LocalDateTime and ZonedDateTime
ZonedDateTime zdt = ZonedDateTime.of(capsule.getDate(), capsule.getTime(), ZoneId.of(capsule.getZone()));
LocalDateTime ldt = LocalDateTime.of(capsule.getDate(), capsule.getTime());
System.out.println("LocalDateTime: " + ldt);
System.out.println("ZonedDateTime: " + zdt);
}

// Locale formatting
System.out.print("\nChoose a locale (FR or JP): ");
String loc = sc.nextLine();
Locale locale = loc.equalsIgnoreCase("FR") ? Locale.FRANCE : Locale.JAPAN;
DateTimeFormatter localeFormatter = DateTimeFormatter.ofPattern("d MMM yyyy", locale);

System.out.println("Formatted date for first capsule: " +
capsules.get(0).getDate().format(localeFormatter));

// Duration and Period
for (TimeCapsule capsule : capsules) {
LocalDateTime now = LocalDateTime.now();
LocalDateTime target = LocalDateTime.of(capsule.getDate(), capsule.getTime());

Period period = Period.between(now.toLocalDate(), capsule.getDate());
Duration duration = Duration.between(now, target);

System.out.println("\nCapsule: " + capsule.getTitle());
System.out.println("Days remaining: " + period.getDays());
System.out.println("Minutes remaining: " + duration.toMinutes());
}

// Iterator to browse capsules
System.out.println("\n--- Browsing All Capsules ---");
Iterator<TimeCapsule> iterator = capsules.iterator();
while (iterator.hasNext()) {
System.out.println(iterator.next().toFormattedString());
}
}
}


