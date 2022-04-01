/*
Implementálja a Team osztályt, ami egy projekt csapattagjait kezeli (name, position). 
Az osztálynak rendelkeznie kell egy newMember (új csapattag hozzáadása), egy leaveTeam 
(adott csapattag törlése) és egy getMembers (String formátumban visszaadja az 
aktuálisan tárolt csapattagok adatait) metódussal.
*/
package matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class Team {
    
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> position = new ArrayList<>();
        
        System.out.print("Kérem adja meg, hogy hány darab csapattagot szeretne most megadni:\n");
        newMember(name,position);
        
        System.out.print("""
                         K\u00e9rem adja meg a t\u00f6rlend\u0151 csapattagok pontos nev\u00e9t: (Ha nem akar \u00e9lni az opci\u00f3val \u00edrjon - jelet) 
                         """);
        leaveTeam(name, position);
        
        System.out.print("Az aktuálisan tárolt csapattagok adatai:\n");
        getMembers(name,position);
    }
    
    public static void newMember(ArrayList<String> name, ArrayList<String> position) {
        //
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        for(int i=0; i<var; i++){
        
        while (true) {
            System.out.println("Kérem adja meg a csapattag nevét (szóközök helyett _ jelet használjon): ");
            name.add(sc.next());
            System.out.println("Kérem adja meg a csapattaghoz tartozó pozíciót (szóközök helyett _ jelet használjon): ");
            position.add(sc.next());
            break;
        }}
        //
    }
    public static void leaveTeam(ArrayList<String> name, ArrayList<String> position){
        //
        try{
        Scanner sc = new Scanner(System.in);
        String var = sc.next();
        int pos = name.indexOf(var);
        name.remove(var);
        position.remove(pos);
        }
        catch (Exception e) {
            System.out.print("Ön nem adott törlésre érvényes elemet.\n");
        }
    }
    
    public static void getMembers(ArrayList<String> name, ArrayList<String> position){
        for (int i = 0 ; i < position.size(); i++) {
            System.out.printf("%s\t%s\n", name.get(i), position.get(i));
        }
    }
}