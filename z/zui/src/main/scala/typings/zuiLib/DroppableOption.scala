package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableOption extends js.Object {
  var always: js.UndefOr[js.Function1[/* e */ DroppableEvent, scala.Unit]] = js.undefined
  var before: js.UndefOr[js.Function1[/* e */ js.UndefOr[DroppableEvent], scala.Boolean]] = js.undefined
  var beforeDrop: js.UndefOr[js.Function1[/* e */ DroppableEvent, scala.Boolean]] = js.undefined
  var container: js.UndefOr[java.lang.String] = js.undefined
  var deviation: js.UndefOr[scala.Double] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ DroppableEvent, scala.Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ DroppableEvent, scala.Unit]] = js.undefined
  var finish: js.UndefOr[js.Function1[/* e */ DroppableEvent, scala.Unit]] = js.undefined
  var flex: js.UndefOr[scala.Boolean] = js.undefined
  var handle: js.UndefOr[java.lang.String] = js.undefined
  var selector: js.UndefOr[java.lang.String] = js.undefined
  var sensorOffsetX: js.UndefOr[scala.Double] = js.undefined
  var sensorOffsetY: js.UndefOr[scala.Double] = js.undefined
  var start: js.UndefOr[js.Function1[/* e */ js.UndefOr[DroppableEvent], scala.Unit]] = js.undefined
  var target: JQuery | java.lang.String
}

object DroppableOption {
  @scala.inline
  def apply(
    target: JQuery | java.lang.String,
    always: js.Function1[/* e */ DroppableEvent, scala.Unit] = null,
    before: js.Function1[/* e */ js.UndefOr[DroppableEvent], scala.Boolean] = null,
    beforeDrop: js.Function1[/* e */ DroppableEvent, scala.Boolean] = null,
    container: java.lang.String = null,
    deviation: scala.Int | scala.Double = null,
    drag: js.Function1[/* e */ DroppableEvent, scala.Unit] = null,
    drop: js.Function1[/* e */ DroppableEvent, scala.Unit] = null,
    finish: js.Function1[/* e */ DroppableEvent, scala.Unit] = null,
    flex: js.UndefOr[scala.Boolean] = js.undefined,
    handle: java.lang.String = null,
    selector: java.lang.String = null,
    sensorOffsetX: scala.Int | scala.Double = null,
    sensorOffsetY: scala.Int | scala.Double = null,
    start: js.Function1[/* e */ js.UndefOr[DroppableEvent], scala.Unit] = null
  ): DroppableOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (always != null) __obj.updateDynamic("always")(always)
    if (before != null) __obj.updateDynamic("before")(before)
    if (beforeDrop != null) __obj.updateDynamic("beforeDrop")(beforeDrop)
    if (container != null) __obj.updateDynamic("container")(container)
    if (deviation != null) __obj.updateDynamic("deviation")(deviation.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (drop != null) __obj.updateDynamic("drop")(drop)
    if (finish != null) __obj.updateDynamic("finish")(finish)
    if (!js.isUndefined(flex)) __obj.updateDynamic("flex")(flex)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (sensorOffsetX != null) __obj.updateDynamic("sensorOffsetX")(sensorOffsetX.asInstanceOf[js.Any])
    if (sensorOffsetY != null) __obj.updateDynamic("sensorOffsetY")(sensorOffsetY.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[DroppableOption]
  }
}

