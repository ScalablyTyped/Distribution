package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeString extends js.Object {
  /**
    * Type of the widget. The zingchart.widgets.myWidget object must exist and define a "parse" method returning an object with "graphs"
    * , "labels" and "shapes" collections which will be injected in the original JSON. "myWidget" | ...
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object TypeString {
  @scala.inline
  def apply(`type`: String = null): TypeString = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeString]
  }
}

