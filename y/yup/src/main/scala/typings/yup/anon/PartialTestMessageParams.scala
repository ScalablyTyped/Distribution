package typings.yup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<yup.yup.TestMessageParams> */
@js.native
trait PartialTestMessageParams extends js.Object {
  
  var label: js.UndefOr[String] = js.native
  
  var originalValue: js.UndefOr[js.Any] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object PartialTestMessageParams {
  
  @scala.inline
  def apply(): PartialTestMessageParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTestMessageParams]
  }
  
  @scala.inline
  implicit class PartialTestMessageParamsOps[Self <: PartialTestMessageParams] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOriginalValue(value: js.Any): Self = this.set("originalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalValue: Self = this.set("originalValue", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
