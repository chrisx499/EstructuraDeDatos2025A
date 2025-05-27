package ActividadS3;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

      int salir = 0;
      int op, estc1, estc2;
      Graph graph = new Graph(5); 
      
      graph.addNode(new Node('A'));
      graph.addNode(new Node('B'));
      graph.addNode(new Node('C'));
      graph.addNode(new Node('D'));
      graph.addNode(new Node('E'));

      graph.addEdge(0, 1);
      graph.addEdge(1, 2);
      graph.addEdge(2, 3);
      graph.addEdge(2, 4);
      graph.addEdge(4, 0);
      graph.addEdge(4, 2);

      while(salir != 4) {
        System.out.println("\nMENU\n");
        System.out.println("1. Imprimir tabla de conexiones");
        System.out.println("2. Ver si existe un camino entre 2 estaciones");
        System.out.println("3. Ver si 2 estaciones son vecinas");
        System.out.println("4. breadthFirstSearch");
        System.out.println("5. Salir");
        System.out.println("");

        Scanner sc1 = new Scanner (System.in);
        op = sc1.nextInt();

        switch(op) {
          
          case 1:
          graph.print();
          break;

          case 2:
          System.out.println("1.Estacion A");
          System.out.println("2.Estacion B");
          System.out.println("3.Estacion C");
          System.out.println("4.Estacion D");
          System.out.println("5.Estacion E");
          System.out.print("Ingrese el numero de la primera estacion: ");
          Scanner sc2 = new Scanner (System.in);
          estc1 = sc2.nextInt();
          estc1 = estc1 - 1;
          System.out.print("Ingrese el numero de la segunda estacion: ");
          Scanner sc3 = new Scanner (System.in);
          estc2 = sc3.nextInt();
          estc2 = estc2 - 1;

          if(graph.checkEdge(estc1, estc2) == true) {
            System.out.println("Existe un camino entre estas 2 estaciones");
          } else {
            System.out.println("No Existe un camino entre estas 2 estaciones");
          }
          break;

          case 3:
          System.out.println("1.Estacion A");
          System.out.println("2.Estacion B");
          System.out.println("3.Estacion C");
          System.out.println("4.Estacion D");
          System.out.println("5.Estacion E");
          System.out.print("Ingrese el numero de la primera estacion: ");
          Scanner sc4 = new Scanner (System.in);
          estc1 = sc4.nextInt();
          estc1 = estc1 - 1;
          System.out.print("Ingrese el numero de la segunda estacion: ");
          Scanner sc5 = new Scanner (System.in);
          estc2 = sc5.nextInt();
          estc2 = estc2 - 1;
          if(graph.areNeighbors(estc1, estc2) == true) {
            System.out.println("Estas estaciones son vecinas");
          } else {
            System.out.println("Estas estaciones no son vecinas");
          }
          break;

          case 4:
          graph.breadthFirstSearch(1);
          break;

          case 5:
          salir = 5;
          break;
        }
      }
    }
}
