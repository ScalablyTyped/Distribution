package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectableOption extends js.Object {
  var clickBehavior: js.UndefOr[java.lang.String] = js.undefined
  var finish: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], scala.Unit]] = js.undefined
  var ignoreVal: js.UndefOr[scala.Double] = js.undefined
  var mouseButton: js.UndefOr[java.lang.String] = js.undefined
  var rangeStyle: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], scala.Unit]] = js.undefined
  var selector: js.UndefOr[java.lang.String] = js.undefined
  var start: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], scala.Boolean]] = js.undefined
  var trigger: js.UndefOr[java.lang.String] = js.undefined
  var unselect: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], scala.Unit]] = js.undefined
}

object SelectableOption {
  @scala.inline
  def apply(
    clickBehavior: java.lang.String = null,
    finish: /* e */ js.UndefOr[SelectableEvent] => scala.Unit = null,
    ignoreVal: scala.Int | scala.Double = null,
    mouseButton: java.lang.String = null,
    rangeStyle: java.lang.String | js.Object = null,
    select: /* e */ js.UndefOr[SelectableEvent] => scala.Unit = null,
    selector: java.lang.String = null,
    start: /* e */ js.UndefOr[SelectableEvent] => scala.Boolean = null,
    trigger: java.lang.String = null,
    unselect: /* e */ js.UndefOr[SelectableEvent] => scala.Unit = null
  ): SelectableOption = {
    val __obj = js.Dynamic.literal()
    if (clickBehavior != null) __obj.updateDynamic("clickBehavior")(clickBehavior)
    if (finish != null) __obj.updateDynamic("finish")(js.Any.fromFunction1(finish))
    if (ignoreVal != null) __obj.updateDynamic("ignoreVal")(ignoreVal.asInstanceOf[js.Any])
    if (mouseButton != null) __obj.updateDynamic("mouseButton")(mouseButton)
    if (rangeStyle != null) __obj.updateDynamic("rangeStyle")(rangeStyle.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (unselect != null) __obj.updateDynamic("unselect")(js.Any.fromFunction1(unselect))
    __obj.asInstanceOf[SelectableOption]
  }
}

