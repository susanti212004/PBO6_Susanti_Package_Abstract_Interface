import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Laptop thinkpad = new Lenovo();
        LaptopUser Nick = new LaptopUser(thinkpad);
        Laptop Satellit = new Toshiba();
        LaptopUser Matt = new LaptopUser(Satellit);
        Laptop Air = new MacBook();
        LaptopUser Chris = new LaptopUser(Air);       

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. ON - Turn On Laptop");
            System.out.println("2. OFF - Turn Off Laptop");
            System.out.println("3. UP - Increase Volume");
            System.out.println("4. DOWN - Decrease Volume");
            System.out.println("5. EXIT - Exit Program");
            System.out.print("Enter your choice: ");
            String input = scanner.nextLine();
            
            switch (input.toUpperCase()) {
                case "ON":
                Nick.turnOnLaptop();
                Matt.turnOnLaptop();
                Chris.turnOnLaptop();
                System.out.println("==============================");
                break;
                case "OFF":
                Nick.turnOffLaptop();
                Matt.turnOffLaptop();
                Chris.turnOffLaptop();
                System.out.println("==============================");
                break;
                case "UP":
                Nick.makeLaptopLouder();
                Matt.makeLaptopLouder();
                Chris.makeLaptopLouder();
                System.out.println("==============================");
                break;
                case "DOWN":
                Nick.makeLaptopSilence();
                Matt.makeLaptopSilence();
                Chris.makeLaptopSilence();
                System.out.println("==============================");
                break;
                case "EXIT":
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}