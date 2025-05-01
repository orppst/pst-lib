package org.orph2020.pst.common.json;
import jakarta.persistence.*;

import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "optical_telescope_data")
public class OpticalTelescopeDataSave {
    @EmbeddedId
    private OpticalTelescopeDataId primaryKey;

    @ElementCollection
    @CollectionTable(name = "telescope_choices", joinColumns = {
        @JoinColumn(name = "proposal_id", referencedColumnName = "proposalID",
                    foreignKey = @ForeignKey(
                            foreignKeyDefinition = "ON DELETE CASCADE")),
        @JoinColumn(name = "observation_id",
                    referencedColumnName = "observationID",
                    foreignKey = @ForeignKey(
                            foreignKeyDefinition = "ON DELETE CASCADE"))
    })

    // the new states of the choices.
    @MapKeyColumn(name = "choice_key")
    @Column(name = "choice_value")
    private Map<String, String> choices;

    // the telescope name.
    @Column(name = "telescope_name")
    private String telescopeName;

    // the instrument name.
    @Column(name = "instrument_name")
    private String instrumentName;

    // the time value
    @Column(name = "telescope_time_value")
    private String telescopeTimeValue;

    @Column(name = "telescope_time_unit")
    private String telescopeTimeUnit;

    @Column(name = "user_type")
    private String userType;

    @Column(name = "condition")
    private String condition;

    /**
     * constructor for the telescope data for saving.
     *
     * @param proposalID: the proposal id.
     * @param observationID: the observation id.
     * @param telescopeName: the telescope name.
     * @param instrumentName: the instrument name chosen for the choices.
     * @param telescopeTimeValue: the telescope time value.
     * @param telescopeTimeUnit: the telescope time unit.
     * @param userType: the user type.
     * @param condition: the condition.
     * @param choices: the choices made.
     */
    public OpticalTelescopeDataSave(
            String proposalID, String observationID, String telescopeName,
            String instrumentName, String telescopeTimeValue,
            String telescopeTimeUnit, String userType,
            String condition,
            HashMap<String, String> choices) {
        this.primaryKey = new OpticalTelescopeDataId(proposalID, observationID);
        this.telescopeName = telescopeName;
        this.instrumentName = instrumentName;
        this.telescopeTimeUnit = telescopeTimeUnit;
        this.telescopeTimeValue = telescopeTimeValue;
        this.userType = userType;
        this.condition = condition;
        this.choices = choices;
    }

    public OpticalTelescopeDataSave() {
        // No-argument constructor for Hibernate ORM
    }

    public Map<String, String> getChoices() {
        return choices;
    }

    public void setChoices(Map<String, String> choices) {
        this.choices = choices;
    }

    public void setTelescopeName(String telescopeName) {
        this.telescopeName = telescopeName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public String getTelescopeName() {
        return telescopeName;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public OpticalTelescopeDataId getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(OpticalTelescopeDataId primaryKey) {
        this.primaryKey = primaryKey;
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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "OpticalTelescopeDataSave{" +
                "primaryKey=" + primaryKey.toString() +
                ", choices values=" + choices.values().toString() +
                ", choices keys=" + choices.keySet().toString() +
                ", choices length=" + choices.size() +
                ", telescopeName='" + telescopeName + '\'' +
                ", instrumentName='" + instrumentName + '\'' +
                ", telescopeTimeValue='" + telescopeTimeValue + '\'' +
                ", telescopeTimeUnit='" + telescopeTimeUnit + '\'' +
                ", userType='" + userType + '\'' +
                ", condition='" + condition + '\'' +
                '}';
    }
}
