package com.company.Switch;

public class SwitchRemote extends Switch {

    @Override
    public String toString() {
        String s = super.toString();
        return s+" remote";
    }

    public void runProgram(int number){
        switch (number){
            case 0:
                System.out.println("off");
                break;
            case 1:
                System.out.println("on");
                break;
            case 2:
                System.out.println("program1");
                break;
        }
    }
}

