package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class NewGroupTest extends TestBase {


    @Test
    public void newGroup() {
        app.openGroupsPage();
        app.newGroup(new GroupData("Group name", "Group header", "Group footer"));
    }

    @Test
    public void newGroupWithEmptyName() {
        app.openGroupsPage();
        app.newGroup(new GroupData());
    }

    @Test
    public void newGroupWithEmptyWithNameOnly() {
        app.openGroupsPage();
        var emptyGroup = new GroupData();
        var groupWithName = emptyGroup.withName("some name");
        app.newGroup(groupWithName);
    }
}
