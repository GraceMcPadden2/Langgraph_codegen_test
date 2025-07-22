class DataRecord:
    class Header:
        def __init__(self, customer_count, file_name, date_created, customer_name):
            self.section_code = "HDR"  # Section code
            self.customer_count = customer_count  # Number of employers
            self.file_name = file_name  # Name of file
            self.date_created = date_created  # Date Created
            self.customer_name = customer_name  # Customer Name

    class PersonalInformation:
        def __init__(self, customer_number, transaction_code, employee_ssn, employee_id, member_ssn_member_id, relationship_code, last_name, first_name):
            self.section_code = "PII"  # Section code
            self.customer_number = customer_number  # Required when providing a multi client file
            self.transaction_code = transaction_code  # Transaction Code
            self.employee_ssn = employee_ssn  # Social Security Number
            self.employee_id = employee_id  # Alpha numeric code
            self.member_ssn_member_id = member_ssn_member_id  # Used for dependents record
            self.relationship_code = relationship_code  # Relationship to employee
            self.last_name = last_name  # Employee or dependent last name
            self.first_name = first_name  # Employee or dependent first name

    class BankInformation:
        def __init__(self, bank_routing_number, account_number, account_type):
            self.section_code = "BNK"  # Section code
            self.bank_routing_number = bank_routing_number  # Routing Number
            self.account_number = account_number  # Account Number
            self.account_type = account_type  # Account Type
