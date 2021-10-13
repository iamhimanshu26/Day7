package questions;

//import java.util.logging.Formatter;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Report {
//public class Report {

private double total = 0;
private Formatter fr = new Formatter(System.out);

public void printTitle() {
fr.format("%-15s %5s %10s\n","Book Name","Date of Issue"," Price of Book");
fr.format("%-15s %5s %10s\n","----","---","-----");
// total += price;
}
public void print(String item, String date, double price) {
fr.format("%-15s %5s %10s\n",item, date, price);
total += price;
}
public void printTotal() {
//fr.format("%-15s %5s %10s\n","Tax"," ",total*0.05);
fr.format("%-15s %5s %10s\n","----","---","-----");
fr.format("%-15s %5s %10s\n","Total Price"," ",total);
}
public static void main(String[] args) {
	DateTimeFormatter date= DateTimeFormatter.ofPattern("dd/mm/yyyy");
	LocalDateTime now= LocalDateTime.now();
	
Report r = new Report();
System.out.println("---- Weekly Report ----");
r.printTitle();
r.print("  A", date.format(now), 200);
r.print("  B", date.format(now), 600);
r.print("  C", date.format(now), 100);


r.printTotal();
}

}
//}
