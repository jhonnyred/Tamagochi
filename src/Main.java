import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        for(int i=0; i < 1000; i++){
            System.out.println();
        }
        
        // CADASTRANDO ANIMAL
        System.out.print("species: ");
        String species = input.nextLine();
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("age: ");
        int age = input.nextInt();
        input.nextLine();

        // STARTING ANIMATION
        Animation animal = new Animation(name, species, age);
        Thread threadAnimacao = new Thread(animal);
        threadAnimacao.start();

        String choice = "";

        while (animal.checkAlive()){
            choice = input.nextLine();

            switch (choice){
                case "1":
                    animal.changeState(Animation.CurrentState.EATING);
                    animal.feed();
                    break;
                case "2":
                    animal.changeState(Animation.CurrentState.PLAYING);
                    animal.play();
                    break;
                case "3":
                    animal.changeState(Animation.CurrentState.SLEEPING);
                    animal.sleep();
                    break;
                case "4":
                    animal.changeState(Animation.CurrentState.STATUS);
                    break;
            }
        } 

        threadAnimacao.interrupt();
        input.close();

    }
}