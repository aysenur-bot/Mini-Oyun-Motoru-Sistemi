public class Main {

    public static void main(String[] args) {

        // Oyunda 3 farklı karakter oluşturuluyor
        createCharacter("PLAYER");
        createCharacter("ENEMY");
        createCharacter("NPC");

        // Aynı fonksiyon içinde her şey kontrol ediliyor
        updateCharacter("PLAYER", 100);
        updateCharacter("ENEMY", 80);
        updateCharacter("NPC", 50);
    }

    // NESNE OLUŞTURMA (KÖTÜ TASARIM)
    public static void createCharacter(String type) {

        if(type.equals("PLAYER")) {
            System.out.println("PLAYER created with 100 HP");
        }
        else if(type.equals("ENEMY")) {
            System.out.println("ENEMY created with 80 HP");
        }
        else if(type.equals("NPC")) {
            System.out.println("NPC created with 50 HP");
        }
    }

    // DAVRANIŞ KONTROLÜ (KÖTÜ TASARIM)
    public static void updateCharacter(String type, int hp) {

        if(type.equals("PLAYER")) {
            System.out.println("Player is fighting. HP: " + hp);
        }
        else if(type.equals("ENEMY")) {
            System.out.println("Enemy is attacking. HP: " + hp);
        }
        else if(type.equals("NPC")) {
            System.out.println("NPC is wandering. HP: " + hp);
        }
    }
}