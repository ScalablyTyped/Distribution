package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DroppableEvent extends js.Object {
  var element: js.UndefOr[JQuery] = js.native
  var event: js.UndefOr[js.Object] = js.native
  var offset: js.UndefOr[js.Object] = js.native
  var pos: js.UndefOr[Postion] = js.native
  var smallOffset: js.UndefOr[js.Object] = js.native
  var startOffset: js.UndefOr[js.Object] = js.native
  var target: js.UndefOr[JQuery] = js.native
}

object DroppableEvent {
  @scala.inline
  def apply(): DroppableEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DroppableEvent]
  }
  @scala.inline
  implicit class DroppableEventOps[Self <: DroppableEvent] (val x: Self) extends AnyVal {
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
    def setElement(value: JQuery): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setEvent(value: js.Object): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setOffset(value: js.Object): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPos(value: Postion): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePos: Self = this.set("pos", js.undefined)
    @scala.inline
    def setSmallOffset(value: js.Object): Self = this.set("smallOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmallOffset: Self = this.set("smallOffset", js.undefined)
    @scala.inline
    def setStartOffset(value: js.Object): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartOffset: Self = this.set("startOffset", js.undefined)
    @scala.inline
    def setTarget(value: JQuery): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

