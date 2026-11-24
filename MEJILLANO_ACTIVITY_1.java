/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mejillano_activity_1;

/**
 *
 * @author MEJILLANO_CPE113
 */
public class MEJILLANO_ACTIVITY_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Create two objects
        PrintAccount margarette = new PrintAccount("Margarette", 10);
        PrintAccount francynne = new PrintAccount("Francynne", -4);

        System.out.println("Initial Credits:");
        System.out.println("Margarette: " + margarette.getCredits());
        System.out.println("Francynne: " + francynne.getCredits());

        // Margarette prints 4 pages
        System.out.println("\nMargarette prints 4 pages: " + margarette.printPages(4));
        System.out.println("Margarette Credits: " + margarette.getCredits());

        // Margarette tries to print 7 pages
        System.out.println("\nMargarette prints 7 pages: "
                + margarette.printPages(7));
        System.out.println("Margarette Credits: " + margarette.getCredits());

        // Margarette tries to add negative credits
        System.out.println("\nMargarette adds -3 credits: "
                + margarette.addCredits(-3));
        System.out.println("Margarette Credits: " + margarette.getCredits());

        // Margarette adds 4 credits
        System.out.println("\nMargarette adds 4 credits: "
                + margarette.addCredits(4));

        System.out.println("Margarette Credits: " + margarette.getCredits());
        System.out.println("Francynne Credits: " + francynne.getCredits());
    }
}
    
    

