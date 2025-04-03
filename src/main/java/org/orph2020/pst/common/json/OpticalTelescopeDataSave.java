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

    /**
     * constructor for the telescope data for saving.
     *
     * @param proposalID: the proposal id.
     * @param observationID: the observation id.
     * @param telescopeName: the telescope name.
     * @param instrumentName: the instrument name chosen for the choices.
     * @param choices: the choices made.
     */
    public OpticalTelescopeDataSave(
            String proposalID, String observationID, String telescopeName,
            String instrumentName, HashMap<String, String> choices) {
        this.primaryKey = new OpticalTelescopeDataId(proposalID, observationID);
        this.telescopeName = telescopeName;
        this.instrumentName = instrumentName;
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
}
