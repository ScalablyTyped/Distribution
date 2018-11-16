package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * sortable
 */

@js.native
trait SortEvent
  extends stdLib.Event {
  var element: JQuery | js.Object = js.native
  var list: js.Array[JQuery | js.Object] = js.native
  var sorter: Anon_SortUp = js.native
}

