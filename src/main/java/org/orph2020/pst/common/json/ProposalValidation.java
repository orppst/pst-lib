package org.orph2020.pst.common.json;

import java.util.Date;

public class ProposalValidation {
    public long id;
    public String title;
    public Boolean isValid;
    public String info;
    public String warnings;
    public String errors;

    public ProposalValidation(long id, String title, Boolean isValid, String info, String warnings, String errors)
    {
        this.id = id;
        this.title = title;
        this.isValid = isValid;
        this.info = info;
        this.warnings = warnings;
        this.errors = errors;
    }

    public ProposalValidation() {}
}
