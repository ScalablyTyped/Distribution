package typings
package zeptoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeptoEffectsSpeeds extends js.Object {
  /**
  	* Default = 400ms.
  	**/
  var _default: scala.Double
  /**
  	* Default = 200ms.
  	**/
  var fast: scala.Double
  /**
  	* Default = 600ms.
  	**/
  var slow: scala.Double
}

object ZeptoEffectsSpeeds {
  @scala.inline
  def apply(_default: scala.Double, fast: scala.Double, slow: scala.Double): ZeptoEffectsSpeeds = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_default")(_default)
    __obj.updateDynamic("fast")(fast)
    __obj.updateDynamic("slow")(slow)
    __obj.asInstanceOf[ZeptoEffectsSpeeds]
  }
}

