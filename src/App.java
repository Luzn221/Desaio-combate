import entiies.Champion;
import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    Champion champion1;
    Champion champion2;

    System.out.println("Digite os dados do primeiro Campeão: ");

    System.out.print("Nome: ");
    String name = sc.nextLine();
    System.out.print("Vida inicial: ");
    int lifeinitial = sc.nextInt();
    System.out.print("ataque: ");
    int attack = sc.nextInt();
    System.out.print("Armadura: ");
    int armor = sc.nextInt();

    champion1 = new Champion(name, lifeinitial, attack, armor);

    System.out.println("Digite os dados do Segundo Campeão: ");

    System.out.print("Nome: ");
    sc.nextLine();
    name = sc.nextLine();
    System.out.print("Vida inicial: ");
    lifeinitial = sc.nextInt();
    System.out.print("ataque: ");
    attack = sc.nextInt();
    System.out.print("Armadura: ");
    armor = sc.nextInt();

    champion2 = new Champion(name, lifeinitial, attack, armor);

    System.out.println("Quantos turnos voce deseja executar? ");
    int quantTurns = sc.nextInt();

    for (int i = 0; i < quantTurns; i++) {
      if (champion1.getLife() == 0 || champion2.getLife() == 0) {
        System.out.println("FIM DO COMBATE");
        break;
        
      } else {
        System.out.println("Resultado do Turno " + (i + 1) + ":");
        champion1.takeDamage(champion1.getArmor(), champion2.getAttack());
        champion2.takeDamage(champion2.getArmor(), champion1.getAttack());
      }

      System.out.println(champion1.Status());
      System.out.println(champion2.Status());
      System.out.println();
    }
    sc.close();
  }
}
