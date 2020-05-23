package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Uniform extends js.Object {
  /**
    * The text of the scale label, can use tokens for day, hour, minute, year etc to add in such information, ONLY if "type"="date" has
    * been specified in this transform object. If values for both "text" and "all" have been specified, the value in "text" will be used
    * . 'Month of %M' | '%d' | ...
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * To convert Unix timestamps into dates. Use this attribute with the all attribute. 'date'
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * To set the time-series scale to linear (uniform) or non-linear. true | false | 1 | 0
    */
  var uniform: js.UndefOr[Boolean] = js.undefined
}

object Uniform {
  @scala.inline
  def apply(text: String = null, `type`: String = null, uniform: js.UndefOr[Boolean] = js.undefined): Uniform = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniform)) __obj.updateDynamic("uniform")(uniform.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uniform]
  }
}

