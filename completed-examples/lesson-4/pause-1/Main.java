class Pet {
    private String name;
    private String species;
    private int energy;
    private int age;   // Pausa 1: nuevo atributo privado

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
        this.energy = 100;
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    // Pausa 1: getter de age
    public int getAge() {
        return age;
    }

    // Pausa 1: setter de age con regla (no acepta edades negativas)
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void play() {
        energy -= 20;
        System.out.println(name + " está jugando. Energía: " + energy);
    }
}

public class Main {
    public static void main(String[] args) {
        Pet myPet = new Pet("Rocky", "perro");
        myPet.setAge(3);
        myPet.setAge(-5);   // se ignora: no cumple la regla
        System.out.println(myPet.getName() + " tiene " + myPet.getAge() + " años");
        myPet.play();
    }
}
