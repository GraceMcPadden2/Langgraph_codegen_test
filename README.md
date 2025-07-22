Temperature set to 0 to increase reliability.

Book1.xlsx contains simulated form of ~20 lines.


Book2.xlsx contains simulated form of ~500 lines.


Book3.xlsx contains simulated form of ~100 lines.


Book4.xlsx contains simulated form of ~50 lines.

One shot generation for Python classes works reliabily up to ~50 lines, One shot generation for Java classes works up to ~20 lines.
Segmenting classes before generation allows classes to be reliabily generated for 1000+ lines.

Python classes generated in segments use dataclass to allow init function to be generated automatically, reducing code complexity and increasing ability for one shot generation. Java class generation includes generation of getters and setters.

Demo for generate by section (python): https://www.youtube.com/watch?v=E_0xtVKohgU

Demo for generate one pass (python): https://youtu.be/6uYgT_IFcJ0
