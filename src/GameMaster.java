import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        //party init
        ArrayList<Character> party = new ArrayList<Character>();
        party.add(new Hero("勇者", 100, "剣"));
        party.add(new Wizard("魔法使い", 60, 10));
        party.add(new Thief("盗賊", 70));

        //monsters init
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters.add(new Matango(45, 'A'));
        monsters.add(new Goblin(50, 'A'));
        monsters.add(new Slime(40, 'A'));

        System.out.println("---味方パーティー---");
        party.forEach(Character::showStatus);
        System.out.println("---敵グループ---");
        monsters.forEach(Monster::showStatus);
        System.out.println();

        System.out.println("味方の総攻撃！");
        for (Character character : party) {
            for (Monster monster : monsters) {
                character.attack(monster);
            }
        }

        System.out.println();

        System.out.println("敵の総攻撃！");
        for (Monster monster : monsters) {
            for (Character character : party) {
                monster.attack(character);
            }
        }
    }
}
