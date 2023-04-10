package javachallengers.optional;

import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 3/30/21 - 9:29 PM
 */

public class OptionalChallenge {

    private static String finalZionValue = "";
    private static int matrixCount = 0;

    public static void main(String... matrix) {
        Optional<String> optFromMatrix = Optional.ofNullable(finalZionValue);

        var agentSmith = "Virus";

        finalZionValue += Optional.ofNullable(agentSmith).orElse(getVisionFromOracle());
        finalZionValue += optFromMatrix.orElseGet(OptionalChallenge::getVisionFromOracle);

        finalZionValue += matrixCount;
        String neo = null;

        try {
            Optional.ofNullable(neo).orElseThrow(IllegalArgumentException::new);
        } catch (Exception e) {
            finalZionValue += Optional.ofNullable(neo).or(() -> Optional.of("theOne")).get();
        }

        finalZionValue += Optional.of("trinity").stream().map(String::toUpperCase)
                .filter(trinity -> trinity.equals("TRINITY")).collect(Collectors.joining());

        System.out.println(finalZionValue);

    }

    private static String getVisionFromOracle() {
        matrixCount++;
        finalZionValue = "KeyMaker";
        return "Architect";
    }
}
