package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckedAll extends js.Object {
  var checkedAll: scala.Boolean
  var checks: js.Array[scala.Double]
}

object Anon_CheckedAll {
  @scala.inline
  def apply(checkedAll: scala.Boolean, checks: js.Array[scala.Double]): Anon_CheckedAll = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkedAll")(checkedAll)
    __obj.updateDynamic("checks")(checks)
    __obj.asInstanceOf[Anon_CheckedAll]
  }
}

