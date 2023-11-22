package Program;

import Entities.LegalPerson;
import Entities.PhysicalPerson;
import exceptions.BusinessException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        boolean isMenuActive = true;


        System.out.println("-----------------------------------------------------------------------");
        System.out.println("                        Bem vindo ao Banco Azul                        ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("           Para ter acesso aos serviços, cadastre sua conta!"           );
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Voce é: \n" +
                "Pessoa Física → Digite 1\n" +
                "Pessoa Jurídica → Digite 2"
        );

        System.out.println("-----------------------------------------------------------------------");

        int personOfType = sc.nextInt();

        switch (personOfType) {
            case 1:
                System.out.println("Digite seu CPF (apenas números):");
                long cpf = sc.nextLong();

                System.out.println("Qual seu nome? ");
                String name = sc2.nextLine();

                System.out.println("Qual sua idade?");
                int age = sc.nextInt();
<<<<<<< HEAD
=======
                // validar maioridade - Nayara
>>>>>>> a83dba2ee978d4921aa6e4f812c7a63f75cc67e2

                System.out.print("Saldo inicial: ");
                double balance = sc.nextDouble();

                System.out.print("Limite de saque: ");
                double withdrawLimit = sc.nextDouble();

                System.out.println("-----------------------------------------------------------------------");

                PhysicalPerson physicalPerson = new PhysicalPerson(name, balance, withdrawLimit, cpf, age);

                try {
                    physicalPerson.period();
                } catch (BusinessException e) {
                    System.out.println(e.getMessage());
                    break;
                }

                while (isMenuActive) {
                    System.out.println("O que você deseja fazer?");
                    System.out.println("[1] Depositar\n" +
                            "[2] Sacar\n" +
                            "[3] Consultar saldo\n" +
                            "[4] Consultar dados de usuário\n" +
                            "[0] Encerrar");

                    System.out.println("-----------------------------------------------------------------------");

                    int choice = sc.nextInt();

                    System.out.println("-----------------------------------------------------------------------");

                    switch (choice) {
                        case 0:
                            isMenuActive = false;
                            break;
                        case 1:
                            System.out.print("Informe o valor que deseja depositar: R$ ");
                            double amountDeposit = sc.nextDouble();
                            physicalPerson.deposit(amountDeposit);
                            System.out.println("-----------------------------------------------------------------------");
                            break;
                        case 2:
<<<<<<< HEAD
                            System.out.print("Informe o valor que deseja sacar: R$ ");
                            double amountWithdraw = sc.nextDouble();
                            try {
                                physicalPerson.withdraw(amountWithdraw);
                            } catch (BusinessException e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.println("-----------------------------------------------------------------------");
                            break;
                        case 3:
                            System.out.printf("O atual saldo da conta é: R$ %.2f%n", physicalPerson.getBalance());
                            System.out.println("-----------------------------------------------------------------------");
                            break;
                        case 4:
                            System.out.println(physicalPerson.data());
                            System.out.println("-----------------------------------------------------------------------");
=======
                            // Lógica para sacar -
                            break;
                        case 3:
                            // Lógica para consultar saldo - Nayara
                            break;
                        case 4:
                            // Lógica para consultar dados de usuário - Junior
>>>>>>> a83dba2ee978d4921aa6e4f812c7a63f75cc67e2
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            System.out.println("-----------------------------------------------------------------------");
                            break;
                    }
                }
                break;

            case 2:
                System.out.println("Digite seu CNPJ (apenas números):");
                long cnpj = sc.nextLong();

                System.out.println("Qual a razão social da empresa? ");
                String corporateReason = sc2.nextLine();

                System.out.println("Qual nome do responsável pela conta da empresa?");
                name = sc2.nextLine();

                System.out.print("Saldo inicial que você deseja inserir: ");
                balance = sc.nextDouble();

                System.out.print("Limite de saque: ");
                withdrawLimit = sc.nextDouble();

                System.out.println("-----------------------------------------------------------------------");

                LegalPerson legalPerson = new LegalPerson(name, balance, withdrawLimit, cnpj, corporateReason);

                while (isMenuActive) {
                    System.out.println("O que você deseja fazer?");
                    System.out.println("[1] Depositar\n" +
                            "[2] Sacar\n" +
                            "[3] Consultar saldo\n" +
                            "[4] Consultar dados de usuário\n" +
                            "[0] Encerrar");

                    System.out.println("-----------------------------------------------------------------------");

                    int choice = sc.nextInt();

                    System.out.println("-----------------------------------------------------------------------");

                    switch (choice) {
                        case 0:
                            isMenuActive = false;
                            break;
                        case 1:
                            System.out.print("Informe o valor que deseja depositar: R$ ");
                            double amountDeposit = sc.nextDouble();
                            legalPerson.deposit(amountDeposit);
                            System.out.println("-----------------------------------------------------------------------");
                            break;
                        case 2:
                            System.out.print("Informe o valor que deseja sacar: R$ ");
                            double amountWithdraw = sc.nextDouble();
                            try {
                                legalPerson.withdraw(amountWithdraw);
                            } catch (BusinessException e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.println("-----------------------------------------------------------------------");
                            break;
                        case 3:
<<<<<<< HEAD
                            System.out.printf("O atual saldo da conta é: R$ %.2f%n", legalPerson.getBalance());
                            System.out.println("-----------------------------------------------------------------------");
                            break;
                        case 4:
                            System.out.println(legalPerson.data());
                            System.out.println("-----------------------------------------------------------------------");
=======
                            // Lógica para consultar saldo - Nayara
                            break;
                        case 4:
                            // Lógica para consultar dados de usuário - Junior
>>>>>>> a83dba2ee978d4921aa6e4f812c7a63f75cc67e2
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            System.out.println("-----------------------------------------------------------------------");
                            break;
                    }
                }
                break;
        }
        sc.close();
        sc2.close();
    }
}
