package typings.zui

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * sortable
  */
@js.native
trait SortEvent extends Event_ {
  var element: JQuery | js.Object = js.native
  var list: js.Array[JQuery | js.Object] = js.native
  var sorter: AnonIndex = js.native
}

