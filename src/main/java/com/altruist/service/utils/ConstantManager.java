package com.altruist.service.utils;

import lombok.Data;


public class ConstantManager {
private  Integer statusCode;
private  String statusDescription;
public ConstantManager(Integer statusCode,String statusDescription) {
	this.statusCode=statusCode;
	this.statusDescription=statusDescription;
}
public static ConstantManager success=new ConstantManager(200, "Success");
public static ConstantManager notFound=new ConstantManager(200, "Not Found");
public static ConstantManager alreadyExist=new ConstantManager(201, "Already exist");
public final static ConstantManager ErrorOccured = new ConstantManager(500,
		"Currently facing some error. Please try after sometime.");
public Integer getStatusCode() {
	return statusCode;
}
public String getStatusDescription() {
	return statusDescription;
}
}
