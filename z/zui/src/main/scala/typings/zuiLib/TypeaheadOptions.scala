package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TypeaheadOptions extends js.Object {
  var highlighter: js.UndefOr[js.Function1[/* item */ js.Any, java.lang.String]] = js.undefined
  var items: js.UndefOr[scala.Double] = js.undefined
  var matcher: js.UndefOr[js.Function1[/* item */ js.Any, scala.Boolean]] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var sorter: js.UndefOr[js.Function1[/* items */ js.Array[_], js.Array[_]]] = js.undefined
  var source: js.UndefOr[js.Any] = js.undefined
  var updater: js.UndefOr[js.Function1[/* item */ js.Any, _]] = js.undefined
}

