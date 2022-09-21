package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeaheadOptions extends StObject {
  
  var highlighter: js.UndefOr[js.Function1[/* item */ Any, String]] = js.undefined
  
  var items: js.UndefOr[Double] = js.undefined
  
  var matcher: js.UndefOr[js.Function1[/* item */ Any, Boolean]] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var sorter: js.UndefOr[js.Function1[/* items */ js.Array[Any], js.Array[Any]]] = js.undefined
  
  var source: js.UndefOr[Any] = js.undefined
  
  var updater: js.UndefOr[js.Function1[/* item */ Any, Any]] = js.undefined
}
object TypeaheadOptions {
  
  inline def apply(): TypeaheadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeaheadOptions]
  }
  
  extension [Self <: TypeaheadOptions](x: Self) {
    
    inline def setHighlighter(value: /* item */ Any => String): Self = StObject.set(x, "highlighter", js.Any.fromFunction1(value))
    
    inline def setHighlighterUndefined: Self = StObject.set(x, "highlighter", js.undefined)
    
    inline def setItems(value: Double): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setMatcher(value: /* item */ Any => Boolean): Self = StObject.set(x, "matcher", js.Any.fromFunction1(value))
    
    inline def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setSorter(value: /* items */ js.Array[Any] => js.Array[Any]): Self = StObject.set(x, "sorter", js.Any.fromFunction1(value))
    
    inline def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
    
    inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setUpdater(value: /* item */ Any => Any): Self = StObject.set(x, "updater", js.Any.fromFunction1(value))
    
    inline def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
  }
}
