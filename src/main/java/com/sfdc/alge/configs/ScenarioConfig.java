package com.sfdc.alge.configs;

import java.util.HashMap;

/**
 * @author psrinivasan
 *         Date: 3/5/13
 *         Time: 4:40 PM
 */
public interface ScenarioConfig {
    public String getGroupNames();
    public HashMap<String, String> getGroupInfo(String groupName);
    public String getGroupConcurrency(String groupName);
    public String getUserType(String groupName);
    public String getRequestsFileLocation(String groupName);
}
