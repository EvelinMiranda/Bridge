package co.edu.poli.bidge;

public class VentanaDialogo extends Ventana {
    public VentanaDialogo(SistemaOperativo sistemaOperativo) {
        super(sistemaOperativo);
    }
    
    public void mostrar() {
        sistemaOperativo.crearVentana("dialogo");
    }
    
    public void ocultar() {
        sistemaOperativo.cerrarVentana("dialogo");
    }
    
    public void redimensionar(int ancho, int alto) {
        sistemaOperativo.redimensionarVentana("dialogo", ancho, alto);
    }
}

