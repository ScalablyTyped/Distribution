package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bar extends StObject {
  
  var bar: js.UndefOr[Borderradius] = js.native
  
  var handle: js.UndefOr[Borderradius] = js.native
}
object Bar {
  
  @scala.inline
  def apply(): Bar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bar]
  }
  
  @scala.inline
  implicit class BarMutableBuilder[Self <: Bar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBar(value: Borderradius): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    @scala.inline
    def setHandle(value: Borderradius): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
  }
}
