package com.zhongmin.boot.domain;

import java.util.Date;

public class ZMSafeguard {
    private Long id;

    private Short zmSafeGuardClassId;

    private String name;

    private String des;

    private String safeCodeZm;

    private Date addDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public Short getZmSafeGuardClassId() {
		return zmSafeGuardClassId;
	}

	public void setZmSafeGuardClassId(Short zmSafeGuardClassId) {
		this.zmSafeGuardClassId = zmSafeGuardClassId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getSafeCodeZm() {
		return safeCodeZm;
	}

	public void setSafeCodeZm(String safeCodeZm) {
		this.safeCodeZm = safeCodeZm;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

    
}