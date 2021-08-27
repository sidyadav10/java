import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Banking bank = new Banking("Siddahrth",1098);
        bank.showMenu();


    }
}

    class Banking {
        int balance;
        int previousTransaction;
        String customerName;
        int customerId;

        Banking(String cusName, int cusId) {
            customerName = cusName;
            customerId = cusId;
        }

        void deposited(int amount){
            if (amount != 0){
                balance = balance + amount;
                previousTransaction = amount;
            }

        }

        void withdraw(int amount) {
            if (amount != 0) {
                balance = balance - amount;
                previousTransaction = -amount;

            }
        }

        void getPreviousTransaction() {
            if (previousTransaction > 0) {
                System.out.println("Deposit: " +previousTransaction);
            } else if (previousTransaction < 0) {
                System.out.println("Withdraw: " + Math.abs(previousTransaction));
            } else {
                System.out.println("NO transaction occured !!");
            }
        }


        void showMenu() {
            int option;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome!!" + customerName);
            System.out.println("user id is:" + customerId);
            System.out.print("\n");
            System.out.println("1. Check your balance: ");
            System.out.println("2. Deposit: ");
            System.out.println("3. Withdraw: ");
            System.out.println("4. previous Transaction: ");
            System.out.println("0. Exit ");


            do {
                System.out.println("===============================================");
                System.out.println("Enter your option: ");
                System.out.println("================================================");
                option = scanner.nextInt();
                System.out.println("");


                switch (option) {

                    case 1:
                        System.out.println("===============================================");
                        System.out.println("Balance: " + balance);
                        System.out.println("==================================================");
                        break;
                    case 2:
                        System.out.println("=====================================================");
                        System.out.println("Enter amount to deposit: ");
                        int amount = scanner.nextInt();
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("=======================================================");
                        System.out.println("Enter your withdraw amount: ");
                        int amount2 = scanner.nextInt();
                        withdraw(amount2);
                        System.out.println("");
                        break;

                    case 4:
                        System.out.println("========================================================");
                        getPreviousTransaction();
                        System.out.println("====================================================");
                        break;
                    case 0:
                        System.out.println("====================================");
                        break;
                    default:
                        System.out.println("Invalid option Please enter again");
                        break;
                }

            }
            while (option != 0);
            System.out.println("Thankyou for using our service!!!!");


        }
    }





