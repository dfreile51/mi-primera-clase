public class Telefono {
    
    // El dueño del teléfono
    private String dueño;
    // Cantidad de la memoria del teléfono
    private int cantidadDeMemoria;
    // Encendido o apagado del teléfono
    private boolean telefonoEncendido;
    
    
    public Telefono(String nombreDueño, int cantidadMemoria, boolean encendidoApagado) {
        dueño = nombreDueño;
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
        System.out.println("Dueño: "+ dueño + " | Cantidad de memoria: " + cantidadDeMemoria + " | Encendido: " + telefonoEncendido);
    }
    
    public boolean getEncendido() {
        return telefonoEncendido;
    }
}