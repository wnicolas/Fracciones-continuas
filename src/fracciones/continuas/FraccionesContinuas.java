package fracciones.continuas;

public class FraccionesContinuas {

    public static void main(String[] args) {
//        Lista miLista = new Lista();
//        miLista.insertar(0);
//        miLista.insertar(5);
//        miLista.insertar(2);
//        miLista.insertar(8);
//        miLista.insertar(9);
//        miLista.insertar(4);
//        
//        miLista.mostrarListaAdelante();
//        System.out.println("*****************");
//        miLista.mostrarListaAtras();
        
        
        Division miDivision=new Division();
        miDivision.proceso(197, 29);
        System.out.println("**********************");
        miDivision.miLista.mostrarListaAdelante();
        System.out.println("*****************");
        System.out.println(miDivision.calcularResultado());
        
    }

}
