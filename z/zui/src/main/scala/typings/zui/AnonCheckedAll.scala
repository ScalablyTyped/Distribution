package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckedAll extends js.Object {
  var checkedAll: Boolean
  var checks: js.Array[Double]
}

object AnonCheckedAll {
  @scala.inline
  def apply(checkedAll: Boolean, checks: js.Array[Double]): AnonCheckedAll = {
    val __obj = js.Dynamic.literal(checkedAll = checkedAll.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCheckedAll]
  }
}

