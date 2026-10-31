package enums;

public enum Role {
    GUEST(1),
    USER(2),
    ADMIN(3);

    private final int accessLevel;

    Role (int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public boolean hasAccess(int requiredLevel) {
        return getAccessLevel() >= requiredLevel;
    }
}
