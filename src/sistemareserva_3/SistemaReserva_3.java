/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemareserva_3;
import java.util.Scanner;

/**
 *
 * @author REGYANE
 */
public class SistemaReserva_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeReservas gerenciador = new GerenciadorDeReservas();
        
        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1 - Cadastrar voo");
            System.out.println("2 - Realizar reserva");
            System.out.println("3 - Exibir voos cadastrados");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer
            
            if (opcao == 1) {
                // Cadastrar voo
                System.out.print("Digite o nome do voo: ");
                String nomeVoo = scanner.nextLine();
                System.out.print("Digite o número de lugares disponíveis: ");
                int lugares = scanner.nextInt();
                scanner.nextLine();  // Limpar o buffer
                gerenciador.cadastrarVoo(nomeVoo, lugares);
                
            } else if (opcao == 2) {
                // Realizar reserva
                System.out.print("Digite o número do voo desejado: ");
                String nomeVoo = scanner.nextLine();
                
                if (!gerenciador.vooExiste(nomeVoo)) {
                    System.out.println("Voo não existe.");
                    continue;
                }
                
                System.out.print("Digite o número da identidade do cliente: ");
                String idCliente = scanner.nextLine();
                gerenciador.realizarReserva(nomeVoo, idCliente);
                
            } else if (opcao == 3) {
                // Exibir voos cadastrados
                gerenciador.exibirVoos();
                
            } else if (opcao == 4) {
                // Sair
                System.out.println("Saindo...");
                break;
                
            } else {
                System.out.println("Opção inválida.");
            }
        }
        
        scanner.close();
    }
}