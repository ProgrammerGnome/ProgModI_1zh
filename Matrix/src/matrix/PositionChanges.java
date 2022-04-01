/*
Származtasson egy PositionChanges osztályt a Team osztályból, melynek promote 
metódusával lehessen módosítani a Team objektumban tárolt csapattagok position értékét.
 */
package matrix;

import java.util.ArrayList;

public class PositionChanges extends Team{
    public static void main(String[] args){
        promote();
    }
    
    public static void promote(){
        Team Objektum = new Team();
        
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> position = new ArrayList<>();

        System.out.print("Ön a következőkben tudja módosítani a csapattagjai position értékeit.\n");
        System.out.print("Kérem adja meg, hogy hány darab csapattagot szeretne most megadni:\n");
        Objektum.newMember(name, position);
    }
}