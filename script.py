from dataclasses import dataclass
@dataclass
class HDR:
    customer_count: str
    file_name: str
    date_created: str
    customer_name: str

    def __init__(self, customer_count: str, file_name: str, date_created: str, customer_name: str):
        self.customer_count = customer_count
        self.file_name = file_name
        self.date_created = date_created
        self.customer_name = customer_name

@dataclass
class PII:
    customer_number: str
    transaction_code: str
    employee_ssn: str
    employee_id: str
    member_ssn_member_id: str
    relationship_code: str
    last_name: str
    first_name: str

    def __init__(self, customer_number: str, transaction_code: str, employee_ssn: str, employee_id: str, member_ssn_member_id: str, relationship_code: str, last_name: str, first_name: str):
        self.customer_number = customer_number
        self.transaction_code = transaction_code
        self.employee_ssn = employee_ssn
        self.employee_id = employee_id
        self.member_ssn_member_id = member_ssn_member_id
        self.relationship_code = relationship_code
        self.last_name = last_name
        self.first_name = first_name

@dataclass
class BNK:
    bank_routing_number: str
    account_number: str
    account_type: str

    def __init__(self, bank_routing_number: str, account_number: str, account_type: str):
        self.bank_routing_number = bank_routing_number
        self.account_number = account_number
        self.account_type = account_type

@dataclass
class ADR:
    company_name: str
    claim_amount: str
    position: str
    phone_number: str
    coverage_type: str
    street_address: str
    provider_name: str
    start_date: str
    zip_code: str
    end_date: str
    email: str
    claim_id: str
    state: str
    city: str
    insurance_id: str
    claim_status: str

    def __init__(self, company_name: str, claim_amount: str, position: str, phone_number: str, coverage_type: str, street_address: str, provider_name: str, start_date: str, zip_code: str, end_date: str, email: str, claim_id: str, state: str, city: str, insurance_id: str, claim_status: str):
        self.company_name = company_name
        self.claim_amount = claim_amount
        self.position = position
        self.phone_number = phone_number
        self.coverage_type = coverage_type
        self.street_address = street_address
        self.provider_name = provider_name
        self.start_date = start_date
        self.zip_code = zip_code
        self.end_date = end_date
        self.email = email
        self.claim_id = claim_id
        self.state = state
        self.city = city
        self.insurance_id = insurance_id
        self.claim_status = claim_status

@dataclass
class COM:
    zip_code: str
    email: str
    insurance_id: str
    city: str
    claim_status: str
    provider_name: str
    end_date: str
    claim_amount: str
    state: str
    start_date: str
    company_name: str
    position: str
    phone_number: str
    street_address: str
    claim_id: str
    coverage_type: str

    def __init__(self, zip_code: str, email: str, insurance_id: str, city: str, claim_status: str, provider_name: str, end_date: str, claim_amount: str, state: str, start_date: str, company_name: str, position: str, phone_number: str, street_address: str, claim_id: str, coverage_type: str):
        self.zip_code = zip_code
        self.email = email
        self.insurance_id = insurance_id
        self.city = city
        self.claim_status = claim_status
        self.provider_name = provider_name
        self.end_date = end_date
        self.claim_amount = claim_amount
        self.state = state
        self.start_date = start_date
        self.company_name = company_name
        self.position = position
        self.phone_number = phone_number
        self.street_address = street_address
        self.claim_id = claim_id
        self.coverage_type = coverage_type

@dataclass
class INS:
    claim_amount: str
    provider_name: str
    company_name: str
    start_date: str
    coverage_type: str
    claim_status: str
    email: str
    position: str
    insurance_id: str
    street_address: str
    state: str
    zip_code: str
    claim_id: str
    phone_number: str
    city: str
    end_date: str

    def __init__(self, claim_amount: str, provider_name: str, company_name: str, start_date: str, coverage_type: str, claim_status: str, email: str, position: str, insurance_id: str, street_address: str, state: str, zip_code: str, claim_id: str, phone_number: str, city: str, end_date: str):
        self.claim_amount = claim_amount
        self.provider_name = provider_name
        self.company_name = company_name
        self.start_date = start_date
        self.coverage_type = coverage_type
        self.claim_status = claim_status
        self.email = email
        self.position = position
        self.insurance_id = insurance_id
        self.street_address = street_address
        self.state = state
        self.zip_code = zip_code
        self.claim_id = claim_id
        self.phone_number = phone_number
        self.city = city
        self.end_date = end_date

@dataclass
class EMP:
    claim_status: str
    company_name: str
    position: str
    end_date: str
    state: str
    zip_code: str
    phone_number: str
    provider_name: str
    start_date: str
    claim_id: str
    email: str
    city: str
    insurance_id: str
    claim_amount: str
    coverage_type: str
    street_address: str

    def __init__(self, claim_status: str, company_name: str, position: str, end_date: str, state: str, zip_code: str, phone_number: str, provider_name: str, start_date: str, claim_id: str, email: str, city: str, insurance_id: str, claim_amount: str, coverage_type: str, street_address: str):
        self.claim_status = claim_status
        self.company_name = company_name
        self.position = position
        self.end_date = end_date
        self.state = state
        self.zip_code = zip_code
        self.phone_number = phone_number
        self.provider_name = provider_name
        self.start_date = start_date
        self.claim_id = claim_id
        self.email = email
        self.city = city
        self.insurance_id = insurance_id
        self.claim_amount = claim_amount
        self.coverage_type = coverage_type
        self.street_address = street_address

@dataclass
class CLA:
    state: str
    zip_code: str
    street_address: str
    coverage_type: str
    insurance_id: str
    claim_amount: str
    position: str
    company_name: str
    start_date: str
    claim_id: str
    email: str
    phone_number: str
    city: str
    provider_name: str
    end_date: str
    claim_status: str

    def __init__(self, state: str, zip_code: str, street_address: str, coverage_type: str, insurance_id: str, claim_amount: str, position: str, company_name: str, start_date: str, claim_id: str, email: str, phone_number: str, city: str, provider_name: str, end_date: str, claim_status: str):
        self.state = state
        self.zip_code = zip_code
        self.street_address = street_address
        self.coverage_type = coverage_type
        self.insurance_id = insurance_id
        self.claim_amount = claim_amount
        self.position = position
        self.company_name = company_name
        self.start_date = start_date
        self.claim_id = claim_id
        self.email = email
        self.phone_number = phone_number
        self.city = city
        self.provider_name = provider_name
        self.end_date = end_date
        self.claim_status = claim_status
@dataclass
class Container:
    hdr: HDR
    pii: PII
    bnk: BNK
    adr: ADR
    com: COM
    ins: INS
    emp: EMP
    cla: CLA

    def __init__(self, hdr: HDR, pii: PII, bnk: BNK, adr: ADR, com: COM, ins: INS, emp: EMP, cla: CLA):
        self.hdr = hdr
        self.pii = pii
        self.bnk = bnk
        self.adr = adr
        self.com = com
        self.ins = ins
        self.emp = emp
        self.cla = cla
