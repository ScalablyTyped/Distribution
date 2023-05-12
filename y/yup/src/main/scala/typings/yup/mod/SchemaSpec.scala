package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpec[TDefault] extends StObject {
  
  var default: js.UndefOr[TDefault | js.Function0[TDefault]] = js.undefined
  
  var abortEarly: js.UndefOr[Boolean] = js.undefined
  
  var coerce: Boolean
  
  var label: js.UndefOr[String] = js.undefined
  
  var meta: js.UndefOr[Any] = js.undefined
  
  var nullable: Boolean
  
  var optional: Boolean
  
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  var strip: js.UndefOr[Boolean] = js.undefined
}
object SchemaSpec {
  
  inline def apply[TDefault](coerce: Boolean, nullable: Boolean, optional: Boolean): SchemaSpec[TDefault] = {
    val __obj = js.Dynamic.literal(coerce = coerce.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSpec[TDefault]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemaSpec[?], TDefault] (val x: Self & SchemaSpec[TDefault]) extends AnyVal {
    
    inline def setAbortEarly(value: Boolean): Self = StObject.set(x, "abortEarly", value.asInstanceOf[js.Any])
    
    inline def setAbortEarlyUndefined: Self = StObject.set(x, "abortEarly", js.undefined)
    
    inline def setCoerce(value: Boolean): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: TDefault | js.Function0[TDefault]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultFunction0(value: () => TDefault): Self = StObject.set(x, "default", js.Any.fromFunction0(value))
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
    
    inline def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
  }
}
