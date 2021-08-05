package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableData extends StObject {
  
  var cols: js.Array[Column]
  
  var rows: js.Array[Row]
}
object DataTableData {
  
  inline def apply(cols: js.Array[Column], rows: js.Array[Row]): DataTableData = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableData]
  }
  
  extension [Self <: DataTableData](x: Self) {
    
    inline def setCols(value: js.Array[Column]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsVarargs(value: Column*): Self = StObject.set(x, "cols", js.Array(value :_*))
    
    inline def setRows(value: js.Array[Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: Row*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
