package co.edu.poli.bidge;

public class VentanaFlotante extends Ventana {
    public VentanaFlotante(SistemaOperativo sistemaOperativo) {
        super(sistemaOperativo);
    }
    
    public void mostrar() {
        sistemaOperativo.crearVentana("flotante");
    }
    
    public void ocultar() {
        sistemaOperativo.cerrarVentana("flotante");
    }
    
    public void redimensionar(int ancho, int alto) {
        sistemaOperativo.redimensionarVentana("flotante", ancho, alto);
    }
}

