package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollSpyOptions extends StObject {
  
  var offset: js.UndefOr[Double] = js.native
  
  var target: js.UndefOr[String] = js.native
}
object ScrollSpyOptions {
  
  @scala.inline
  def apply(): ScrollSpyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollSpyOptions]
  }
  
  @scala.inline
  implicit class ScrollSpyOptionsMutableBuilder[Self <: ScrollSpyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
