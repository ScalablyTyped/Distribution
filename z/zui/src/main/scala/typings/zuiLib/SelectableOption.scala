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

