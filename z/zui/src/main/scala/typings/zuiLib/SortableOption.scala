package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableOption extends js.Object {
  var dragCssClass: js.UndefOr[java.lang.String] = js.undefined
  var finish: js.UndefOr[js.Function1[/* e */ js.UndefOr[SortEvent], scala.Unit]] = js.undefined
  var mouseButton: js.UndefOr[java.lang.String] = js.undefined
  var order: js.UndefOr[js.Function1[/* e */ js.UndefOr[SortEvent], scala.Unit]] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var selector: js.UndefOr[java.lang.String] = js.undefined
  var sortingClass: js.UndefOr[java.lang.String] = js.undefined
  var start: js.UndefOr[js.Function1[/* e */ js.UndefOr[SortEvent], scala.Unit]] = js.undefined
  var trigger: js.UndefOr[java.lang.String] = js.undefined
}

object SortableOption {
  @scala.inline
  def apply(
    dragCssClass: java.lang.String = null,
    finish: /* e */ js.UndefOr[SortEvent] => scala.Unit = null,
    mouseButton: java.lang.String = null,
    order: /* e */ js.UndefOr[SortEvent] => scala.Unit = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    selector: java.lang.String = null,
    sortingClass: java.lang.String = null,
    start: /* e */ js.UndefOr[SortEvent] => scala.Unit = null,
    trigger: java.lang.String = null
  ): SortableOption = {
    val __obj = js.Dynamic.literal()
    if (dragCssClass != null) __obj.updateDynamic("dragCssClass")(dragCssClass)
    if (finish != null) __obj.updateDynamic("finish")(js.Any.fromFunction1(finish))
    if (mouseButton != null) __obj.updateDynamic("mouseButton")(mouseButton)
    if (order != null) __obj.updateDynamic("order")(js.Any.fromFunction1(order))
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (sortingClass != null) __obj.updateDynamic("sortingClass")(sortingClass)
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    __obj.asInstanceOf[SortableOption]
  }
}

