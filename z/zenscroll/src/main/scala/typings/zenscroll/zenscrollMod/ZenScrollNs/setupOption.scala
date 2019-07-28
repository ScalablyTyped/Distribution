package typings.zenscroll.zenscrollMod.ZenScrollNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait setupOption extends js.Object {
  var defaultDuration: Double
  var edgeOffset: Double
}

object setupOption {
  @scala.inline
  def apply(defaultDuration: Double, edgeOffset: Double): setupOption = {
    val __obj = js.Dynamic.literal(defaultDuration = defaultDuration, edgeOffset = edgeOffset)
  
    __obj.asInstanceOf[setupOption]
  }
}

