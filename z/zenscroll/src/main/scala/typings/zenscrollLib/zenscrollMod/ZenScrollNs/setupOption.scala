package typings
package zenscrollLib.zenscrollMod.ZenScrollNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait setupOption extends js.Object {
  var defaultDuration: scala.Double
  var edgeOffset: scala.Double
}

object setupOption {
  @scala.inline
  def apply(defaultDuration: scala.Double, edgeOffset: scala.Double): setupOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultDuration")(defaultDuration)
    __obj.updateDynamic("edgeOffset")(edgeOffset)
    __obj.asInstanceOf[setupOption]
  }
}

