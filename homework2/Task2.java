

// Изменения не требуются.

public class Task2{

public static void main(String[] args) {
   int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // объявление и инициализация массива
   
   try {
      int d = 2;  // Заменяем значение нулем на другое ненулевое число
      double catchedRes1 = intArray[8] / d;
      System.out.println("catchedRes1 = " + catchedRes1);
   } catch (ArithmeticException e) {
      System.out.println("Catching exception: " + e);
   }
}
}