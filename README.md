# Car.Builder — Builder Pattern in Java (Clean Code)
Discipline: Software Design Patterns
Pattern: Builder (Creational)
Language/Tools: Java, any IDE (IntelliJ IDEA recommended)
1) Overview
This project demonstrates the Builder pattern by constructing immutable Car objects step-by-step via a fluent API.
The implementation applies Clean Code principles (readability, immutability, SRP, fail-fast validation) and is defense-ready.
Why Builder?
Avoids telescoping constructors when an object has many optional fields.
Offers readable and safe construction via method chaining.
Keeps the constructed object immutable while allowing progressive configuration.
2) Key Features
Immutable Car: all fields are private final, no setters.
Static inner builder: Car.Builder exposes fluent setXxx(...) methods and build().
Fail-fast: validate() checks required fields (brand, model, engine) before build.
Sane defaults: color="White", seats=4, hasSunroof=false.
Clean API: descriptive names, small functions, no flag parameters.
3) Project Structure
CarBuilderAssignment/
├─ Car.java     # Car + inner static Builder
├─ Main.java    # Demo usage (entry point)
└─ README.md
4) Design & Clean Code Notes
Principle / Idea	How it’s applied here
Immutability:	Car fields are private final; no setters. Thread-safe by design.
SRP:	Car holds state/behavior; Builder handles construction and validation.
Readable, fluent API:	Method chaining (.setColor(...).setSeats(...).build()) reads like a sentence.
Fail-fast:	validate() throws if required fields are missing, preventing invalid objects.
Small, focused methods:	build() delegates checks to validate(); no long methods.
Good names:	setSunroof(boolean hasSunroof) is explicit; no abbreviations or flags.
Defaults:	Optional fields get reasonable defaults (no null surprises).
- Trade-offs
Builder adds extra classes/lines vs. a single constructor.
For very simple objects, a constructor or factory could be enough; Builder shines when options grow.

