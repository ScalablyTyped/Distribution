package typings.yui.YNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  var optional: js.Array[String]
  var requires: js.Array[String]
  var use: js.Array[String]
}

object IConfig {
  @scala.inline
  def apply(optional: js.Array[String], requires: js.Array[String], use: js.Array[String]): IConfig = {
    val __obj = js.Dynamic.literal(optional = optional, requires = requires, use = use)
  
    __obj.asInstanceOf[IConfig]
  }
}

