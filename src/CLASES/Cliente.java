package CLASES;


import java.util.*;

/**
 * 
 */
public class Cliente extends Persona {

    public Integer IdCliente;
    public String Correo;
    public ArrayList<Reserva> reserva = new ArrayList<Reserva>(); 
    public FichaParqueo FichaParqueo;
    public Set<Vehículo> Vehiculo;

     
    public Cliente() {
    }

    public Cliente(Integer IdCliente, String Correo, FichaParqueo FichaParqueo, Set<Vehículo> Vehiculo, String Nombre, String Apellido, String CI, String User, String Pass) {
        super(Nombre, Apellido, CI, User, Pass);
        this.IdCliente = IdCliente;
        this.Correo = Correo;
        this.FichaParqueo = FichaParqueo;
        this.Vehiculo = Vehiculo;
    }
    
    
       

}