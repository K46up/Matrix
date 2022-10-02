package Matrix;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Matrix a = new Matrix(2,2);
        Matrix b = new Matrix(2,2);

        int num = 2;

        for(int i = 0; i < a.str; i++){
            for(int j = 0; j < a.col; j++){
                a.array[i][j] = random.nextInt(1,11);
                b.array[i][j] = random.nextInt(1,11);
            }
        }

        System.out.println("Матрица а");

        a.Print();

        System.out.println("Матрица b");

        b.Print();

        System.out.println("Сумма матриц");

        Matrix resultPlus = Matrix.Plus(a, b);

        resultPlus.Print();

        System.out.println("Умножение матрицы a на " + num);

        Matrix resultUmnozhenie = Matrix.Umnozhenie(a, num);

        resultUmnozhenie.Print();

        System.out.println("Произведение матриц");

        Matrix resultPeremnozhenie = Matrix.Peremnozhenie(a, b);

        resultPeremnozhenie.Print();

    }
}