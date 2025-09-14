class Tamagochi{
    // ATRIBUTES
    protected String name;
    protected String species;
    protected int age;
    protected int energy = 100;
    protected int happiness = 100;
    protected boolean alive = true;

    // CONSTRUCTOR
    Tamagochi(String name, String species, int age){
        this.name = name;
        this.species = species;
        this.age = age;
    }

    // METHODS
    public void feed(){
        this.energy += 10;
    }

    public void play(){
        this.happiness += 10;
        this.energy -= 30;

        if(this.energy <= 0){
            this.alive = false;
        }
    }
    
    public void sleep(){
        this.energy = 100;
    }

    public boolean checkAlive(){
        if(this.alive == true){
            return true;
        }else{
            for(int i=0; i < 1000; i++){
                System.out.println();
            }
            System.out.println("              -|-   ");
            System.out.println("             __|__     ");
            System.out.println("            |R.I.P|    ");
            System.out.println("            | "+this.name+"   ");
            System.out.println("          \\\\|     |//  ");
            System.out.println("     ^^^^^^^^^^^^^^^^^^ ");  
            return false;
        }
    }
}