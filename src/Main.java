//Задача 1:
//Имате 3 критика, всеки от които е дал оценка за 4 филма.
//Оценките са представени чрез следната таблица:

//                Ф И Л М И
//
//              0   1   2   3
//   К        _________________
//   Р    0   | 4 | 6 | 2 | 5 |
//   И        -----------------
//   Т    1   | 7 | 9 | 4 | 8 |
//   И        -----------------
//   Ц    2   | 6 | 9 | 3 | 7 |
//   И        -----------------
//
//Принтирайте средната оценка за филм #3.

public class Main {
    public static void main(String[] args) {
        int[][] ratings = {
                {4, 6, 2, 5},
                {7, 9, 4, 8},
                {6, 9, 3, 7}
        };
        int filmIndex = 2;
        double sum = 0;
        int numCritics = ratings.length;

        for (int i = 0; i < numCritics; i++) {
            sum += ratings[i][filmIndex];
        }
        double averageRating = sum/numCritics;
        System.out.println("Средната оценка за филм №3 е: " + averageRating);
    }
}