 interface Creature {
     boolean isAlive();
     void showStatus();
     void attack(final Creature target);
     String getName();
     int getHp();
     void setHp(final int hp);
}
