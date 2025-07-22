class DataSections:
    class HDR:
        """Header Section"""
        customer_count: int  # Number of employers
        file_name: str  # Name of file
        date_created: str  # Date Created
        customer_name: str  # Customer Name

    class PII:
        """Personally Identifiable Information Section"""
        customer_number: str  # Required when providing a multi client file
        transaction_code: str  # Transaction Code
        employee_ssn: str  # Social Security Number
        employee_id: str  # Alpha numeric code
        member_ssn_member_id: str  # Used for dependents record
        relationship_code: str  # Relationship to employee
        last_name: str  # Employee or dependent name
        first_name: str  # Employee or dependent name

    class BNK:
        """Bank Information Section"""
        bank_routing_number: str  # Routing Number
        account_number: str  # Account Number
        account_type: str  # Account Type

    class ADR:
        """Address Section"""
        company_name: str  # Name of employer or business
        claim_amount: float  # Amount claimed
        position: str  # Job title or role
        phone_number: str  # Primary contact number
        coverage_type: str  # Type of insurance coverage
        street_address: str  # Street address of the individual
        provider_name: str  # Insurance provider name

    class COM:
        """Communication Section"""
        zip_code: str  # Postal code
        email: str  # Email address
        insurance_id: str  # Insurance policy number
        city: str  # City of residence
        claim_status: str  # Status of the claim
        provider_name: str  # Insurance provider name
        end_date: str  # Policy end date
        claim_amount: float  # Amount claimed
        state: str  # State or province

    class INS:
        """Insurance Section"""
        claim_amount: float  # Amount claimed
        provider_name: str  # Insurance provider name
        company_name: str  # Name of employer or business
        start_date: str  # Policy start date
        coverage_type: str  # Type of insurance coverage
        claim_status: str  # Status of the claim
        email: str  # Email address
