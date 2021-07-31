package typings.zui

import typings.zui.anon.CheckedAll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTable extends StObject {
  
  var checks: CheckedAll
}
object DataTable {
  
  @scala.inline
  def apply(checks: CheckedAll): DataTable = {
    val __obj = js.Dynamic.literal(checks = checks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTable]
  }
  
  @scala.inline
  implicit class DataTableMutableBuilder[Self <: DataTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecks(value: CheckedAll): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
  }
}
