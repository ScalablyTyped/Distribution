package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyscalekeyScale extends js.Object {
  /**
    * Sets the key-scale value "scale-k" | "scale-v" | ...
    */
  var `key-scalekeyScale`: js.UndefOr[String] = js.undefined
  /**
    * Sets the value-scale value "scale-x" | "scale-y" | ...
    */
  var `val-scalevalScale`: js.UndefOr[String] = js.undefined
}

object AnonKeyscalekeyScale {
  @scala.inline
  def apply(`key-scalekeyScale`: String = null, `val-scalevalScale`: String = null): AnonKeyscalekeyScale = {
    val __obj = js.Dynamic.literal()
    if (`key-scalekeyScale` != null) __obj.updateDynamic("key-scalekeyScale")(`key-scalekeyScale`.asInstanceOf[js.Any])
    if (`val-scalevalScale` != null) __obj.updateDynamic("val-scalevalScale")(`val-scalevalScale`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyscalekeyScale]
  }
}

