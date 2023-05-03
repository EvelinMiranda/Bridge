package co.edu.poli.bidge;

public abstract class Ventana {
    protected SistemaOperativo sistemaOperativo;
    
    public Ventana(SistemaOperativo sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    
    public abstract void mostrar();
    
    public abstract void ocultar();
    
    public abstract void redimensionar(int ancho, int alto);
}
