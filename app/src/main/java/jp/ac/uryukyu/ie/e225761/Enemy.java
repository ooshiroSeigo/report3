package jp.ac.uryukyu.ie.e225761;
public class Enemy extends LivingThing{
    String name;
    int hitPoint;
    int attack;
    boolean dead;
    public Enemy(String name, int maximumHP, int attack){
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
    @Override 
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。", name);
        }
    }
}