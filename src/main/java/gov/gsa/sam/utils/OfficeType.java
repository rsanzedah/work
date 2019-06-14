package gov.gsa.sam.utils;
import java.sql.Timestamp;


public class OfficeType {
	private String officeTypeName;
	//private Timestamp officeTypeStartDate;
	//private Timestamp officeTypeEndDate;
	private String officeTypeStartDate;
	private String officeTypeEndDate;
	
	public String getOfficeTypeName() {
		return officeTypeName;
	}
	public void setOfficeTypeName(String officeTypeName) {
		this.officeTypeName = officeTypeName;
	}
	public String getOfficeTypeStartDate() {
		return officeTypeStartDate;
	}
	public void setOfficeTypeStartDate(String officeTypeStartDate) {
		this.officeTypeStartDate = officeTypeStartDate;
	}
	public String getOfficeTypeEndDate() {
		return officeTypeEndDate;
	}
	public void setOfficeTypeEndDate(String officeTypeEndDate) {
		this.officeTypeEndDate = officeTypeEndDate;
	}
	public String getOfficeTypeStatus() {
		return officeTypeStatus;
	}
	public void setOfficeTypeStatus(String officeTypeStatus) {
		this.officeTypeStatus = officeTypeStatus;
	}
	private String officeTypeStatus;

	@Override
	public String toString() {
		return "OfficeType [officeTypeName=" + officeTypeName + ", officeTypeStartDate=" + officeTypeStartDate
				+ ", officeTypeEndDate=" + officeTypeEndDate + ", officeTypeStatus=" + officeTypeStatus + "]";
	}
	
	
	
	
	

}
