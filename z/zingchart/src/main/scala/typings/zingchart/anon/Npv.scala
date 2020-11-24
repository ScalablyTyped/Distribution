package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Npv extends js.Object {
  
  var npv: js.UndefOr[Decimals] = js.native
  
  var title: js.UndefOr[Fontfamily] = js.native
  
  var value: js.UndefOr[Fontfamily] = js.native
  
  /**
    * To set the visibility of the object. true | false
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object Npv {
  
  @scala.inline
  def apply(): Npv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Npv]
  }
  
  @scala.inline
  implicit class NpvOps[Self <: Npv] (val x: Self) extends AnyVal {
    
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
    def setNpv(value: Decimals): Self = this.set("npv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNpv: Self = this.set("npv", js.undefined)
    
    @scala.inline
    def setTitle(value: Fontfamily): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setValue(value: Fontfamily): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
