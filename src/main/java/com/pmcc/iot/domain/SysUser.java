package com.pmcc.iot.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author TZ0528
 */
@Table("sys_user")
public class SysUser {
    /**
     * 主键ID
     */
    @Id
    private String id;

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户密码
     */
    @JsonIgnore
    private String userPassword;

    /**
     * 真实姓名
     */
    private String userName;


    /**
     * 所属机构ID
     */
    private String unitId;

    /**
     * 角色ID
     */
    private String roleId;


    /**
     * 账号到期日期
     */
    private LocalDate expireDate;


    /**
     * 联系电话
     */
    private String contactPhone;


    /**
     * 账号最后登录IP
     */
    private String lastIp;

    /**
     * 账号最后登录时间
     */
    private LocalDate lastLogin;


    /**
     * 账号登录次数
     */
    private Integer loginTimes;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private LocalDate createdDate;

    /**
     * 修改人
     */
    private String modifiedBy;

    /**
     * 修改时间
     */
    private LocalDate modifiedDate;


    /**
     * 是否删除 1 删除状态
     */
    private String isDeleted;

    /**
     * 禁用状态 1禁用  0默认启用
     */
    private String disableState;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户账号
     *
     * @return user_account - 用户账号
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 设置用户账号
     *
     * @param userAccount 用户账号
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 获取用户密码
     *
     * @return user_password - 用户密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置用户密码
     *
     * @param userPassword 用户密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取真实姓名
     *
     * @return user_name - 真实姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置真实姓名
     *
     * @param userName 真实姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取所属机构ID
     *
     * @return unit_id - 所属机构ID
     */
    public String getUnitId() {
        return unitId;
    }

    /**
     * 设置所属机构ID
     *
     * @param unitId 所属机构ID
     */
    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    /**
     * 获取账号到期日期
     *
     * @return expire_date - 账号到期日期
     */
    public LocalDate getExpireDate() {
        return expireDate;
    }

    /**
     * 设置账号到期日期
     *
     * @param expireDate 账号到期日期
     */
    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * 获取联系电话
     *
     * @return contact_phone - 联系电话
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * 设置联系电话
     *
     * @param contactPhone 联系电话
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     * 获取账号最后登录IP
     *
     * @return last_ip - 账号最后登录IP
     */
    public String getLastIp() {
        return lastIp;
    }

    /**
     * 设置账号最后登录IP
     *
     * @param lastIp 账号最后登录IP
     */
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    /**
     * 获取账号最后登录时间
     *
     * @return last_login - 账号最后登录时间
     */
    public LocalDate getLastLogin() {
        return lastLogin;
    }

    /**
     * 设置账号最后登录时间
     *
     * @param lastLogin 账号最后登录时间
     */
    public void setLastLogin(LocalDate lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * 获取账号登录次数
     *
     * @return login_times - 账号登录次数
     */
    public Integer getLoginTimes() {
        return loginTimes;
    }

    /**
     * 设置账号登录次数
     *
     * @param loginTimes 账号登录次数
     */
    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }

    /**
     * 获取是否删除 1 删除状态
     *
     * @return is_deleted - 是否删除 1 删除状态
     */
    public String getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除 1 删除状态
     *
     * @param isDeleted 是否删除 1 删除状态
     */
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取禁用状态 1禁用  0默认启用
     *
     * @return disable_state - 禁用状态 1禁用  0默认启用
     */
    public String getDisableState() {
        return disableState;
    }

    /**
     * 设置禁用状态 1禁用  0默认启用
     *
     * @param disableState 禁用状态 1禁用  0默认启用
     */
    public void setDisableState(String disableState) {
        this.disableState = disableState;
    }

    /**
     * 获取创建人
     *
     * @return created_by - 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 获取创建时间
     *
     * @return created_date - 创建时间
     */
    public LocalDate getCreatedDate() {
        return createdDate;
    }

    /**
     * 设置创建时间
     *
     * @param createdDate 创建时间
     */
    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * 获取修改人
     *
     * @return modified_by - 修改人
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设置修改人
     *
     * @param modifiedBy 修改人
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * 获取修改时间
     *
     * @return modified_date - 修改时间
     */
    public LocalDate getModifiedDate() {
        return modifiedDate;
    }

    /**
     * 设置修改时间
     *
     * @param modifiedDate 修改时间
     */
    public void setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}