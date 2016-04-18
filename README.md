# Brief

(https://docs.google.com/document/d/18mBn4R_DsuHPSuZHCqTgXrhXfyPJW-Gd46EJS_mWy2k)

**Estimated Duration:** 1-3 hours

**Author:** James Jeffries
                                                                         
**Language(s)/stacks:** Any

**Summary:**

A roulette wheel has numbers from 0 to 36. A spin of the wheel takes 20 seconds and leaves the ball on  a random number.

Design and implement a roulette wheel using TDD. Think about how using time and random numbers affects your design. Consider how much functionality each test covers and what responsibilities you are testing.


# Initial Thoughts

- Seems like a brief with a lot of latitude for different implementations.
- Can imagine it being very easy to get to something minimal that meets the brief (famous last words)

# Build/Test

`./gradlew clean build`

`java -cp build/classes/main com.parker0phil.roulette.ConsoleApplication`

`./gradlew clean build -Dtest.include.slow` (if you want to include the 20 second slow-running acceptance test)

# TODO:

- [X] Git/Gradle
- [X] Console input/output Walking Skeleton
- [X] Select a random number
- [X] Delay by x seconds
- [ ] Use properly ordered roulette wheel stream
- [ ] Deliver non-final (near miss/bounce) numbers periodically
- [ ] Better model wheel/ball 



# Feedback on exercise:

- It nicely incorporates two common gotchas (randoms and current times) into a contained  exercise.
- However, if you inject/mock these by default then it feels like you might not have done enough "work" to make this a complete exercise.
- There was plenty of gold-plating/addition that you could have done but nothing you would want to add without understanding how the "requirements" were going to progress.


# Suggestions:

- Make it clear how someone is expected to interact with the system (maybe suggest it is a console app with SPACE bar presses re-spinning the wheel?)
- Perhaps add a little more state to the exercise (e.g. the console should say "WHAT ARE THE CHANCES?!" if the same number comes twice in a row).
- Suggest an extension to the codebase (maybe after first part of coding has been completed). For example adding a 00, a common feature of roulette wheels, would be interesting considering lots of people will have gone for an int based solution!
