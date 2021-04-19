
public class Logger implements Observer{

    public void log(String message){

        System.out.println(message);
    }

    @Override
    public void update(FirewallIncident incident) {
        System.out.println("Logger: "+incident);
    }
}
