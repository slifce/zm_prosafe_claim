package com.zhongmin.boot.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 保障项目保额
 *
 */
@SuppressWarnings("serial")
public class ZMSafeCoverage implements Serializable{
	  	
		private Long id;

	    private Long zmProductId;

	    private Long zmProSafeGuardId;

	    private BigDecimal coverage;

	    private BigDecimal coveragePrice;

	    private Short minAge;

	    private Short maxAge;

	    private Date addDate;

	    private String coverageText;
	    
	    private String assocseq;
	    
	    private String safeCode;  //查价格时用
	    
	    private Short age;//根据年龄确定保额范围
	    
	    
	    //许子杰新加
	    
	    private Integer male;			//性别
		
		private Integer socialsecurity;	//社保状态
		
		private Integer policyterm;		//保障期限长度
		
		private Integer policytermtype; //保障期限单位
		
		private Integer periods;		//缴费期限
		
		private Integer periodType;		//缴费期限单位
		
		private String arrName ; //技术名称 （意外险用）
		
		private Integer jobRisk; //最大职业等级
		
		public Integer getJobRisk() {
			return jobRisk;
		}

		public void setJobRisk(Integer jobRisk) {
			this.jobRisk = jobRisk;
		}

		public String getArrName() {
			return arrName;
		}

		public void setArrName(String arrName) {
			this.arrName = arrName;
		}

		public Short getAge() {
			return age;
		}

		public void setAge(Short age) {
			this.age = age;
		}

		public String getAssocseq() {
			return assocseq;
		}

		public void setAssocseq(String assocseq) {
			this.assocseq = assocseq;
		}

		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}

		/**
		 * @return the zmProductId
		 */
		public Long getZmProductId() {
			return zmProductId;
		}

		/**
		 * @param zmProductId the zmProductId to set
		 */
		public void setZmProductId(Long zmProductId) {
			this.zmProductId = zmProductId;
		}

	
		/**
		 * @return the zmProSafeGuardId
		 */
		public Long getZmProSafeGuardId() {
			return zmProSafeGuardId;
		}

		/**
		 * @param zmProSafeGuardId the zmProSafeGuardId to set
		 */
		public void setZmProSafeGuardId(Long zmProSafeGuardId) {
			this.zmProSafeGuardId = zmProSafeGuardId;
		}

		/**
		 * @return the coverage
		 */
		public BigDecimal getCoverage() {
			return coverage;
		}

		/**
		 * @param coverage the coverage to set
		 */
		public void setCoverage(BigDecimal coverage) {
			this.coverage = coverage;
		}

		/**
		 * @return the coveragePrice
		 */
		public BigDecimal getCoveragePrice() {
			return coveragePrice;
		}

		/**
		 * @param coveragePrice the coveragePrice to set
		 */
		public void setCoveragePrice(BigDecimal coveragePrice) {
			this.coveragePrice = coveragePrice;
		}

		/**
		 * @return the minAge
		 */
		public Short getMinAge() {
			return minAge;
		}

		/**
		 * @param minAge the minAge to set
		 */
		public void setMinAge(Short minAge) {
			this.minAge = minAge;
		}

		/**
		 * @return the maxAge
		 */
		public Short getMaxAge() {
			return maxAge;
		}

		/**
		 * @param maxAge the maxAge to set
		 */
		public void setMaxAge(Short maxAge) {
			this.maxAge = maxAge;
		}

		/**
		 * @return the addDate
		 */
		public Date getAddDate() {
			return addDate;
		}

		/**
		 * @param addDate the addDate to set
		 */
		public void setAddDate(Date addDate) {
			this.addDate = addDate;
		}

		/**
		 * @return the coverageText
		 */
		public String getCoverageText() {
			return coverageText;
		}

		/**
		 * @param coverageText the coverageText to set
		 */
		public void setCoverageText(String coverageText) {
			this.coverageText = coverageText;
		}

		public String getSafeCode() {
			return safeCode;
		}

		public void setSafeCode(String safeCode) {
			this.safeCode = safeCode;
		}

		public Integer getMale() {
			return male;
		}

		public void setMale(Integer male) {
			this.male = male;
		}

		public Integer getSocialsecurity() {
			return socialsecurity;
		}

		public void setSocialsecurity(Integer socialsecurity) {
			this.socialsecurity = socialsecurity;
		}

		public Integer getPolicyterm() {
			return policyterm;
		}

		public void setPolicyterm(Integer policyterm) {
			this.policyterm = policyterm;
		}

		public Integer getPolicytermtype() {
			return policytermtype;
		}

		public void setPolicytermtype(Integer policytermtype) {
			this.policytermtype = policytermtype;
		}

		public Integer getPeriods() {
			return periods;
		}

		public void setPeriods(Integer periods) {
			this.periods = periods;
		}

		public Integer getPeriodType() {
			return periodType;
		}

		public void setPeriodType(Integer periodType) {
			this.periodType = periodType;
		}

	
	 
}