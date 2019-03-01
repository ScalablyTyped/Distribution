package typings
package zipcodesLib.zipcodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZipCode extends js.Object {
  var city: java.lang.String
  var country: java.lang.String
  var latitude: scala.Double
  var longitude: scala.Double
  var state: java.lang.String
  var zip: java.lang.String
}

object ZipCode {
  @scala.inline
  def apply(
    city: java.lang.String,
    country: java.lang.String,
    latitude: scala.Double,
    longitude: scala.Double,
    state: java.lang.String,
    zip: java.lang.String
  ): ZipCode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("zip")(zip)
    __obj.asInstanceOf[ZipCode]
  }
}

