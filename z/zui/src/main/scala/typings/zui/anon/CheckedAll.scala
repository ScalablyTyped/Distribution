package typings.zui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckedAll extends js.Object {
  
  var checkedAll: Boolean = js.native
  
  var checks: js.Array[Double] = js.native
}
object CheckedAll {
  
  @scala.inline
  def apply(checkedAll: Boolean, checks: js.Array[Double]): CheckedAll = {
    val __obj = js.Dynamic.literal(checkedAll = checkedAll.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedAll]
  }
  
  @scala.inline
  implicit class CheckedAllOps[Self <: CheckedAll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheckedAll(value: Boolean): Self = this.set("checkedAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksVarargs(value: Double*): Self = this.set("checks", js.Array(value :_*))
    
    @scala.inline
    def setChecks(value: js.Array[Double]): Self = this.set("checks", value.asInstanceOf[js.Any])
  }
}
