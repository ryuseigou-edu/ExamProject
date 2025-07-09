public class SuperHero extends Hero {
    public SuperHero(final Hero hero) {
        super(hero.getName(), hero.getHp(), hero.getWeapon());
    }

    @Override
    public void attack(final Creature target) {
        System.out.println(getName() + "は" + this.getWeapon() + "で攻撃！" + target.getName() + "に25のダメージを与えた！");
        target.setHp(target.getHp() - 25);
    }
}
