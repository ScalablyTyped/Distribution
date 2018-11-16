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

