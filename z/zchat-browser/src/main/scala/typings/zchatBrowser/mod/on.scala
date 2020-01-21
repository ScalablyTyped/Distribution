package typings.zchatBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", "on")
@js.native
object on extends js.Object {
  def apply(event_name: EventName, handler: js.Function1[/* event_data */ js.UndefOr[EventData], Unit]): Unit = js.native
}

