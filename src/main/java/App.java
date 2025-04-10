import io.Console;
import lombok.Getter;
import lombok.Setter;
import services.SneakerService;
import services.WhiskeyService;
import utils.CSVUtils;

public class App {
    @Setter
    private SneakerService sneakerService = new SneakerService();
    @Setter
    @Getter
    private WhiskeyService whiskeyService = new WhiskeyService();

    public static void main(String... args) {
//        SneakerService service = new SneakerService();
//        int sneakerService = service.
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
        console.updateUser("Choose a Product to Add. \n" +
                "(1) Sneaker or (2) Whiskey");


    }


}
