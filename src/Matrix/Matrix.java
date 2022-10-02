package Matrix;

public class Matrix {
    int str;
    int col;
    int[][] array;

    public Matrix(int str1, int col1){
        str = str1;
        col = col1;
        array = new int[str1][col1];
    }

    public void Print(){
        for(int i = 0; i < str; i++){
            for(int j = 0; j < col; j++){
                System.out.print("\t" + array[i][j]);
            }
            System.out.println();
        }
    }

    public static Matrix Plus(Matrix a, Matrix b){
        Matrix result = new Matrix(a.str, a.col);

        for(int i = 0; i < a.str; i++){
            for(int j = 0; j < a.col; j++){
                result.array[i][j] = a.array[i][j] + b.array[i][j];
            }
        }

        return result;
    }

    public static Matrix Umnozhenie(Matrix a, int num){
        Matrix result = new Matrix(a.str, a.col);

        for(int i = 0; i < a.str; i++){
            for(int j = 0; j < a.col; j++){
                result.array[i][j] = a.array[i][j] * num;
            }
        }

        return result;
    }

    public static Matrix Peremnozhenie(Matrix a, Matrix b){
        Matrix result = new Matrix(a.str, a.col);

        for(int i = 0; i < a.str; i++){
            for(int j = 0; j < a.col; j++){
                for(int k = 0; k < a.col; k++) {
                    result.array[i][j] = result.array[i][j] + a.array[i][k] * b.array[k][j];
                }
            }
        }

        return result;
    }
}
