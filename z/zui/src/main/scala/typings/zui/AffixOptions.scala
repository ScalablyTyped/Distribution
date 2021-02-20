package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AffixOptions extends StObject {
  
  var offset: js.UndefOr[Double | CallBack | js.Object] = js.native
  
  var target: js.UndefOr[js.Any] = js.native
}
object AffixOptions {
  
  @scala.inline
  def apply(): AffixOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AffixOptions]
  }
  
  @scala.inline
  implicit class AffixOptionsMutableBuilder[Self <: AffixOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double | CallBack | js.Object): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetFunction0(value: () => Unit): Self = StObject.set(x, "offset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
