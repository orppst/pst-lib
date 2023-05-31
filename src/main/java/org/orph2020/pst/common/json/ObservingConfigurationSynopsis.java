package org.orph2020.pst.common.json;

public class ObservingConfigurationSynopsis {

    public long id;

    public String telescopeName;

    public String instrumentName;

    public String backendName;

    public ObservingConfigurationSynopsis(long id, String telescopeName, String instrumentName,
                                          String backendName)
    {
        this.id = id;
        this.telescopeName = telescopeName;
        this.instrumentName = instrumentName;
        this.backendName = backendName;
    }
}
