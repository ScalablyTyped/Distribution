package typings.yup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocaleObject extends js.Object {
  
  var array: js.UndefOr[ArrayLocale] = js.native
  
  var boolean: js.UndefOr[js.Object] = js.native
  
  var date: js.UndefOr[DateLocale] = js.native
  
  var mixed: js.UndefOr[MixedLocale] = js.native
  
  var number: js.UndefOr[NumberLocale] = js.native
  
  var `object`: js.UndefOr[ObjectLocale] = js.native
  
  var string: js.UndefOr[StringLocale] = js.native
}
object LocaleObject {
  
  @scala.inline
  def apply(): LocaleObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleObject]
  }
  
  @scala.inline
  implicit class LocaleObjectOps[Self <: LocaleObject] (val x: Self) extends AnyVal {
    
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
    def setArray(value: ArrayLocale): Self = this.set("array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArray: Self = this.set("array", js.undefined)
    
    @scala.inline
    def setBoolean(value: js.Object): Self = this.set("boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoolean: Self = this.set("boolean", js.undefined)
    
    @scala.inline
    def setDate(value: DateLocale): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setMixed(value: MixedLocale): Self = this.set("mixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMixed: Self = this.set("mixed", js.undefined)
    
    @scala.inline
    def setNumber(value: NumberLocale): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setObject(value: ObjectLocale): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    
    @scala.inline
    def setString(value: StringLocale): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
  }
}
