package test1219;

import java.util.ArrayList;
import java.util.List;

public class test306 extends over{
    public static int aa;
    public test306() {
        super(aa);
    }

    @Override
    void getInt(int aa) {

    }

    enum Direction {
        EAST(1,"a"), SOTH(2,"b"), WEST(3,"c"), NORTH(4,"d");
        private static final Direction[] dir = Direction.values();
        private static final List<String> symbolStr = new ArrayList<>();
        private static final List<String> dirStr = new ArrayList<>();

        private final int value;
        private final String symbol;
        Direction(int value, String Symbol) {
            this.value = value;
            this.symbol = Symbol;
        }
        int getValue() {return value;}
        String getSymbol() {return symbol;}
        public static List getSymbols() {
            for(Direction d : dir) {
                symbolStr.add(d.getSymbol());
            }
            return symbolStr;
        }
        public static List getDirection() {
            for(Direction d : dir) {
                dirStr.add(d.name());
            }
            return dirStr;
        }
    }
    public static void main (String[]args){
        System.out.println(Direction.getSymbols());
        System.out.println(Direction.getDirection());
        }
    }

    class over {
    int a;
        over (int a){}
        void getInt(int aa){
            this.a = aa;
        }
    }
