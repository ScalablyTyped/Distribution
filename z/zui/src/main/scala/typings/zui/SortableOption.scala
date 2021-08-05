package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortableOption extends StObject {
  
  var dragCssClass: js.UndefOr[String] = js.undefined
  
  var finish: js.UndefOr[js.Function1[/* e */ js.UndefOr[SortEvent], Unit]] = js.undefined
  
  var mouseButton: js.UndefOr[String] = js.undefined
  
  var order: js.UndefOr[js.Function1[/* e */ js.UndefOr[SortEvent], Unit]] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  var sortingClass: js.UndefOr[String] = js.undefined
  
  var start: js.UndefOr[js.Function1[/* e */ js.UndefOr[SortEvent], Unit]] = js.undefined
  
  var trigger: js.UndefOr[String] = js.undefined
}
object SortableOption {
  
  inline def apply(): SortableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableOption]
  }
  
  extension [Self <: SortableOption](x: Self) {
    
    inline def setDragCssClass(value: String): Self = StObject.set(x, "dragCssClass", value.asInstanceOf[js.Any])
    
    inline def setDragCssClassUndefined: Self = StObject.set(x, "dragCssClass", js.undefined)
    
    inline def setFinish(value: /* e */ js.UndefOr[SortEvent] => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction1(value))
    
    inline def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
    
    inline def setMouseButton(value: String): Self = StObject.set(x, "mouseButton", value.asInstanceOf[js.Any])
    
    inline def setMouseButtonUndefined: Self = StObject.set(x, "mouseButton", js.undefined)
    
    inline def setOrder(value: /* e */ js.UndefOr[SortEvent] => Unit): Self = StObject.set(x, "order", js.Any.fromFunction1(value))
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSortingClass(value: String): Self = StObject.set(x, "sortingClass", value.asInstanceOf[js.Any])
    
    inline def setSortingClassUndefined: Self = StObject.set(x, "sortingClass", js.undefined)
    
    inline def setStart(value: /* e */ js.UndefOr[SortEvent] => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
