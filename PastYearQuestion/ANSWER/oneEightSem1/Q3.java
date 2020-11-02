package oneEightSem1;

import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter font size: ");
        int fontSize = input.nextInt();
        System.out.print("Enter font type: ");
        char fontType = input.next().charAt(0);
        System.out.print("Enter format [1 - Vertical, 2 - Horizontal]: ");
        int format = input.nextInt();

        if (format == 1) {
            for (int i = 0; i < 2; i++) {
                printFullHorizontal(fontSize, fontType, format);
                for (int j = 0; j < fontSize; j++) {
                    printPartialHorizontal(fontSize, fontType, format);
                }
            }
            printFullHorizontal(fontSize, fontType, format);
        }

        if (format == 2) {
            printFullHorizontal(fontSize, fontType, format);
            for (int i = 0; i < fontSize; i++) {
                printPartialHorizontal(fontSize, fontType, format);
            }
            printFullHorizontal(fontSize, fontType, format);
        }

    }

    public static void printFullHorizontal(int fontSize, char fontType, int format) {
        if (format == 1) {
            for (int i = 0; i < fontSize + 2; i++) {
                System.out.print(fontType);
            }
        } else if (format == 2) {
            for (int i = 0; i < fontSize * 2 + 3; i++) {
                System.out.print(fontType);
            }
        }
        System.out.println("");
    }

    public static void printPartialHorizontal(int fontSize, char fontType, int format) {
        System.out.print(fontType);
        for (int i = 0; i < fontSize; i++) {
            System.out.print(" ");
        }
        System.out.print(fontType);
        if (format == 2) {
            for (int i = 0; i < fontSize; i++) {
                System.out.print(" ");
            }
            System.out.print(fontType);
        }
        System.out.println("");
    }
}
