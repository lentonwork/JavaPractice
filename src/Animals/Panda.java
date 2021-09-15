package Animals;

import Animals.Animal;

public class Panda extends Animal implements Wild {
    @Override
    public void makenoise(){
        System.out.println("I like Bamboo");
    }

    @Override
    public void roar(){
        System.out.println("Im sleepy");
    }
}
