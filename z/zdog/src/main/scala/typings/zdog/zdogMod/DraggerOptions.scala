package typings.zdog.zdogMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggerOptions extends js.Object {
  val onDragEnd: js.UndefOr[DragEndListener] = js.undefined
  val onDragMove: js.UndefOr[DragMoveListener] = js.undefined
  val onDragStart: js.UndefOr[DragStartListener] = js.undefined
  /**
    * The element to start dragging on the initial `mousedown`, `pointerdown`, or `touchstart` event.
    */
  val startElement: js.UndefOr[String | Element] = js.undefined
}

object DraggerOptions {
  @scala.inline
  def apply(
    onDragEnd: DragEndListener = null,
    onDragMove: DragMoveListener = null,
    onDragStart: DragStartListener = null,
    startElement: String | Element = null
  ): DraggerOptions = {
    val __obj = js.Dynamic.literal()
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd.asInstanceOf[js.Any])
    if (onDragMove != null) __obj.updateDynamic("onDragMove")(onDragMove.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart.asInstanceOf[js.Any])
    if (startElement != null) __obj.updateDynamic("startElement")(startElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggerOptions]
  }
}

