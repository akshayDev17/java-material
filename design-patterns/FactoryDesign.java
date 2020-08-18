import java.util.Scanner;

public class FactoryDesign{
    public static void main(String[] args){
        
        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;

        Scanner scan = new Scanner(System.in);
        System.out.println("What type Ship? U/R/B\n");

        if(scan.hasNextLine()){
            String typeOfShip = scan.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }
        doStuff(theEnemy);

    }

    public static void doStuff(EnemyShip enemyShip){
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}