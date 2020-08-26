package typings.zipcodes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZipCode extends js.Object {
  var city: String = js.native
  var country: String = js.native
  var latitude: Double = js.native
  var longitude: Double = js.native
  var state: String = js.native
  var zip: String = js.native
}

object ZipCode {
  @scala.inline
  def apply(city: String, country: String, latitude: Double, longitude: Double, state: String, zip: String): ZipCode = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipCode]
  }
  @scala.inline
  implicit class ZipCodeOps[Self <: ZipCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setZip(value: String): Self = this.set("zip", value.asInstanceOf[js.Any])
  }
  
}

