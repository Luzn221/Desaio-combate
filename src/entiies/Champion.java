package entiies;

public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }
    public int getLife() {
       return life;
    }
    public int getAttack() {
        return attack;
    }
    public int getArmor() {
        return armor;
    }  
    public void takeDamage(int armor,int attack) {
        if(armor < attack){
            life -= (attack - armor);
        }else if(armor > attack){
            life -= 1;
        }
        if(life < 0){
            life = 0;
        }     
    }
    public String Status() {
        if(getLife() > 0){
            return getName()
            +": "
            +life
            +" de vida";
        }else{
            return getName()
            +": "
            +life
            +" de vida (morreu)";
        }

    }
}

