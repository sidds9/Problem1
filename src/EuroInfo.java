/**
 * @author Sheraz Siddiqi
 */
public class EuroInfo {
    int Leads;
    int Voltage;

    //Constructor
    public EuroInfo(int Leads , int Voltage){
        this.Leads = Leads;
        this.Voltage = Voltage;
    }
    public int getLeads(){
        return Leads;
    }
    public void setLeads(int Leads){
        this.Leads = Leads;
    }
    public int getVoltage(){
        return Voltage;
    }
    public void setVoltage(int Voltage){
        this.Voltage = Voltage;
    }
}
