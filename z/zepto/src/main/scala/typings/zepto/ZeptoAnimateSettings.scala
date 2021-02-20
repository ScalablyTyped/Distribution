package typings.zepto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZeptoAnimateSettings extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easing: js.UndefOr[String] = js.native
}
object ZeptoAnimateSettings {
  
  @scala.inline
  def apply(): ZeptoAnimateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZeptoAnimateSettings]
  }
  
  @scala.inline
  implicit class ZeptoAnimateSettingsMutableBuilder[Self <: ZeptoAnimateSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
  }
}
