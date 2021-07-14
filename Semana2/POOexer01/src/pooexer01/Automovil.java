
package pooexer01;


public class Automovil {
    public String marca = "", color, placa, estado;
    public int modelo, ruedas = 0, No_puertas;
    
    public void arrancar(){ // void = metodo no retorna un valor
        if(this.estado.equals("Detenido")){ // this = ubicado sobre la misma clase de este atributo. .equals comparar con string en vez de == 
            System.out.println("Arrancando...");
            this.estado = "En Movimiento";
        } else{
            System.out.println("El auto ya esta en movimiento...");

        }
    }
    
    public int numeroRuedas(){ // int del tipo de dato que va a retornar
        
        return this.ruedas;
    }
    
    public String modificaColor(String color){
        this.color = color;
        return this.color;
    }
}
