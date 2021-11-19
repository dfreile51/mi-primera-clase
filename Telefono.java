public class Telefono {
    
    // El dueño del teléfono
    private String dueno;
    // Cantidad de la memoria del teléfono
    private int cantidadDeMemoria;
    // Encendido o apagado del teléfono
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
            System.out.println("Dueño: "+ dueno + " | Cantidad de memoria: " + cantidadDeMemoria + " | Encendido: si");
        }
        else {
           System.out.println("Dueño: "+ dueno + " | Cantidad de memoria: " + cantidadDeMemoria + " | Encendido: no"); 
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
        estado = ("Dueño: "+ dueno + " | Cantidad de memoria: " + cantidadDeMemoria + " | Encendido: " + encendido);
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