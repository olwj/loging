import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by RENT on 2017-02-27.
 */
public class System {

    private static final Logger LOGGER = Logger.getAnonymousLogger();

    public System() {
        try {
           LOGGER.addHandler(new FileHandler(pattern:"info.log"));
        }catch (IOException e){
            System.out.println("");;
        }
    }

    public void run() {
        LOGGER.log(Level.FINE, msg:"do run method");
    }
    public System() {
        LOGGER.addHandler(new FileHandler(pattern:"info.log"));
    }

    public void execute(){

    }

    public void exit(){

    }
}
