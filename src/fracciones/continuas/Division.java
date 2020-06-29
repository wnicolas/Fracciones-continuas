package fracciones.continuas;

import javax.swing.JTextArea;

public class Division {

    Lista miLista;
    public int contador = 0;
    String space = "";
    Boolean entro = false;
    int resultado=0;

    public Division() {
        miLista = new Lista();
    }

    public String proceso(int dividendo, int divisor, JTextArea t1) {

        

        if ((dividendo % divisor) == 0) {

            if (entro == true) {
                space += "    ";
                t1.append(space + dividendo + "\n");
                System.out.println(space + dividendo);
                //t1.append(" | "+dividendo);
                System.out.println(dividendo);
                miLista.insertar(dividendo);
                System.out.println("noooo");
                //Ventana.TextoArea.setText(space+Integer.parseInt(dividendo));
                return space;
            } else {
                t1.append(dividendo + "/" + divisor + "\n");
                System.out.println(dividendo + "/" + divisor);
               // t1.append(space + (dividendo / divisor) + " + 1" + "\n");
                System.out.println(space + (dividendo / divisor) + " + 1");
                space += "    ";
                //t1.append(space + "------" + "\n");
                System.out.println(space + "------");

                t1.append(space+dividendo / divisor + " ");
                System.out.println(dividendo / divisor);
                miLista.insertar(dividendo / divisor);

                return space;
            }
        }
            //contador++;
        else {
            entro = true;
            t1.append(dividendo + "/" + divisor + "\n");
            System.out.println(dividendo + "/" + divisor);
            t1.append(space + (dividendo / divisor) + " + 1" + "\n");
            System.out.println(space + (dividendo / divisor) + " + 1");
            space += "    ";
            t1.append(space + "------" + "\n");
            System.out.println(space + "------");

            proceso(divisor, (dividendo % divisor), t1);
            //t1.append("La lista de los números es \n");
            //t1.append(dividendo / divisor+" | ");
            System.out.println(dividendo / divisor);
            miLista.insertar(dividendo / divisor);

            System.out.println("prueba " + entro);
            return space;

            // }
        }

        //return space;
    }

    public double calcularResultado() {
        float x = 0;
        Nodo recorrido = miLista.inicio;
        while (recorrido.siguiente != null) {

            if (x == 0) {
                //System.out.println("----------------------------------");
                // System.out.println("Este es x anterior: " + x);

                float elementoLista = 0;
                elementoLista = (float) recorrido.informacion;
                //System.out.println("Este es el elemento: " + elementoLista);
                //System.out.println("Elemento+x: " + (elementoLista + x));
                float a = (float) Math.pow((elementoLista + x), -1);
                float b = (float) recorrido.siguiente.informacion;

                //System.out.println("Este s a: " + a);
                //System.out.println("Este es b: " + b);
                x = (float) a + b;

                //x = Math.pow((elementoLista+x), -1);//+(double) recorrido.siguiente.informacion;
                //System.out.println("Estes es x: " + x);
                recorrido = recorrido.siguiente;
                resultado=1;
                //System.out.println("----------------------------------");
            } else {
                //System.out.println("----------------------------------");
                //System.out.println("Este es x anterior: " + x);

                float elementoLista = 0;
                elementoLista = (float) recorrido.informacion;
                //System.out.println("Este es el elemento: " + elementoLista);
                //System.out.println("Elemento+x: " + (elementoLista + x));
                float a = (float) Math.pow((x), -1);
                float b = (float) recorrido.siguiente.informacion;

                //System.out.println("Este s a: " + a);
                //System.out.println("Este es b: " + b);
                x = (float) a + b;

                //x = Math.pow((elementoLista+x), -1);//+(double) recorrido.siguiente.informacion;
                // System.out.println("Estes es x: " + x);
                recorrido = recorrido.siguiente;
                // System.out.println("----------------------------------");
            }
        }
        while (recorrido.siguiente == null)
        {
            if(resultado==0)
            {
                float elementoLista = 0;
                elementoLista = (float) recorrido.informacion;
                //System.out.println("Este es el elemento: " + elementoLista);
                //System.out.println("Elemento+x: " + (elementoLista + x));
               // float a = (float) Math.pow((elementoLista + x), -1);
                float b = (float) recorrido.informacion;

                //System.out.println("Este s a: " + a);
                //System.out.println("Este es b: " + b);
                x =  b;
                break;
            }
            else
            {
                break;
            }
        }
        
        return x;
    }

}
