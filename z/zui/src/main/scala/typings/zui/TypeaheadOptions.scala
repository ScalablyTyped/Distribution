package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeaheadOptions extends js.Object {
  var highlighter: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.undefined
  var items: js.UndefOr[Double] = js.undefined
  var matcher: js.UndefOr[js.Function1[/* item */ js.Any, Boolean]] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var sorter: js.UndefOr[js.Function1[/* items */ js.Array[_], js.Array[_]]] = js.undefined
  var source: js.UndefOr[js.Any] = js.undefined
  var updater: js.UndefOr[js.Function1[/* item */ js.Any, _]] = js.undefined
}

object TypeaheadOptions {
  @scala.inline
  def apply(
    highlighter: /* item */ js.Any => String = null,
    items: js.UndefOr[Double] = js.undefined,
    matcher: /* item */ js.Any => Boolean = null,
    minLength: js.UndefOr[Double] = js.undefined,
    sorter: /* items */ js.Array[_] => js.Array[_] = null,
    source: js.Any = null,
    updater: /* item */ js.Any => _ = null
  ): TypeaheadOptions = {
    val __obj = js.Dynamic.literal()
    if (highlighter != null) __obj.updateDynamic("highlighter")(js.Any.fromFunction1(highlighter))
    if (!js.isUndefined(items)) __obj.updateDynamic("items")(items.get.asInstanceOf[js.Any])
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction1(matcher))
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(js.Any.fromFunction1(sorter))
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction1(updater))
    __obj.asInstanceOf[TypeaheadOptions]
  }
}

