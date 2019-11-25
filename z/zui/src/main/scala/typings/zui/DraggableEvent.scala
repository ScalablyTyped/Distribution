package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableEvent extends js.Object {
  var element: js.UndefOr[JQuery | js.Object] = js.undefined
  var event: js.UndefOr[js.Object] = js.undefined
  var offset: js.UndefOr[js.Object] = js.undefined
  var pos: js.UndefOr[Postion] = js.undefined
  var smallOffset: js.UndefOr[js.Object] = js.undefined
  var startOffset: js.UndefOr[js.Object] = js.undefined
  var target: js.UndefOr[JQuery | js.Object] = js.undefined
}

object DraggableEvent {
  @scala.inline
  def apply(
    element: JQuery | js.Object = null,
    event: js.Object = null,
    offset: js.Object = null,
    pos: Postion = null,
    smallOffset: js.Object = null,
    startOffset: js.Object = null,
    target: JQuery | js.Object = null
  ): DraggableEvent = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (pos != null) __obj.updateDynamic("pos")(pos.asInstanceOf[js.Any])
    if (smallOffset != null) __obj.updateDynamic("smallOffset")(smallOffset.asInstanceOf[js.Any])
    if (startOffset != null) __obj.updateDynamic("startOffset")(startOffset.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableEvent]
  }
}

