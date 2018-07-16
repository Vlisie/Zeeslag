package happyfriday;

import java.util.Random;
import java.util.Scanner;
 
class Zeeslag {
    static Scanner in = new Scanner(System.in);
 
    public static void main(String[] args) {
        int choice = 0;
        board();
        char[][] values = { { ' ', 'A', 'B', 'C', 'D', 'E' },
                { '1', '-', '-', '-', '-', '-' },
                { '2', '-', '-', '-', '-', '-' },
                { '3', '-', '-', '-', '-', '-' },
                { '4', '-', '-', '-', '-', '-' },
                { '5', '-', '-', '-', '-', '-' } };
        do{
        	choice = menu();
            switch(choice){
                case 1: System.out.println("Voer een rij nummer in: ");
                        int gokrij = rowCheck();
                        System.out.println("Voer een kolom hoofdletter in: ");
                        String gokkolom = columnCheck1();
                        int colLocation = columnCheck(gokkolom);
                        int ROWS = 6;
                        int COLS = 6;
                        hitormiss(gokrij, colLocation, ROWS, COLS, values);
                        break;
                case 2: 
                        break;
                case 3: 
                         
                        break;
                default:System.out.println("Ongeldige Invoer");
                        break;
            }
        }while(choice != 3);
    }
 
    // methode van het weergavemenu
   static int menu() {
        System.out.println("Menu:");
        System.out.println("1. Fire Shot");
        System.out.println("2. Show Solution");
        System.out.println("3. Quit");
        int menuOption = 0;
        boolean test = true;
        while (test) {
            if (in.hasNextInt()) {
                menuOption = in.nextInt();
                test = false;
            } else {
                String junk = in.next();
                System.out.println("Invalid Input");
            }
        }
        return menuOption;
    }
 
    // methode van bord
   static void board() {
        final int ROWS = 6;
        final int COLS = 6;
        char[][] values = { { ' ', 'A', 'B', 'C', 'D', 'E' },
                { '1', '-', '-', '-', '-', '-' },
                { '2', '-', '-', '-', '-', '-' },
                { '3', '-', '-', '-', '-', '-' },
                { '4', '-', '-', '-', '-', '-' },
                { '5', '-', '-', '-', '-', '-' } };
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                System.out.print(" " + values[row][col]);
            }
            System.out.println("\n");
        }
    }
 
    // methode om input te controleren
    static int rowCheck() {
        int guessRow = 0;
        boolean test = true;
        while (test) {
            if (in.hasNextInt()) {
                guessRow = in.nextInt();
                if (guessRow < 1 || guessRow > 5) {
                    System.out.println("Invalid Input - Retry");
                } else if (guessRow >= 1 || guessRow < 6) {
                    test = false;
                }
            } else {
                String dummy = in.next();
                System.out.println("Invalid Input - Retry");
            }
 
        }
        return guessRow;
    }
 
    // methode om kolom te gokken
    public static int locationCol() {
        System.out.println("Enter a Column Letter: ");
        in.nextLine();
        String guessColumn = in.nextLine();
        char c = guessColumn.charAt(0);
        int colLocation = (c - 'A') + 1;
        return colLocation;
    }
 
    public static String columnCheck1() {
        in.nextLine();
        String guessColumn="";
        boolean test = true;
        while (test) {
            if (in.hasNextLine()) {
                guessColumn = in.nextLine();
                    test = false;
                }
             else {
                int dummy = in.nextInt();
                System.out.println("Invalid Input - Retry");
            }
 
        }
        return guessColumn;
    }
     
     
    // methode om input te controleren
    public static int columnCheck(String guessColumn) {
        char c=' ';
        do{
                c = guessColumn.charAt(0);
                switch (c) {
                case 'A':
                     
                    break;
                case 'B':
                     
                    break;
                case 'C':
                     
                    break;
                case 'D':
                     
                    break;
                case 'E':
                     
                    break;
                default:
                    System.out.println("Invalid Option");
                     
                }
                }while (c != 'A' && c != 'B' && c != 'C' && c != 'D' && c != 'E');
             
            int colLocation = (c - 'A') + 1;
            return colLocation;
        }
     
 
    // methode om te checken of er raak of mis is geschoten
    public static void hitormiss(int guessRow, int colLocation, int ROWS,
            int COLS, char[][] values) {
        Random rand = new Random();
        int x = rand.nextInt(4); // goes from 0-3, excludes 4
        int y = rand.nextInt(4);
        if (guessRow == x && colLocation == y) {
            values[guessRow][colLocation] = '*';
            System.out.println("hit");
            for (int row = 0; row < ROWS; row++) {
                for (int col = 0; col < COLS; col++) {
                    System.out.print(" " + values[row][col]);
                }
                System.out.println("\n");
            }
        }
        else if (guessRow == x + 1 && colLocation == y + 1) {
            values[guessRow][colLocation] = '*';
            System.out.println("hit");
            for (int row = 0; row < ROWS; row++) {
                for (int col = 0; col < COLS; col++) {
                    System.out.print(" " + values[row][col]);
                }
                System.out.println("\n");
            }
        }
        else if (guessRow == x + 1 && colLocation == y) {
            values[guessRow][colLocation] = '*';
            System.out.println("hit");
            for (int row = 0; row < ROWS; row++) {
                for (int col = 0; col < COLS; col++) {
                    System.out.print(" " + values[row][col]);
                }
                System.out.println("\n");
            }
        }
        else if (guessRow == x && colLocation == y + 1) {
            values[guessRow][colLocation] = '*';
            System.out.println("hit");
            for (int row = 0; row < ROWS; row++) {
                for (int col = 0; col < COLS; col++) {
                    System.out.print(" " + values[row][col]);
                }
                System.out.println("\n");
            }
        } else {
            values[guessRow][colLocation] = 'x';
            System.out.println("miss");
            for (int row = 0; row < ROWS; row++) {
                for (int col = 0; col < COLS; col++) {
                    System.out.print(" " + values[row][col]);
                }
                System.out.println("\n");
            }
        }
    }
}