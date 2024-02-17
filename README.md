# MediScoreCal

 Aire Logic Tech Test
 
## Indroduction

FINISH

## Patient Class

The Patient class represents a patient with certain physiological measurements. Here’s a breakdown of the class and its components:
The Patient class represents a patient with certain physiological measurements. Here’s a breakdown of the class and its components:

Instance Variables: The class has five instance variables: airOrOxygen, consciousness, respirationRate, spO2, and temperature. These variables hold the values for the patient’s air or oxygen status, consciousness level, respiration rate, oxygen saturation (SpO2), and body temperature, respectively.
Constructor: The Patient constructor takes five parameters corresponding to the instance variables. When a new Patient object is created, this constructor is called with the initial values for the patient’s measurements, and these values are assigned to the instance variables.
Getters: The class includes getter methods for each of the instance variables. These methods return the current value of the corresponding instance variable. For example, the getAirOrOxygen() method returns the current value of the airOrOxygen variable.
This class can be used to create Patient objects with specific physiological measurements and then retrieve those measurements using the getter methods.

## MediScoreCalculator Class

The class named MediScoreCalculator with a static method calculateMediScore(). This method calculates a score for a patient based on various health parameters. Here’s a breakdown of the method:
The class named MediScoreCalculator with a static method calculateMediScore(). This method calculates a score for a patient based on various health parameters. Here’s a breakdown of the method:

Input: The method takes a Patient object as input. This object should have properties for air or oxygen status, consciousness level, respiration rate, oxygen saturation (SpO2), and body temperature.
Output: The method returns an integer score based on the patient’s health parameters.
Error Handling: The method throws an Exception if any of the health parameters are out of their expected ranges. For example, if the airOrOxygen property is not 0 or 2, an Exception with the message “Invalid value for air_or_oxygen” is thrown.
Score Calculation: The score is calculated by adding up individual scores for each health parameter. The scoring rules are defined in the if-else statements. For example, if the patient’s SpO2 is less than or equal to 83 or the patient is on oxygen and their SpO2 is greater than or equal to 97, 3 points are added to the score.
Here’s how the score is calculated for each parameter:
Air or Oxygen: If the patient is on oxygen (value is 2), 2 points are added to the score.
Consciousness: If the patient is not conscious (value is not 0), 1 point is added to the score.
Respiration Rate: Points are added based on the respiration rate. The higher or lower the rate from the normal range (12-20), the more points are added.
SpO2: Points are added based on the SpO2 level. The further the level is from the normal range (88-92 or >=93 if on air), the more points are added.
Temperature: Points are added based on the body temperature. The further the temperature is from the normal range (36.1-38.0), the more points are added.
The total score is returned at the end of the method. This score can be used to assess the patient’s health status. The higher the score, the more critical the patient’s condition may be.

## Main Class

The Main class with a main method, which is the entry point for any Java application. The main method creates three Patient objects and calculates their Medi Scores using the calculateMediScore method from the MediScoreCalculator class. Here’s a breakdown of the code:
The Main class with a main method, which is the entry point for any Java application. The main method creates three Patient objects and calculates their Medi Scores using the calculateMediScore method from the MediScoreCalculator class. Here’s a breakdown of the code:

Patient Objects: Three Patient objects are created with different physiological measurements. These measurements are passed as arguments to the Patient constructor.
Medi Score Calculation: For each Patient object, the calculateMediScore method of the MediScoreCalculator class is called. This method calculates a score based on the patient’s physiological measurements. The calculated score is stored in the mediScore variable.
Printing the Medi Score: The Medi Score for each patient is printed to the console.
Exception Handling: The code that creates the Patient objects and calculates the Medi Scores is wrapped in a try-catch block. If an exception occurs while executing this code (for example, if invalid physiological measurements are passed to the Patient constructor or the calculateMediScore method), the catch block will catch the exception and print its stack trace to the console. This prevents the program from terminating abruptly due to the exception.
Please note that the Patient and MediScoreCalculator classes are not defined in this code snippet. They should be defined elsewhere in your code. The Patient class should have a constructor that takes the physiological measurements as parameters, and the MediScoreCalculator class should have a calculateMediScore method that takes a Patient object as a parameter and returns an integer score.
