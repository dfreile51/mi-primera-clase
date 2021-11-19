public class Telefono {
    
    // El due�o del tel�fono
    private String dueno;
    // Cantidad de la memoria del tel�fono
    private int cantidadDeMemoria;
    // Encendido o apagado del tel�fono
    private boolean telefonoEncendido;
    
    
    public Telefono(String nombreDueno, int cantidadMemoria) {
        dueno = nombreDueno;
        cantidadDeMemoria = cantidadMemoria;
        telefonoEncendido = false;
    }
    
    public void aumentoMemoria(int cantidadDeAumento) {
        cantidadDeMemoria = cantidadDeMemoria + cantidadDeAumento;
    }
    
    public void apretarBotonEncendido() {
        if (telefonoEncendido == false) {
            telefonoEncendido = true;
        }
        else {
            telefonoEncendido = false;
        }
    }
    
    public void setDueno(String nuevoDueno) {
        dueno = nuevoDueno;
    }
    
    public void imprimirInformacion () {
        if (telefonoEncendido == true) {
            System.out.println("Due�o: "+ dueno + " | Cantidad de memoria: " + cantidadDeMemoria + " | Encendido: si");
        }
        else {
           System.out.println("Due�o: "+ dueno + " | Cantidad de memoria: " + cantidadDeMemoria + " | Encendido: no"); 
        }
    }
    
    public String getEstado() {
        String estado;
        String encendido;
        if (telefonoEncendido == true) {
            encendido = "si";
        }
        else {
           encendido = "no";
        }
        estado = ("Due�o: "+ dueno + " | Cantidad de memoria: " + cantidadDeMemoria + " | Encendido: " + encendido);
        return estado;
    }
    
    public boolean getEncendido() {
        return telefonoEncendido;
    }
     
    public int getCantidadMemoria() {
        return cantidadDeMemoria;
    }
    
    public String getDueno() {
        return dueno;
    }
}