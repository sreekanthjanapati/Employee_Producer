package com.chubb.icc.wsdlmgmt;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.chubbindia.employees.EmpDetails;
import com.chubbindia.employees.GetEmployeeDetailsRequest;
import com.chubbindia.employees.GetEmployeeDetailsResponse;

@Endpoint
public class EmployeeDetailsEndpoint {

	@PayloadRoot(namespace = "http://chubbindia.com/employees", localPart = "GetEmployeeDetailsRequest")
	@ResponsePayload
	public GetEmployeeDetailsResponse processCourseDetailsRequest(@RequestPayload GetEmployeeDetailsRequest request) {
		GetEmployeeDetailsResponse response = new GetEmployeeDetailsResponse();

		EmpDetails details = new EmpDetails();
		details.setId(request.getId());
		details.setName("Kumar");
		details.setAddress("Hyderabad");

		response.setEmpDetails(details);

		return response;
	}

}
