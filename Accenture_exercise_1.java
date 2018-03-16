
package accenture_exercise_1;

/**
 * 1. Exercise:
 *Create a function that takes a list of numbers as parameter and returns the average value of the odd
 *numbers in the list.
 * 
 * @author Kazai Ágnes
 */
public class Accenture_exercise_1 {

    
    public static void main(String[] args) {
        int[] numbers1 ={1, 2, 3, 4, 5, 6};   
        int[] numbers2 ={-3, -2, -1, 0, 1, 2, 3, 5, 7};
        System.out.println("The average value of the odd numbers is:  " + averageValueOfTheOddNumbers(numbers1, true)); 
        System.out.println("The average value of the odd numbers is:  " + averageValueOfTheOddNumbers(numbers2, false));

    }
    /**
     * 
     * @param array A két tömb közül valamelyiket várja első paraméterként.
     * @param averageType Logikai értéket vár második paraméterként.True/False
     * @return Exc_1: Az összeget elosztjuk a páratlan elemek számával.(Átlag)
     *         Exc._2:Az összeget a tömb összes elemével osztom el.(Súlyozott átlag)
     */
    public static float averageValueOfTheOddNumbers(int[] array, boolean averageType){ 
        int sum = 0;
        int count = 0;
        if (averageType){  //átlagszámítás ex. 1
            for( int i = 0; i < array.length; i++ ){
                if( array[i] %2 != 0){   //Ha maradék nélül osztható, akkor páros, ha maradékosan, akkor páratlan a szám.
                    sum += array[i];
                    count++;
                }
            }return (float)sum / count;  
      
        }else{
            for( int i = 0; i < array.length; i++ ){   //exc 2. súlyozott átlag
                if( array[i] %2 != 0){
                    sum += array[i];
                }
            }
        }return (float)sum / array.length; 
    }
}
