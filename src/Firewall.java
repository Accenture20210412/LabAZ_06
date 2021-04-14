import java.util.EnumSet;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Firewall {
    private FirewallIncident[] possibleIncident = EnumSet.allOf(FirewallIncident.class).toArray((new FirewallIncident[0]));

    private  Random fate = new Random();

    private Logger logger = new Logger();

    public void startFirewall(){
        for(;;){
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(2));
                FirewallIncident justNow
                        = possibleIncident[fate.nextInt(200) % possibleIncident.length];
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void attach(Observer observer){

    }
    public void detach(Observer observer){

    }
    public void notifyObservers(){

    }
}
