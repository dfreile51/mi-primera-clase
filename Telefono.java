public class Telefono {
    
    // El due�o del tel�fono
    private String due�o;
    // Cantidad de la memoria del tel�fono
    private int cantidadDeMemoria;
    // Encendido o apagado del tel�fono
    private boolean telefonoEncendido;
    
    
    public Telefono(String nombreDue�o, int cantidadMemoria, boolean encendidoApagado) {
        due�o = nombreDue�o;
        cantidadDeMemoria = cantidadMemoria;
        telefonoEncendido = encendidoApagado;
    }
    
    public int aumentoMemoria(int cantidadDeAumento) {
        cantidadDeMemoria = cantidadDeMemoria + cantidadDeAumento;
        return cantidadDeMemoria;
    }
    
    public boolean apretarBotonEncendido(boolean apretarBoton) {
        telefonoEncendido = apretarBoton;
        return telefonoEncendido;
    }
    
    public void imprimirInformacion () {
        System.out.println("Due�o: "+ due�o + " | Cantidad de memoria: " + cantidadDeMemoria + " | Encendido: " + telefonoEncendido);
    }
    
    public boolean getEncendido() {
        return telefonoEncendido;
    }
}