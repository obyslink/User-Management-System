package krzysztof.companytask.UserManagementSystem.commands;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UsersGroupCommand {

    private Long id;
    private String groupName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
