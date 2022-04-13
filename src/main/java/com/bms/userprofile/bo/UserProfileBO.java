package com.bms.userprofile.bo;



import com.bms.userprofile.beans.UserProfileRequest;
import com.bms.userprofile.beans.UserProfileResponse;


public interface UserProfileBO {

	
	public  UserProfileResponse checkUserAvailability(String userName) throws Exception;
	
	public UserProfileResponse updateUserProfile(UserProfileRequest userProfileRequest) throws Exception;
}
