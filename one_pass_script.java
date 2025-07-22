public class DataRecord {

    // HDR Section
    private String sectionCodeHDR;
    private int customerCount;
    private String fileName;
    private String dateCreated;
    private String customerName;

    // PII Section
    private String sectionCodePII;
    private String customerNumber;
    private String transactionCode;
    private String employeeSSN;
    private String employeeID;
    private String memberSSNOrMemberID;
    private String relationshipCode;
    private String lastName;
    private String firstName;

    // BNK Section
    private String sectionCodeBNK;
    private String bankRoutingNumber;
    private String accountNumber;
    private String accountType;

    // Getters and Setters for HDR Section
    public String getSectionCodeHDR() {
        return sectionCodeHDR;
    }

    public void setSectionCodeHDR(String sectionCodeHDR) {
        this.sectionCodeHDR = sectionCodeHDR;
    }

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

    // Getters and Setters for PII Section
    public String getSectionCodePII() {
        return sectionCodePII;
    }

    public void setSectionCodePII(String sectionCodePII) {
        this.sectionCodePII = sectionCodePII;
    }

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

    public String getMemberSSNOrMemberID() {
        return memberSSNOrMemberID;
    }

    public void setMemberSSNOrMemberID(String memberSSNOrMemberID) {
        this.memberSSNOrMemberID = memberSSNOrMemberID;
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

    // Getters and Setters for BNK Section
    public String getSectionCodeBNK() {
        return sectionCodeBNK;
    }

    public void setSectionCodeBNK(String sectionCodeBNK) {
        this.sectionCodeBNK = sectionCodeBNK;
    }

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
}
