package ng.com.cc.app.entity.salesmanager;

import javax.persistence.*;
import java.io.*;
import java.util.*;

@Entity
public class DimDate implements Serializable {

	Collection<Stroes_Product_Prices> stroes_Product_Prices;
	Collection<Orders> orders;
	Collection<Daily_Inventory_Levels> daily_Inventory_Levels;
	Collection<Custormer> custormer;
	Collection<Custormer> custormer1;
	Collection<Staff> staff;
	Collection<Staff> staff1;
	Collection<Staff> staff2;
	private int dateKay;
	private Date date;
	private String fullDate;
	private String dayOFMonth;
	private String daySuffix;
	private String dayName;
	private Integer dayOfWeek;
	private String dayOfWeekInMonth;
	private String dayOfWeekInYear;
	private String dayOfQuarter;
	private String dayOfYear;
	private String weekOfMonth;
	private String weekOfQuarter;
	private Integer weekOfYear;
	private String month;
	private String monthName;
	private String monthOfQuarter;
	private Character quarter;
	private String quarterName;
	private String year;
	private String yearName;
	private String monthYear;
	private String MMYYYY;
	private Date firstDayOfMonth;
	private Date lastDayOfMonth;
	private Date firstDayOfQuarter;
	private Date lastDayOfQuarter;
	private Date firstDayOfYear;
	private Date lastDayOfYear;
	private Boolean isHoliday;
	private Boolean isweekDay;
	private String fiscalDayOfyear;
	private String fiscalWeekOfYear;
	private String fisaclMonth;
	private Character fisaclQuarter;
	private String fisaclQuarterName;
	private String fisaclYear;
	private String fisaclYearName;
	private String fisaclMonthYear;
	private String fisaclMMYYY;
	private Date fisaclFirastDayOfMonth;
	private Date fisaclLastDayOfMonth;
	private Date fiscalFirstDayOfQuarter;
	private Date fiscalLastDatOfQuarter;
	private Date fisaccalFisrtDayOfYear;
	private Date fiscalLastDayOfYear;

	@OneToMany(mappedBy="price_date")
	public Collection<Stroes_Product_Prices> getStroes_Product_Prices() {
		return this.stroes_Product_Prices;
	}

	public void setStroes_Product_Prices(Collection<Stroes_Product_Prices> stroes_Product_Prices) {
		this.stroes_Product_Prices = stroes_Product_Prices;
	}

	@OneToMany(mappedBy="date_Of_Order")
	public Collection<Orders> getOrders() {
		return this.orders;
	}

	public void setOrders(Collection<Orders> orders) {
		this.orders = orders;
	}

	@OneToMany(mappedBy="date_Of_Inventory")
	public Collection<Daily_Inventory_Levels> getDaily_Inventory_Levels() {
		return this.daily_Inventory_Levels;
	}

	public void setDaily_Inventory_Levels(Collection<Daily_Inventory_Levels> daily_Inventory_Levels) {
		this.daily_Inventory_Levels = daily_Inventory_Levels;
	}

	@OneToMany(mappedBy="date_Of_Birth")
	public Collection<Custormer> getCustormer() {
		return this.custormer;
	}

	public void setCustormer(Collection<Custormer> custormer) {
		this.custormer = custormer;
	}

	@OneToMany(mappedBy="latest_deposit_Date")
	public Collection<Custormer> getCustormer1() {
		return this.custormer1;
	}

	public void setCustormer1(Collection<Custormer> custormer1) {
		this.custormer1 = custormer1;
	}

	@OneToMany(mappedBy="dateOfBirth")
	public Collection<Staff> getStaff() {
		return this.staff;
	}

	public void setStaff(Collection<Staff> staff) {
		this.staff = staff;
	}

	@OneToMany(mappedBy="dateJoined")
	public Collection<Staff> getStaff1() {
		return this.staff1;
	}

	public void setStaff1(Collection<Staff> staff1) {
		this.staff1 = staff1;
	}

	@OneToMany(mappedBy="dateLeft")
	public Collection<Staff> getStaff2() {
		return this.staff2;
	}

	public void setStaff2(Collection<Staff> staff2) {
		this.staff2 = staff2;
	}

	@Id
	@Column(name="DateKay", nullable=false, length=10)
	public int getDateKay() {
		return this.dateKay;
	}

	public void setDateKay(int dateKay) {
		this.dateKay = dateKay;
	}

