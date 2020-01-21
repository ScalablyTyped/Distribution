package typings.zipcodes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipcodes", "lookup")
@js.native
object lookup extends js.Object {
  def apply(zip: String): js.UndefOr[ZipCode] = js.native
  def apply(zip: Double): js.UndefOr[ZipCode] = js.native
}

