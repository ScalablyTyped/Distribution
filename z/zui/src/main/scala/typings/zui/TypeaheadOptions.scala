package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeaheadOptions extends js.Object {
  
  var highlighter: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.native
  
  var items: js.UndefOr[Double] = js.native
  
  var matcher: js.UndefOr[js.Function1[/* item */ js.Any, Boolean]] = js.native
  
  var minLength: js.UndefOr[Double] = js.native
  
  var sorter: js.UndefOr[js.Function1[/* items */ js.Array[_], js.Array[_]]] = js.native
  
  var source: js.UndefOr[js.Any] = js.native
  
  var updater: js.UndefOr[js.Function1[/* item */ js.Any, _]] = js.native
}
object TypeaheadOptions {
  
  @scala.inline
  def apply(): TypeaheadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeaheadOptions]
  }
  
  @scala.inline
  implicit class TypeaheadOptionsOps[Self <: TypeaheadOptions] (val x: Self) extends AnyVal {
    
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
    def setHighlighter(value: /* item */ js.Any => String): Self = this.set("highlighter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHighlighter: Self = this.set("highlighter", js.undefined)
    
    @scala.inline
    def setItems(value: Double): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setMatcher(value: /* item */ js.Any => Boolean): Self = this.set("matcher", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMatcher: Self = this.set("matcher", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    
    @scala.inline
    def setSorter(value: /* items */ js.Array[_] => js.Array[_]): Self = this.set("sorter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSorter: Self = this.set("sorter", js.undefined)
    
    @scala.inline
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setUpdater(value: /* item */ js.Any => _): Self = this.set("updater", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdater: Self = this.set("updater", js.undefined)
  }
}
