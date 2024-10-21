package boxedvsprimitive;

/**
 * @author : bijay.thapa
 * @created : 10/9/23, Monday
 * @Description :
 **/
public class MinMaxPrimitiveBoxed {
    private Boolean trueValue;
    private Boolean falseValue;
    private Byte minByteValue;
    private Byte maxByteValue;
    private Character minCharValue;
    private Character maxCharValue;
    private Short minShortValue;
    private Short maxShortValue;
    private Integer minIntValue;
    private Integer maxIntValue;
    private Float minFloatValue;
    private Float maxFloatValue;
    private Long minLongValue;
    private Long maxLongValue;
    private Double minDoubleValue;
    private Double maxDoubleValue;
}

class MinMaxPrimitivePlain {
    private boolean trueValue;
    private boolean falseValue;
    private byte minByteValue;
    private byte maxByteValue;
    private char minCharValue;
    private char maxCharValue;
    private short minShortValue;
    private short maxShortValue;
    private int minIntValue;
    private int maxIntValue;
    private float minFloatValue;
    private float maxFloatValue;
    private long minLongValue;
    private long maxLongValue;
    private double minDoubleValue;
    private double maxDoubleValue;
}

class TestMemoryCost {
    public static void main(String[] args) {
        /* Memory Cost : Boxed vs Primitive */
//        System.out.println(GraphLayout.parseInstance(new MinMaxPrimitiveBoxed()).toFootPrint());
//        System.out.println(GraphLayout.parseInstance(new MinMaxPrimitivePlain()).toFootPrint());

        /* Memory Footprint :  Boxed vs Alternative vs Primitive Sets */
//        HashSet<Integer> jdkBoxedSet = new HashSet<>(Interval.oneTo(10));
//        MutableSet<Integer> ecBoxedSet = Interval.oneTo(10).toSet();
//        MutableIntSet ecPrimitiveSet = IntInterval.oneTo(10).toSet();
//        System.out.println(GraphLayout.parseInstance(jdkBoxedSet).toFootPrint());
//        System.out.println(GraphLayout.parseInstance(ecBoxedSet).toFootPrint());
//        System.out.println(GraphLayout.parseInstance(ecPrimitiveSet).toFootPrint());

        /* Memory Footprint : Mutable vs Immutable Sets */
//        Set<Integer> jdkMutableSet = new HashSet<>();
//        jdkMutableSet.add(1);
//        jdkMutableSet.add(2);
//        Set<Integer> jdkImmutableSet = Set.copyOf(jdkMutableSet);
//        System.out.println(GraphLayout.parseInstance(jdkMutableSet).toFootPrint());
//        System.out.println(GraphLayout.parseInstance(jdkImmutableSet).toFootPrint());
    }
}
