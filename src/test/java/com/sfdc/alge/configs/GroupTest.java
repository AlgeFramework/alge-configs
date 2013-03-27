package com.sfdc.alge.configs;
import junit.framework.TestCase;

/**
 * @author psrinivasan
 *         Date: 3/18/13
 *         Time: 3:32 PM
 */

public class GroupTest extends TestCase {

    public void testBasicGroup() throws Exception {
        Group group = new Group("src/test/java/com/sfdc/alge/configs/SingleGroupBasicUser.json");
        assertEquals("A single group scenario ...", group.getDescription());
        assertEquals("G1", group.getName());
        assertEquals(10, group.getMaxConcurrency());
        UserType userType = group.getUserType();
        assertEquals("BasicUser", userType.getUserType());
        assertEquals("my name", userType.getName());
        assertEquals("A basic user .. and other optional text", userType.getDescription());
        assertEquals("/tmp/flow.txt", userType.getRequestsFile());
        System.out.println(group.getDescription());
    }

}
