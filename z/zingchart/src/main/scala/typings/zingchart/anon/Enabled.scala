package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enabled extends js.Object {
  /**
    * To enable or disable individual context menu item behaviors. "all" | "none"
    */
  var enabled: js.UndefOr[String] = js.undefined
  /**
    * To specify the behavior ID of the context menu item that is being accessed. "3D" | "LogScale" | "LinScale" | ...
    */
  var id: js.UndefOr[String] = js.undefined
}

object Enabled {
  @scala.inline
  def apply(enabled: String = null, id: String = null): Enabled = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
}

