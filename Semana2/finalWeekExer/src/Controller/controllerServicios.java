package Controller;

import Model.modelServicios;
import View.viewServicios;

public class controllerServicios {

    public int servicioPub;
    public int estrato;
    public int consumo;
    public double precioUnidad;

    viewServicios vS = new viewServicios();
    modelServicios mS = new modelServicios();
    
    public void control(){
        this.servicioPub = vS.capturarServPub();
    }
    
}
