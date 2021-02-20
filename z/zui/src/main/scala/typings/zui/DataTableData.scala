package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTableData extends StObject {
  
  var cols: js.Array[Column] = js.native
  
  var rows: js.Array[Row] = js.native
}
object DataTableData {
  
  @scala.inline
  def apply(cols: js.Array[Column], rows: js.Array[Row]): DataTableData = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableData]
  }
  
  @scala.inline
  implicit class DataTableDataMutableBuilder[Self <: DataTableData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCols(value: js.Array[Column]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColsVarargs(value: Column*): Self = StObject.set(x, "cols", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: Row*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
