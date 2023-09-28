package Training.s7;

public class Main {
    public static void main(String[] args) {
        IMapWithAllUniquee<String, Integer> map = new MapWithAllUniquee<>();
        map.put("Sam", 1);
        map.put("Tom", 5);
        map.put("Re", 5);
        map.put("Sa", 5);
        map.put("Aa", 7);
        map.put("Ab", 7);

        map.remove("Re");
        map.remove("Sa");
        map.remove("Aa");

        System.out.println(map);
        System.out.println("Map is unique = " + map.isAllUnique());

    }
}
