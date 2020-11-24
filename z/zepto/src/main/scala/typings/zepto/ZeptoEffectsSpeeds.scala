package typings.zepto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZeptoEffectsSpeeds extends js.Object {
  
  /**
    * Default = 400ms.
    **/
  var _default: Double = js.native
  
  /**
    * Default = 200ms.
    **/
  var fast: Double = js.native
  
  /**
    * Default = 600ms.
    **/
  var slow: Double = js.native
}
object ZeptoEffectsSpeeds {
  
  @scala.inline
  def apply(_default: Double, fast: Double, slow: Double): ZeptoEffectsSpeeds = {
    val __obj = js.Dynamic.literal(_default = _default.asInstanceOf[js.Any], fast = fast.asInstanceOf[js.Any], slow = slow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeptoEffectsSpeeds]
  }
  
  @scala.inline
  implicit class ZeptoEffectsSpeedsOps[Self <: ZeptoEffectsSpeeds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_default(value: Double): Self = this.set("_default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFast(value: Double): Self = this.set("fast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlow(value: Double): Self = this.set("slow", value.asInstanceOf[js.Any])
  }
}
