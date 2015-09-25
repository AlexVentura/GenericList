package main;

import model.structs.LinkedLst;

/**
 *
 * @author LexCovent
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedLst <Integer> lista = new LinkedLst();
        
        lista.addLast(12);
        lista.addLast(90);
        lista.addLast(00);
        lista.addLast(1021);
        lista.addFirst(-222);
        lista.addFirst(-1);
        
        lista.printElements();
        System.out.print("Tamaño = " + lista.getLength());
        
        System.out.println("  Borramos el PRIMER elemento:\n");
        lista.deleteFirst();
        
        lista.printElements();
        System.out.print("Tamaño = " + lista.getLength());
        
        System.out.println("  Borramos el ULTIMO elemento:\n");
        lista.deleteLast();
        
        lista.printElements();
        System.out.print("Tamaño = " + lista.getLength());
        
        int pos = 3;
        System.out.println("  Borramos la POSICION : " + pos + "\n");
        lista.deleteByPosition(pos);
        
        lista.printElements();
        System.out.println("Tamaño = " + lista.getLength());
        
        System.out.print("\nAhora HEAD es : ");
        System.out.println("{" + lista.getHead().getObject().toString() + "}");
        System.out.print("Ahora TAIL es : ");
        System.out.println("{" + lista.getTail().getObject().toString() + "}");
    }
    
}