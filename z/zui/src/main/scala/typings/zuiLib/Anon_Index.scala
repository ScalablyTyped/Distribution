package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: scala.Double
  var sortUp: scala.Boolean
}

object Anon_Index {
  @scala.inline
  def apply(index: scala.Double, sortUp: scala.Boolean): Anon_Index = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("sortUp")(sortUp)
    __obj.asInstanceOf[Anon_Index]
  }
}

