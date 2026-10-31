import java.util.Random;
import java.util.Scanner;

public class JesterMonster extends Monster {
    JesterMonster(int sizeBoard) {
        super(sizeBoard);
        setImage("  ");
    }

    @Override
    public boolean taskMonster(int difficultGame) {
        Scanner scanner = new Scanner(System.in);
        int PlayerAnswer = scanner.nextInt();
        Random random = new Random();
        int RandomAnswer = random.nextInt(2);
        switch (RandomAnswer) {
            case 0 -> {
                System.out.println("Расскажи анекдот:");
                String answer = scanner.nextLine();
                System.out.println(".....(-_-).....");
            }
            case 1 -> {
                int n = random.nextInt(10); // случай анекдот от шута
                switch (n) {
                    case 0 -> System.out.println("А");
                    case 1 -> System.out.println("Б");
                    case 2 -> System.out.println("В");
                    case 3 -> System.out.println("Г");
                    case 4 -> System.out.println("Д");
                    case 5 -> System.out.println("Е");
                    case 6 -> System.out.println("Ё");
                    case 7 -> System.out.println("Ж");
                    case 8 -> System.out.println("З");
                    case 9 -> System.out.println("И");
                }
            }
        }
        return true;
    }
}