package com.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/*
    Name    : Monu KD (monukd01dev)
    Project : StandaloneCollection
    Date    : 04-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class Me {
    private List<String> friends;
    private Map<String,String> details;
    private Properties jdbc;

    public Me() {
        super();
    }

    public Me(List<String> friends, Map<String, String> details, Properties jdbc) {
        this.friends = friends;
        this.details = details;
        this.jdbc = jdbc;
    }

    public List<String> getFriends() {
        return friends;
    }

    public Map<String, String> getDetails() {
        return details;
    }

    public Properties getJdbc() {
        return jdbc;
    }

    @Override
    public String toString() {
        return "Me{" +
                "friends=" + friends +
                ", details=" + details +
                ", JDBC=" + jdbc +
                '}';
    }
}
