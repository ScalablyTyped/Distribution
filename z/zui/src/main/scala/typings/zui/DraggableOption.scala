package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableOption extends js.Object {
  var before: js.UndefOr[js.Function1[/* e */ js.UndefOr[DraggableEvent], Boolean]] = js.native
  var container: js.UndefOr[String] = js.native
  var drag: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.native
  var finish: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.native
  var handle: js.UndefOr[String] = js.native
  var mouseButton: js.UndefOr[String] = js.native
  var move: js.UndefOr[Boolean] = js.native
  var selector: js.UndefOr[String] = js.native
  var stopPropagation: js.UndefOr[Boolean] = js.native
}

object DraggableOption {
  @scala.inline
  def apply(): DraggableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableOption]
  }
  @scala.inline
  implicit class DraggableOptionOps[Self <: DraggableOption] (val x: Self) extends AnyVal {
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
    def setBefore(value: /* e */ js.UndefOr[DraggableEvent] => Boolean): Self = this.set("before", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setDrag(value: /* e */ DraggableEvent => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setFinish(value: /* e */ DraggableEvent => Unit): Self = this.set("finish", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFinish: Self = this.set("finish", js.undefined)
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setMouseButton(value: String): Self = this.set("mouseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseButton: Self = this.set("mouseButton", js.undefined)
    @scala.inline
    def setMove(value: Boolean): Self = this.set("move", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setStopPropagation(value: Boolean): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopPropagation: Self = this.set("stopPropagation", js.undefined)
  }
  
}

