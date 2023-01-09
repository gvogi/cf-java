package gr.aueb.cf.ch11_ch12.exercises_ch12.bankapp;

import gr.aueb.cf.ch11_ch12.exercises_ch12.bankapp.model.Holder;
import gr.aueb.cf.ch11_ch12.exercises_ch12.bankapp.model.JointAccount;
import gr.aueb.cf.ch11_ch12.exercises_ch12.bankapp.model.OverdraftAccount;

public class Main {

    public static void main(String[] args) {
        Holder alice = new Holder(1L,"Alice", "W.", "R123");
        Holder bob = new Holder(2L,"Bob", "M.", "R456");
        Holder alice2 = new Holder(3L,"Alice", "W.", "R789");
        JointAccount aliceBob = new JointAccount(1L, alice, bob, "GR103", 1_000);
        OverdraftAccount aliceOverdraft = new OverdraftAccount(1L, alice, "GR101", 1_000);

        try {
            // Joint account testing

            aliceBob.withdraw(200, alice);
            System.out.println("Successful withdrawal");
            System.out.println(aliceBob.getJointAccBalance());

            aliceBob.deposit(400);
            System.out.println("Successful deposit");
            System.out.println(aliceBob.getJointAccBalance());
            System.out.println(aliceBob.getJointAccountState());

            aliceBob.withdraw(200, alice2);

            // Overdraft account testing

         /*   aliceOverdraft.withdraw(1100, alice);
            System.out.println("Successful Overdraft withdrawal");
            System.out.println(aliceOverdraft.getOverdraftAccBalance());

            aliceOverdraft.deposit(150);
            System.out.println("Successful deposit");
            System.out.println(aliceOverdraft.getOverdraftAccBalance());
            System.out.println(aliceOverdraft.getOverdraftAccState());

            aliceOverdraft.withdraw(600, alice);
            System.out.println(aliceOverdraft.getOverdraftAccBalance());

            aliceOverdraft.withdraw(550, bob);
            System.out.println(aliceOverdraft.getOverdraftAccBalance());*/
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
