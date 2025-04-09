import io.Console;
import services.SneakerService;
import services.WhiskeyService;

public class App {
    private SneakerService sneakerService = new SneakerService();
    private WhiskeyService whiskeyService = new WhiskeyService();

    public static void main(String... args) {
        App application = new App();
        application.init();
        application.printMainMenu();
    }
    Console console = new Console();


    public void init(){
        Console.printWelcome();
    }

    public void printMainMenu(){
        console.mainMenu();
    }

    public void addNewProducts(){
        console.updateUser("Which product (1) Sneaker or (2) Whiskey");

    }

    public SneakerService getSneakerService() {
        return sneakerService;
    }

    public void setSneakerService(SneakerService sneakerService) {
        this.sneakerService = sneakerService;
    }

    public WhiskeyService getWhiskeyService() {
        return whiskeyService;
    }

    public void setWhiskeyService(WhiskeyService whiskeyService) {
        this.whiskeyService = whiskeyService;
    }
}
