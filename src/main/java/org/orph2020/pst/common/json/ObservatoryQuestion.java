package org.orph2020.pst.common.json;

public class ObservatoryQuestion {
    public int id;
    public String label;
    public String description;
    public String query;
    public String response;

    public ObservatoryQuestion() {}

    public ObservatoryQuestion(int id, String label, String description, String query, String response) {
        this.id = id;
        this.label = label;
        this.description = description;
        this.query = query;
        this.response = response;
    }
}
