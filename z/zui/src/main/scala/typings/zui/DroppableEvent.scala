package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableEvent extends js.Object {
  var element: js.UndefOr[JQuery] = js.undefined
  var event: js.UndefOr[js.Object] = js.undefined
  var offset: js.UndefOr[js.Object] = js.undefined
  var pos: js.UndefOr[Postion] = js.undefined
  var smallOffset: js.UndefOr[js.Object] = js.undefined
  var startOffset: js.UndefOr[js.Object] = js.undefined
  var target: js.UndefOr[JQuery] = js.undefined
}

object DroppableEvent {
  @scala.inline
  def apply(
    element: JQuery = null,
    event: js.Object = null,
    offset: js.Object = null,
    pos: Postion = null,
    smallOffset: js.Object = null,
    startOffset: js.Object = null,
    target: JQuery = null
  ): DroppableEvent = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element)
    if (event != null) __obj.updateDynamic("event")(event)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (pos != null) __obj.updateDynamic("pos")(pos)
    if (smallOffset != null) __obj.updateDynamic("smallOffset")(smallOffset)
    if (startOffset != null) __obj.updateDynamic("startOffset")(startOffset)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DroppableEvent]
  }
}

