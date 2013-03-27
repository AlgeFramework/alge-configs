package com.sfdc.alge.configs;

import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author psrinivasan
 *         Date: 3/5/13
 *         Time: 5:06 PM
 */

public class JSONConfig  {
    private String [] groupNames;

    public String [] getGroupNames() {
        return groupNames;
    }

    public void setGroupNames(String [] groupNames) {
        this.groupNames = groupNames;
    }

    public JSONConfig() {

    }

    public static void main(String[] args) throws IOException {
        JSONConfig jsonConfig = new JSONConfig();
        UserType u = new UserType();
        Group g = new Group("");
        g.setDescription("A single group scenario ...");
        g.setUserType(u);
        g.setName("G1");
        g.setMaxConcurrency(10);
        u.setDescription("A basic user ... and other optional text");
        u.setRequestsFile("/tmp/flow.txt");
        u.setName("my name");
        u.setUserType("BasicUser");

        ObjectMapper mapper = new ObjectMapper();

        try {

            System.out.println(mapper.defaultPrettyPrintingWriter()
                    .writeValueAsString(g));

        } catch (JsonGenerationException e) {

            e.printStackTrace();

        } catch (JsonMappingException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
