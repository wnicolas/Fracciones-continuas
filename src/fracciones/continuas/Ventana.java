/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fracciones.continuas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Cristian Ovalles
 */
public class Ventana extends JFrame {

    public JPanel panel;
    public JLabel label;
    public JLabel label2;
    public JLabel label3;
    public JLabel label4;
    public JLabel label5;
    public JTextField Texto;
    public JTextField Texto2;
    public JButton boton;
    public JTextArea TextoArea;
    public JTextArea TextoArea2;
    public JTextArea TextoArea3;
    public JScrollPane scrollVentana;

    public Ventana() {
        this.setSize(700, 700);
        //setLocation(200,200);
        //setBounds(400, 200, 600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this.getContentPane().setBackground(Color.BLUE);
        iniciarComponentes();
        setTitle("Fracciones Continuas");
    }

    private void iniciarComponentes() {

        colocarPanel();
        colocarEtiqueta();
        colocarCajaDeTexto();
        colocarBoton();

    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }

    private void colocarEtiqueta() {
        JLabel etiqueta = new JLabel("Ingrese el primer número: ");
        etiqueta.setBounds(30, 10, 200, 30);
        etiqueta.setFont(new Font("Cooper black", 0, 12));
        panel.add(etiqueta);

        JLabel etiqueta2 = new JLabel("Ingrese el segundo número: ");
        etiqueta2.setBounds(250, 10, 200, 30);
        etiqueta2.setFont(new Font("Cooper black", 0, 12));
        panel.add(etiqueta2);

    }

    private void colocarCajaDeTexto() {
        Texto = new JTextField();
        Texto.setBounds(30, 50, 150, 30);
        panel.add(Texto);

        Texto2 = new JTextField();
        Texto2.setBounds(250, 50, 200, 30);
        panel.add(Texto2);
        
        

    }

