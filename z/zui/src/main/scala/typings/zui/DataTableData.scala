package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableData extends js.Object {
  var cols: js.Array[Column]
  var rows: js.Array[Row]
}

object DataTableData {
  @scala.inline
  def apply(cols: js.Array[Column], rows: js.Array[Row]): DataTableData = {
    val __obj = js.Dynamic.literal(cols = cols, rows = rows)
  
    __obj.asInstanceOf[DataTableData]
  }
}

