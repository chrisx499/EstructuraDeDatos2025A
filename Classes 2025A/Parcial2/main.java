package Parcial2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        int salir = 0;
        int i = 3;
        int j = 2;
        int op, op2, numagen, numagen2, numagen3, k;
        String nombres[] = new String[5];
        String numeros[] = new String[5];
        String nombrecont, numerocont, nombrecont2, numerocont2;

        nombres[0] = "andres";
        nombres[1] = "jhonatan";
        nombres[2] = "carlos";
        numeros[0] = "3888746399";
        numeros[1] = "3228493766";
        numeros[2] = "3778364736";

        Agenda tree = new Agenda();

        tree.insert(new Node(3,"carlos","377 8364736"));
        tree.insert(new Node(1,"andres","388 8746399"));
        tree.insert(new Node(2,"jhonatan","322 8493766"));

        while(salir!=4) {
            System.out.println("\nMENU\n");
            System.out.println("1.Agregar contacto");
            System.out.println("2.Buscar contacto");
            System.out.println("3.Mostrar todos los contactos");
            System.out.println("4.Salir\n");
            System.out.print("Ingrese el numero de la opcion que desea: ");
            Scanner sc1 = new Scanner (System.in);
            op = sc1.nextInt();
            System.out.print("\n");

            switch(op) {
                case 1:
                System.out.print("Ingrese el nombre del contacto: ");
                Scanner sc2 = new Scanner (System.in);
                nombrecont = sc2.nextLine();
                System.out.print("Ingrese el numero del contacto: ");
                numerocont = sc2.nextLine();
                i++;
                j++;
                nombres[j] = nombrecont;
                tree.insert(new Node(i, nombrecont, numerocont));
                break;

                case 2:
                System.out.println("1.Buscar por nombre");
                System.out.println("2.Buscar por numero telefonico");
                System.out.println("3.Buscar por numero de registro en la agenda\n");
                System.out.print("Ingrese el numero de la opcion que desea: ");
                Scanner sc3 = new Scanner (System.in);
                op2 = sc3.nextInt();
                System.out.print("\n");

                switch(op2) {
                    case 1:
                    System.out.print("Ingrese el nombre del contacto: ");
                    Scanner sc5 = new Scanner (System.in);
                    nombrecont2 = sc5.nextLine();
                    k = 0;
                    while(k<4) {
                        if(nombrecont2.equals(nombres[k])) {
                            numagen2 = k + 1;
                            tree.search(numagen2);
                            k = 4;
                        }
                        k++;
                    }
                    break;

                    case 2:
                    System.out.print("Ingrese el nombre del contacto: ");
                    Scanner sc6 = new Scanner (System.in);
                    numerocont2 = sc6.nextLine();
                    k = 0;
                    while(k<4) {
                        if(numerocont2.equals(numeros[k])) {
                            numagen3 = k + 1;
                            tree.search(numagen3);
                            k = 4;
                        }
                        k++;
                    }
                    break;

                    case 3:
                    System.out.print("Ingrese el numero de registro del contacto en la agenda: ");
                    Scanner sc4 = new Scanner (System.in);
                    numagen = sc4.nextInt();
                    tree.search(numagen);
                    break;
                }
                break;

                case 3:
                tree.display();
                break;

                case 4:
                salir = 4;
                break;
            }
        }

    }
}
  