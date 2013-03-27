package com.sfdc.alge.configs;

import com.sfdc.http.queue.HttpWorkItem;
import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * @author psrinivasan
 *         Date: 3/18/13
 *         Time: 7:02 PM
 */
public class UserTypeTest extends TestCase {
    public void testGetRequestList() throws Exception {
        Group group = new Group("src/test/java/com/sfdc/alge/configs/SingleGroupBasicUser.json");
        UserType userType = group.getUserType();
        ArrayList<HttpWorkItem> items = userType.getRequestList();
        for (int i = 0 ; i < items.size(); i ++) {
            assertEquals("http://localhost:8080", items.get(i).getInstance());
            assertEquals("GET", items.get(i).getOperation());

        }

    }
}
