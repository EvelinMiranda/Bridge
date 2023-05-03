package co.edu.poli.bidge;

public class VentanaDocumento extends Ventana {
    public VentanaDocumento(SistemaOperativo sistemaOperativo) {
        super(sistemaOperativo);
    }
    
    public void mostrar() {
        sistemaOperativo.crearVentana("documento");
    }
    
    public void ocultar() {
        sistemaOperativo.cerrarVentana("documento");
    }
    
    public void redimensionar(int ancho, int alto) {
        sistemaOperativo.redimensionarVentana("documento", ancho, alto);
    }
}

