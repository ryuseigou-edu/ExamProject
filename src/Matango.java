public class Matango extends Monster {
    public Matango(final int hp, final char suffix) {
        super(hp, suffix);
        setName("お化けキノコ");
    }

    @Override
    public void attack(Creature target) {
        System.out.println
                ("お化けキノコ" + this.getSuffix() + "は体当たり攻撃！" + target.getName() + "に6のダメージを与えた！");
        target.setHp(target.getHp() - 6);
    }
}
