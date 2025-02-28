package org.orph2020.pst.common.json;

import java.util.List;

// the return type for the telescope names.
public class OpticalTelescopeNames 
{
    public List<String> names;
    public int length;

    /**
     * generates the names and length.
     *
     * @param names: the telescope names.
     * @param length: the number of them.
     */
    public OpticalTelescopeNames(List<String> names, int length) {
        this.names = names;
        this.length = length;
    }
}
