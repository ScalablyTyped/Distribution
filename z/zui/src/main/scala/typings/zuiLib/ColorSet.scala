package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSet extends js.Object {
  def get(name: java.lang.String): Color
}

object ColorSet {
  @scala.inline
  def apply(get: js.Function1[java.lang.String, Color]): ColorSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[ColorSet]
  }
}

