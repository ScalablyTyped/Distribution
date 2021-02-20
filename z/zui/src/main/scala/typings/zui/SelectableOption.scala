package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectableOption extends StObject {
  
  var clickBehavior: js.UndefOr[String] = js.native
  
  var finish: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], Unit]] = js.native
  
  var ignoreVal: js.UndefOr[Double] = js.native
  
  var mouseButton: js.UndefOr[String] = js.native
  
  var rangeStyle: js.UndefOr[String | js.Object] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], Unit]] = js.native
  
  var selector: js.UndefOr[String] = js.native
  
  var start: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], Boolean]] = js.native
  
  var trigger: js.UndefOr[String] = js.native
  
  var unselect: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], Unit]] = js.native
}
object SelectableOption {
  
  @scala.inline
  def apply(): SelectableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectableOption]
  }
  
  @scala.inline
  implicit class SelectableOptionMutableBuilder[Self <: SelectableOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickBehavior(value: String): Self = StObject.set(x, "clickBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickBehaviorUndefined: Self = StObject.set(x, "clickBehavior", js.undefined)
    
    @scala.inline
    def setFinish(value: /* e */ js.UndefOr[SelectableEvent] => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
    
    @scala.inline
    def setIgnoreVal(value: Double): Self = StObject.set(x, "ignoreVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreValUndefined: Self = StObject.set(x, "ignoreVal", js.undefined)
    
    @scala.inline
    def setMouseButton(value: String): Self = StObject.set(x, "mouseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseButtonUndefined: Self = StObject.set(x, "mouseButton", js.undefined)
    
    @scala.inline
    def setRangeStyle(value: String | js.Object): Self = StObject.set(x, "rangeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeStyleUndefined: Self = StObject.set(x, "rangeStyle", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ js.UndefOr[SelectableEvent] => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setStart(value: /* e */ js.UndefOr[SelectableEvent] => Boolean): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    @scala.inline
    def setUnselect(value: /* e */ js.UndefOr[SelectableEvent] => Unit): Self = StObject.set(x, "unselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnselectUndefined: Self = StObject.set(x, "unselect", js.undefined)
  }
}
