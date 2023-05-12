package typings.yup.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOptions[TType, TDefault] extends StObject {
  
  def check(value: Any): /* is std.NonNullable<TType> */ Boolean
  
  var spec: js.UndefOr[Partial[SchemaSpec[TDefault]]] = js.undefined
  
  var `type`: String
}
object SchemaOptions {
  
  inline def apply[TType, TDefault](check: Any => /* is std.NonNullable<TType> */ Boolean, `type`: String): SchemaOptions[TType, TDefault] = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOptions[TType, TDefault]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemaOptions[?, ?], TType, TDefault] (val x: Self & (SchemaOptions[TType, TDefault])) extends AnyVal {
    
    inline def setCheck(value: Any => /* is std.NonNullable<TType> */ Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    inline def setSpec(value: Partial[SchemaSpec[TDefault]]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
