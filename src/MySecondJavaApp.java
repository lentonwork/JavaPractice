import Animals.Donkey;
import Animals.Panda;
import library.Book;

public class MySecondJavaApp {
    public static void main(String[] args){
        String myname = "Daniel Lenton";
        System.out.println(myname);

        Book dans_fav_book = new Book();

        System.out.println('a');

        Donkey donkey1 = new Donkey();
        donkey1.makenoise();

        Panda panda1 = new Panda();
        panda1.makenoise();

    }
}
