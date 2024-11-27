/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemareserva_3;

/**
 *
 * @author REGYANE
 */
public class GerenciadorDeReservas {
    
private String[] nomesVoo = new String[1000];  // Nomes dos voos
    private int[] lugaresDisponiveis = new int[1000];  // Número de lugares disponíveis em cada voo
    private int totalVoos = 0;  // Contador de voos cadastrados

    // Método para cadastrar um voo
    public void cadastrarVoo(String nomeVoo, int lugares) {
        nomesVoo[totalVoos] = nomeVoo;
        lugaresDisponiveis[totalVoos] = lugares;
        totalVoos++;
    }

    // Método para realizar a reserva de voo
    public boolean realizarReserva(String nomeVoo, String idCliente) {
        for (int i = 0; i < totalVoos; i++) {
            if (nomesVoo[i].equals(nomeVoo)) {
                if (lugaresDisponiveis[i] > 0) {
                    lugaresDisponiveis[i]--;  // Reserva um lugar
                    System.out.println("Reserva realizada com sucesso!");
                    System.out.println("Identidade do Cliente: " + idCliente + " - Voo: " + nomeVoo);
                    return true;
                } else {
                    System.out.println("Não existem mais lugares neste voo.");
                    return false;
                }
            }
        }
        System.out.println("Voo não encontrado.");
        return false;
    }

    // Método para exibir todos os voos cadastrados
    public void exibirVoos() {
        System.out.println("Lista de voos disponíveis:");
        for (int i = 0; i < totalVoos; i++) {
            System.out.println("Voo: " + nomesVoo[i] + " - Lugares disponíveis: " + lugaresDisponiveis[i]);
        }
    }

    // Método para verificar se um voo existe
    public boolean vooExiste(String nomeVoo) {
        for (int i = 0; i < totalVoos; i++) {
            if (nomesVoo[i].equals(nomeVoo)) {
                return true;
            }
        }
        return false;
    }
}
