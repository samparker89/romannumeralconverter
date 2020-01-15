import java.util.ArrayList;
import java.util.Collections;

public class RomanNumeralConverter {

    public String convert(int value){

        if(value < 1 || value > 3999999){
            return "Number must be between 1 - 3999999";
        }

        var sb = new StringBuilder();

        var numericUnits = new ArrayList<>(RomanNumeral.VALUES.keySet());
        Collections.sort(numericUnits, Collections.reverseOrder());

        var remainder = value;
        for (var numericUnit : numericUnits) {
            remainder = calculateNumericUnit(sb, remainder, numericUnit);
        }

        return sb.toString().strip();
    }

    private int calculateNumericUnit(StringBuilder sb, int value, int numericUnit){
        int wholeUnits = value / numericUnit;

        var romanNumeral = RomanNumeral.VALUES.get(numericUnit);

        if (wholeUnits == 4){
            var secondNumeral = getSecondRomanNumeralCharacter(numericUnit);
            sb.append("*" + romanNumeral + secondNumeral + "*");
        } else {
            for (int i = 0; i < wholeUnits; i++) {
                sb.append(romanNumeral);
            }
        }

        return value % numericUnit;
    }

    private String getSecondRomanNumeralCharacter(int numericUnit){
        var secondNumeralNumericValue = numericUnit * 5;
        var secondNumeralValue = RomanNumeral.VALUES.get(secondNumeralNumericValue);
        return secondNumeralValue;
    }
}