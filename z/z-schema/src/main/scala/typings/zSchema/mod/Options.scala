package typings.zSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var assumeAdditional: js.UndefOr[Boolean] = js.native
  
  var asyncTimeout: js.UndefOr[Double] = js.native
  
  var breakOnFirstError: js.UndefOr[Boolean] = js.native
  
  var customValidator: js.UndefOr[js.Function3[/* report */ Report, /* schema */ js.Any, /* json */ js.Any, Unit]] = js.native
  
  var forceAdditional: js.UndefOr[Boolean] = js.native
  
  var forceItems: js.UndefOr[Boolean] = js.native
  
  var forceMaxItems: js.UndefOr[Boolean] = js.native
  
  var forceMaxLength: js.UndefOr[Boolean] = js.native
  
  var forceMinItems: js.UndefOr[Boolean] = js.native
  
  var forceMinLength: js.UndefOr[Boolean] = js.native
  
  var forceProperties: js.UndefOr[Boolean] = js.native
  
  var ignoreUnknownFormats: js.UndefOr[Boolean] = js.native
  
  var ignoreUnresolvableReferences: js.UndefOr[Boolean] = js.native
  
  var noEmptyArrays: js.UndefOr[Boolean] = js.native
  
  var noEmptyStrings: js.UndefOr[Boolean] = js.native
  
  var noExtraKeywords: js.UndefOr[Boolean] = js.native
  
  var noTypeless: js.UndefOr[Boolean] = js.native
  
  var pedanticCheck: js.UndefOr[Boolean] = js.native
  
  var reportPathAsArray: js.UndefOr[Boolean] = js.native
  
  var strictMode: js.UndefOr[Boolean] = js.native
  
  var strictUris: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAssumeAdditional(value: Boolean): Self = this.set("assumeAdditional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssumeAdditional: Self = this.set("assumeAdditional", js.undefined)
    
    @scala.inline
    def setAsyncTimeout(value: Double): Self = this.set("asyncTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncTimeout: Self = this.set("asyncTimeout", js.undefined)
    
    @scala.inline
    def setBreakOnFirstError(value: Boolean): Self = this.set("breakOnFirstError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakOnFirstError: Self = this.set("breakOnFirstError", js.undefined)
    
    @scala.inline
    def setCustomValidator(value: (/* report */ Report, /* schema */ js.Any, /* json */ js.Any) => Unit): Self = this.set("customValidator", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCustomValidator: Self = this.set("customValidator", js.undefined)
    
    @scala.inline
    def setForceAdditional(value: Boolean): Self = this.set("forceAdditional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceAdditional: Self = this.set("forceAdditional", js.undefined)
    
    @scala.inline
    def setForceItems(value: Boolean): Self = this.set("forceItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceItems: Self = this.set("forceItems", js.undefined)
    
    @scala.inline
    def setForceMaxItems(value: Boolean): Self = this.set("forceMaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceMaxItems: Self = this.set("forceMaxItems", js.undefined)
    
    @scala.inline
    def setForceMaxLength(value: Boolean): Self = this.set("forceMaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceMaxLength: Self = this.set("forceMaxLength", js.undefined)
    
    @scala.inline
    def setForceMinItems(value: Boolean): Self = this.set("forceMinItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceMinItems: Self = this.set("forceMinItems", js.undefined)
    
    @scala.inline
    def setForceMinLength(value: Boolean): Self = this.set("forceMinLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceMinLength: Self = this.set("forceMinLength", js.undefined)
    
    @scala.inline
    def setForceProperties(value: Boolean): Self = this.set("forceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceProperties: Self = this.set("forceProperties", js.undefined)
    
    @scala.inline
    def setIgnoreUnknownFormats(value: Boolean): Self = this.set("ignoreUnknownFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUnknownFormats: Self = this.set("ignoreUnknownFormats", js.undefined)
    
    @scala.inline
    def setIgnoreUnresolvableReferences(value: Boolean): Self = this.set("ignoreUnresolvableReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUnresolvableReferences: Self = this.set("ignoreUnresolvableReferences", js.undefined)
    
    @scala.inline
    def setNoEmptyArrays(value: Boolean): Self = this.set("noEmptyArrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoEmptyArrays: Self = this.set("noEmptyArrays", js.undefined)
    
    @scala.inline
    def setNoEmptyStrings(value: Boolean): Self = this.set("noEmptyStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoEmptyStrings: Self = this.set("noEmptyStrings", js.undefined)
    
    @scala.inline
    def setNoExtraKeywords(value: Boolean): Self = this.set("noExtraKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoExtraKeywords: Self = this.set("noExtraKeywords", js.undefined)
    
    @scala.inline
    def setNoTypeless(value: Boolean): Self = this.set("noTypeless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoTypeless: Self = this.set("noTypeless", js.undefined)
    
    @scala.inline
    def setPedanticCheck(value: Boolean): Self = this.set("pedanticCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePedanticCheck: Self = this.set("pedanticCheck", js.undefined)
    
    @scala.inline
    def setReportPathAsArray(value: Boolean): Self = this.set("reportPathAsArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportPathAsArray: Self = this.set("reportPathAsArray", js.undefined)
    
    @scala.inline
    def setStrictMode(value: Boolean): Self = this.set("strictMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictMode: Self = this.set("strictMode", js.undefined)
    
    @scala.inline
    def setStrictUris(value: Boolean): Self = this.set("strictUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictUris: Self = this.set("strictUris", js.undefined)
  }
}
