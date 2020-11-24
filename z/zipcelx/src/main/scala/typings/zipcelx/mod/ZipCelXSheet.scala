package typings.zipcelx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZipCelXSheet extends js.Object {
  
  /**
    * The sheet's DataSet
    */
  var data: ZipCelXDataSet = js.native
}
object ZipCelXSheet {
  
  @scala.inline
  def apply(data: ZipCelXDataSet): ZipCelXSheet = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipCelXSheet]
  }
  
  @scala.inline
  implicit class ZipCelXSheetOps[Self <: ZipCelXSheet] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: ZipCelXRow*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: ZipCelXDataSet): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
