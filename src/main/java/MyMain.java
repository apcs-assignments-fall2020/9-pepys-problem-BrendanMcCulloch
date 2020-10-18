public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int b = 0;
        double y = 0.0;
        for (int i = 0; i < 10000; i++){
            for (int j = 0; j < 6; j++){
                b = (int) ((Math.random() * 6) + 1);
                if (b == 6){
                    y += 1;
                    break;
                } 
            }
        }
        double ou = (y / 10000.0) * 100.0;
        return ou;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int b = 0;
        double y = 0.0;
        int u = 0;
        for (int i = 0; i < 10000; i++){
            u = 0;
            for (int j = 0; j < 12; j++){
                b = (int) ((Math.random() * 6) + 1);
                if (b == 6){
                    u += 1;
                }
                if (u == 2){
                    y += 1;
                    break;
                }
            }
        }
        double oooo = (y / 10000.0) * 100.0;
        return (oooo);
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int b = 0;
        double y = 0.0;
        int u = 0;
        for (int i = 0; i < 10000; i++){
            u = 0;
            for (int j = 0; j < 18; j++){
                b = (int) ((Math.random()*6) + 1);
                if (b == 6){
                    u += 1;

                }
                if (u == 3){
                    y += 1;
                    break;
                }
            }
        }
        double ooui = (y / 10000.0) * 100.0;
        return (ooui);
    }


    public static void main(String[] args) {
        System.out.println("Probability of one six in 6 rolls " + probabilityOneSix());
        System.out.println("probability of 2 sixes in 12 rolls " + probabilityTwoSixes());
        System.out.println("probability of 3 sixes in 18 rolls " + probabilityTwoSixes());
    }
}
