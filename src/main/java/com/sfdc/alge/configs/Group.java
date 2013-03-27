package com.sfdc.alge.configs;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * @author psrinivasan
 *         Date: 3/5/13
 *         Time: 7:40 PM
 */
public class Group {

    private String name;
    private String description;
    private int maxConcurrency;
    private UserType userType;

    public Group() {}

    public Group(String jsonFileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Group group = mapper.readValue(new File(jsonFileName), Group.class);
        name = group.getName();
        description = group.getDescription();
        maxConcurrency = group.getMaxConcurrency();
        userType = group.getUserType();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxConcurrency() {
        return maxConcurrency;
    }

    public void setMaxConcurrency(int maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }
}
