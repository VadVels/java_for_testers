package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class NewGroupTest extends TestBase {


    @Test
    public void newGroup() {
        app.groups().newGroup(new GroupData("Group name", "Group header", "Group footer"));
    }

    @Test
    public void newGroupWithEmptyName() {
        app.groups().newGroup(new GroupData());
    }

    @Test
    public void newGroupWithEmptyWithNameOnly() {
        app.groups().newGroup(new GroupData().withName("some name"));
    }
}
