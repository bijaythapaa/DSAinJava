package randompractise;

import java.util.ArrayList;

public class PractiseDemo {

    public static double ScalesFitness(ArrayList<Double> weights, int reps) {

//        if (scasol.length() > weights.size()) return (-1);
//        double lhs = 0.0, rhs = 0.0;
//        int n = scasol.length();
//
//        for (int i = 0; i < n; i++) {
//            if (scasol.charAt(i) == '0') {
//                lhs += weights.get(i);
//            } else {
//                rhs += weights.get(i);
//            }
//        }
//
//        return (Math.abs(lhs - rhs));
        return 22d;
    }

    public static void testFitnessFC() {
        ArrayList<Double> weights = new ArrayList<Double>();
        weights.add(1.0);
        weights.add(2.0);
        weights.add(3.0);
        weights.add(4.0);
        weights.add(10.0);
        weights.add(4.0);
        weights.add(3.0);
        System.out.println(weights);

        System.out.print("Fitness: ");
        double testFitness = ScalesFitness(weights, 5);
        System.out.print(testFitness);
    }
}
