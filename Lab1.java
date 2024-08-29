
public class Lab1 {
    public static void main(String[] args) {
        BancoDePalabras miBanco = new BancoDePalabras("otras palabras");
        String respuesta = miBanco.dameUnaPalabra();
        System.out.println(respuesta);
    }
}
