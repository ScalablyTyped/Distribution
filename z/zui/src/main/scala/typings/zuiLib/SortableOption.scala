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

