package Animals;

import Animals.Animal;

public class Donkey extends Animal implements Pet{
    @Override
    public void makenoise(){
        System.out.println("Eeyore");
    }
    @Override
    public void fetch(){
        System.out.println("No");
    }

}
