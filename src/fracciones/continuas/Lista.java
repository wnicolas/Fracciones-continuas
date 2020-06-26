package fracciones.continuas;

public class Lista {

    Nodo inicio;
    Nodo fin;

    public Lista() {
        inicio = null;
        fin = null;
    }

    public void insertar(int informacion) {//Este método ordena la lista de fin hacia inicio
        Nodo nuevo = new Nodo(informacion);
        if (inicio == fin && inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
//            inicio.anterior=nuevo;
//            nuevo.siguiente=inicio;
//            inicio=nuevo;

            fin.siguiente = nuevo;
            nuevo.anterior = fin;
            fin = nuevo;
        }
    }

    public void mostrarListaAdelante() {
        Nodo recorrido = inicio;
        while (recorrido != null) {
            System.out.println(recorrido.informacion);
            recorrido = recorrido.siguiente;
        }
    }

    public void mostrarListaAtras() {
        Nodo recorrido = fin;
        while (recorrido != null) {
            System.out.println(recorrido.informacion);
            recorrido = recorrido.anterior;
        }
    }

}
