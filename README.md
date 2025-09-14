```mermaid
classDiagram
class Car {
  - String brand
  - String model
  - String engine
  - String color
  - int seats
  - boolean hasSunroof
  + String getBrand()
  + String getModel()
  + String getEngine()
  + String getColor()
  + int getSeats()
  + boolean hasSunroof()
  + String toString()
  - Car(Builder)  <<constructor>>
}

class CarBuilder {
  - String brand
  - String model
  - String engine
  - String color = "White"
  - int seats = 4
  - boolean hasSunroof = false
  + CarBuilder setBrand(String)
  + CarBuilder setModel(String)
  + CarBuilder setEngine(String)
  + CarBuilder setColor(String)
  + CarBuilder setSeats(int)
  + CarBuilder setSunroof(boolean)
  + Car build()
  - void validate()
}

CarBuilder ..> Car : builds
```
