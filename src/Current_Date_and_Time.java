import java.time.*;
public class Current_Date_and_Time {
    public static void main(String[] args) {
        System.out.println("");
        LocalDate current = LocalDate.now();
        LocalTime current1 = LocalTime.now();
        System.out.println("The Current Date is: " + current);
        System.out.println("The Current Time is: " + current1);
        System.out.println("");
    }
}