package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateOptions[C] extends StObject {
  
  /**
    * Return from validation methods on the first error rather than after all validations run. Default - true
    */
  var abortEarly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Any context needed for validating schema conditions (see: when())
    */
  var context: js.UndefOr[C] = js.undefined
  
  /**
    * When false validations will not descend into nested schema (relevant for objects or arrays). Default - true
    */
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Only validate the input, and skip and coercion or transformation. Default - false
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Remove unspecified keys from objects. Default - false
    */
  var stripUnknown: js.UndefOr[Boolean] = js.undefined
}
object ValidateOptions {
  
  inline def apply[C](): ValidateOptions[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateOptions[C]]
  }
  
  extension [Self <: ValidateOptions[?], C](x: Self & ValidateOptions[C]) {
    
    inline def setAbortEarly(value: Boolean): Self = StObject.set(x, "abortEarly", value.asInstanceOf[js.Any])
    
    inline def setAbortEarlyUndefined: Self = StObject.set(x, "abortEarly", js.undefined)
    
    inline def setContext(value: C): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setStripUnknown(value: Boolean): Self = StObject.set(x, "stripUnknown", value.asInstanceOf[js.Any])
    
    inline def setStripUnknownUndefined: Self = StObject.set(x, "stripUnknown", js.undefined)
  }
}
