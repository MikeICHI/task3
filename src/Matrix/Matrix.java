package Matrix;

public class Matrix {
    private int rows;
    private int columns;

    private double[][] matrix;

    //конструктор класса Matrix
    Matrix(int rows, int columns){
        this.columns=columns;
        this.rows=rows;

        this.matrix=new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.matrix[i][j] = Math.random();
            }
        }

    }
    //Метод для сложения с другой матрицей
    public Matrix Addition(Matrix otherMatrix){
        Matrix result = new Matrix(this.rows,this.columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.matrix[i][j] = this.matrix[i][j]+otherMatrix.matrix[i][j];
            }
        }
return result;
    }

    //Метод для умножения матрицы на число
    public void multiplicationByNum(int num){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.matrix[i][j] *= num;
            }
        }
    }



    public Matrix multiplicationByMatrix(Matrix otherMatrix) {

        Matrix result = new Matrix(this.rows, this.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < otherMatrix.columns; j++) {
                for (int k = 0; k < this.columns; k++) {
                    result.matrix[i][j] += this.matrix[i][k] * otherMatrix.matrix[k][j];

                }
            }
        }
        return result;
    }


//Метод для вывода матрицы
    void print(){
        System.out.println("Matrix : ");
        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(this.matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3,3);
        Matrix matrix2 = new Matrix(3,3);

        System.out.println("матрица 1 : ");
        matrix1.print();
        System.out.println("\nматрица 2 : ");
        matrix2.print();

        Matrix sumMatrix = matrix1.Addition(matrix2);
        System.out.println("\nСложение матрицы 1 и матрицы 2 : ");
        sumMatrix.print();

        matrix1.multiplicationByNum(2);
        System.out.println("\nПеремножение матрицы 1 на число 2 : ");
        matrix1.print();

        Matrix multByMatrix = matrix1.multiplicationByMatrix(matrix2);
        System.out.println("\nПеремножение матрицы 1 и матрицы 2 : ");
        multByMatrix.print();



    }


}
