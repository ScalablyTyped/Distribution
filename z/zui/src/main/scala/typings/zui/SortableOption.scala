package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortableOption extends js.Object {
  
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
  implicit class SortableOptionOps[Self <: SortableOption] (val x: Self) extends AnyVal {
    
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
    def setDragCssClass(value: String): Self = this.set("dragCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragCssClass: Self = this.set("dragCssClass", js.undefined)
    
    @scala.inline
    def setFinish(value: /* e */ js.UndefOr[SortEvent] => Unit): Self = this.set("finish", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFinish: Self = this.set("finish", js.undefined)
    
    @scala.inline
    def setMouseButton(value: String): Self = this.set("mouseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseButton: Self = this.set("mouseButton", js.undefined)
    
    @scala.inline
    def setOrder(value: /* e */ js.UndefOr[SortEvent] => Unit): Self = this.set("order", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setSortingClass(value: String): Self = this.set("sortingClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortingClass: Self = this.set("sortingClass", js.undefined)
    
    @scala.inline
    def setStart(value: /* e */ js.UndefOr[SortEvent] => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
  }
}
