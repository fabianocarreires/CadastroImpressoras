package aula07_2010;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cadImpressoras {
    
    static private List<Matricial> matriciais = new ArrayList();
    private static List<Laser> lasers = new ArrayList();

    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;
        do {
            menu();
            opcao = Integer.parseInt(ler.nextLine());
            if (opcao == 1) {
                cadastrarM();
            }
            if (opcao == 2) {
                cadastrarL();
            }
            if (opcao == 3) {
                listarM();
            }
            if (opcao == 4) {
                listarL();
            }
            if (opcao == 5) {
                listarT();
            }
        } while (opcao != 6);
    }

    public static void menu() {
        System.out.println("*** Impressoras ***");
        System.out.println("1 - Cadastrar Matricial ");
        System.out.println("2 - Cadastrar Laser  ");
        System.out.println("3 - Listar Matriciais ");
        System.out.println("4 - Listar Lasers ");
        System.out.println("5 - Listar todas");
        System.out.println("6 - Sair ");
        System.out.print("Opção: ");
    }

    public static void cadastrarM() {
        Matricial novaImpressora = new Matricial();
        System.out.println("*** Cadastro de Impressora Matricial ***");
        System.out.print("Digite a Marca: ");
        novaImpressora.setMarca(ler.nextLine());
        System.out.print("Digite o modelo: ");
        novaImpressora.setModelo(ler.nextLine());
        System.out.print("Digite o peso: ");
        novaImpressora.setPeso(Double.parseDouble(ler.nextLine()));
        System.out.print("Imprime Colorido (S/N): ");
        if (ler.nextLine().equals("S"))
            novaImpressora.setColorida(true);
        else 
            novaImpressora.setColorida(false);        
        System.out.print("Imprime vias (S/N): ");
        if (ler.nextLine().equals("S"))
            novaImpressora.setImprimeVias(true);
        else
            novaImpressora.setImprimeVias(false);        
        System.out.print("Quantidade de agulhas: ");
        novaImpressora.setNumAgulhas(Integer.parseInt(ler.nextLine()));        
        matriciais.add(novaImpressora);
        System.out.println("\nImpressora adicionada com sucesso!\n");
    }

    public static void cadastrarL() {        
        Laser novaImpressora = new Laser();
        System.out.println("*** Cadastro de Impressora Laser ***");
        System.out.print("Digite a Marca: ");
        novaImpressora.setMarca(ler.nextLine());
        System.out.print("Digite o modelo: ");
        novaImpressora.setModelo(ler.nextLine());
        System.out.print("Digite o peso: ");
        novaImpressora.setPeso(Double.parseDouble(ler.nextLine()));
        System.out.print("Imprime Frente e Verso (S/N): ");        
        if (ler.nextLine().equals("S")) 
            novaImpressora.setFrenteVerso(true);
        else
            novaImpressora.setFrenteVerso(false);        
        System.out.print("Imprime Colorido (S/N): ");        
        if (ler.nextLine().equals("S"))
            novaImpressora.setFrenteVerso(true);
        else 
            novaImpressora.setFrenteVerso(false);        
        System.out.print("Digite a capacidade de Toner: ");
        novaImpressora.setCapacidadeToner(Double.parseDouble(ler.nextLine()));
        lasers.add(novaImpressora);
        System.out.println("\nImpressora adicionada com sucesso!\n");
    }

    public static void listarM() {        
        System.out.println("*** Lista de Matriciais ***\n");
        if (matriciais.isEmpty()) {
            System.out.println("Não Existem Impressoras Maticiais Cadastradas!\n");
        } else {
            for (Matricial impressora : matriciais) {                    
                System.out.println("Marca: " + impressora.getMarca());
                System.out.println("Modelo: " + impressora.getModelo());
                if (impressora.isColorida()) 
                    System.out.println("Impressão Colorida: S");
                else 
                    System.out.println("Impressão Colorida: N");                 
                if (impressora.isImprimeVias())
                    System.out.println("Imprime Vias: S");
                else
                    System.out.println("Imprime Vias: N"); 

                System.out.println("Peso: " + impressora.getPeso());
                System.out.println("Número de Agulhas: " + impressora.getNumAgulhas());
                System.out.println("------------------------------------------------\n");
            }
        }
    }

    public static void listarL() {
        System.out.println("*** Lista de Lasers ***\n");
        if (lasers.isEmpty()) {
            System.out.println("Não Existem Impressoras Laser Cadastradas!\n");
        } else {
            for (Laser impressora : lasers) {
                System.out.println("Marca: " + impressora.getMarca());
                System.out.println("Modelo: " + impressora.getModelo());
                if (impressora.isColorida())
                    System.out.println("Impressão Colorida: S");
                else
                    System.out.println("Impressão Colorida: N");
                if (impressora.isFrenteVerso())
                    System.out.println("Imprime Frente e Verso: S");
                else
                    System.out.println("Imprime Frente e Verso: N");
                
                System.out.println("Peso: " + impressora.getPeso());
                System.out.println("Capacidade Toner: " + impressora.getCapacidadeToner());
                System.out.println("------------------------------------------------\n");
            }
        }
    }

    public static void listarT() {
        System.out.println("*** Lista de Todas Impressoras ***\n");
        listarM();
        listarL();
    }
}
