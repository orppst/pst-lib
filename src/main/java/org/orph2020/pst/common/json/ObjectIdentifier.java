package org.orph2020.pst.common.json;
/*
 * Created on 17/03/2023 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */

/**
 * Class just to refer to an object in the database.
 * It is used in the APIs when there is a list of objects returned.
 */

public class ObjectIdentifier {

    public long dbid;
    public String code;
    public String name;

    public ObjectIdentifier(long dbid, String name) {
        this.dbid = dbid;
        this.name = name;
    }

/*
 * Allow us to use object identifier with proposals.  There may be a better way to do this.
 */
    public ObjectIdentifier(String code, String title){
        this.code = code;
        this.name = title;
    }


    public ObjectIdentifier(long dbid, String code, String name) {
        this.dbid = dbid;
        this.code = code;
        this.name = name;
    }


    public ObjectIdentifier() {
    }
}
