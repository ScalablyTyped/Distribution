package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var zui: ZuiStatic
}

object JQueryStatic {
  @scala.inline
  def apply(zui: ZuiStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("zui")(zui)
    __obj.asInstanceOf[JQueryStatic]
  }
}

