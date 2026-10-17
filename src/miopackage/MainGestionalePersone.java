package miopackage;

import java.util.Scanner;

public class MainGestionalePersone {
    public static void main(String[] args) {
        String cognome, nome;
        Persona persona;
        Scanner s = new Scanner(System.in);
        int risposta;

        System.out.println("Inserisci cognome: ");
        cognome = s.nextLine();

        System.out.println("Inserisci nome: ");
        nome = s.nextLine();

        persona = new Persona(cognome, nome);

        System.out.println("Cognome: " + persona.getCognome() + "\n" + "Nome: " +  persona.getNome()+"\n" );

        // TELEFONATA

        System.out.println("Vuoi modificare il Cognome? (0 -> NO; 1 -> SI')");
        risposta = s.nextInt();
        s.nextLine(); // Digerisco il "\n" che è rimasto nel buffer;
        if( risposta == 0 ) {
            System.out.println("Va bene, non modifichiamo nulla");
        }
        else {
            System.out.println("Inserisci il nuovo cognome: ");

            cognome = s.nextLine();
            persona.setCognome(cognome);
        }

        persona.visualizza();


    }
}
