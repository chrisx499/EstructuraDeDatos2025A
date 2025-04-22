package Parcial2;


public class Node {
    
    int data;
    String nombre;
    String telefono;
    Node left;
    Node right;

    public Node(int data, String nombre, String telefono) {
        this.data = data;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}
