package ifrn.edu.eduardo;

import java.util.Scanner;

public class IdentifierMain {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Identifier id = new Identifier();

            System.out.print("Digite um identificador: ");
            String entrada = sc.nextLine();

            if (id.validateIdentifier(entrada)) {
                System.out.println("Válido");
            } else {
                System.out.println("Inválido");
            }

            sc.close();
        }
    }
