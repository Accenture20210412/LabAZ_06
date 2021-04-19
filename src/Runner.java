import java.util.concurrent.TimeUnit;

public class Runner {
    public static void main(String[] args){

        Firewall firewall = new Firewall();
        firewall.attach(new Logger());

        Thread thread = new Thread(firewall);
        thread.start();

        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(4));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        firewall.attach(new RiskManager());
    }
}
