import org.junit.jupiter.api.Test;

public class DeleteGroupTest extends TestBase {


    @Test
    public void deleteGroup() {
        openGroupsPage();
        if (!isGroupPresent()) {
            newGroup("Group name", "Group header", "Group footer");
        }
        removeGroup();
    }


}
