public abstract class Character implements Creature {
    private final String name;
    private int hp;
    private static final String ERROR_MESSAGE = "初期設定に誤りがあるため、キャラクターを作成できませんでした";

    public Character(final String name, final int hp) {
        this.name = name;
        if(hp >= 0) {
            this.setHp(hp);
        } else {
            throw new IllegalArgumentException
                    (ERROR_MESSAGE);
        }
    }

    @Override
    public final boolean isAlive(){
        return getHp() > 0;
    }
    @Override
    public void showStatus(){
        System.out.println
                (this.getName() + "：HP " + this.getHp());
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public int getHp() {
        return this.hp;
    }
    @Override
    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }
}
