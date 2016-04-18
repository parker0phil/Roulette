# Brief

(https://docs.google.com/document/d/18mBn4R_DsuHPSuZHCqTgXrhXfyPJW-Gd46EJS_mWy2k)

**Estimated Duration:** 1-3 hours

**Author:** James Jeffries
                                                                          git stat
**Language(s)/stacks:** Any

**Summary:**

A roulette wheel has numbers from 0 to 36. A spin of the wheel takes 20 seconds and leaves the ball on  a random number.

Design and implement a roulette wheel using TDD. Think about how using time and random numbers affects your design. Consider how much functionality each test covers and what responsibilities you are testing.


# Initial Thoughts

- Seems like a brief with a lot of latitude for different implementations.
- Can imagine it being very easy to get to something minimal that meets the brief (famous last words)

# Build/Test

'/gradlew clean build'
'java -cp build/classes/main com.parker0phil.roulette.ConsoleApplication'

# TODO:

- [ ] Git/Gradle
- [ ] Console input/output Walking Skeleton
- [ ] Select a random number
- [ ] Delay by x seconds
- [ ] Use properly ordered roulette wheel stream
- [ ] Deliver non-final (near miss/bounce) numbers periodically
- [ ] Better model wheel/ball 
