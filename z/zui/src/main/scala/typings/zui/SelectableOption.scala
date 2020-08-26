package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectableOption extends js.Object {
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
  implicit class SelectableOptionOps[Self <: SelectableOption] (val x: Self) extends AnyVal {
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
    def setClickBehavior(value: String): Self = this.set("clickBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickBehavior: Self = this.set("clickBehavior", js.undefined)
    @scala.inline
    def setFinish(value: /* e */ js.UndefOr[SelectableEvent] => Unit): Self = this.set("finish", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFinish: Self = this.set("finish", js.undefined)
    @scala.inline
    def setIgnoreVal(value: Double): Self = this.set("ignoreVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreVal: Self = this.set("ignoreVal", js.undefined)
    @scala.inline
    def setMouseButton(value: String): Self = this.set("mouseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseButton: Self = this.set("mouseButton", js.undefined)
    @scala.inline
    def setRangeStyle(value: String | js.Object): Self = this.set("rangeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeStyle: Self = this.set("rangeStyle", js.undefined)
    @scala.inline
    def setSelect(value: /* e */ js.UndefOr[SelectableEvent] => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setStart(value: /* e */ js.UndefOr[SelectableEvent] => Boolean): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    @scala.inline
    def setUnselect(value: /* e */ js.UndefOr[SelectableEvent] => Unit): Self = this.set("unselect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnselect: Self = this.set("unselect", js.undefined)
  }
  
}

