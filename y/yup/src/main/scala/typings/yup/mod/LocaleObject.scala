package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocaleObject extends StObject {
  
  var array: js.UndefOr[ArrayLocale] = js.undefined
  
  var boolean: js.UndefOr[BooleanLocale] = js.undefined
  
  var date: js.UndefOr[DateLocale] = js.undefined
  
  var mixed: js.UndefOr[MixedLocale] = js.undefined
  
  var number: js.UndefOr[NumberLocale] = js.undefined
  
  var `object`: js.UndefOr[ObjectLocale] = js.undefined
  
  var string: js.UndefOr[StringLocale] = js.undefined
}
object LocaleObject {
  
  inline def apply(): LocaleObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocaleObject] (val x: Self) extends AnyVal {
    
    inline def setArray(value: ArrayLocale): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setBoolean(value: BooleanLocale): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
    
    inline def setDate(value: DateLocale): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setMixed(value: MixedLocale): Self = StObject.set(x, "mixed", value.asInstanceOf[js.Any])
    
    inline def setMixedUndefined: Self = StObject.set(x, "mixed", js.undefined)
    
    inline def setNumber(value: NumberLocale): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setObject(value: ObjectLocale): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    inline def setString(value: StringLocale): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
  }
}
