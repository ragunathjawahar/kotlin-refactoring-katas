package racingcars.leaderboard

open class Driver(val name: String, val country: String) {
  override fun hashCode(): Int {
    return name.hashCode() * 31 + country.hashCode()
  }

  override fun equals(other: Any?): Boolean {
    if (this === other) {
      return true
    }
    if (other == null || other !is Driver) {
      return false
    }
    val otherObject = other as Driver?
    return this.name == otherObject!!.name && this.country == otherObject.country
  }
}
