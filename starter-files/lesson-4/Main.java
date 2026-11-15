class Pet {
    // ----- Atributos: lo que la mascota TIENE -----
    private String name;
    private String species;
    private int energy;
    // TODO 1: agrega un atributo privado age (edad) de tipo int

    // ----- Constructor: se ejecuta automáticamente al hacer "new" -----
    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
        this.energy = 100;
    }

    // ----- Getters -----
    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    // TODO 2: crea getAge() que devuelva la edad

    // ----- Setters con reglas -----
    public void setEnergy(int energy) {
        if (energy < 0) {
            this.energy = 0;
        } else if (energy > 100) {
            this.energy = 100;
        } else {
            this.energy = energy;
        }
    }

    // TODO 3: crea setAge(int age) que no acepte edades negativas

    // ----- Comportamientos -----
    public void play() {
        setEnergy(energy - 20);
        System.out.println(name + " está jugando. Energía: " + energy);
    }

    public void eat() {
        setEnergy(energy + 30);
        System.out.println(name + " comió. Energía: " + energy);
    }
}

public class Main {
    public static void main(String[] args) {
        Pet myPet = new Pet("Rocky", "perro");
        Pet otherPet = new Pet("Michi", "gato");

        myPet.play();
        otherPet.eat();

        // TODO 4: dale una edad a cada mascota con setAge y muéstrala con getAge
    }
}
