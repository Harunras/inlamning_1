package uppgift;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (true){
            System.out.println("Ange Djurs Namn");
            String name = sc.next();
            //kontrollera med angivna metoder och namn i olika klasserna
            // Baserat på namnet skapar så har vi hund eller katt eller orm
            // objekt för att beräkna portion.
            if (name.equalsIgnoreCase( DjurNamn.Dogge.toString())){
                Hund d= new Hund(10000);
                double portion = d.kalkyleraPortion();
                System.out.println("Dogge ska ha "+portion+ " gms of "+d.getFoodType());

            }
            else if (name.equalsIgnoreCase( DjurNamn.Sixten.toString())){
                Hund d = new Hund(5000);
                double portion = d.kalkyleraPortion();
                System.out.println("Sixten ska ha "+portion+ " gms of "+d.getFoodType());

            }
            else if (name.equalsIgnoreCase( DjurNamn.Venus.toString())){
                Katt c = new Katt(5000);
                double portion=c.kalkyleraPortion();
                System.out.println("Venus ska ha "+portion+ " gms of "+c.getFoodType());

            }
            else if (name.equalsIgnoreCase( DjurNamn.Ove.toString())){
                Katt c = new Katt(3000);
                double portion=c.kalkyleraPortion();
                System.out.println("Ove ska ha "+portion+ " gms of "+c.getFoodType());

            }
            else if (name.equalsIgnoreCase( DjurNamn.Ormen_Hypno.toString())){
                Orm s = new Orm(1000);
                double portion = s.kalkyleraPortion();
                System.out.println("Ormen Hypno ska ha "+portion+ " gms of "+s.getFoodType());

            }
            else {
                System.out.println("namnet stämmer inte med något av Djurnamn");
                continue;
            }

            // Asking the user if he/ she wants to perform the action again

            while (true){
                System.out.println("Vill du ange ett annat djur namn? Svara med 'ja' eller 'nej'");
                String answer = sc.next();
                if (answer.equalsIgnoreCase("nej")){
                    System.out.println("Ha ett trevlig dag");
                    System.exit(0);;
                }
                else if(answer.equalsIgnoreCase("ja")){
                    break;
                }
                else{
                    System.out.println("Försök igen");
                }
            }


        }

    }
}




