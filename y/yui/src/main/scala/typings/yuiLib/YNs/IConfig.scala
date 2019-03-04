package typings
package yuiLib.YNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  var optional: js.Array[java.lang.String]
  var requires: js.Array[java.lang.String]
  var use: js.Array[java.lang.String]
}

object IConfig {
  @scala.inline
  def apply(
    optional: js.Array[java.lang.String],
    requires: js.Array[java.lang.String],
    use: js.Array[java.lang.String]
  ): IConfig = {
    val __obj = js.Dynamic.literal(optional = optional, requires = requires, use = use)
  
    __obj.asInstanceOf[IConfig]
  }
}

