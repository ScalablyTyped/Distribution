package typings.yup.mod

import typings.yup.yupStrings.`ignore-optionality`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<yup.yup.CastOptions$1<C>, 'assert'> */
trait CastOptionalityOptions[C] extends StObject {
  
  /**
    * Whether or not to throw TypeErrors if casting fails to produce a valid type.
    * defaults to `true`. The `'ignore-optionality'` options is provided as a migration
    * path from pre-v1 where `schema.nullable().required()` was allowed. When provided
    * cast will only throw for values that are the wrong type *not* including `null` and `undefined`
    */
  var assert: `ignore-optionality`
  
  var context: js.UndefOr[C] = js.undefined
  
  var parent: js.UndefOr[Any] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var resolved: js.UndefOr[Boolean] = js.undefined
  
  var stripUnknown: js.UndefOr[Boolean] = js.undefined
}
object CastOptionalityOptions {
  
  inline def apply[C](): CastOptionalityOptions[C] = {
    val __obj = js.Dynamic.literal(assert = "ignore-optionality")
    __obj.asInstanceOf[CastOptionalityOptions[C]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CastOptionalityOptions[?], C] (val x: Self & CastOptionalityOptions[C]) extends AnyVal {
    
    inline def setAssert(value: `ignore-optionality`): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    inline def setContext(value: C): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
    
    inline def setStripUnknown(value: Boolean): Self = StObject.set(x, "stripUnknown", value.asInstanceOf[js.Any])
    
    inline def setStripUnknownUndefined: Self = StObject.set(x, "stripUnknown", js.undefined)
  }
}
