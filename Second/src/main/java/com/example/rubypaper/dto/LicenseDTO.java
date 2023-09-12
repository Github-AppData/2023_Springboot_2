package com.example.rubypaper.dto;


public class LicenseDTO {

	private String LicenseAgency;
	private String LicenseType;
	private String LicenseMethod;
	public String getLicenseAgency() {
		return LicenseAgency;
	}
	public void setLicenseAgency(String licenseAgency) {
		LicenseAgency = licenseAgency;
	}
	public String getLicenseType() {
		return LicenseType;
	}
	public void setLicenseType(String licenseType) {
		LicenseType = licenseType;
	}
	public String getLicenseMethod() {
		return LicenseMethod;
	}
	public void setLicenseMethod(String licenseMethod) {
		LicenseMethod = licenseMethod;
	}
	@Override
	public String toString() {
		return "LicenseDTO [LicenseAgency=" + LicenseAgency + ", LicenseType=" + LicenseType + ", LicenseMethod="
				+ LicenseMethod + "]";
	}
	
	
	
	
	
}
