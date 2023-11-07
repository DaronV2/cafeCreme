package fr.louis.daron;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        // 1.2.5.10.50
        System.out.print("Combien avez vous de pièces de 1 centimes ? : ");
        int pieceUn = clavier.nextInt();

        System.out.print("Combien avez vous de pièces de 2 centimes ? : ");
        int pieceDe = clavier.nextInt();

        System.out.print("Combien avez vous de pièces de 5 centimes ? : ");
        int pieceCinq = clavier.nextInt();

        System.out.print("Combien avez vous de pièces de 10 centimes ? : ");
        int pieceDix = clavier.nextInt();

        System.out.print("Combien avez vous de pièces de 50 centimes ? : ");
        int pieceCinquante = clavier.nextInt();

        int total = pieceCinq * 5 + pieceDe * 2 + pieceUn + pieceDix * 10 + pieceCinquante * 50;

        if (total < 100){
            System.err.println("Vous n'avez pas assez ! ");

        }else if (total == 100){
            System.out.println("Vous avez pile assez ! ");
        }else{
            System.out.println("Vous avez assez ! ");
        }
        clavier.close();
    }
}
