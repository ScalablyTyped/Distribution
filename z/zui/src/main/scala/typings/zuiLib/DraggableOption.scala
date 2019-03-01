package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableOption extends js.Object {
  var before: js.UndefOr[js.Function1[/* e */ js.UndefOr[DraggableEvent], scala.Boolean]] = js.undefined
  var container: js.UndefOr[java.lang.String] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ DraggableEvent, scala.Unit]] = js.undefined
  var finish: js.UndefOr[js.Function1[/* e */ DraggableEvent, scala.Unit]] = js.undefined
  var handle: js.UndefOr[java.lang.String] = js.undefined
  var mouseButton: js.UndefOr[java.lang.String] = js.undefined
  var move: js.UndefOr[scala.Boolean] = js.undefined
  var selector: js.UndefOr[java.lang.String] = js.undefined
  var stopPropagation: js.UndefOr[scala.Boolean] = js.undefined
}

object DraggableOption {
  @scala.inline
  def apply(
    before: js.Function1[/* e */ js.UndefOr[DraggableEvent], scala.Boolean] = null,
    container: java.lang.String = null,
    drag: js.Function1[/* e */ DraggableEvent, scala.Unit] = null,
    finish: js.Function1[/* e */ DraggableEvent, scala.Unit] = null,
    handle: java.lang.String = null,
    mouseButton: java.lang.String = null,
    move: js.UndefOr[scala.Boolean] = js.undefined,
    selector: java.lang.String = null,
    stopPropagation: js.UndefOr[scala.Boolean] = js.undefined
  ): DraggableOption = {
    val __obj = js.Dynamic.literal()
    if (before != null) __obj.updateDynamic("before")(before)
    if (container != null) __obj.updateDynamic("container")(container)
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (finish != null) __obj.updateDynamic("finish")(finish)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (mouseButton != null) __obj.updateDynamic("mouseButton")(mouseButton)
    if (!js.isUndefined(move)) __obj.updateDynamic("move")(move)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.asInstanceOf[DraggableOption]
  }
}

