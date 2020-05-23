package typings.zui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckedAll extends js.Object {
  var checkedAll: Boolean
  var checks: js.Array[Double]
}

object CheckedAll {
  @scala.inline
  def apply(checkedAll: Boolean, checks: js.Array[Double]): CheckedAll = {
    val __obj = js.Dynamic.literal(checkedAll = checkedAll.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedAll]
  }
}

