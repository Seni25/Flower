package accenture_exercise_2;

/**
 *2. Exercise
 *    Description
 *    Create a function that takes a text as a parameter and returns an encoded version of the text according
 *    to the following algorithm:
 *    ● each letter in the text is replaced by a letter some fixed number of positions up in the alphabet
 *    ● the number of this shifting positions equals to the number of occurrences of the first letter in
 *    the whole text
 *    ● the algorithm works with lower case letters, it modifies upper case letters to lower case ones as
 *    well
 *    ● the special characters (e.g. spaces, exclamation mark, …) remain the same
 *    ● shifting a letter towards the end of the alphabet continues from the beginning of the alphabet (
 *    z → a
 * 
 * @author Kazai Ágnes
 */
public class Accenture_exercise_2 {

    public static void main(String[] args) {
        System.out.println(letterShifting("aPple larm"));

    }

    /**
     * 
     * @param variable String input
     * @return Az eltolt stringet output.
     */
    public static char[] letterShifting(String variable) {
        String inPut = variable.toLowerCase(); //Ha van nagybetű a karakterek között, átkonvertáljuk kisbetűre.
        char[] outPut = new char[inPut.length()];
        char c = inPut.charAt(0); //Kiolvassa az első karaktert az adott indexen lévő karaktert.

        int count = 0;
        for (int i = 0; i < inPut.length(); i++) { //Megvizsgáljuk, hogy az első karakter hányszor szerepel a sztringben.
            if (inPut.charAt(i) == c) {
                count++;
            }
        }

       /**
        * ASCII kódtábla alapján vizsgálódunk.
        */
        char n = 'a';
        int temp = 0;
        for (int i = 0; i < inPut.length(); i++) {
            char t = inPut.charAt(i);
            int ascii = (int) t;
            if (ascii >= 97 && ascii <= 122) {   //Megvizsgáljuk, hogy benne van-e az ASCII intervellumban.
                temp = ascii + count; //ASCII+az első karakter előfordulásának száma
                outPut[i] = (char) temp;  //cast int-ből char-ba, majd betöltés a kimenő tömbe.
                if (temp > 122) {   //Itt azt vizsgálom, hogy ha túlmegyünk a "z" betűn miután hozzáadtuk az előfordulási számot.
                    int temp2 = temp - 122; //pl. 123-as lett az új ASCII kód, akkor ebből levonom a 122. Megkapjuk, hogy mennyivel léptük túl a z-t.
                    int temp3 = 97 + temp2 - 1;  //Hozzáadjuk az "a" ASCII kódjához azaz 97-hez, majd levonunk 1-et.
                    n = (char) temp3; //Karakterré alakítom.
                    outPut[i] = n;
                }
            } else {
                outPut[i] = t;
            }
        }
        return outPut;
    }
}
