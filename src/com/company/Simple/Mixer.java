package com.company.Simple;

public class Mixer {  // Functional, informal
    double coldTemp = 15;
    double hotTemp = 60;
    double cold = 0;
    double hot = 0;
    // default constructor

    public void setValues(int cold, int hot) {
        this.cold = cold;
        this.hot = hot;
    }

    public double getTemp() {
        return (cold * coldTemp + hot * hotTemp) / (cold + hot);
    }

}
