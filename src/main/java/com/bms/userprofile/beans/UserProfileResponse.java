package com.bms.userprofile.beans;





import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserProfileResponse {
	
	private HttpStatus httpStatus;
	private String Response;
	
		public UserProfileResponse( HttpStatus httpStatus, String response) {
		super();
		this.httpStatus = httpStatus;
		this.Response = response;
	}
		
	public UserProfileResponse() {
			// TODO Auto-generated constructor stub
		}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getResponse() {
		return Response;
	}
	public void setResponse(String response) {
		Response = response;
	}
	

}

