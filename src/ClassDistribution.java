import java.util.Random;
import java.util.Scanner;

public class ClassDistribution {
//Метод для раздачи карт
    public static void distribution(Player player) {
        int playngCard = 1;
        int c = 0;
        Random random = new Random();
        System.out.println("Игрок " + player.name + " под номером " + player.id + ":");
        int a;
        while(playngCard < 3) {
            a = random.nextInt(11);
            while( a == 5 || a == 0){
                a = random.nextInt(11);
            }
            switch (a) {
                case 2:
                    System.out.println("Ваша карта - J");
                    player.count += a;
                    break;
                case 3:
                    System.out.println("Ваша карта - Q");
                    player.count += a;
                    break;
                case 4:
                    System.out.println("Ваша карта - K");
                    player.count += a;
                    break;
                case 1:
                case 11:
                    c++;
                    System.out.println("Ваша карта - A");
                    if(player.count > 10){
                        a = 1;
                    }else {
                        a = 11;
                    }
                    player.count += a;
                    break;
                default:
                    System.out.println("Ваша карта - " + a);
                    player.count += a;
            }
            playngCard++;
            if(playngCard == 3){
                System.out.println("Ещё карту или хватит?");
                String answer = new Scanner(System.in).nextLine();
                if(answer.length() <= 4){
                    playngCard--;
                }else if(answer.length() >= 5) {
                    if (c > 0 && player.count > 21) {
                        player.count -= 10;
                        System.out.println(player.name + ", Вы набрали " + player.count + " очко(ов)");
                    }else {
                        System.out.println(player.name + ", Вы набрали " + player.count + " очко(ов)");
                    }
                    if(player.count > 21){
                        System.out.println("У вас перебор!");
                    }
                }
            }
        }
        System.out.println();
    }
    //---------------------------------------------------------------------------------------

    //Метод для определения победителя
    public static void win(Player player){
        System.out.println("Игрок " + player.name + " под номером " + player.id + " набрал: " + player.count +
                " очко(ов)");
    }
}
