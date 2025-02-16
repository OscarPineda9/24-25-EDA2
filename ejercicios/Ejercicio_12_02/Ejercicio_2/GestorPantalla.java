package ejercicios.Ejercicio_12_02.Ejercicio_2;

public class GestorPantalla {
    private PantallaEntrelazada pantalla;
    public GestorPantalla(Dimension dimension) { pantalla = new PantallaEntrelazada(dimension); }
    public void establecerPixel(Coordenada c, int color) { pantalla.establecerPixel(c, color); }
    public void renderizar() { pantalla.renderizar(); }
}