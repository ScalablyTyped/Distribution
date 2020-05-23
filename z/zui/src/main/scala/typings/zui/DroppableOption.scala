package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableOption extends js.Object {
  var always: js.UndefOr[js.Function1[/* e */ DroppableEvent, Unit]] = js.undefined
  var before: js.UndefOr[js.Function1[/* e */ js.UndefOr[DroppableEvent], Boolean]] = js.undefined
  var beforeDrop: js.UndefOr[js.Function1[/* e */ DroppableEvent, Boolean]] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var deviation: js.UndefOr[Double] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ DroppableEvent, Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ DroppableEvent, Unit]] = js.undefined
  var finish: js.UndefOr[js.Function1[/* e */ DroppableEvent, Unit]] = js.undefined
  var flex: js.UndefOr[Boolean] = js.undefined
  var handle: js.UndefOr[String] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var sensorOffsetX: js.UndefOr[Double] = js.undefined
  var sensorOffsetY: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[js.Function1[/* e */ js.UndefOr[DroppableEvent], Unit]] = js.undefined
  var target: JQuery | String
}

object DroppableOption {
  @scala.inline
  def apply(
    target: JQuery | String,
    always: /* e */ DroppableEvent => Unit = null,
    before: /* e */ js.UndefOr[DroppableEvent] => Boolean = null,
    beforeDrop: /* e */ DroppableEvent => Boolean = null,
    container: String = null,
    deviation: js.UndefOr[Double] = js.undefined,
    drag: /* e */ DroppableEvent => Unit = null,
    drop: /* e */ DroppableEvent => Unit = null,
    finish: /* e */ DroppableEvent => Unit = null,
    flex: js.UndefOr[Boolean] = js.undefined,
    handle: String = null,
    selector: String = null,
    sensorOffsetX: js.UndefOr[Double] = js.undefined,
    sensorOffsetY: js.UndefOr[Double] = js.undefined,
    start: /* e */ js.UndefOr[DroppableEvent] => Unit = null
  ): DroppableOption = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (always != null) __obj.updateDynamic("always")(js.Any.fromFunction1(always))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    if (beforeDrop != null) __obj.updateDynamic("beforeDrop")(js.Any.fromFunction1(beforeDrop))
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(deviation)) __obj.updateDynamic("deviation")(deviation.get.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1(drop))
    if (finish != null) __obj.updateDynamic("finish")(js.Any.fromFunction1(finish))
    if (!js.isUndefined(flex)) __obj.updateDynamic("flex")(flex.get.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(sensorOffsetX)) __obj.updateDynamic("sensorOffsetX")(sensorOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sensorOffsetY)) __obj.updateDynamic("sensorOffsetY")(sensorOffsetY.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    __obj.asInstanceOf[DroppableOption]
  }
}

