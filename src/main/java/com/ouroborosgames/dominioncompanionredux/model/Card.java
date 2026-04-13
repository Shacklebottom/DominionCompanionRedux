package com.ouroborosgames.dominioncompanionredux.model;

public class Card {
    private String name;
    private int cost;
    private CardTypes[] types;
    private String[] expansions;
    private Boolean provinceFlag;

    //getters
    public String getName() { return name; }
    public int getCost() { return cost; }
    public CardTypes[] getTypes() { return types; }
    public String[] getExpansions() { return expansions; }
    public Boolean getProvinceFlag() { return provinceFlag; }

    //setters
    public void setName(String name) { this.name = name; }
    public void setCost(int cost) { this.cost = cost; }
    public void setTypes(CardTypes[] types) { this.types = types; }
    public void setExpansions(String[] expansions) { this.expansions = expansions; }
    public void setProvinceFlag(Boolean provinceFlag) { this.provinceFlag = provinceFlag; }
    
}

