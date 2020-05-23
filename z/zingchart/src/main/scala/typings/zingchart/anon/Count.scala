package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  /**
    * Offset from start to zoom. This attribute is coupled with the type attribute to determine where to set the zoom level. 1 | 2 | 3
    */
  var count: js.UndefOr[js.Any] = js.undefined
  /**
    * To set the text of the button 3m | 2015 | all
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * To set multiplier for count ytd | all | year | month | week | day | hour | minute
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Count {
  @scala.inline
  def apply(count: js.Any = null, text: String = null, `type`: String = null): Count = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

