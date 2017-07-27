package com.xyl.bean;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer accountId;

    private String name;

    private String code;

    private String loginId;

    private String password;
    
    private String head;

    /**
     * 手机号
     */
    private String phone;
    
    /**
     * 移动电话
     */
    private String mobile;
    
    /**
     * 所在公司ID
     */
    private String companyId;
    
    /**
     * 所在部门ID
     */
    private String deptId;

    private Integer status;

    private String memo;

    // 弃用
    @Deprecated
    private Integer roleId;

    @Deprecated
    private Integer type;	
    
    private String userType;//用户类型，1=系统管理员 2=企业管理员 3=企业用户 4=司机 5=老板APP 6=货主APP 7=游客（自助注册）

    private Integer allowLoginBossApp;// 是否允许登录老板APP，0否，1是

    private Integer allowCustomerAudit;// 是否允许审核客户资料，0否，1是
    
    private Integer allowNotWorkingTimeLogin;// 是否允许工作时间外登录，0否，1是 
    
    private Date addTime;
    
    private Integer appendCode;//
    
    private String trustType;//认证状态
    

    public Account() {
		super();
	}

	public Account(Integer accountId, String name, String code, String loginId,
			String password, String head, String phone, String mobile,
			String companyId, String deptId, Integer status, String memo,
			Integer roleId, Integer type, String userType,
			Integer allowLoginBossApp, Integer allowCustomerAudit,
			Integer allowNotWorkingTimeLogin, Date addTime, Integer appendCode,
			String trustType) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.code = code;
		this.loginId = loginId;
		this.password = password;
		this.head = head;
		this.phone = phone;
		this.mobile = mobile;
		this.companyId = companyId;
		this.deptId = deptId;
		this.status = status;
		this.memo = memo;
		this.roleId = roleId;
		this.type = type;
		this.userType = userType;
		this.allowLoginBossApp = allowLoginBossApp;
		this.allowCustomerAudit = allowCustomerAudit;
		this.allowNotWorkingTimeLogin = allowNotWorkingTimeLogin;
		this.addTime = addTime;
		this.appendCode = appendCode;
		this.trustType = trustType;
	}

	public String getTrustType() {
        return trustType;
    }

    public void setTrustType(String trustType) {
        this.trustType = trustType;
    }

    public Integer getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginId() {
        return this.loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Deprecated
    public Integer getRoleId() {
        return this.roleId;
    }

    @Deprecated
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getAllowLoginBossApp() {
        return allowLoginBossApp;
    }

    public void setAllowLoginBossApp(Integer allowLoginBossApp) {
        this.allowLoginBossApp = allowLoginBossApp;
    }

    public Integer getAllowCustomerAudit() {
        return allowCustomerAudit;
    }

    public void setAllowCustomerAudit(Integer allowCustomerAudit) {
        if (allowCustomerAudit == null) {
            allowCustomerAudit = 0;
        }
        this.allowCustomerAudit = allowCustomerAudit;
    }

    public Integer getAllowNotWorkingTimeLogin() {
        return allowNotWorkingTimeLogin;
    }

    public void setAllowNotWorkingTimeLogin(Integer allowNotWorkingTimeLogin) {
        this.allowNotWorkingTimeLogin = allowNotWorkingTimeLogin;
    }

    public Integer getAppendCode() {
		return appendCode;
	}

	public void setAppendCode(Integer appendCode) {
		this.appendCode = appendCode;
	}

	@Override
    public String toString() {
        return "Account [accountId=" + accountId + ", name=" + name + ", code=" + code + ", loginId=" + loginId + ", password=" + password
                + ", companyId=" + companyId + ", status=" + status + ", memo=" + memo + ", roleId=" + roleId + ", type=" + type + ", allowCustomerAudit="
                + allowCustomerAudit + "]";
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
