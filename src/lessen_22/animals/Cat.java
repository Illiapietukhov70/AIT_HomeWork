package lessen_22.animals;

public class Cat extends Animal{
    public void eat (){
        System.out.println("Cat eating");
    }
    public void eat (String food) {
        System.out.println("Cat eating " + food);
    }
    @Override
    public void voice() {
        System.out.println("Miyo");
    }

}
