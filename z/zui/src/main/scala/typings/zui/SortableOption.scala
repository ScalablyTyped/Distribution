package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortableOption extends StObject {
  
  var dragCssClass: js.UndefOr[String] = js.native
  
  var finish: js.UndefOr[js.Function1[/* e */ js.UndefOr[SortEvent], Unit]] = js.native
  
  var mouseButton: js.UndefOr[String] = js.native
  
  var order: js.UndefOr[js.Function1[/* e */ js.UndefOr[SortEvent], Unit]] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var selector: js.UndefOr[String] = js.native
  
  var sortingClass: js.UndefOr[String] = js.native
  
  var start: js.UndefOr[js.Function1[/* e */ js.UndefOr[SortEvent], Unit]] = js.native
  
  var trigger: js.UndefOr[String] = js.native
}
object SortableOption {
  
  @scala.inline
  def apply(): SortableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableOption]
  }
  
  @scala.inline
  implicit class SortableOptionMutableBuilder[Self <: SortableOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragCssClass(value: String): Self = StObject.set(x, "dragCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragCssClassUndefined: Self = StObject.set(x, "dragCssClass", js.undefined)
    
    @scala.inline
    def setFinish(value: /* e */ js.UndefOr[SortEvent] => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
    
    @scala.inline
    def setMouseButton(value: String): Self = StObject.set(x, "mouseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseButtonUndefined: Self = StObject.set(x, "mouseButton", js.undefined)
    
    @scala.inline
    def setOrder(value: /* e */ js.UndefOr[SortEvent] => Unit): Self = StObject.set(x, "order", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setSortingClass(value: String): Self = StObject.set(x, "sortingClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingClassUndefined: Self = StObject.set(x, "sortingClass", js.undefined)
    
    @scala.inline
    def setStart(value: /* e */ js.UndefOr[SortEvent] => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
