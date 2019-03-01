package typings
package zrenderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: java.lang.String
  var offset: scala.Double
}

object Anon_Color {
  @scala.inline
  def apply(color: java.lang.String, offset: scala.Double): Anon_Color = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[Anon_Color]
  }
}

