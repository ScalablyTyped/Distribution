package typings.zui

import typings.zui.anon.CheckedAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTable extends js.Object {
  var checks: CheckedAll
}

object DataTable {
  @scala.inline
  def apply(checks: CheckedAll): DataTable = {
    val __obj = js.Dynamic.literal(checks = checks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTable]
  }
}

