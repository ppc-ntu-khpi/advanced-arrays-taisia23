package main;

    import java.util.Scanner;
/**
 * Клас Main надає просте меню для транспонування випадково згенерованої матриці.
 * Користувачі можуть обрати транспонування матриці або вийти з програми.
 * 
 * @author Таїсія
 */
public class Main {
     /**
     * Головний метод виводить меню та обробляє введення користувача.
     * 
     * @param args Аргументи командного рядка
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose option:");
        System.out.println("1. Transpose matrix");
        System.out.println("2. Exit");
        
        int option = scanner.nextInt();
        
        switch (option) {
            case 1:
                System.out.println("enter matrix size (rows and collums separated by space):");
                int rows = scanner.nextInt();
                int columns = scanner.nextInt();
                
                int[][] matrix = Calc.generateRandomMatrix(rows, columns);
                
                System.out.println("Starter matrix:");
                printMatrix(matrix);
                
                int[][] transposedMatrix = Calc.transposeMatrix(matrix);
                
                System.out.println("Transposed matrix:");
                printMatrix(transposedMatrix);
                break;
            case 2:
                System.out.println("Bye!");
                break;
            default:
                System.out.println("Unknown option, try again.");
        }
        
        scanner.close();
    }
    
   /**
     * Друкує матрицю на консоль.
     * 
     * @param matrix Матриця, яку потрібно вивести
     */
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

