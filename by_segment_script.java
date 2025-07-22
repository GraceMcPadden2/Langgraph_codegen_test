public class HDR {
    private int customerCount;
    private String fileName;
    private String dateCreated;
    private String customerName;

    public HDR(int customerCount, String fileName, String dateCreated, String customerName) {
        this.customerCount = customerCount;
        this.fileName = fileName;
        this.dateCreated = dateCreated;
        this.customerName = customerName;
    }

    // Getters and setters
    public int getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(int customerCount) {
        this.customerCount = customerCount;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}public class PII {
    private String customerNumber;
    private String transactionCode;
    private String employeeSSN;
    private String employeeID;
    private String memberSSNMemberID;
    private String relationshipCode;
    private String lastName;
    private String firstName;

    public PII(String customerNumber, String transactionCode, String employeeSSN, String employeeID, 
               String memberSSNMemberID, String relationshipCode, String lastName, String firstName) {
        this.customerNumber = customerNumber;
        this.transactionCode = transactionCode;
        this.employeeSSN = employeeSSN;
        this.employeeID = employeeID;
        this.memberSSNMemberID = memberSSNMemberID;
        this.relationshipCode = relationshipCode;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    // Getters and setters
    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getEmployeeSSN() {
        return employeeSSN;
    }

    public void setEmployeeSSN(String employeeSSN) {
        this.employeeSSN = employeeSSN;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getMemberSSNMemberID() {
        return memberSSNMemberID;
    }

    public void setMemberSSNMemberID(String memberSSNMemberID) {
        this.memberSSNMemberID = memberSSNMemberID;
    }

    public String getRelationshipCode() {
        return relationshipCode;
    }

    public void setRelationshipCode(String relationshipCode) {
        this.relationshipCode = relationshipCode;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}public class BNK {
    private String bankRoutingNumber;
    private String accountNumber;
    private String accountType;

    public BNK(String bankRoutingNumber, String accountNumber, String accountType) {
        this.bankRoutingNumber = bankRoutingNumber;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    // Getters and setters
    public String getBankRoutingNumber() {
        return bankRoutingNumber;
    }

    public void setBankRoutingNumber(String bankRoutingNumber) {
        this.bankRoutingNumber = bankRoutingNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}public class ADR {
    private String companyName;
    private double claimAmount;
    private String position;
    private String phoneNumber;
    private String coverageType;
    private String streetAddress;
    private String providerName;
    private String startDate;
    private String endDate;
    private String email;
    private String claimID;
    private String state;
    private String city;
    private String insuranceID;
    private String claimStatus;
    private String zipCode;

    public ADR(String companyName, double claimAmount, String position, String phoneNumber, String coverageType,
               String streetAddress, String providerName, String startDate, String endDate, String email,
               String claimID, String state, String city, String insuranceID, String claimStatus, String zipCode) {
        this.companyName = companyName;
        this.claimAmount = claimAmount;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.coverageType = coverageType;
        this.streetAddress = streetAddress;
        this.providerName = providerName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.email = email;
        this.claimID = claimID;
        this.state = state;
        this.city = city;
        this.insuranceID = insuranceID;
        this.claimStatus = claimStatus;
        this.zipCode = zipCode;
    }

    // Getters and setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClaimID() {
        return claimID;
    }

    public void setClaimID(String claimID) {
        this.claimID = claimID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}public class COM {
    private String zipCode;
    private String email;
    private String insuranceID;
    private String city;
    private String claimStatus;
    private String providerName;
    private String endDate;
    private double claimAmount;
    private String state;
    private String startDate;
    private String companyName;
    private String position;
    private String phoneNumber;
    private String streetAddress;
    private String claimID;
    private String coverageType;

    public COM(String zipCode, String email, String insuranceID, String city, String claimStatus, String providerName,
               String endDate, double claimAmount, String state, String startDate, String companyName, String position,
               String phoneNumber, String streetAddress, String claimID, String coverageType) {
        this.zipCode = zipCode;
        this.email = email;
        this.insuranceID = insuranceID;
        this.city = city;
        this.claimStatus = claimStatus;
        this.providerName = providerName;
        this.endDate = endDate;
        this.claimAmount = claimAmount;
        this.state = state;
        this.startDate = startDate;
        this.companyName = companyName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.streetAddress = streetAddress;
        this.claimID = claimID;
        this.coverageType = coverageType;
    }

    // Getters and setters
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getClaimID() {
        return claimID;
    }

    public void setClaimID(String claimID) {
        this.claimID = claimID;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }
}public class INS {
    private double claimAmount;
    private String providerName;
    private String companyName;
    private String startDate;
    private String coverageType;
    private String claimStatus;
    private String email;
    private String position;
    private String insuranceID;
    private String streetAddress;
    private String state;
    private String zipCode;
    private String claimID;
    private String phoneNumber;
    private String city;
    private String endDate;

    public INS(double claimAmount, String providerName, String companyName, String startDate, String coverageType,
               String claimStatus, String email, String position, String insuranceID, String streetAddress,
               String state, String zipCode, String claimID, String phoneNumber, String city, String endDate) {
        this.claimAmount = claimAmount;
        this.providerName = providerName;
        this.companyName = companyName;
        this.startDate = startDate;
        this.coverageType = coverageType;
        this.claimStatus = claimStatus;
        this.email = email;
        this.position = position;
        this.insuranceID = insuranceID;
        this.streetAddress = streetAddress;
        this.state = state;
        this.zipCode = zipCode;
        this.claimID = claimID;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.endDate = endDate;
    }

    // Getters and setters
    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getClaimID() {
        return claimID;
    }

    public void setClaimID(String claimID) {
        this.claimID = claimID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}public class EMP {
    private String claimStatus;
    private String companyName;
    private String position;
    private String endDate;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String providerName;
    private String startDate;
    private String claimID;
    private String email;
    private String city;
    private String insuranceID;
    private double claimAmount;
    private String streetAddress;
    private String coverageType;

    public EMP(String claimStatus, String companyName, String position, String endDate, String state, String zipCode,
               String phoneNumber, String providerName, String startDate, String claimID, String email, String city,
               String insuranceID, double claimAmount, String streetAddress, String coverageType) {
        this.claimStatus = claimStatus;
        this.companyName = companyName;
        this.position = position;
        this.endDate = endDate;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.providerName = providerName;
        this.startDate = startDate;
        this.claimID = claimID;
        this.email = email;
        this.city = city;
        this.insuranceID = insuranceID;
        this.claimAmount = claimAmount;
        this.streetAddress = streetAddress;
        this.coverageType = coverageType;
    }

    // Getters and setters
    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getClaimID() {
        return claimID;
    }

    public void setClaimID(String claimID) {
        this.claimID = claimID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }
}public class CLA {
    private String state;
    private String zipCode;
    private String streetAddress;
    private String coverageType;
    private String insuranceID;
    private double claimAmount;
    private String position;
    private String companyName;
    private String startDate;
    private String claimID;
    private String email;
    private String city;
    private String providerName;
    private String endDate;
    private String phoneNumber;
    private String claimStatus;

    public CLA(String state, String zipCode, String streetAddress, String coverageType, String insuranceID,
               double claimAmount, String position, String companyName, String startDate, String claimID,
               String email, String city, String providerName, String endDate, String phoneNumber, String claimStatus) {
        this.state = state;
        this.zipCode = zipCode;
        this.streetAddress = streetAddress;
        this.coverageType = coverageType;
        this.insuranceID = insuranceID;
        this.claimAmount = claimAmount;
        this.position = position;
        this.companyName = companyName;
        this.startDate = startDate;
        this.claimID = claimID;
        this.email = email;
        this.city = city;
        this.providerName = providerName;
        this.endDate = endDate;
        this.phoneNumber = phoneNumber;
        this.claimStatus = claimStatus;
    }

    // Getters and setters
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }

    public String getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getClaimID() {
        return claimID;
    }

    public void setClaimID(String claimID) {
        this.claimID = claimID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }
}public class Container {
    private HDR hdr;
    private PII pii;
    private BNK bnk;
    private ADR adr;
    private COM com;
    private INS ins;
    private EMP emp;
    private CLA cla;

    public Container(HDR hdr, PII pii, BNK bnk, ADR adr, COM com, INS ins, EMP emp, CLA cla) {
        this.hdr = hdr;
        this.pii = pii;
        this.bnk = bnk;
        this.adr = adr;
        this.com = com;
        this.ins = ins;
        this.emp = emp;
        this.cla = cla;
    }

    // Getters and setters
    public HDR getHdr() {
        return hdr;
    }

    public void setHdr(HDR hdr) {
        this.hdr = hdr;
    }

    public PII getPii() {
        return pii;
    }

    public void setPii(PII pii) {
        this.pii = pii;
    }

    public BNK getBnk() {
        return bnk;
    }

    public void setBnk(BNK bnk) {
        this.bnk = bnk;
    }

    public ADR getAdr() {
        return adr;
    }

    public void setAdr(ADR adr) {
        this.adr = adr;
    }

    public COM getCom() {
        return com;
    }

    public void setCom(COM com) {
        this.com = com;
    }

    public INS getIns() {
        return ins;
    }

    public void setIns(INS ins) {
        this.ins = ins;
    }

    public EMP getEmp() {
        return emp;
    }

    public void setEmp(EMP emp) {
        this.emp = emp;
    }

    public CLA getCla() {
        return cla;
    }

    public void setCla(CLA cla) {
        this.cla = cla;
    }
}