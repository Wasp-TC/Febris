package com.project.febris;

import java.util.Hashtable;

public class Database {

    Hashtable<String, Integer> infected_data;

    public Database(){
        this.infected_data = new Hashtable<>();
        infected_data.put("New York", 83712);
        infected_data.put("New Jersey", 22255);
        infected_data.put("Michigan", 9334);
        infected_data.put("California", 8155);
        infected_data.put("Massachusetts", 7738);
        infected_data.put("Illinois", 6980);
        infected_data.put("Florida", 6946);
        infected_data.put("Louisiana", 6424);
        infected_data.put("Pennsylvania", 5805);
        infected_data.put("Washington", 5222);
        infected_data.put("Georgia", 4638);
        infected_data.put("Texas", 3997);
        infected_data.put("Colorado", 3338);
        infected_data.put("Connecticut", 3128);
    }

    private Hashtable getInfected(){
        return this.infected_data;
    }

}