	@Column(name="Date")
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name="FullDate", length=10)
	public String getFullDate() {
		return this.fullDate;
	}

	public void setFullDate(String fullDate) {
		this.fullDate = fullDate;
	}

	@Column(name="DayOFMonth", length=2)
	public String getDayOFMonth() {
		return this.dayOFMonth;
	}

	public void setDayOFMonth(String dayOFMonth) {
		this.dayOFMonth = dayOFMonth;
	}

	@Column(name="DaySuffix", length=4)
	public String getDaySuffix() {
		return this.daySuffix;
	}

	public void setDaySuffix(String daySuffix) {
		this.daySuffix = daySuffix;
	}

	@Column(name="DayName", length=9)
	public String getDayName() {
		return this.dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	@Column(name="DayOfWeek", length=10)
	public Integer getDayOfWeek() {
		return this.dayOfWeek;
	}

	public void setDayOfWeek(Integer dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Column(name="DayOfWeekInMonth", length=2)
	public String getDayOfWeekInMonth() {
		return this.dayOfWeekInMonth;
	}

	public void setDayOfWeekInMonth(String dayOfWeekInMonth) {
		this.dayOfWeekInMonth = dayOfWeekInMonth;
	}

	@Column(name="DayOfWeekInYear", length=2)
	public String getDayOfWeekInYear() {
		return this.dayOfWeekInYear;
	}

	public void setDayOfWeekInYear(String dayOfWeekInYear) {
		this.dayOfWeekInYear = dayOfWeekInYear;
	}

	@Column(name="DayOfQuarter", length=3)
	public String getDayOfQuarter() {
		return this.dayOfQuarter;
	}

	public void setDayOfQuarter(String dayOfQuarter) {
		this.dayOfQuarter = dayOfQuarter;
	}

	@Column(name="DayOfYear", length=3)
	public String getDayOfYear() {
		return this.dayOfYear;
	}

	public void setDayOfYear(String dayOfYear) {
		this.dayOfYear = dayOfYear;
	}

	@Column(name="WeekOfMonth", length=1)
	public String getWeekOfMonth() {
		return this.weekOfMonth;
	}

	public void setWeekOfMonth(String weekOfMonth) {
		this.weekOfMonth = weekOfMonth;
	}

	@Column(name="WeekOfQuarter", length=2)
	public String getWeekOfQuarter() {
		return this.weekOfQuarter;
	}

	public void setWeekOfQuarter(String weekOfQuarter) {
		this.weekOfQuarter = weekOfQuarter;
	}

	@Column(name="WeekOfYear", length=10)
	public Integer getWeekOfYear() {
		return this.weekOfYear;
	}

	public void setWeekOfYear(Integer weekOfYear) {
		this.weekOfYear = weekOfYear;
	}

	@Column(name="Month", length=2)
	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	@Column(name="MonthName", length=9)
	public String getMonthName() {
		return this.monthName;
	}

	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}

	@Column(name="MonthOfQuarter", length=2)
	public String getMonthOfQuarter() {
		return this.monthOfQuarter;
	}

	public void setMonthOfQuarter(String monthOfQuarter) {
		this.monthOfQuarter = monthOfQuarter;
	}

	@Column(name="Quarter", length=1)
	public Character getQuarter() {
		return this.quarter;
	}

	public void setQuarter(Character quarter) {
		this.quarter = quarter;
	}

	@Column(name="QuarterName", length=9)
	public String getQuarterName() {
		return this.quarterName;
	}

	public void setQuarterName(String quarterName) {
		this.quarterName = quarterName;
	}

	@Column(name="Year", length=4)
	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Column(name="YearName", length=7)
	public String getYearName() {
		return this.yearName;
	}

	public void setYearName(String yearName) {
		this.yearName = yearName;
	}

	@Column(name="MonthYear", length=9)
	public String getMonthYear() {
		return this.monthYear;
	}

	public void setMonthYear(String monthYear) {
		this.monthYear = monthYear;
	}

	@Column(name="MMYYYY", length=6)
	public String getMMYYYY() {
		return this.MMYYYY;
	}

	public void setMMYYYY(String MMYYYY) {
		this.MMYYYY = MMYYYY;
	}

	@Column(name="FirstDayOfMonth")
	public Date getFirstDayOfMonth() {
		return this.firstDayOfMonth;
	}

	public void setFirstDayOfMonth(Date firstDayOfMonth) {
		this.firstDayOfMonth = firstDayOfMonth;
	}

	@Column(name="LastDayOfMonth")
	public Date getLastDayOfMonth() {
		return this.lastDayOfMonth;
	}

	public void setLastDayOfMonth(Date lastDayOfMonth) {
		this.lastDayOfMonth = lastDayOfMonth;
	}

	@Column(name="FirstDayOfQuarter")
	public Date getFirstDayOfQuarter() {
		return this.firstDayOfQuarter;
	}

	public void setFirstDayOfQuarter(Date firstDayOfQuarter) {
		this.firstDayOfQuarter = firstDayOfQuarter;
	}

	@Column(name="LastDayOfQuarter")
	public Date getLastDayOfQuarter() {
		return this.lastDayOfQuarter;
	}

	public void setLastDayOfQuarter(Date lastDayOfQuarter) {
		this.lastDayOfQuarter = lastDayOfQuarter;
	}

	@Column(name="FirstDayOfYear")
	public Date getFirstDayOfYear() {
		return this.firstDayOfYear;
	}

	public void setFirstDayOfYear(Date firstDayOfYear) {
		this.firstDayOfYear = firstDayOfYear;
	}

	@Column(name="LastDayOfYear")
	public Date getLastDayOfYear() {
		return this.lastDayOfYear;
	}

	public void setLastDayOfYear(Date lastDayOfYear) {
		this.lastDayOfYear = lastDayOfYear;
	}

	@Column(name="IsHoliday")
	public Boolean getIsHoliday() {
		return this.isHoliday;
	}

	public void setIsHoliday(Boolean isHoliday) {
		this.isHoliday = isHoliday;
	}

	@Column(name="IsweekDay")
	public Boolean getIsweekDay() {
		return this.isweekDay;
	}

	public void setIsweekDay(Boolean isweekDay) {
		this.isweekDay = isweekDay;
	}

	@Column(name="FiscalDayOfyear", length=3)
	public String getFiscalDayOfyear() {
		return this.fiscalDayOfyear;
	}

	public void setFiscalDayOfyear(String fiscalDayOfyear) {
		this.fiscalDayOfyear = fiscalDayOfyear;
	}

	@Column(name="FiscalWeekOfYear", length=3)
	public String getFiscalWeekOfYear() {
		return this.fiscalWeekOfYear;
	}

	public void setFiscalWeekOfYear(String fiscalWeekOfYear) {
		this.fiscalWeekOfYear = fiscalWeekOfYear;
	}

	@Column(name="FisaclMonth", length=2)
	public String getFisaclMonth() {
		return this.fisaclMonth;
	}

	public void setFisaclMonth(String fisaclMonth) {
		this.fisaclMonth = fisaclMonth;
	}

	@Column(name="FisaclQuarter", length=1)
	public Character getFisaclQuarter() {
		return this.fisaclQuarter;
	}

	public void setFisaclQuarter(Character fisaclQuarter) {
		this.fisaclQuarter = fisaclQuarter;
	}

	@Column(name="FisaclQuarterName", length=9)
	public String getFisaclQuarterName() {
		return this.fisaclQuarterName;
	}

	public void setFisaclQuarterName(String fisaclQuarterName) {
		this.fisaclQuarterName = fisaclQuarterName;
	}

	@Column(name="FisaclYear", length=4)
	public String getFisaclYear() {
		return this.fisaclYear;
	}

	public void setFisaclYear(String fisaclYear) {
		this.fisaclYear = fisaclYear;
	}

	@Column(name="FisaclYearName", length=7)
	public String getFisaclYearName() {
		return this.fisaclYearName;
	}

	public void setFisaclYearName(String fisaclYearName) {
		this.fisaclYearName = fisaclYearName;
	}

	@Column(name="FisaclMonthYear", length=10)
	public String getFisaclMonthYear() {
		return this.fisaclMonthYear;
	}

	public void setFisaclMonthYear(String fisaclMonthYear) {
		this.fisaclMonthYear = fisaclMonthYear;
	}

	@Column(name="FisaclMMYYY", length=6)
	public String getFisaclMMYYY() {
		return this.fisaclMMYYY;
	}

	public void setFisaclMMYYY(String fisaclMMYYY) {
		this.fisaclMMYYY = fisaclMMYYY;
	}

	@Column(name="FisaclFirastDayOfMonth")
	public Date getFisaclFirastDayOfMonth() {
		return this.fisaclFirastDayOfMonth;
	}

	public void setFisaclFirastDayOfMonth(Date fisaclFirastDayOfMonth) {
		this.fisaclFirastDayOfMonth = fisaclFirastDayOfMonth;
	}

	@Column(name="FisaclLastDayOfMonth")
	public Date getFisaclLastDayOfMonth() {
		return this.fisaclLastDayOfMonth;
	}

	public void setFisaclLastDayOfMonth(Date fisaclLastDayOfMonth) {
		this.fisaclLastDayOfMonth = fisaclLastDayOfMonth;
	}

	@Column(name="FiscalFirstDayOfQuarter")
	public Date getFiscalFirstDayOfQuarter() {
		return this.fiscalFirstDayOfQuarter;
	}

	public void setFiscalFirstDayOfQuarter(Date fiscalFirstDayOfQuarter) {
		this.fiscalFirstDayOfQuarter = fiscalFirstDayOfQuarter;
	}

	@Column(name="FiscalLastDatOfQuarter")
	public Date getFiscalLastDatOfQuarter() {
		return this.fiscalLastDatOfQuarter;
	}

	public void setFiscalLastDatOfQuarter(Date fiscalLastDatOfQuarter) {
		this.fiscalLastDatOfQuarter = fiscalLastDatOfQuarter;
	}

	@Column(name="FisaccalFisrtDayOfYear")
	public Date getFisaccalFisrtDayOfYear() {
		return this.fisaccalFisrtDayOfYear;
	}

	public void setFisaccalFisrtDayOfYear(Date fisaccalFisrtDayOfYear) {
		this.fisaccalFisrtDayOfYear = fisaccalFisrtDayOfYear;
	}

	@Column(name="FiscalLastDayOfYear")
	public Date getFiscalLastDayOfYear() {
		return this.fiscalLastDayOfYear;
	}

	public void setFiscalLastDayOfYear(Date fiscalLastDayOfYear) {
		this.fiscalLastDayOfYear = fiscalLastDayOfYear;
	}

}