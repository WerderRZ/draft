package Tests.Notes.TestTask3;

import java.util.List;

public enum NDS {
    N20(20, "green"), N30(30, "black"), NONDS(0, "yelow"), N5(5, "white");
    int value;
    String color;

    NDS(int value, String color) {
        this.value = value;
        this.color = color;
    }

    public List<NDS> getValuesGreatThen5() {
        return List.of(N20, N30);
    }

    public NDS getNDSByValueAndColor(int value, String color) {
        NDS[] ndsArray = NDS.values();

        for (NDS element : ndsArray) {
            if (element.value == value && element.color.equals(color)) {
                return element;
            }
        }
        return null;
    }
}
