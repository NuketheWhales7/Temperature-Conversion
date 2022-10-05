//Chris Miller Java Program
// This program converts Celsius to Fahrenheit and Fahrenheit to Celsius


package TemperatureConversion;

public class TemperatureConversion {
	public static void main(String[] args)
    {
        double f, c;
        
        System.out.println("Celsius Fahrenheit | Fahrenheit Celsius");
        
      for ( double i=40.0, j=120; i>30.0&&j>=30.0;i--,j-=10)
      {
          f=celsiusToFahrenheit(i);
          c=fahrenheitToCelsius(j);
          System.out.printf("%.1f  %.1f | %.1f  %.2f\n", i,f, j, c);
      }
      
   }
    public static double celsiusToFahrenheit(double celsius)
    {
        return (9.0/5)*celsius+32;
    }
    public static double fahrenheitToCelsius(double fahrenheit)
    {
        return (5.0/9)*(fahrenheit -32);
    }	
	
}
