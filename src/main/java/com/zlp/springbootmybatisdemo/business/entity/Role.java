package com.zlp.springbootmybatisdemo.business.entity;

public class Role {
    private Long id;

    private Long createTime;

    private Long createUser;

    private String modifyDescription;

    private Long modifyTime;

    private Long modifyUser;

    private Integer status;

    private Integer version;

    private String resourcesIds;

    private String roleDesc;

    private String roleName;

    private String resourceIds;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public String getModifyDescription() {
        return modifyDescription;
    }

    public void setModifyDescription(String modifyDescription) {
        this.modifyDescription = modifyDescription == null ? null : modifyDescription.trim();
    }

    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(Long modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getResourcesIds() {
        return resourcesIds;
    }

    public void setResourcesIds(String resourcesIds) {
        this.resourcesIds = resourcesIds == null ? null : resourcesIds.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds == null ? null : resourceIds.trim();
    }
}