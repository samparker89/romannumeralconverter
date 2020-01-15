import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {
    private static final String ONE = "I";
    private static final String FIVE = "V";
    private static final String TEN = "X";
    private static final String FIFTY = "L";
    private static final String ONE_HUNDRED = "C";
    private static final String FIVE_HUNDRED = "D";
    private static final String ONE_THOUSAND = "M";
    private static final String FIVE_THOUSAND = "_V_";
    private static final String TEN_THOUSAND = "_X_";
    private static final String FIFTY_THOUSAND = "_L_";
    private static final String ONE_HUNDRED_THOUSAND = "_C_";
    private static final String FIVE_HUNDRED_THOUSAND = "_D_";
    private static final String ONE_MILLION = "_M_";

    private static final Map<Integer, String> BACKED_VALUES = new HashMap<>();

    public static final Map<Integer, String> VALUES;

    static {
        BACKED_VALUES.put(1, ONE);
        BACKED_VALUES.put(5, FIVE);
        BACKED_VALUES.put(10, TEN);
        BACKED_VALUES.put(50, FIFTY);
        BACKED_VALUES.put(100, ONE_HUNDRED);
        BACKED_VALUES.put(500, FIVE_HUNDRED);
        BACKED_VALUES.put(1000, ONE_THOUSAND);
        BACKED_VALUES.put(5000, FIVE_THOUSAND);
        BACKED_VALUES.put(10000, TEN_THOUSAND);
        BACKED_VALUES.put(50000, FIFTY_THOUSAND);
        BACKED_VALUES.put(100000, ONE_HUNDRED_THOUSAND);
        BACKED_VALUES.put(500000, FIVE_HUNDRED_THOUSAND);
        BACKED_VALUES.put(1000000, ONE_MILLION);

        VALUES = Collections.unmodifiableMap(BACKED_VALUES);
    }
}
