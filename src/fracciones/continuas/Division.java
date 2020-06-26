package fracciones.continuas;

public class Division {

    Lista miLista;

    public Division() {
        miLista = new Lista();
    }

    public void proceso(int dividendo, int divisor) {
        String space = "";

        if ((dividendo % divisor) == 0) {

            space += "    ";
            System.out.println(space + dividendo);
            System.out.println(dividendo);
            miLista.insertar(dividendo);

        } else {

            System.out.println(dividendo + "/" + divisor);
            System.out.println(space + (dividendo / divisor) + " + 1");
            space += "    ";
            System.out.println(space + "------");

            proceso(divisor, (dividendo % divisor));
            System.out.println(dividendo / divisor);
            miLista.insertar(dividendo / divisor);

        }

    }

    public double calcularResultado() {
        double x = 0;
        Nodo recorrido = miLista.inicio;
        while (recorrido.siguiente != null) {

            System.out.println("----------------------------------");
            System.out.println("Este es x anterior: "+x);
            
            double elementoLista=0;
            elementoLista = (double) recorrido.informacion;
            System.out.println("Este es el elemento: "+elementoLista);
            System.out.println("Elemento+x: "+(elementoLista+x));
            double a=Math.pow((elementoLista+x), -1);
            double b=(double) recorrido.siguiente.informacion;
            
            System.out.println("Este s a: "+a);
            System.out.println("Este es b: "+b);
            
            x=a+b;
            
            //x = Math.pow((elementoLista+x), -1);//+(double) recorrido.siguiente.informacion;
            System.out.println("Estes es x: "+x);

            
            recorrido = recorrido.siguiente;
            System.out.println("----------------------------------");
        }
        return x;
    }

}
