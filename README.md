Temperature set to 0 to increase increase repeatability.

Book1.xlsx contains simulated form of ~20 rows.


Book2.xlsx contains simulated form of ~500 rows.


Book3.xlsx contains simulated form of ~100 rows.


Book4.xlsx contains simulated form of ~50 rows.

One shot generation for Python classes works reliabily up to ~50 rows, One shot generation for Java classes works up to ~20 rows.
Segmenting classes before generation allows classes to be reliabily generated for 500+ rows.

Python classes generated in segments use dataclass to allow init function to be generated automatically, reducing code complexity and increasing ability for one shot generation. Java class generation includes generation of getters and setters.

Demo for generate by section (python): https://www.youtube.com/watch?v=E_0xtVKohgU

Demo for generate one pass (python): https://youtu.be/6uYgT_IFcJ0


Example Generations:

by_segment_script.py

one_pass_script.py

by_segment_script.java

one_pass_script.java

