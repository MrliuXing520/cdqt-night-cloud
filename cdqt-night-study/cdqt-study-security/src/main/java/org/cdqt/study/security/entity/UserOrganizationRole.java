package org.cdqt.study.security.entity;

import java.util.Date;

import org.cdqt.night.core.entity.BaseEntity;

/**
 * UserOrganizationRole
 *
 * @author LiuGangQiang Create in 2020/10/27
 */
public class UserOrganizationRole extends BaseEntity {

	/**
	 * serialVersionUID
	 *
	 * @author LiuGangQiang Create in 2020/10/27
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * id
	 *
	 * @author LiuGangQiang Create in 2020/10/27
	 */
	private String id;
	/**
	 * userInfoId
	 *
	 * @author LiuGangQiang Create in 2020/10/27
	 */
	private String userInfoId;
	/**
	 * organizationInfoId
	 *
	 * @author LiuGangQiang Create in 2020/10/27
	 */
	private String organizationInfoId;
	/**
	 * roleId
	 *
	 * @author LiuGangQiang Create in 2020/10/27
	 */
	private String roleId;
	/**
	 * enabled
	 *
	 * @author LiuGangQiang Create in 2020/10/27
	 */
	private Boolean enabled;
	/**
	 * updateTime
	 *
	 * @author LiuGangQiang Create in 2020/10/27
	 */
	private Date updateTime;
	/**
	 * createTime
	 *
	 * @author LiuGangQiang Create in 2020/10/27
	 */
	private Date createTime;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the userInfoId
	 */
	public String getUserInfoId() {
		return userInfoId;
	}

	/**
	 * @param userInfoId the userInfoId to set
	 */
	public void setUserInfoId(String userInfoId) {
		this.userInfoId = userInfoId;
	}

	/**
	 * @return the organizationInfoId
	 */
	public String getOrganizationInfoId() {
		return organizationInfoId;
	}

	/**
	 * @param organizationInfoId the organizationInfoId to set
	 */
	public void setOrganizationInfoId(String organizationInfoId) {
		this.organizationInfoId = organizationInfoId;
	}

	/**
	 * @return the roleId
	 */
	public String getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the enabled
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
