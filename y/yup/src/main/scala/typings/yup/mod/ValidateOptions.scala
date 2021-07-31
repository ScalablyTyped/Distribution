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
  
  @scala.inline
  def apply[C](): ValidateOptions[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateOptions[C]]
  }
  
  @scala.inline
  implicit class ValidateOptionsMutableBuilder[Self <: ValidateOptions[?], C] (val x: Self & ValidateOptions[C]) extends AnyVal {
    
    @scala.inline
    def setAbortEarly(value: Boolean): Self = StObject.set(x, "abortEarly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortEarlyUndefined: Self = StObject.set(x, "abortEarly", js.undefined)
    
    @scala.inline
    def setContext(value: C): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    @scala.inline
    def setStripUnknown(value: Boolean): Self = StObject.set(x, "stripUnknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknownUndefined: Self = StObject.set(x, "stripUnknown", js.undefined)
  }
}
