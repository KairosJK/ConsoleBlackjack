package com.company;

import java.util.Random;
import java.util.*;
import java.util.concurrent.TimeUnit;
import static  com.company.JonsSpecialFunctions.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        JonsSpecialFunctions funct = new JonsSpecialFunctions();

        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_CYAN = "\u001B[36m";

        boolean t = true;
        while (t) {

            int card = 0;
            int total = 0;

            String jqkpick = null;
            String suits = null;
            String[] jqkarr = {"Jack", "Queen", "King"};
            int[] cardset = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};


            System.out.print(ANSI_BLUE + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" + ANSI_RESET);
            System.out.print(ANSI_CYAN + "\tWelcome to ICS3 Blackjack! Would you like to play?\n" + ANSI_RESET);
            System.out.print(ANSI_BLUE + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" + ANSI_RESET);

            Scanner yesOrNo = new Scanner(System.in);
            String YorN = yesOrNo.nextLine();

            System.out.print("\n");

            if (YorN.equalsIgnoreCase("Yes")) {

                for (int i = 0; i < 2; i++) {

                    Random random2 = new Random();
                    int cardPick = random2.nextInt(4);


                    Random randomcard = new Random();
                    int index = randomcard.nextInt(12);

                    if (cardPick == 0) {
                        card = cardset[index];
                        suits = "spades";
                    } else if (cardPick == 1) {
                        card = cardset[index];
                        suits = "clubs";
                    } else if (cardPick == 2) {
                        card = cardset[index];
                        suits = "hearts";
                    } else if (cardPick == 3) {
                        card = cardset[index];
                        suits = "diamonds";
                    }
                    total += card;

                    if (card == 10) {
                        Random random3 = new Random();
                        int jqk = random3.nextInt(3);
                        jqkpick = jqkarr[jqk];
                    }

                    if (card == 10) {
                        System.out.print("You got a " + jqkpick + " of " + suits + "\n");
                    } else {
                        System.out.print("You got a " + card + " of " + suits + "\n");
                    }
                }

                System.out.print(ANSI_CYAN + "Total: " + total + ANSI_RESET);
                //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                boolean t2 = true;

                while (t2) {
                    System.out.print("\n~~~~~~~~~~~~");
                    System.out.print(ANSI_CYAN + "\nHit" + ANSI_RESET + " or" + ANSI_PURPLE + " Stay ?\n" + ANSI_RESET);
                    Scanner hitorstay = new Scanner(System.in);
                    String HOS = hitorstay.nextLine();

                    if (HOS.contentEquals("Hit")) {

                        Random random2 = new Random();
                        int cardPick = random2.nextInt(4);

                        Random randomcard = new Random();
                        int index = randomcard.nextInt(12);

                        if (cardPick == 0) {
                            card = cardset[index];
                            suits = "spades";
                        } else if (cardPick == 1) {
                            card = cardset[index];
                            suits = "clubs";
                        } else if (cardPick == 2) {
                            card = cardset[index];
                            suits = "hearts";
                        } else if (cardPick == 3) {
                            card = cardset[index];
                            suits = "diamonds";
                        }
                        total += card;

                        if (card == 10) {
                            Random random3 = new Random();
                            int jqk = random3.nextInt(3);
                            jqkpick = jqkarr[jqk];
                        }

                        if (card == 10) {
                            System.out.print("\nYou got a " + jqkpick + " of " + suits + "\n");
                        } else {
                            System.out.print("\nYou got a " + card + " of " + suits + "\n");
                        }

                        System.out.print(ANSI_CYAN + "Total: " + total + ANSI_RESET);

                        if (total > 21) {
                            System.out.print("\nYou went over! Better luck next time.\n");
                            t2 = false;
                        }
                    } else if (HOS.contentEquals("Stay")) {
                        System.out.print("\nThe Dealer will now draw his hand.\n");
                        t2 = false;
                    }
                }

                TimeUnit.MILLISECONDS.sleep(500);

                int cardbot = 0;
                int totalbot = 0;
                String jqkpickbot = null;
                String suitsbot = null;

                for (int i = 0; i <= 2; i++) {

                    Random random2 = new Random();
                    int cardPick = random2.nextInt(4);

                    Random randomcard = new Random();
                    int index = randomcard.nextInt(12);

                    if (cardPick == 0) {
                        cardbot = cardset[index];
                        suitsbot = "spades";
                    } else if (cardPick == 1) {
                        cardbot = cardset[index];
                        suitsbot = "clubs";
                    } else if (cardPick == 2) {
                        cardbot = cardset[index];
                        suitsbot = "hearts";
                    } else if (cardPick == 3) {
                        cardbot = cardset[index];
                        suitsbot = "diamonds";
                    }
                    totalbot += cardbot;

                    if (cardbot == 10) {
                        Random random3 = new Random();
                        int jqk = random3.nextInt(3);
                        jqkpickbot = jqkarr[jqk];
                    }

                    if (card == 10) {
                        System.out.print("The dealer got a " + jqkpickbot + " of " + suitsbot + "\n");
                    } else {
                        System.out.print("The dealer got a " + cardbot + " of " + suitsbot + "\n");
                    }
                }


                while (true) {

                    if (totalbot <= 17) {

                        Random random5 = new Random();
                        int rand = random5.nextInt(9);

                        if (rand < 1) {

                            Random random3 = new Random();
                            int cardPick = random3.nextInt(4);

                            Random randomcard = new Random();
                            int index = randomcard.nextInt(12);

                            if (cardPick == 0) {
                                cardbot = cardset[index];
                                suitsbot = "spades";
                            } else if (cardPick == 1) {
                                cardbot = cardset[index];
                                suitsbot = "clubs";
                            } else if (cardPick == 2) {
                                cardbot = cardset[index];
                                suitsbot = "hearts";
                            } else if (cardPick == 3) {
                                cardbot = cardset[index];
                                suitsbot = "diamonds";
                            }
                            totalbot += cardbot;

                            if (cardbot == 10) {
                                Random random4 = new Random();
                                int jqk = random4.nextInt(3);
                                jqkpickbot = jqkarr[jqk];
                            }

                            if (card == 10) {
                                System.out.print("The dealer got a " + jqkpickbot + " of " + suitsbot + "\n");
                            } else {
                                System.out.print("The dealer got a " + cardbot + " of " + suitsbot + "\n");
                            }
                        }
                    } else if (totalbot >= 18) {
                        break;
                    }
                    if (totalbot > 21) {
                        System.out.print("\n The Dealer has gone bust!");
                        break;
                    }
                }

                if (totalbot > 21) {
                    if (total < 21) {
                        System.out.print("\nYou Win!");
                    }
                }

                if (total < 21) {
                    if (totalbot < 21) {
                        if (total > totalbot) {
                            System.out.print("\nYou Win!");
                        }
                        if (totalbot > total) {
                            System.out.print("\nYou Lose!");
                        }
                    }
                }

            } else if (YorN.equalsIgnoreCase("No")) {
                System.out.print("Goodbye.");
                System.exit(0);
            } else if (YorN.equalsIgnoreCase("die lit")) {
                funct.dieLit();
            } else {
                System.out.print("Please Answer {Yes} or {No}, Try again.\n");
            }
        }
    }
}







