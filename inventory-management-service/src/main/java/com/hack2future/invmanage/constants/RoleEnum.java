package com.hack2future.invmanage.constants;

public enum RoleEnum {
  ROLE_USER(1L, "Read Only User"),
  ROLE_MODERATOR(2L, "Moderator"),
  ROLE_ADMIN(3L, "Admin");

  private final Long id;
  private final String displayName;

  // Constructor
  RoleEnum(Long id, String displayName) {
    this.id = id;
    this.displayName = displayName;
  }

  // Getter methods
  public Long getId() {
    return id;
  }

  public String getDisplayName() {
    return displayName;
  }

  // Get Role by ID
  public static RoleEnum getById(Long id) {
    for (RoleEnum role : values()) {
      if (role.id.equals(id)) {
        return role;
      }
    }
    throw new IllegalArgumentException("No role found for id: " + id);
  }

  // Get Role by Display Name
  public static RoleEnum getByDisplayName(String displayName) {
    for (RoleEnum role : values()) {
      if (role.displayName.equalsIgnoreCase(displayName)) {
        return role;
      }
    }
    throw new IllegalArgumentException("No role found for display name: " + displayName);
  }
}
