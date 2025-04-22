package views;

import java.util.Scanner;

public class showConsole {
    private Scanner scanner;
    public showConsole(){
        this.scanner = new Scanner(System.in);
        showBanner();
    }

    public void showBanner (){
        System.out.println("Método Binario");        
    }

    public int inputAge(){
        System.out.print("Ingrese la edad de la persona que desea buscar: ");
        int age = scanner.nextInt();
        System.out.println();
        return age;
    }

    public String inputName(){
        System.out.print("Ingrese un nombre: ");
        System.out.println();
        String name = scanner.next();
        return name;
    }

    public void showMessage (String message){
        System.out.println(message);
    }

    public int inputInt(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }
    
    public String inputString(String mensaje) {
        System.out.print(mensaje);
        return scanner.next();
    }
    
}
    