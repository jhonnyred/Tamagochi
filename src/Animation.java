public class Animation extends Tamagochi implements Runnable{
    private int count = 0;
    private volatile CurrentState state = CurrentState.VIBING;
    public Animation(String name, String species, int age){
        super(name, species, age);
    }

    public void clearScreen(){
        for(int i=0; i < 1000; i++){
            System.out.println();
        }
    }

    public void run(){
        while (Thread.currentThread().isInterrupted() != true){
            switch(state){
                // JUST VIBING
                case VIBING:
                    clearScreen();
                    System.out.println("      " +this.name+ "\n\n");
                    System.out.println("      /\\_/\\  (");
                    System.out.println("     ( °.° ) _)");
                    System.out.println("       \\ /( (");
                    System.out.println("     ( | | )_)");
                    System.out.println("    (__d b__)");
                    System.out.println("\nEnergy: " +this.energy+ "  Happiness: " +this.happiness);
                    System.out.println("\nFeed      1");
                    System.out.println("Play      2");
                    System.out.println("Sleep     3");
                    System.out.println("Status    4");

                    try{
                        Thread.sleep(1500);
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                        break;
                    }
                    clearScreen();
                    System.out.println("      " +this.name+ "\n\n");
                    System.out.println("      /\\_/\\ _");
                    System.out.println("     ( °.° ) )");
                    System.out.println("       \\ /( (");
                    System.out.println("     ( | | )_)");
                    System.out.println("    (__d b__)");
                    System.out.println("\nEnergy: " +this.energy+ "  Happiness: " +this.happiness);
                    System.out.println("\nFeed      1");
                    System.out.println("Play      2");
                    System.out.println("Sleep     3");
                    System.out.println("Status    4");

                    try{
                        Thread.sleep(1500);
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                        break;
                    }
                    break;
                
                // EATING
                case EATING:
                    clearScreen();
                    System.out.println("      " +this.name+ "\n");
                    System.out.println("   +    *    +  ");
                    System.out.println(" *  + /\\_/\\ _ *");
                    System.out.println("*    ( ^.^ ) ) * ");
                    System.out.println("       \\ /( (");
                    System.out.println("     ( | | )_)");
                    System.out.println("    (__d b__)");
                    System.out.println("\nEnergy: " +this.energy+ "  Happiness: " +this.happiness);
                    System.out.println("\nFeed      1");
                    System.out.println("Play      2");
                    System.out.println("Sleep     3");
                    System.out.println("Status    4");

                    try{
                        Thread.sleep(1500);
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                        break;
                    }
                    changeState(CurrentState.VIBING);
                    clearScreen();
                    break;

                // SLEEPING
                case SLEEPING:
                    clearScreen();
                    System.out.println("      " +this.name+ "\n");
                    System.out.println("         Z");
                    System.out.println("       z");
                    System.out.println("        Z");
                    System.out.println("       |\'/-..--.");
                    System.out.println("      / _ _   ,  ;");
                    System.out.println("     `~=`Y'~_<._./");
                    System.out.println("      <`-....__.'");
                    System.out.println("\nEnergy: " +this.energy+ "  Happiness: " +this.happiness);
                    System.out.println("\nFeed      1");
                    System.out.println("Play      2");
                    System.out.println("Sleep     3");
                    System.out.println("Status    4");

                    try{
                        Thread.sleep(1500);
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                        break;
                    }
                    clearScreen();
                    System.out.println("      " +this.name+ "\n");
                    System.out.println("        z");
                    System.out.println("       Z");
                    System.out.println("        z");
                    System.out.println("       |\'/-..--.");
                    System.out.println("      / _ _   ,  ;");
                    System.out.println("     `~=`Y'~_<._./");
                    System.out.println("      <`-....__.'");
                    System.out.println("\nEnergy: " +this.energy+ "  Happiness: " +this.happiness);
                    System.out.println("\nFeed      1");
                    System.out.println("Play      2");
                    System.out.println("Sleep     3");
                    System.out.println("Status    4");

                    try{
                        Thread.sleep(1500);
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                        break;
                    }
                    clearScreen();
                    System.out.println("      " +this.name+ "\n");
                    System.out.println("         Z");
                    System.out.println("       z");
                    System.out.println("        Z");
                    System.out.println("       |\'/-..--.");
                    System.out.println("      / _ _   ,  ;");
                    System.out.println("     `~=`Y'~_<._./");
                    System.out.println("      <`-....__.'");
                    System.out.println("\nEnergy: " +this.energy+ "  Happiness: " +this.happiness);
                    System.out.println("\nFeed      1");
                    System.out.println("Play      2");
                    System.out.println("Sleep     3");
                    System.out.println("Status    4");

                    try{
                        Thread.sleep(1500);
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                        break;
                    }
                    changeState(CurrentState.VIBING);
                    break;

                // PLAYING
                case PLAYING:
                    clearScreen();
                    System.out.println("      " +this.name+ "\n\n");
                    System.out.println("  /   ");
                    System.out.println(" /       |\\_/|   (");
                    System.out.println("O       _(o o )_  )");
                    System.out.println("      ---U---U--------");
                    System.out.println("\nEnergy: " +this.energy+ "  Happiness: " +this.happiness);
                    System.out.println("\nFeed      1");
                    System.out.println("Play      2");
                    System.out.println("Sleep     3");
                    System.out.println("Status    4");

                    try{
                        Thread.sleep(1200);
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                        break;
                    }
                    clearScreen();
                    System.out.println("      " +this.name+ "\n\n");
                    System.out.println("   |   ");
                    System.out.println("   |     |\\_/|    )");
                    System.out.println("   O    _(o o )_ (");
                    System.out.println("      ---U---U--------");
                    System.out.println("\nEnergy: " +this.energy+ "  Happiness: " +this.happiness);
                    System.out.println("\nFeed      1");
                    System.out.println("Play      2");
                    System.out.println("Sleep     3");
                    System.out.println("Status    4");

                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                        break;
                    }
                    clearScreen();
                    System.out.println("      " +this.name+ "\n\n");
                    System.out.println("    \\   ");
                    System.out.println("     \\   |\\_/|   (");
                    System.out.println("      O _(o o )_  )");
                    System.out.println("      ---U---U--------");
                    System.out.println("\nEnergy: " +this.energy+ "  Happiness: " +this.happiness);
                    System.out.println("\nFeed      1");
                    System.out.println("Play      2");
                    System.out.println("Sleep     3");
                    System.out.println("Status    4");

                    try{
                        Thread.sleep(1200);
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                        break;
                    }
                    clearScreen();
                    System.out.println("      " +this.name+ "\n\n");
                    System.out.println("   |   ");
                    System.out.println("   |     |\\_/|    )");
                    System.out.println("   O  C==(o o )_ (");
                    System.out.println("      -------U--------");
                    System.out.println("\nEnergy: " +this.energy+ "  Happiness: " +this.happiness);
                    System.out.println("\nFeed      1");
                    System.out.println("Play      2");
                    System.out.println("Sleep     3");
                    System.out.println("Status    4");

                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                        break;
                    }
                    // check
                    if(this.count == 2){
                        this.count = 0;
                        changeState(CurrentState.VIBING);
                    }else{
                        this.count++;
                    }
                    break;
                case STATUS:
                    clearScreen();
                    System.out.println("      " +this.name+ "\n\n");
                    System.out.println("      /\\_/\\  (");
                    System.out.println("     ( °.° ) _)");
                    System.out.println("       \\ /( (");
                    System.out.println("     ( | | )_)");
                    System.out.println("    (__d b__)");
                    System.out.println("\n    Name: " +this.name+
                                     "\n    Tipo: " +this.species+
                                     "\n    Age: " +this.age+
                                     "\n    Energy: " +this.energy+
                                     "\n    Happiness: " +this.happiness);
                    try{
                        Thread.sleep(1500);
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                        break;
                    }
                    clearScreen();
                    System.out.println("      " +this.name+ "\n\n");
                    System.out.println("      /\\_/\\ _");
                    System.out.println("     ( °.° ) )");
                    System.out.println("       \\ /( (");
                    System.out.println("     ( | | )_)");
                    System.out.println("    (__d b__)");
                    System.out.println("\n    Name: " +this.name+
                                     "\n    Tipo: " +this.species+
                                     "\n    Age: " +this.age+
                                     "\n    Energy: " +this.energy+
                                     "\n    Happiness: " +this.happiness);
                    try{
                        Thread.sleep(1500);
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                        break;
                    }
                    // check
                    if(this.count == 2){
                        this.count = 0;
                        changeState(CurrentState.VIBING);
                    }else{
                        this.count++;
                    }
                    break;
            }
        }
    }

    public void changeState(CurrentState newState){
        this.state = newState;
    }

    public enum CurrentState{
            VIBING, EATING, SLEEPING, PLAYING, DEAD, STATUS
    }
}