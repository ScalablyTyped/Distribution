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

