package typings
package zdogLib.zdogMod

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
  val startElement: js.UndefOr[java.lang.String | stdLib.Element] = js.undefined
}

object DraggerOptions {
  @scala.inline
  def apply(
    onDragEnd: DragEndListener = null,
    onDragMove: DragMoveListener = null,
    onDragStart: DragStartListener = null,
    startElement: java.lang.String | stdLib.Element = null
  ): DraggerOptions = {
    val __obj = js.Dynamic.literal()
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragMove != null) __obj.updateDynamic("onDragMove")(onDragMove)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (startElement != null) __obj.updateDynamic("startElement")(startElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggerOptions]
  }
}

