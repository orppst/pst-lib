package org.orph2020.pst.common.json;

public class ObservatoryQuestion {
    public int id;
    public String label;
    public String description;
    public String query;
    public String response;
    public int minChar;
    public int maxChar;

    public ObservatoryQuestion() {}

    public ObservatoryQuestion(int id, String label, String description, String query, String response,
                               int minChar, int maxChar) {
        this.id = id;
        this.label = label;
        this.description = description;
        this.query = query;
        this.response = response;
        this.minChar = minChar;
        this.maxChar = maxChar;
    }
}
