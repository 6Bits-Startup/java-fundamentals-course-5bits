class Pet {
    // ----- Atributos: lo que la mascota TIENE (privados) -----
    private String name;
    private String species;
    private int energy;
    private int happiness;

    // ----- Constructor: se ejecuta automáticamente al hacer "new" -----
    public Pet(String name, String species) {
        this.name = name;          // this.name = el atributo del objeto
        this.species = species;    // species = el dato que llega
        this.energy = 100;         // toda mascota nace con energía llena
        this.happiness = 50;
    }

    // ----- Getters: permiten LEER un atributo privado -----
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getEnergy() {
        return energy;
    }

    public int getHappiness() {
        return happiness;
    }

    // ----- Setters con validación: permiten CAMBIAR un atributo, pero con reglas -----
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setEnergy(int energy) {
        this.energy = keepInRange(energy);
    }

    public void setHappiness(int happiness) {
        this.happiness = keepInRange(happiness);
    }

    // Método privado de ayuda: mantiene un valor entre 0 y 100
    private int keepInRange(int value) {
        if (value < 0) {
            return 0;
        }
        if (value > 100) {
            return 100;
        }
        return value;
    }

    // ----- Comportamientos: lo que la mascota HACE -----
    public void play() {
        if (energy < 20) {
            System.out.println(name + " está muy cansado para jugar");
            return;
        }
        setEnergy(energy - 20);
        setHappiness(happiness + 25);
        System.out.println(name + " jugó con la pelota");
    }

    public void eat() {
        setEnergy(energy + 30);
        System.out.println(name + " comió su comida favorita");
    }

    public void sleep() {
        setEnergy(100);
        System.out.println(name + " durmió una siesta");
    }

    public void showStatus() {
        System.out.println("[" + name + " · " + species + "] Energía: " + energy
                + " | Felicidad: " + happiness);
    }
}

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("Rocky", "perro");
        Pet cat = new Pet("Michi", "gato");

        dog.showStatus();
        cat.showStatus();
        System.out.println("---------------------------");

        dog.play();
        dog.play();
        dog.play();
        dog.play();
        dog.play();
        dog.play();   // ya no tiene energía suficiente
        dog.showStatus();
        System.out.println("---------------------------");

        dog.sleep();
        dog.showStatus();

        cat.eat();
        cat.setName("Michifú");
        cat.showStatus();
    }
}
