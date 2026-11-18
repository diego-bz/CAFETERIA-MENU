package org.example;
import java.util.HashSet;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        int banderita = 0;
        while (opc != 2) {
            System.out.println("*** FLASH ORDER ***" + "\n");
            System.out.println("=== BIENVENIDO ===");
            System.out.println("1. Iniciar sesión\n2. Crear cuenta\n0. Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Iniciar sesión");
                    sc.nextLine();
                    System.out.println("Ingresa el nombre de usuario / Nickname: ");
                    String username = sc.nextLine();
                    System.out.println("Ingresa tu contraseña:");
                    String password = sc.nextLine();
                    banderita = 1;
                    break;
                case 2:
                    System.out.println("Ingresa el nombre de usuario:  ");
                    String newuser = sc.nextLine();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    banderita = 1;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
            if(banderita == 1)
                break;
        }

    }
}


