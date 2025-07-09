public final class Slime extends Monster {
    public Slime(final int hp, final char suffix) {
        super(hp, suffix);
        setName("スライム");
    }

    @Override
    public void attack(Creature target) {
        System.out.println
                ("スライム" + this.getSuffix() + "は体当たり攻撃！" + target.getName() + "に5のダメージを与えた！");
        target.setHp(target.getHp() - 5);
    }
}
