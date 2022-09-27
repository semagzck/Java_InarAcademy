package chapter_06;

public class Exercise_08 {
   System.out.println("Celsius    Fahrenheit   |   Fahrenheit   Celsius");
      
       for(
    double c = 40.0, f = 120;
    c >=31;c--,f -=10)

    {
        System.out.printf("%-11.1f%-13.1f|%9.1f%13.2f\n", c,
                celsiusToFahrenheit(c), f, fahrenheitToCelsius(f));
    }
}
