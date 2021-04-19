import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Firewall extends Thread {
    private List<Observer> observers;
    private FirewallIncident[] possibleIncident = EnumSet.allOf(FirewallIncident.class).toArray((new FirewallIncident[0]));
    private  Random fate = new Random();

    public Firewall() {

        observers = new ArrayList<>();
    }

    public void run(){

        startFirewall();
    }

    public void startFirewall(){
        for(;;){
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(2));
                FirewallIncident justNow
                        = possibleIncident[fate.nextInt(200) % possibleIncident.length];
                notifyObservers(justNow);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void attach(Observer observer){

        observers.add(observer);
    }
    public void detach(Observer observer){

        observers.remove(observer);
    }
    public void notifyObservers(FirewallIncident incident){
        for(Observer o : observers){
            o.update(incident);
        }
    }
}
