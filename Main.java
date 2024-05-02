class Main{
    public static void main(String[] args) {
        Enemy musuh = new Enemy();
        Zombie musuhZombie = new Zombie();
        Pocong musuhPocong = new Pocong();
        Burung mobBurung = new Burung();
        Monster musuhMonster = new Monster();

        musuh.attack();
        musuhZombie.attack();
        musuhZombie.walk();
        musuhPocong.jump();
        mobBurung.fly();
        musuhMonster.serangan();
        musuhMonster.seranganBalik();
    }
}