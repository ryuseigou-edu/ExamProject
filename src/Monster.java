public abstract class Monster implements Creature {
    private final String name;
    private int hp;
    private final char suffix;
    private static final String ERROR_MESSAGE = "初期設定に誤りがあるため、キャラクターを作成できませんでした";

    public Monster(final String name, final int hp, final char suffix) {
        this.name = name;
        if(hp >= 0) {
            setHp(hp);
        } else {
            throw new IllegalArgumentException
                    (ERROR_MESSAGE);
        }
        this.suffix = suffix;
    }

    @Override
    public boolean isAlive() {
        return hp > 0;
    }
    @Override
    public void showStatus() {
        System.out.println
                (this.getName() + this.getSuffix() + "：HP " + this.getHp());
    }

    @Override
    public int getHp() {
        return this.hp;
    }
    @Override
    public String getName() {
        return this.name;
    }
    public char getSuffix() {
        return this.suffix;
    }
    @Override
    public void setHp(final int hp) {
        this.hp = Math.max(hp, 0);
    }
}
