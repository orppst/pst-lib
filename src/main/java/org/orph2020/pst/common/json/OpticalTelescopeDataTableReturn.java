package org.orph2020.pst.common.json;

public class OpticalTelescopeDataTableReturn {
    // the telescope name.
    private String telescopeName;

    // the instrument name.
    private String instrumentName;

    /**
     * constructor for the telescope data for saving.
     *
     * @param telescopeName: the telescope name.
     * @param instrumentName: the instrument name chosen for the choices.
     */
    public OpticalTelescopeDataTableReturn(
            String telescopeName, String instrumentName) {
        this.telescopeName = telescopeName;
        this.instrumentName = instrumentName;
    }

    public OpticalTelescopeDataTableReturn() {
        // No-argument constructor for Hibernate ORM
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
}
