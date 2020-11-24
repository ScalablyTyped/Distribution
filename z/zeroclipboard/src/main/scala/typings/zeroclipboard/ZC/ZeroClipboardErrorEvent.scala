package typings.zeroclipboard.ZC

import typings.std.HTMLElement
import typings.std.HTMLObjectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZeroClipboardErrorEvent extends ZeroClipboardEvent {
  
  var actualValue: js.UndefOr[String] = js.native
  
  var configuredValue: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[Dictionary[String]] = js.native
  
  var errors: js.UndefOr[js.Array[_]] = js.native
  
  var jsVersion: js.UndefOr[String] = js.native
  
  var message: String = js.native
  
  var minimumVersion: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var property: js.UndefOr[String] = js.native
  
  var swfVersion: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object ZeroClipboardErrorEvent {
  
  @scala.inline
  def apply(
    currentTarget: HTMLObjectElement,
    message: String,
    name: String,
    relatedTarget: HTMLElement,
    target: HTMLElement,
    timeStamp: Double,
    `type`: String
  ): ZeroClipboardErrorEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relatedTarget = relatedTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeroClipboardErrorEvent]
  }
  
  @scala.inline
  implicit class ZeroClipboardErrorEventOps[Self <: ZeroClipboardErrorEvent] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualValue(value: String): Self = this.set("actualValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActualValue: Self = this.set("actualValue", js.undefined)
    
    @scala.inline
    def setConfiguredValue(value: String): Self = this.set("configuredValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguredValue: Self = this.set("configuredValue", js.undefined)
    
    @scala.inline
    def setData(value: Dictionary[String]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: js.Any*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[_]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setJsVersion(value: String): Self = this.set("jsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsVersion: Self = this.set("jsVersion", js.undefined)
    
    @scala.inline
    def setMinimumVersion(value: String): Self = this.set("minimumVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumVersion: Self = this.set("minimumVersion", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    
    @scala.inline
    def setSwfVersion(value: String): Self = this.set("swfVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwfVersion: Self = this.set("swfVersion", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
