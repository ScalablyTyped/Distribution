package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocaleObject extends StObject {
  
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
  implicit class LocaleObjectMutableBuilder[Self <: LocaleObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: ArrayLocale): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    @scala.inline
    def setBoolean(value: js.Object): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
    
    @scala.inline
    def setDate(value: DateLocale): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setMixed(value: MixedLocale): Self = StObject.set(x, "mixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixedUndefined: Self = StObject.set(x, "mixed", js.undefined)
    
    @scala.inline
    def setNumber(value: NumberLocale): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setObject(value: ObjectLocale): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    @scala.inline
    def setString(value: StringLocale): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
  }
}