    private void colocarBoton() {
        boton = new JButton("Comenzar");
        boton.setBounds(150, 100, 150, 40);
        boton.setFont(new Font("arial", 0, 15));
        panel.add(boton);

        label = new JLabel();
        label.setBounds(50, 200, 300, 40);
        //label.setFont(new Font("arial",1,20));
        panel.add(label);

        label2 = new JLabel();
        label2.setBounds(50, 250, 300, 40);
        //label.setFont(new Font("arial",1,20));
        panel.add(label2);
        
        label3 = new JLabel("La lista es: ");
        label3.setBounds(50,150, 300, 40);
        //label.setFont(new Font("arial",1,20));
        panel.add(label3);

        TextoArea = new JTextArea();
        TextoArea.setBounds(50, 200, 300, 450);
        panel.add(TextoArea);

        scrollVentana = new JScrollPane(TextoArea);
        scrollVentana.setBounds(50, 200, 300, 450);
        scrollVentana.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS); 
        scrollVentana.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); 
        panel.add(scrollVentana);
        
        label4 = new JLabel("El resultado es: ");
        label4.setBounds(400,150, 300, 40);
        //label.setFont(new Font("arial",1,20));
        panel.add(label4);
        
        TextoArea2 = new JTextArea();
        TextoArea2.setBounds(400, 200, 200, 40);
        panel.add(TextoArea2);
        
        label5 = new JLabel("La lista es: ");
        label5.setBounds(400,250, 300, 40);
        //label.setFont(new Font("arial",1,20));
        panel.add(label5);
        
        TextoArea3 = new JTextArea();
        TextoArea3.setBounds(400, 300, 200, 40);
        panel.add(TextoArea3);
        ////

        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Division miDivision = new Division();
                miDivision.proceso(Integer.parseInt(Texto.getText()), Integer.parseInt(Texto2.getText()),TextoArea);
                System.out.println("**********************");
                miDivision.miLista.mostrarListaAtras(TextoArea3);
                System.out.println("*****************");
                System.out.println(miDivision.calcularResultado());

               // TextoArea.setText(miDivision.proceso(Integer.parseInt(Texto.getText()), Integer.parseInt(Texto2.getText())));
                //TextoArea.setText(Integer.parseInt(miDivision.proceso(Texto.getText()), Integer.parseInt(Texto2.getText())));
                TextoArea2.setText(Double.toString(miDivision.calcularResultado()));

                //label2.setText(miDivision.miLista.mostrarListaAdelante());
            }
        };
        boton.addActionListener(oyenteDeAccion);
    }

    /*
    
    ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
        colocarRadioBotones();
        colocarCajaDeTexto();
        colocarAreaDeTexto();
        colocarListaDesplegables();
    private void colocarPaneles()
    {
        panel=new JPanel();
        //panel.setBackground(Color.yellow);
        panel.setLayout(null);//desactivamos el diseño
        this.getContentPane().add(panel);        //agregamos el panel a la ventana
        
    }
    
    private void colocarEtiquetas(){
        JLabel etiqueta=new JLabel();//centro de la etiqueta JLabel etiqueta=new JLabel("Holi",SwingConstants.CENTER);
        etiqueta.setText("Holi");
        etiqueta.setBounds(10,10,50,20);//posición y tamaño etiqueta
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//Establecer posición de la etiqueta
        etiqueta.setForeground(Color.blue);//color de la etiqueta 
        etiqueta.setOpaque(true);//pintar fondo de la etiqueta
        etiqueta.setBackground(Color.yellow);//color de fondo de la etiqueta
        etiqueta.setFont(new Font("chiller",Font.ITALIC,20));//Establecer fuente del texto
        panel.add(etiqueta);//agregamos al panel
        
        //Etiqueta 2
        ImageIcon imagen=new ImageIcon("Holi.jpg");
        JLabel etiqueta2=new JLabel();// label con imagen JLabel etiqueta2=new JLabel(new ImageIcon("Holi.jpg"));
        etiqueta2.setBounds(10, 80, 300, 300);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }
    
    private void colocarBotones()
    {
        JButton boton1=new JButton("clic");        
        boton1.setBounds(100, 400, 70, 30);//tamaño
        boton1.setEnabled(true);//habilitar o inhabilitar 
        boton1.setMnemonic('a');//establecer control con otra letra para que se presione
        boton1.setForeground(Color.BLUE);//color boton
        boton1.setFont(new Font("cooper black",Font.BOLD,16));//Fuente del botón
        panel.add(boton1);        
        
        //Boton imagen
        JButton boton2=new JButton(); 
        boton2.setBounds(100,450,100,40);
        ImageIcon clicAqui=new ImageIcon("boton.jpg");
        boton2.setIcon(new ImageIcon(clicAqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        //boton2.setBackground(Color.yellow);
        panel.add(boton2);
    }
    
    private void colocarRadioBotones()
    {
        JRadioButton radioBoton1=new JRadioButton("Opcion 1",true);
        radioBoton1.setBounds(100, 500, 100, 50);
        panel.add(radioBoton1);
        
        JRadioButton radioBoton2=new JRadioButton("Opcion 2",false);
        radioBoton2.setBounds(100, 550, 100, 50);
        panel.add(radioBoton2);
        
        ButtonGroup grupoRadioBotones=new ButtonGroup();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
    }
    
    private void colocarCajaDeTexto()
    {
        JTextField cajaTexto=new JTextField();
        cajaTexto.setBounds(300, 400, 150, 30);
        cajaTexto.setText("");
        //System.out.println("");
        System.out.println("El text Field es: "+cajaTexto.getText());
        panel.add(cajaTexto);
    }
    
    private void colocarAreaDeTexto()
    {
        JTextArea areaTexto=new JTextArea();
        areaTexto.setBounds(300,450,300,200);
        areaTexto.setText("Escriba el texto aqui");
        areaTexto.append("\n holiiiii");//Se escribe más texto
        areaTexto.setEditable(true);//editar el área de texto
        System.out.println("El texto es: "+areaTexto.getText());
        panel.add(areaTexto);
    }
    
    private void colocarListaDesplegables()
    {
        String [] paises={"Colombia","Brasil","USA"};
        JComboBox listaDespegable=new JComboBox(paises);
        listaDespegable.setBounds(500,200,100,30);
        listaDespegable.addItem("Inglaterra");//Añadir objetos
        listaDespegable.setSelectedItem("Inglaterra");
        panel.add(listaDespegable);
    }*/
}
