package jp.ac.uryukyu.ie.e225761;

public class Warrior extends Hero{
    String name;
    int hitPoint;
    int attack;
    boolean dead;
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }
    public boolean isDead(){
        return this.dead;
    }
    public String getName(){
        return this.name;
    }
    public void attack(LivingThing livi){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, livi.getName(), damage);
        livi.wounded(damage);
    }
    public void attackWithWeponSkill(LivingThing live){
        int damageBywpn = (int)(attack * 1.5);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, live.getName(), damageBywpn);
        live.wounded(damageBywpn);
    }
    @Override 
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。", name);
        }
    }
}
