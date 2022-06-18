

/**
 *
 * @author Usuario
 */
public class Vendedor {
    public int identificacion;
    public String nombre;
    public String apellido;
    public int edad;
    private int valorVendido;
    public String descripcion;
    public double anioIngreso; 
    public String experiencia;

    public Vendedor(int identificacion, String nombre, String apellido, int edad, String descripcion, double anioIngreso) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.valorVendido = 0;
        this.descripcion = descripcion;
        this.anioIngreso = anioIngreso;
    }
    
    public void setVendido(int valorVendido){
        this.valorVendido = valorVendido;
        }
    
    public String vendido(){
        if (valorVendido == 0 ) {
            experiencia = "Novato";
        } else if (valorVendido > 0 && valorVendido <= 500000000) {
            experiencia = "Principiante";
        } else if (valorVendido > 500000000 && valorVendido <= 2000000000) {
            experiencia = "Intermedio";
        } else if (valorVendido > 2000000000) {
            experiencia = "Avanzado";
        }
        return experiencia;
    }

    public void setAnio(int anioIngreso){
        this.anioIngreso = anioIngreso;
        }
    
    
    
    }
