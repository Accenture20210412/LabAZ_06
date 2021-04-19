
public class RiskManager implements Observer{

    @Override
    public void update(FirewallIncident incident) {
        System.out.println("RiskManager: risk level "+incident.getValue());
    }
}
