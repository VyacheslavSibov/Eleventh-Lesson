package wrappers;
//ctrl + alt + L

public class WrapperTest {
    public static void main(String[] args) {

        Character char1 = 'u';
        Character char2 = Character.valueOf('k');
        Character char3 = new Character('r');

        Byte byte1 = 123;
        Byte byte2 = Byte.valueOf((byte) 123);
        Byte byte3 = new Byte((byte) 123);
        Byte byte4 = Byte.parseByte("123");

        Short short1 = 298;
        Short short2 = Short.valueOf((short) 298);
        Short short3 = new Short((short) 298);
        Short short4 = Short.parseShort("298");

        Integer integer1 = 35_000;
        Integer integer2 = Integer.valueOf(3423);
        Integer integer3 = new Integer(3423);
        Integer integer4 = Integer.parseInt("3423");

        Long long1 = 5_323_322L;
        Long long2 = Long.valueOf(5_323_322L);
        Long long3 = new Long(5_323_322L);
        Long long4 = Long.parseLong("5323322");

        Float float1 = 18.6f;
        Float float2 = Float.valueOf(18.6f);
        Float float3 = new Float(18.6f);
        Float float4 = Float.parseFloat("18.6f");

        Double double1 = 193_122.032_436;
        Double double2 = Double.valueOf(13_122.032_436);
        Double double3 = new Double(13_122.032_436);
        Double double4 = Double.parseDouble("13122.032436");
        Double double5 = 0.0;
        Double double6 = 3.12;
        Double nanValue = double5 / double5;
        Double infinityValue = double6 / double5;

        Boolean boolean1 = true;
        Boolean boolean2 = Boolean.valueOf(true);
        Boolean boolean3 = new Boolean(true);
        Boolean boolean4 = Boolean.parseBoolean("false");

        Double myDouble = 111.111;
        byte myByte = myDouble.byteValue();
        short myShort = myDouble.shortValue();
        int myInt = myDouble.intValue();
        float myFloat = myDouble.floatValue();
        long myLong = myDouble.longValue();

        System.out.println("NaN: " + nanValue);
        System.out.println("Infinity: " + infinityValue);

        if (nanValue.isNaN()) {
            System.out.println("Value of NaNvalue: " + "NaN");
        }

        if (infinityValue.isInfinite()) {
            System.out.println("Value of infinityValue: " + "Infinity");
        }

        Long Long1 = 120L;
        Long Long2 = 120L;
        System.out.println(Long1 == Long2);

        Long1 = 1200L;
        Long2 = 1200l;
        System.out.println(Long1 == Long2);
    }
}