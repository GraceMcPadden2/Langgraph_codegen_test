from dataclasses import dataclass, field
from typing import Optional

import pandas as pd
from collections import defaultdict

import pandas as pd
from collections import defaultdict
from typing import Dict, List


def convert_sectioned_data(file_path: str) -> Dict[str, List[str]]:
    """
    Convert a spreadsheet with alternating 'Section Code' markers and fields
    into a dictionary mapping section codes to lists of field names.
    """
    df = pd.read_excel(file_path, header=None)

    section_to_fields = defaultdict(list)
    current_section = None

    for idx, row in df.iterrows():
        first_cell = str(row[0]).strip() if pd.notna(row[0]) else ""

        if first_cell == "Section code":
            # Grab section code from second cell
            current_section = str(row[1]).strip() if pd.notna(row[1]) else None
            if current_section is None:
                raise ValueError(f"Missing section name on row {idx}")
        elif current_section and pd.notna(row[0]):
            section_to_fields[current_section].append(str(row[0]).strip())

    return dict(section_to_fields)

def to_field_name(name: str) -> str:
    return name.lower().replace(" ", "_").replace("/", "_").replace("-", "_")

def generate_dataclass(section: str, fields: list[str]) -> str:
    class_name = section.title()
    lines = [f"@dataclass", f"class {class_name}:"]
    for field_name in fields:
        python_field = to_field_name(field_name)
        lines.append(f"    {python_field}: Optional[str] = None  # {field_name}")
    return "\n".join(lines)

schema = convert_sectioned_data("Book1.xlsx")

for section, fields in schema.items():
    print(generate_dataclass(section, fields))
