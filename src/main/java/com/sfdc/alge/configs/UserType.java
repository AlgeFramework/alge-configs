package com.sfdc.alge.configs;

import au.com.bytecode.opencsv.CSVReader;
import com.sfdc.http.queue.HttpWorkItem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author psrinivasan
 *         Date: 3/5/13
 *         Time: 7:36 PM
 */
public class UserType {
    private String description;
    private String requestsFile;
    private String userType;
    private String name;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequestsFile() {
        return requestsFile;
    }

    public void setRequestsFile(String requestsFile) {
        this.requestsFile = requestsFile;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getRequestList() throws IOException {
        CSVReader reader = new CSVReader(new FileReader(requestsFile));
        ArrayList<HttpWorkItem> list = new ArrayList<HttpWorkItem>(10);
        String[] nextLine = reader.readNext();
        while (nextLine != null) {
            HttpWorkItem w = new HttpWorkItem();
            w.setInstance(nextLine[0]);
            w.setOperation(nextLine[1]);
            list.add(w);
            nextLine = reader.readNext();
        }
        return list;
    }
}
