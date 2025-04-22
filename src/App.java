import javax.sound.midi.SysexMessage;

import controllers.MetodoBinario;
import models.Persona;
import views.showConsole;


public class App {
    public static void main(String[] args)  {
          showConsole mostrar = new showConsole();
        Persona[] personas = MetodoBinario.ingresarPersonas(mostrar);
        MetodoBinario mb = new MetodoBinario( personas);

        MetodoBinario.ordenamiento(personas);
        mostrar.showMessage("Arreglo ordenado:");

        mb.printArray(personas);

        int ageToFind = mostrar.inputAge();
        mb.showPersonByAge(ageToFind);
        
    }
  }
        
        