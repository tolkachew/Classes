package com.company.Switch;

public class Switch {
    public boolean isTurned() {
        return turned;
    }

    public void setTurned(boolean turned) {
        this.turned = turned;
    }

    protected boolean turned;

    @Override
    public String toString() {
        return "Switch{" + "turned=" + turned + '}';
    }

    public void runProgram(int number){}
}
