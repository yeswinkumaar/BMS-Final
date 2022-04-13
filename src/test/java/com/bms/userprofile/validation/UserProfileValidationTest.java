//package com.bms.userprofile.validation;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import com.bms.userprofile.beans.UserProfileRequest;
//@ExtendWith(SpringExtension.class)
//
//public class UserProfileValidationTest {
//
//	
//	
//	
//	@InjectMocks
//	private UserProfileValidation  userProfileValidation;
//	
//	@Test
//	public void addressValidationSuccessTest()
//	{
//		UserProfileRequest userProfileRequest;
//		userProfileRequest=new UserProfileRequest((long) 1, "vignesh123","ramvicky@456","rahul.kumar@gmail.com","kumar","19/08/1999","983749213","10 rkv road","chennai","TamilNadu","India","638142","Y","Y","Y","N");
//		System.out.println(userProfileRequest.toString());
//		
//		String result=userProfileValidation.addressValidation(userProfileRequest);
//		assertEquals("success", result);
//	}
//	
//	@Test
//	public void addressValidationfailedAddressTest()
//	{
//		UserProfileRequest userProfileRequest;
//		
//		
//		userProfileRequest=new UserProfileRequest((long) 1, "vignesh123","ramvicky@456","rahul.kumar@gmail.com","kumar","19/08/1999","983749213","street!@","chennai","TamilNadu","India","638142","Y","Y","Y","N");
//		System.out.println(userProfileRequest.toString());
//		
//		String result=userProfileValidation.addressValidation(userProfileRequest);
//		assertEquals("Invalid Address,Please check the Address", result);
//	}
//	
//	@Test
//	public void addressValidationFailedCityTest()
//	{
//		UserProfileRequest userProfileRequest;
//		
//		
//		userProfileRequest=new UserProfileRequest((long) 1, "vignesh123","ramvicky@456","rahul.kumar@gmail.com","kumar","19/08/1999","983749213","street","chennai@","TamilNadu","India","638142","Y","Y","Y","N");
//		
//		String result=userProfileValidation.addressValidation(userProfileRequest);
//		assertEquals("Invalid City Name,Please check the Name", result);
//	}
//	@Test
//	public void addressValidationfailedStateTest()
//	{
//		UserProfileRequest userProfileRequest;
//		
//		
//		userProfileRequest=new UserProfileRequest((long) 1, "vignesh123","ramvicky@456","rahul.kumar@gmail.com","kumar","19/08/1999","983749213","street","chennai","TamilNadu!@","India","638142","Y","Y","Y","N");
//		System.out.println(userProfileRequest.toString());
//		
//		String result=userProfileValidation.addressValidation(userProfileRequest);
//		assertEquals("Invalid State Name,Please check the name", result);
//	}
//	@Test
//	public void addressValidationfailedCountryTest()
//	{
//		UserProfileRequest userProfileRequest;
//		
//		
//		userProfileRequest=new UserProfileRequest((long) 1, "vignesh123","ramvicky@456","rahul.kumar@gmail.com","kumar","19/08/1999","983749213","street","chennai","TamilNadu","India!@","638142","Y","Y","Y","N");
//		System.out.println(userProfileRequest.toString());
//		
//		String result=userProfileValidation.addressValidation(userProfileRequest);
//		assertEquals("Invalid Country Name,Please check the name", result);
//	}
//	@Test
//	public void addressValidationfailedPincodeTest()
//	{
//		UserProfileRequest userProfileRequest;
//		
//		
//		userProfileRequest=new UserProfileRequest((long) 1, "vignesh123","ramvicky@456","rahul.kumar@gmail.com","kumar","19/08/1999","983749213","street","chennai","TamilNadu","India","6qw38142","Y","Y","Y","N");
//		System.out.println(userProfileRequest.toString());
//		
//		String result=userProfileValidation.addressValidation(userProfileRequest);
//		assertEquals("Invalid Pincode,Please check the Pincode", result);
//	}
//	
//	@Test
//	public void profileValidationSuccessTest()
//	{
//		UserProfileRequest userProfileRequest;
//		userProfileRequest=new UserProfileRequest((long) 1, "vignesh123","ramvicky@456","kumar","rahul.kumar@gmail.com","19/08/1999","983749213","10 rkv road","chennai","TamilNadu","India","638142","Y","Y","Y","N");
//		System.out.println(userProfileRequest.toString());
//		
//		String result=userProfileValidation.profileValidation(userProfileRequest);
//		assertEquals("success", result);
//	}
//	@Test
//	public void profileValidationFailureTest()
//	{
//		UserProfileRequest userProfileRequest;
//		userProfileRequest=new UserProfileRequest((long) 1, "vignesh123","ramvicky@456","kumar!@","rahul.kumar@gmail.com","19/08/1999","983749213","10 rkv road","chennai","TamilNadu","India","638142","Y","Y","Y","N");
//		System.out.println(userProfileRequest.toString());
//		
//		String result=userProfileValidation.profileValidation(userProfileRequest);
//		assertEquals("Invalid LastName,Please check the name", result);
//	}
//	@Test
//	public void profileValidationMailFailureTest()
//	{
//		UserProfileRequest userProfileRequest;
//		userProfileRequest=new UserProfileRequest((long) 1, "vignesh123","ramvicky@456","kumar","rahul.kumargmail.com","19/08/1999","983749213","10 rkv road","chennai","TamilNadu","India","638142","Y","Y","Y","N");
//		System.out.println(userProfileRequest.toString());
//		
//		String result=userProfileValidation.profileValidation(userProfileRequest);
//		assertEquals("Invalid E-mail,Please check the E-mail", result);
//	}
//	@Test
//	public void profileValidationDateFailureTest()
//	{
//		UserProfileRequest userProfileRequest;
//		userProfileRequest=new UserProfileRequest((long) 1, "vignesh123","ramvicky@456","kumar","rahul.kumar@gmail.com","1908/1999","983749213","10 rkv road","chennai","TamilNadu","India","638142","Y","Y","Y","N");
//		System.out.println(userProfileRequest.toString());
//		
//		String result=userProfileValidation.profileValidation(userProfileRequest);
//		assertEquals("Invalid Date,Please check the Date Format", result);
//	}
//	@Test
//	public void profileValidationContactFailureTest()
//	{
//		UserProfileRequest userProfileRequest;
//		userProfileRequest=new UserProfileRequest((long) 1, "vignesh123","ramvicky@456","kumar","rahul.kumar@gmail.com","19/08/1999","9qw83749213","10 rkv road","chennai","TamilNadu","India","638142","Y","Y","Y","N");
//		System.out.println(userProfileRequest.toString());
//		
//		String result=userProfileValidation.profileValidation(userProfileRequest);
//		assertEquals("Invalid ContactNo,Please check the ContactNo", result);
//	}
//	@Test
//	public void validationIndicatorFailureTest()
//	{
//		assertEquals(false,userProfileValidation.validateIndicator("no"));
//	}
//	@Test
//	public void validationIndicatorSuccessTest()
//	{
//		assertEquals(true,userProfileValidation.validateIndicator("Y"));
//	}
//	@Test
//	public void userAvailabilitySuccessTest()
//	{
//		assertEquals(true,userProfileValidation.validateUserAvailability("Mohan123"));
//	}
//	@Test
//	public void userAvailabilityFailureTest()
//	{
//		assertEquals(false,userProfileValidation.validateUserAvailability("Mohan123@"));
//	}
//	@Test
//	public void userAvailabilityAlphaFailureTest()
//	{
//		assertEquals(false,userProfileValidation.validateUserAvailability("Mohan"));
//	}
//	@Test
//	public void userAvailabilityNumbericFailureTest()
//	{
//		assertEquals(false,userProfileValidation.validateUserAvailability("123"));
//	}
//	@Test
//	public void passwordValidationSuccessTest()
//	{
//		assertEquals(true,userProfileValidation.isValidPassword("Mohan123@"));
//	}
//	@Test
//	public void passwordValidationFailureTest()
//	{
//		assertEquals(false,userProfileValidation.isValidPassword("Mohan123"));
//	}
//}
