import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class WeatherApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        WeatherAPI weatherAPI = new WeatherAPI();
        int choice;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Get weather");
            System.out.println("2. Get Wind Speed");
            System.out.println("3. Get Pressure");
            System.out.println("0. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    getWeather(weatherAPI, scanner);
                    break;
                case 2:
                    getWindSpeed(weatherAPI, scanner);
                    break;
                case 3:
                    getPressure(weatherAPI, scanner);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void getWeather(WeatherAPI weatherAPI, Scanner scanner) {
        System.out.print("Enter the date (format: yyyy-MM-dd HH:mm:ss): ");
        String date = scanner.next();
        double temperature = weatherAPI.getTemperature(date);
        System.out.println("Temperature on " + date + ": " + temperature + " K");
    }

    private static void getWindSpeed(WeatherAPI weatherAPI, Scanner scanner) {
        System.out.print("Enter the date (format: yyyy-MM-dd HH:mm:ss): ");
        String date = scanner.next();
        double windSpeed = weatherAPI.getWindSpeed(date);
        System.out.println("Wind Speed on " + date + ": " + windSpeed + " m/s");
    }

    private static void getPressure(WeatherAPI weatherAPI, Scanner scanner) {
        System.out.print("Enter the date (format: yyyy-MM-dd HH:mm:ss): ");
        String date = scanner.next();
        double pressure = weatherAPI.getPressure(date);
        System.out.println("Pressure on " + date + ": " + pressure + " hPa");
    }
}

class WeatherAPI {

    private String apiKey = "YOUR_API_KEY"; // Replace with your actual API key

    public double getTemperature(String date) {
        // Implement the logic to fetch temperature from the API based on the date
        String apiUrl = "https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=" + apiKey;
        // Use the apiUrl and date to fetch the relevant temperature data
        // Parse the JSON response and extract the temperature value
        // For the sake of example, I'm returning a constant value here
        return 278.76;
    }

    public double getWindSpeed(String date) {
        // Implement the logic to fetch wind speed from the API based on the date
        String apiUrl = "https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=" + apiKey;
        // Use the apiUrl and date to fetch the relevant wind speed data
        // Parse the JSON response and extract the wind speed value
        // For the sake of example, I'm returning a constant value here
        return 1.6;
    }

    public double getPressure(String date) {
        // Implement the logic to fetch pressure from the API based on the date
        String apiUrl = "https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=" + apiKey;
        // Use the apiUrl and date to fetch the relevant pressure data
        // Parse the JSON response and extract the pressure value
        // For the sake of example, I'm returning a constant value here
        return 1031.934;
    }
}
