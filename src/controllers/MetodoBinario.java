package controllers;

import models.Persona;
import views.showConsole;

public class MetodoBinario {
    private showConsole mostrar;
    private Persona[] people;

    public MetodoBinario(Persona[] people) {
        mostrar = new showConsole();
        this.people = people;
    }

    private int findPersonByAge(int age) {
        int bajo = 0;
        int alto = people.length - 1;
        while (alto >= bajo) {
            int central = (alto + bajo) / 2;
            if (people[central].getAge() == age) {
                Array(people);
                System.out.print("Bajo = " + bajo);
                System.out.print("Centro = " + central);
                System.out.println("Alto = " + alto);
                System.out.print("Valor Centro = " + people[central].getAge());
                System.out.println("--> ENCONTRADO");
                System.out.println();
                return central;
            }
            if (people[central].getAge() > age) {
                Array(people);
                System.out.print("Bajo = " + bajo);
                System.out.print("Centro = " + central);
                System.out.println("Alto = " + alto);
                System.out.print("Valor Centro = " + people[central].getAge());
                System.out.println("--> IZQUIERDA");
                alto = central - 1;
                System.out.println();
            } else {
                Array(people);
                System.out.print("Bajo = " + bajo);
                System.out.print("Centro = " + central);
                System.out.println("Alto = " + alto);
                System.out.print("Valor Centro = " + people[central].getAge());
                System.out.println("--> DERECHA");
                bajo = central + 1;
                System.out.println();
            }
        }
        return -1;
    }

    public void showPersonByAge(int ageToFind) {
        int indexPerson = findPersonByAge(ageToFind);
        if (indexPerson >= 0) {
            mostrar.showMessage("La edad de " + ageToFind + " que corresponde al nombre de " + 
            people[indexPerson].getName() + "se encuentra en la posición "
            + indexPerson + " : " + people[indexPerson].toString());
            System.out.println("Realizado por Sebastian Lopez");
        } else {
            mostrar.showMessage("Persona con edad no encontrada.");
        }
    }

    public static void ordenamiento(Persona[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1; j++) {
                if (people[j].getAge() > people[j + 1].getAge()) {
                    Persona temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }

    public void printArray(Persona[] people) {
        for (int i = 0; i < people.length; i++) {
            System.out.print(people[i] + " ");
        }
        System.out.println();
    }

    public void Array(Persona[] people) {
        for (int i = 0; i < people.length; i++) {
            System.out.print(people[i].getAge() + " ");
        }
        System.out.println();
    }

    public static Persona[] ingresarPersonas(showConsole mostrar) {
        int cantidad = mostrar.inputInt("Ingrese la cantidad de personas: ");
        Persona[] personas = new Persona[cantidad];
        for (int i = 0; i < cantidad; i++) {
            mostrar.showMessage("Persona #" + (i + 1));
            String nombre = mostrar.inputString("Nombre: ");
            int edad;
            do {
                edad = mostrar.inputInt("Edad: ");
                if (edad < 0) mostrar.showMessage("La edad no puede ser negativa, ingrese la edad correcta.");
            } while (edad < 0);
            personas[i] = new Persona(edad, nombre);
        }
        return personas;
    }
}