package models;

public class Turn {

    private int value = 0;

    public Turn() {
        value = 0;
    }

    public void change(){
        value = value + 1;
    }

    public int take(){
        return value;
    }
}
