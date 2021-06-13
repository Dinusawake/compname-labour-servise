package com.compname.labour.service.dto;
import java.sql.Date;


public class LabourRequestDTO {

	String requestFromBuilder ;
	int noOfLaborRequired;
	Date fromDate;
	Date toDate;
	int noOfWorkingHours;
	String commentFromBuilder;
	public LabourRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LabourRequestDTO(String requestFromBuilder, int noOfLaborRequired, Date fromDate, Date toDate,
			int noOfWorkingHours, String commentFromBuilder) {
		super();
		this.requestFromBuilder = requestFromBuilder;
		this.noOfLaborRequired = noOfLaborRequired;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.noOfWorkingHours = noOfWorkingHours;
		this.commentFromBuilder = commentFromBuilder;
	}
	public String getRequestFromBuilder() {
		return requestFromBuilder;
	}
	public void setRequestFromBuilder(String requestFromBuilder) {
		this.requestFromBuilder = requestFromBuilder;
	}
	public int getNoOfLaborRequired() {
		return noOfLaborRequired;
	}
	public void setNoOfLaborRequired(int noOfLaborRequired) {
		this.noOfLaborRequired = noOfLaborRequired;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public int getNoOfWorkingHours() {
		return noOfWorkingHours;
	}
	public void setNoOfWorkingHours(int noOfWorkingHours) {
		this.noOfWorkingHours = noOfWorkingHours;
	}
	public String getCommentFromBuilder() {
		return commentFromBuilder;
	}
	public void setCommentFromBuilder(String commentFromBuilder) {
		this.commentFromBuilder = commentFromBuilder;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LabourRequestDTO [requestFromBuilder=");
		builder.append(requestFromBuilder);
		builder.append(", noOfLaborRequired=");
		builder.append(noOfLaborRequired);
		builder.append(", fromDate=");
		builder.append(fromDate);
		builder.append(", toDate=");
		builder.append(toDate);
		builder.append(", noOfWorkingHours=");
		builder.append(noOfWorkingHours);
		builder.append(", commentFromBuilder=");
		builder.append(commentFromBuilder);
		builder.append("]");
		return builder.toString();
	}
	
	
}