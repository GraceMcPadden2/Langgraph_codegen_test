from dataclasses import dataclass
@dataclass
class HDR:
    customer_count: int
    file_name: str
    date_created: str
    customer_name: str

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

@dataclass
class BNK:
    bank_routing_number: str
    account_number: str
    account_type: str

@dataclass
class Container:
    hdr: HDR
    pii: PII
    bnk: BNK
