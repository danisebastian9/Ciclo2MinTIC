package Model;

public class modelServicios {
    
    public int servicioPub;
    public int estrato;
    public int consumo;
    public double precioUnidad;
    public double desc;
    public double precioNeto;
    public double impuesto;
    public double totalPago;



    public double valorUnidad(int servicioPub){
        if(servicioPub == 1){
            this.precioUnidad = 6200;
        } else if(servicioPub == 2){
            this.precioUnidad = 9256;
        } else if(servicioPub == 3){
            this.precioUnidad = 5234;
        }
        return this.precioUnidad;
    }


    public double totalNeto( int consumo){
        this.precioNeto = valorUnidad(servicioPub) * consumo;
        return this.precioNeto;
    }

    public double descSobr(int estrato){
        if(estrato >= 1 && estrato <= 2){
            this.desc = this.precioNeto * 0.50;
        } else if(estrato >= 3 && estrato <= 4){
            this.desc = this.precioNeto * 0.10;
        } else if(estrato >= 5 && estrato <= 6){
            this.desc = this.precioNeto * 0.25;
        }
        return this.desc;
    }

    public double impuestoDaños(){
        this.impuesto = this.precioNeto * 0.01; 
        return this.impuesto;
    }
    
    public double totalFactura(int estrato){
        if(estrato >= 5 && estrato <= 6){
            this.totalPago = this.precioNeto + this.impuesto + this.desc;
        } else {
            this.totalPago = this.precioNeto + this.impuesto - this.desc;
        }
        return this.totalPago;
    }
    
}
