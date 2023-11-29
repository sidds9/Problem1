/**
 * @author Sheraz Siddiqi
 */

//Constructor
public class EuroAdapter implements EuPlug {
    private AmerPlug plug;
    public EuroAdapter(AmerPlug plug){
        this.plug = plug;
    }

    //Override Method used
    @Override
    public void givePower(){
        plug.power();
    }
}
