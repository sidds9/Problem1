/**
 * @author Sheraz Siddiqi
 */

public class Main {
    public static void main(String[] args) {
        AmerPlug AmerPlug = new Amer120Plug();
        EuOutlet eSocket = new EuOutlet();
        EuPlug EPlug = new EuroAdapter(AmerPlug);


        eSocket.plugIN(EPlug);
    }
}