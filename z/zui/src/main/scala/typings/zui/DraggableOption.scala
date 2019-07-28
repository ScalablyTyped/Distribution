package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableOption extends js.Object {
  var before: js.UndefOr[js.Function1[/* e */ js.UndefOr[DraggableEvent], Boolean]] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.undefined
  var finish: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.undefined
  var handle: js.UndefOr[String] = js.undefined
  var mouseButton: js.UndefOr[String] = js.undefined
  var move: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var stopPropagation: js.UndefOr[Boolean] = js.undefined
}

object DraggableOption {
  @scala.inline
  def apply(
    before: /* e */ js.UndefOr[DraggableEvent] => Boolean = null,
    container: String = null,
    drag: /* e */ DraggableEvent => Unit = null,
    finish: /* e */ DraggableEvent => Unit = null,
    handle: String = null,
    mouseButton: String = null,
    move: js.UndefOr[Boolean] = js.undefined,
    selector: String = null,
    stopPropagation: js.UndefOr[Boolean] = js.undefined
  ): DraggableOption = {
    val __obj = js.Dynamic.literal()
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    if (container != null) __obj.updateDynamic("container")(container)
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (finish != null) __obj.updateDynamic("finish")(js.Any.fromFunction1(finish))
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (mouseButton != null) __obj.updateDynamic("mouseButton")(mouseButton)
    if (!js.isUndefined(move)) __obj.updateDynamic("move")(move)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.asInstanceOf[DraggableOption]
  }
}

