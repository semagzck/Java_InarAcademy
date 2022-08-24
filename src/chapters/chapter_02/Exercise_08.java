public class Exersice_08 {
public static void main(String[] args) {
 
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the time zone offset to GMT:");
  int offset = input.nextInt();
  // calculate offset in seconds
  offset = offset * 60 * 60;
 
  // Obtain the total milliseconds since midnight, Jan 1, 1970
  long totalMilliseconds = System.currentTimeMillis();
 
  // Obtain the total seconds since midnight, Jan 1, 1970 and apply the offset
  long totalSeconds = (totalMilliseconds / 1000) + offset;
 
  // Compute the current second in the minute in the hour
  long currentSecond = totalSeconds % 60;
 
  // total minutes
  long totalMinutes = totalSeconds / 60;
 
  //  current minute in the hour
  long currentMinute = totalMinutes % 60;
 
  //  total hours
  long totalHours = totalMinutes / 60;
 
  
  long currentHour = totalHours % 24;
 
  
  System.out.println("Current time is " + currentHour + ":"
    + currentMinute + ":" + currentSecond );
 }
}
