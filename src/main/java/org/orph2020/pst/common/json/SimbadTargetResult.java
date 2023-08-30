package org.orph2020.pst.common.json;

/*
  Auxiliary class to contain the relevant data of a SIMBAD "ident" query
*/

public class SimbadTargetResult {

    public String targetName;

    public String spaceSystemCode;

    public String epoch;

    public double raDegrees;

    public double decDegrees;

    public
    SimbadTargetResult(String targetName, String spaceSystemCode, String epoch, double raDegrees, double decDegrees)
    {
        this.targetName = targetName;
        this.spaceSystemCode = spaceSystemCode;
        this.epoch = epoch;
        this.raDegrees = raDegrees;
        this.decDegrees = decDegrees;
    }

    public
    SimbadTargetResult() {}

}
