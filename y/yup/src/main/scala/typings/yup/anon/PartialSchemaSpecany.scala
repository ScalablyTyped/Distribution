package typings.yup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<yup.yup.SchemaSpec<any>> */
trait PartialSchemaSpecany extends StObject {
  
  var default: js.UndefOr[Any | js.Function0[Any]] = js.undefined
  
  var abortEarly: js.UndefOr[Boolean] = js.undefined
  
  var coerce: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var meta: js.UndefOr[Any] = js.undefined
  
  var nullable: js.UndefOr[Boolean] = js.undefined
  
  var optional: js.UndefOr[Boolean] = js.undefined
  
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  var strip: js.UndefOr[Boolean] = js.undefined
}
object PartialSchemaSpecany {
  
  inline def apply(): PartialSchemaSpecany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSchemaSpecany]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSchemaSpecany] (val x: Self) extends AnyVal {
    
    inline def setAbortEarly(value: Boolean): Self = StObject.set(x, "abortEarly", value.asInstanceOf[js.Any])
    
    inline def setAbortEarlyUndefined: Self = StObject.set(x, "abortEarly", js.undefined)
    
    inline def setCoerce(value: Boolean): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
    
    inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
    
    inline def setDefault(value: Any | js.Function0[Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultFunction0(value: () => Any): Self = StObject.set(x, "default", js.Any.fromFunction0(value))
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
    
    inline def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
  }
}
