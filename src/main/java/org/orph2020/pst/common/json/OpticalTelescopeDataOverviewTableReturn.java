package org.orph2020.pst.common.json;

public class OpticalTelescopeDataOverviewTableReturn extends
        OpticalTelescopeDataTableReturn{
    // the time selection.
    private String telescopeTimeValue;

    // the time selection unit.
    private String telescopeTimeUnit;

    // the condition.
    private String condition;

    /**
     * constructor for the telescope data for saving.
     *
     * @param telescopeName: the telescope name.
     * @param instrumentName: the instrument name chosen for the choices.
     * @param telescopeTimeValue: the value of time.
     * @param telescopeTimeUnit: the unit of time.
     * @param condition: the condition.
     */
    public OpticalTelescopeDataOverviewTableReturn (
            String telescopeName, String instrumentName,
            String telescopeTimeValue, String telescopeTimeUnit,
            String condition) {
        super(telescopeName, instrumentName);
        this.telescopeTimeUnit = telescopeTimeUnit;
        this.telescopeTimeValue = telescopeTimeValue;
        this.condition = condition;
    }

    public OpticalTelescopeDataOverviewTableReturn() {
        // No-argument constructor for Hibernate ORM
    }

    public String getTelescopeTimeValue() {
        return telescopeTimeValue;
    }

    public void setTelescopeTimeValue(String telescopeTimeValue) {
        this.telescopeTimeValue = telescopeTimeValue;
    }

    public String getTelescopeTimeUnit() {
        return telescopeTimeUnit;
    }

    public void setTelescopeTimeUnit(String telescopeTimeUnit) {
        this.telescopeTimeUnit = telescopeTimeUnit;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
