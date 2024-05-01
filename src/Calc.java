package main;

import java.util.Random;

/**
 * Клас Calc містить методи для транспонування матриць і генерації випадкових матриць.
 * 
 * @author Таїсія
 */
public class Calc {
    /**
     * Транспонує задану матрицю.
     * 
     * @param matrix Матриця, яку потрібно транспонувати
     * @return Транспонована матриця
     */
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposedMatrix = new int[columns][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        
        return transposedMatrix;
    }
    
    /**
     * Генерує випадкову матрицю заданого розміру.
     * 
     * @param rows Кількість рядків у матриці
     * @param columns Кількість стовпців у матриці
     * @return Випадково згенерована матриця
     */
    public static int[][] generateRandomMatrix(int rows, int columns) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(100); // Генерує випадкове число від 0 до 99
            }
        }
        
        return matrix;
    }
}
