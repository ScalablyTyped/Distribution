package typings.zipcodes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipcodes", "radius")
@js.native
object radius extends js.Object {
  def apply(zip: String, miles: Double, full: Boolean): js.Array[String | ZipCode] = js.native
  def apply(zip: Double, miles: Double, full: Boolean): js.Array[String | ZipCode] = js.native
}

