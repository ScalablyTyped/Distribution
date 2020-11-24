package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatetimepickerIcons extends js.Object {
  
  var date: js.UndefOr[String] = js.native
  
  var down: js.UndefOr[String] = js.native
  
  var time: js.UndefOr[String] = js.native
  
  var up: js.UndefOr[String] = js.native
}
object DatetimepickerIcons {
  
  @scala.inline
  def apply(): DatetimepickerIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatetimepickerIcons]
  }
  
  @scala.inline
  implicit class DatetimepickerIconsOps[Self <: DatetimepickerIcons] (val x: Self) extends AnyVal {
    
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDown(value: String): Self = this.set("down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setUp(value: String): Self = this.set("up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
  }
}
