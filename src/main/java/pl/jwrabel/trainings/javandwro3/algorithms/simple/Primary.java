package pl.jwrabel.trainings.javandwro3.algorithms.simple;

/**
 * Created by jakubwrabel on 18.04.2017.
 */
public class Primary {
    public static void main(String[] args) {
        int x = 21;
        boolean isPrimary = isPrimary(x);
        System.out.println(x + " is primary: " + isPrimary);
    }

    public static boolean isPrimary(int x) {
        for (int i = 2; i < x; i++) {
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}
