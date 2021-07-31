package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeaheadOptions extends StObject {
  
  var highlighter: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.undefined
  
  var items: js.UndefOr[Double] = js.undefined
  
  var matcher: js.UndefOr[js.Function1[/* item */ js.Any, Boolean]] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var sorter: js.UndefOr[js.Function1[/* items */ js.Array[js.Any], js.Array[js.Any]]] = js.undefined
  
  var source: js.UndefOr[js.Any] = js.undefined
  
  var updater: js.UndefOr[js.Function1[/* item */ js.Any, js.Any]] = js.undefined
}
object TypeaheadOptions {
  
  @scala.inline
  def apply(): TypeaheadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeaheadOptions]
  }
  
  @scala.inline
  implicit class TypeaheadOptionsMutableBuilder[Self <: TypeaheadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlighter(value: /* item */ js.Any => String): Self = StObject.set(x, "highlighter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHighlighterUndefined: Self = StObject.set(x, "highlighter", js.undefined)
    
    @scala.inline
    def setItems(value: Double): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setMatcher(value: /* item */ js.Any => Boolean): Self = StObject.set(x, "matcher", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    @scala.inline
    def setSorter(value: /* items */ js.Array[js.Any] => js.Array[js.Any]): Self = StObject.set(x, "sorter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
    
    @scala.inline
    def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setUpdater(value: /* item */ js.Any => js.Any): Self = StObject.set(x, "updater", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
  }
}
