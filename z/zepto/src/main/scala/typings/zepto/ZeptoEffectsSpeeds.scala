package typings.zepto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeptoEffectsSpeeds extends js.Object {
  /**
  	* Default = 400ms.
  	**/
  var _default: Double
  /**
  	* Default = 200ms.
  	**/
  var fast: Double
  /**
  	* Default = 600ms.
  	**/
  var slow: Double
}

object ZeptoEffectsSpeeds {
  @scala.inline
  def apply(_default: Double, fast: Double, slow: Double): ZeptoEffectsSpeeds = {
    val __obj = js.Dynamic.literal(_default = _default, fast = fast, slow = slow)
  
    __obj.asInstanceOf[ZeptoEffectsSpeeds]
  }
}

