import kotlin.math.floor

fun main() {
  println("Hello, world!")

  // gather and display my power level
  val gearScore = 123
  var fightingSkillLevel = 15
  val happiness = 1000
  var powerLevel = calculation(gearScore, fightingSkillLevel, happiness)
  checkNotNull(powerLevel) { "Failed to calculate!" }
  println("My power level is $powerLevel!")

  // ... fight some monsters

  // you gained experience points. fighting skill level has changed
  fightingSkillLevel += skillLevelIncreaseFromExpPoints(expFromEnemy(getPowerOfSun()))
  powerLevel = calculation(gearScore, fightingSkillLevel, happiness)
  checkNotNull(powerLevel) { "Failed to calculate!" }
  println("My new power level is $powerLevel!")

  val enemyPowerLevel = calculation(5, 10, 1)
  checkNotNull(enemyPowerLevel) { "Failed to calculate!" }
  println("The enemy power level is $enemyPowerLevel!")
}

// get the power of the sun
fun getPowerOfSun(): Int = 5

// enemies give more exp if the sun is out more??
fun expFromEnemy(sunPower: Int): Int {
  return 500 + (sunPower * 3)
}

// calculate your total power level, based on your gear score, fighting skill level, your happiness,
// and the power of the sun and moon
fun calculation(gearScore: Int, fightingSkillLevel: Int, happiness: Int): Int? {
  if (gearScore < 0 || fightingSkillLevel < 0) {
    return null
  }

  if (happiness < 0) {
    // being unhappy makes you evil and thus the most powerful of all
    return Int.MAX_VALUE
  }

  // calculate fighting power based on gear score
  var fightingPower = 0
  for (i in 0 until gearScore) {
    fightingPower += (fightingSkillLevel * 2) + i
  }

  // true happiness actually comes from your fighting power.
  val trueHappiness = happiness + (fightingPower / 3)

  val moonPower = 5 * 2
  val sunPower = getPowerOfSun() + trueHappiness

  return fightingPower + moonPower + sunPower
}

fun skillLevelIncreaseFromExpPoints(exp: Int): Int {
  return exp + floor((exp * exp).toFloat() * 0.1).toInt()
}
