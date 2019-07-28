package typings.zipcodes.zipcodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZipCode extends js.Object {
  var city: String
  var country: String
  var latitude: Double
  var longitude: Double
  var state: String
  var zip: String
}

object ZipCode {
  @scala.inline
  def apply(city: String, country: String, latitude: Double, longitude: Double, state: String, zip: String): ZipCode = {
    val __obj = js.Dynamic.literal(city = city, country = country, latitude = latitude, longitude = longitude, state = state, zip = zip)
  
    __obj.asInstanceOf[ZipCode]
  }
}

