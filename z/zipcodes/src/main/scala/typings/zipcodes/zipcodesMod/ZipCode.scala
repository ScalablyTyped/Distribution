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
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ZipCode]
  }
}

