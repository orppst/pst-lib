package org.orph2020.pst.common.json;

// class to hold summary totals of the observing time allocated per cycle, broken down by
// observing mode and allocation grade

public class CycleObservingTimeTotal {
    public String modeName;
    public String gradeName;
    public Double totalTime;

    public CycleObservingTimeTotal(String modeName, String gradeName, Double totalTime) {
        this.modeName = modeName;
        this.gradeName = gradeName;
        this.totalTime = totalTime;
    }

    public CycleObservingTimeTotal() {}
}
