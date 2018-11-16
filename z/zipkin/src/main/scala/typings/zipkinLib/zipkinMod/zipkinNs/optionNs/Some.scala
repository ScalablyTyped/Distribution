package typings
package zipkinLib.zipkinMod.zipkinNs.optionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Some[T] extends IOption[T] {
  @JSName("present")
  var present_Some: zipkinLib.zipkinLibNumbers.`true` = js.native
  def getOrElse(): T = js.native
}

