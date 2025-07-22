from dataclasses import dataclasspublic class HDR {
    private String customerCount;
    private String fileName;
    private String dateCreated;
    private String customerName;

    public HDR(String customerCount, String fileName, String dateCreated, String customerName) {
        this.customerCount = customerCount;
        this.fileName = fileName;
        this.dateCreated = dateCreated;
        this.customerName = customerName;
    }
}
public class PII {
    private String customerNumber;
    private String transactionCode;
    private String employeeSSN;
    private String employeeID;
    private String memberSSNMemberID;
    private String relationshipCode;
    private String lastName;
    private String firstName;

    public PII(String customerNumber, String transactionCode, String employeeSSN, 
               String employeeID, String memberSSNMemberID, String relationshipCode, 
               String lastName, String firstName) {
        this.customerNumber = customerNumber;
        this.transactionCode = transactionCode;
        this.employeeSSN = employeeSSN;
        this.employeeID = employeeID;
        this.memberSSNMemberID = memberSSNMemberID;
        this.relationshipCode = relationshipCode;
        this.lastName = lastName;
        this.firstName = firstName;
    }
}
public class BNK {
    private String bankRoutingNumber;
    private String accountNumber;
    private String accountType;

    public BNK(String bankRoutingNumber, String accountNumber, String accountType) {
        this.bankRoutingNumber = bankRoutingNumber;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }
}
public class ADR {
    private String companyName;
    private String claimAmount;
    private String position;
    private String phoneNumber;
    private String coverageType;
    private String streetAddress;
    private String providerName;
    private String startDate;
    private String zipCode;
    private String endDate;
    private String claimID;
    private String state;
    private String city;
    private String insuranceID;
    private String claimStatus;
    private String email;

    public ADR(String companyName, String claimAmount, String position, String phoneNumber, 
               String coverageType, String streetAddress, String providerName, String startDate, 
               String zipCode, String endDate, String claimID, String state, 
               String city, String insuranceID, String claimStatus, String email) {
        this.companyName = companyName;
        this.claimAmount = claimAmount;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.coverageType = coverageType;
        this.streetAddress = streetAddress;
        this.providerName = providerName;
        this.startDate = startDate;
        this.zipCode = zipCode;
        this.endDate = endDate;
        this.claimID = claimID;
        this.state = state;
        this.city = city;
        this.insuranceID = insuranceID;
        this.claimStatus = claimStatus;
        this.email = email;
    }
}
public class COM {
    private String zipCode;
    private String email;
    private String insuranceID;
    private String city;
    private String claimStatus;
    private String providerName;
    private String endDate;
    private String claimAmount;
    private String state;
    private String startDate;
    private String companyName;
    private String position;
    private String phoneNumber;
    private String streetAddress;
    private String claimID;
    private String coverageType;

    public COM(String zipCode, String email, String insuranceID, String city, 
               String claimStatus, String providerName, String endDate, String claimAmount, 
               String state, String startDate, String companyName, String position, 
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
}
public class INS {
    private String claimAmount;
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

    public INS(String claimAmount, String providerName, String companyName, String startDate, 
               String coverageType, String claimStatus, String email, String position, 
               String insuranceID, String streetAddress, String state, String zipCode, 
               String claimID, String phoneNumber, String city, String endDate) {
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
}
public class EMP {
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
    private String claimAmount;
    private String streetAddress;
    private String coverageType;

    public EMP(String claimStatus, String companyName, String position, String endDate, 
               String state, String zipCode, String phoneNumber, String providerName, 
               String startDate, String claimID, String email, String city, 
               String insuranceID, String claimAmount, String streetAddress, String coverageType) {
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
}
public class CLA {
    private String state;
    private String zipCode;
    private String streetAddress;
    private String coverageType;
    private String insuranceID;
    private String claimAmount;
    private String position;
    private String companyName;
    private String startDate;
    private String claimID;
    private String email;
    private String phoneNumber;
    private String city;
    private String providerName;
    private String endDate;
    private String claimStatus;

    public CLA(String state, String zipCode, String streetAddress, String coverageType, 
               String insuranceID, String claimAmount, String position, String companyName, 
               String startDate, String claimID, String email, String phoneNumber, 
               String city, String providerName, String endDate, String claimStatus) {
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
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.providerName = providerName;
        this.endDate = endDate;
        this.claimStatus = claimStatus;
    }
}
public class Container {
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

    // Getter and Setter methods for each class

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
