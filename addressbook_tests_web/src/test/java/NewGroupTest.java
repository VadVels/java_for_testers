import org.junit.jupiter.api.Test;

public class NewGroupTest extends TestBase {


    @Test
    public void newGroup() {
        openGroupsPage();
        newGroup("Group name", "Group header", "Group footer");
    }

    @Test
    public void newGroupWithEmptyName() {
        openGroupsPage();
        newGroup("", "", "");
    }
}
