package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * selectable
 */

@js.native
trait SelectableEvent
  extends stdLib.Event {
  var selected: js.Array[scala.Double] = js.native
  var selections: stdLib.Map[scala.Double, scala.Boolean] = js.native
}

